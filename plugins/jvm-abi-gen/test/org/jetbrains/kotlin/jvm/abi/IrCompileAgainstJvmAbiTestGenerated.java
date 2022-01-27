/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.jvm.abi;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("plugins/jvm-abi-gen/testData/compile")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class IrCompileAgainstJvmAbiTestGenerated extends AbstractIrCompileAgainstJvmAbiTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, TargetBackend.JVM_IR, testDataFilePath);
    }

    public void testAllFilesPresentInCompile() throws Exception {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("plugins/jvm-abi-gen/testData/compile"), Pattern.compile("^([^\\.]+)$"), null, TargetBackend.JVM_IR, false);
    }

    @TestMetadata("anonymousObject")
    public void testAnonymousObject() throws Exception {
        runTest("plugins/jvm-abi-gen/testData/compile/anonymousObject/");
    }

    @TestMetadata("classes")
    public void testClasses() throws Exception {
        runTest("plugins/jvm-abi-gen/testData/compile/classes/");
    }

    @TestMetadata("clinit")
    public void testClinit() throws Exception {
        runTest("plugins/jvm-abi-gen/testData/compile/clinit/");
    }

    @TestMetadata("inlineAnnotationInstantiation")
    public void testInlineAnnotationInstantiation() throws Exception {
        runTest("plugins/jvm-abi-gen/testData/compile/inlineAnnotationInstantiation/");
    }

    @TestMetadata("inlineAnonymousObject")
    public void testInlineAnonymousObject() throws Exception {
        runTest("plugins/jvm-abi-gen/testData/compile/inlineAnonymousObject/");
    }

    @TestMetadata("inlineCapture")
    public void testInlineCapture() throws Exception {
        runTest("plugins/jvm-abi-gen/testData/compile/inlineCapture/");
    }

    @TestMetadata("inlineNoRegeneration")
    public void testInlineNoRegeneration() throws Exception {
        runTest("plugins/jvm-abi-gen/testData/compile/inlineNoRegeneration/");
    }

    @TestMetadata("inlineReifiedFunction")
    public void testInlineReifiedFunction() throws Exception {
        runTest("plugins/jvm-abi-gen/testData/compile/inlineReifiedFunction/");
    }

    @TestMetadata("inlineWhenMappings")
    public void testInlineWhenMappings() throws Exception {
        runTest("plugins/jvm-abi-gen/testData/compile/inlineWhenMappings/");
    }

    @TestMetadata("innerObjectRegeneration")
    public void testInnerObjectRegeneration() throws Exception {
        runTest("plugins/jvm-abi-gen/testData/compile/innerObjectRegeneration/");
    }

    @TestMetadata("kt-40133")
    public void testKt_40133() throws Exception {
        runTest("plugins/jvm-abi-gen/testData/compile/kt-40133/");
    }

    @TestMetadata("kt-40340")
    public void testKt_40340() throws Exception {
        runTest("plugins/jvm-abi-gen/testData/compile/kt-40340/");
    }

    @TestMetadata("privateAnnotationsFromJavaApp")
    public void testPrivateAnnotationsFromJavaApp() throws Exception {
        runTest("plugins/jvm-abi-gen/testData/compile/privateAnnotationsFromJavaApp/");
    }

    @TestMetadata("privateAnnotationsFromJavaLib")
    public void testPrivateAnnotationsFromJavaLib() throws Exception {
        runTest("plugins/jvm-abi-gen/testData/compile/privateAnnotationsFromJavaLib/");
    }

    @TestMetadata("privateClassesFromJavaApp")
    public void testPrivateClassesFromJavaApp() throws Exception {
        runTest("plugins/jvm-abi-gen/testData/compile/privateClassesFromJavaApp/");
    }

    @TestMetadata("privateClassesFromJavaLib")
    public void testPrivateClassesFromJavaLib() throws Exception {
        runTest("plugins/jvm-abi-gen/testData/compile/privateClassesFromJavaLib/");
    }

    @TestMetadata("privateOnlyConstructors")
    public void testPrivateOnlyConstructors() throws Exception {
        runTest("plugins/jvm-abi-gen/testData/compile/privateOnlyConstructors/");
    }

    @TestMetadata("privateValueClassConstructor")
    public void testPrivateValueClassConstructor() throws Exception {
        runTest("plugins/jvm-abi-gen/testData/compile/privateValueClassConstructor/");
    }

    @TestMetadata("topLevel")
    public void testTopLevel() throws Exception {
        runTest("plugins/jvm-abi-gen/testData/compile/topLevel/");
    }
}
