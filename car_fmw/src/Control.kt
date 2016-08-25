object Control {
    val BLINK_DURATION = 1000

    fun run() {
        Memory.setHeap(Memory.DYNAMIC_HEAP)
        while (true) {
            executeCommand()
            Memory.cleanDynamicHeap()
        }
    }

    private fun executeCommand() {
        val task = Reader.readTask()
        Leds.blink()
        Time.wait(BLINK_DURATION)

        when (task.type.id) {
            TaskRequest.Type.DEBUG.id -> debugTask()
            TaskRequest.Type.ROUTE.id -> routeTask()
            TaskRequest.Type.ROUTE_METRIC.id -> routeMetricTask()
            TaskRequest.Type.SONAR.id -> sonarTask()
        }

        Leds.blink()
        Time.wait(BLINK_DURATION)
    }

    private fun debugTask() {
        val request = Reader.readDebug()

        when (request.type.id) {
            DebugRequest.Type.MEMORY_STATS.id -> sendMemoryStats()
        }
    }

    private fun routeTask() {
        val route = Reader.readRoute()

        val times = route.times
        val directions = route.directions
        var i = 0

        while (i < times.size) {
            val time = times[i]
            val direction = directions[i]

            Engine.go(direction)
            Time.wait(time)
            Engine.stop()

            i++
        }

        val response = RouteResponse.BuilderRouteResponse(0).build()
        Writer.writeRoute(response)
    }

    private fun routeMetricTask() {
        val route = Reader.readMetricRoute()
        val distances = route.distances
        var i = 0

        while (i < distances.size) {
            val distance = distances[i]
            val direction = route.directions[i]
            Engine.drive(direction, distance)

            i++
        }

        val response = RouteResponse.BuilderRouteResponse(0).build()
        Writer.writeRoute(response)
    }

    private fun sonarTask() {
        val request = Reader.readSonar()
        val size = request.angles.size
        val distances = IntArray(size)

        var i = 0
        while (i < size) {
            distances[i] = Sonar.getDistance(request.angles[i])
            i++
        }

        val response = SonarResponse.BuilderSonarResponse(distances).build()
        Writer.writeSonar(response)
    }

    private fun sendMemoryStats() {
        val stats = DebugResponseMemoryStats.BuilderDebugResponseMemoryStats(
                DebugInfo.getDynamicHeapTail(),
                DebugInfo.getStaticHeapTail(),
                DebugInfo.getDynamicHeapMaxSize(),
                DebugInfo.getDynamicHeapTotalBytes()
        ).build()

        Writer.writeMemoryStats(stats)
    }
}
