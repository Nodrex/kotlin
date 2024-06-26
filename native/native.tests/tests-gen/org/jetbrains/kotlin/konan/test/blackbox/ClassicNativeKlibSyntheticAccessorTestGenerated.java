/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.konan.test.blackbox;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.konan.test.blackbox.support.EnforcedProperty;
import org.jetbrains.kotlin.konan.test.blackbox.support.ClassLevelProperty;
import org.jetbrains.kotlin.konan.test.blackbox.support.group.UseExtTestCaseGroupProvider;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.GenerateNativeTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/klib/syntheticAccessors")
@TestDataPath("$PROJECT_ROOT")
@EnforcedProperty(property = ClassLevelProperty.TEST_KIND, propertyValue = "STANDALONE")
@EnforcedProperty(property = ClassLevelProperty.CACHE_MODE, propertyValue = "NO")
@UseExtTestCaseGroupProvider()
public class ClassicNativeKlibSyntheticAccessorTestGenerated extends AbstractNativeKlibSyntheticAccessorTest {
  @Test
  public void testAllFilesPresentInSyntheticAccessors() {
    KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/klib/syntheticAccessors"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.NATIVE, true);
  }

  @Nested
  @TestMetadata("compiler/testData/klib/syntheticAccessors/outerThis")
  @TestDataPath("$PROJECT_ROOT")
  @EnforcedProperty(property = ClassLevelProperty.TEST_KIND, propertyValue = "STANDALONE")
  @EnforcedProperty(property = ClassLevelProperty.CACHE_MODE, propertyValue = "NO")
  @UseExtTestCaseGroupProvider()
  public class OuterThis {
    @Test
    public void testAllFilesPresentInOuterThis() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/klib/syntheticAccessors/outerThis"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.NATIVE, true);
    }

    @Test
    @TestMetadata("leakingOuterThisCrossFile.kt")
    public void testLeakingOuterThisCrossFile() {
      runTest("compiler/testData/klib/syntheticAccessors/outerThis/leakingOuterThisCrossFile.kt");
    }

    @Test
    @TestMetadata("leakingOuterThisCrossModule.kt")
    public void testLeakingOuterThisCrossModule() {
      runTest("compiler/testData/klib/syntheticAccessors/outerThis/leakingOuterThisCrossModule.kt");
    }

    @Test
    @TestMetadata("outerThisUsageSingleFile.kt")
    public void testOuterThisUsageSingleFile() {
      runTest("compiler/testData/klib/syntheticAccessors/outerThis/outerThisUsageSingleFile.kt");
    }
  }

  @Nested
  @TestMetadata("compiler/testData/klib/syntheticAccessors/privateMember")
  @TestDataPath("$PROJECT_ROOT")
  @EnforcedProperty(property = ClassLevelProperty.TEST_KIND, propertyValue = "STANDALONE")
  @EnforcedProperty(property = ClassLevelProperty.CACHE_MODE, propertyValue = "NO")
  @UseExtTestCaseGroupProvider()
  public class PrivateMember {
    @Test
    public void testAllFilesPresentInPrivateMember() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/klib/syntheticAccessors/privateMember"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.NATIVE, true);
    }

    @Nested
    @TestMetadata("compiler/testData/klib/syntheticAccessors/privateMember/crossFilePrivateLeak")
    @TestDataPath("$PROJECT_ROOT")
    @EnforcedProperty(property = ClassLevelProperty.TEST_KIND, propertyValue = "STANDALONE")
    @EnforcedProperty(property = ClassLevelProperty.CACHE_MODE, propertyValue = "NO")
    @UseExtTestCaseGroupProvider()
    public class CrossFilePrivateLeak {
      @Test
      public void testAllFilesPresentInCrossFilePrivateLeak() {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/klib/syntheticAccessors/privateMember/crossFilePrivateLeak"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.NATIVE, true);
      }

      @Test
      @TestMetadata("leakingPrivateExtensionFun.kt")
      public void testLeakingPrivateExtensionFun() {
        runTest("compiler/testData/klib/syntheticAccessors/privateMember/crossFilePrivateLeak/leakingPrivateExtensionFun.kt");
      }

      @Test
      @TestMetadata("leakingPrivateExtensionFunThroughPrivateInlineChain.kt")
      public void testLeakingPrivateExtensionFunThroughPrivateInlineChain() {
        runTest("compiler/testData/klib/syntheticAccessors/privateMember/crossFilePrivateLeak/leakingPrivateExtensionFunThroughPrivateInlineChain.kt");
      }

      @Test
      @TestMetadata("leakingPrivateExtensionMember.kt")
      public void testLeakingPrivateExtensionMember() {
        runTest("compiler/testData/klib/syntheticAccessors/privateMember/crossFilePrivateLeak/leakingPrivateExtensionMember.kt");
      }

      @Test
      @TestMetadata("leakingPrivateExtensionVarThroughInlineFun.kt")
      public void testLeakingPrivateExtensionVarThroughInlineFun() {
        runTest("compiler/testData/klib/syntheticAccessors/privateMember/crossFilePrivateLeak/leakingPrivateExtensionVarThroughInlineFun.kt");
      }

      @Test
      @TestMetadata("leakingPrivateExtensionVarThroughPrivateInlineVarChain.kt")
      public void testLeakingPrivateExtensionVarThroughPrivateInlineVarChain() {
        runTest("compiler/testData/klib/syntheticAccessors/privateMember/crossFilePrivateLeak/leakingPrivateExtensionVarThroughPrivateInlineVarChain.kt");
      }

      @Test
      @TestMetadata("leakingPrivateConstructorThroughInternalInlineFun.kt")
      public void testLeakingPrivateConstructorThroughInternalInlineFun() {
        runTest("compiler/testData/klib/syntheticAccessors/privateMember/crossFilePrivateLeak/leakingPrivateConstructorThroughInternalInlineFun.kt");
      }

      @Test
      @TestMetadata("leakingPrivateMethod.kt")
      public void testLeakingPrivateMethod() {
        runTest("compiler/testData/klib/syntheticAccessors/privateMember/crossFilePrivateLeak/leakingPrivateMethod.kt");
      }

      @Test
      @TestMetadata("leakingPrivateMethodFromLocalObjectInsideInternalInline.kt")
      public void testLeakingPrivateMethodFromLocalObjectInsideInternalInline() {
        runTest("compiler/testData/klib/syntheticAccessors/privateMember/crossFilePrivateLeak/leakingPrivateMethodFromLocalObjectInsideInternalInline.kt");
      }

      @Test
      @TestMetadata("leakingPrivateMethodThroughPrivateInlineChain.kt")
      public void testLeakingPrivateMethodThroughPrivateInlineChain() {
        runTest("compiler/testData/klib/syntheticAccessors/privateMember/crossFilePrivateLeak/leakingPrivateMethodThroughPrivateInlineChain.kt");
      }

      @Test
      @TestMetadata("leakingPrivateSetterThroughInlineFun.kt")
      public void testLeakingPrivateSetterThroughInlineFun() {
        runTest("compiler/testData/klib/syntheticAccessors/privateMember/crossFilePrivateLeak/leakingPrivateSetterThroughInlineFun.kt");
      }

      @Test
      @TestMetadata("leakingPrivateSetterThroughInlineVar.kt")
      public void testLeakingPrivateSetterThroughInlineVar() {
        runTest("compiler/testData/klib/syntheticAccessors/privateMember/crossFilePrivateLeak/leakingPrivateSetterThroughInlineVar.kt");
      }

      @Test
      @TestMetadata("leakingPrivateSetterThroughPrivateInlineFunChain.kt")
      public void testLeakingPrivateSetterThroughPrivateInlineFunChain() {
        runTest("compiler/testData/klib/syntheticAccessors/privateMember/crossFilePrivateLeak/leakingPrivateSetterThroughPrivateInlineFunChain.kt");
      }

      @Test
      @TestMetadata("leakingPrivateSetterThroughPrivateInlineVarChain.kt")
      public void testLeakingPrivateSetterThroughPrivateInlineVarChain() {
        runTest("compiler/testData/klib/syntheticAccessors/privateMember/crossFilePrivateLeak/leakingPrivateSetterThroughPrivateInlineVarChain.kt");
      }

      @Test
      @TestMetadata("leakingPrivateVarThroughInlineFun.kt")
      public void testLeakingPrivateVarThroughInlineFun() {
        runTest("compiler/testData/klib/syntheticAccessors/privateMember/crossFilePrivateLeak/leakingPrivateVarThroughInlineFun.kt");
      }

      @Test
      @TestMetadata("leakingPrivateVarThroughInlineFunParameter.kt")
      public void testLeakingPrivateVarThroughInlineFunParameter() {
        runTest("compiler/testData/klib/syntheticAccessors/privateMember/crossFilePrivateLeak/leakingPrivateVarThroughInlineFunParameter.kt");
      }

      @Test
      @TestMetadata("leakingPrivateVarThroughInlineVar.kt")
      public void testLeakingPrivateVarThroughInlineVar() {
        runTest("compiler/testData/klib/syntheticAccessors/privateMember/crossFilePrivateLeak/leakingPrivateVarThroughInlineVar.kt");
      }

      @Test
      @TestMetadata("leakingPrivateVarThroughPrivateInlineFunChain.kt")
      public void testLeakingPrivateVarThroughPrivateInlineFunChain() {
        runTest("compiler/testData/klib/syntheticAccessors/privateMember/crossFilePrivateLeak/leakingPrivateVarThroughPrivateInlineFunChain.kt");
      }

      @Test
      @TestMetadata("leakingPrivateVarThroughPrivateInlineVarChain.kt")
      public void testLeakingPrivateVarThroughPrivateInlineVarChain() {
        runTest("compiler/testData/klib/syntheticAccessors/privateMember/crossFilePrivateLeak/leakingPrivateVarThroughPrivateInlineVarChain.kt");
      }

      @Test
      @TestMetadata("usePrivateConstValFromInternalInline.kt")
      public void testUsePrivateConstValFromInternalInline() {
        runTest("compiler/testData/klib/syntheticAccessors/privateMember/crossFilePrivateLeak/usePrivateConstValFromInternalInline.kt");
      }
    }

    @Nested
    @TestMetadata("compiler/testData/klib/syntheticAccessors/privateMember/crossModulePrivateLeak")
    @TestDataPath("$PROJECT_ROOT")
    @EnforcedProperty(property = ClassLevelProperty.TEST_KIND, propertyValue = "STANDALONE")
    @EnforcedProperty(property = ClassLevelProperty.CACHE_MODE, propertyValue = "NO")
    @UseExtTestCaseGroupProvider()
    public class CrossModulePrivateLeak {
      @Test
      public void testAllFilesPresentInCrossModulePrivateLeak() {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/klib/syntheticAccessors/privateMember/crossModulePrivateLeak"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.NATIVE, true);
      }

      @Test
      @TestMetadata("leakingPrivateExtensionFun.kt")
      public void testLeakingPrivateExtensionFun() {
        runTest("compiler/testData/klib/syntheticAccessors/privateMember/crossModulePrivateLeak/leakingPrivateExtensionFun.kt");
      }

      @Test
      @TestMetadata("leakingPrivateExtensionFunThroughPrivateInlineChain.kt")
      public void testLeakingPrivateExtensionFunThroughPrivateInlineChain() {
        runTest("compiler/testData/klib/syntheticAccessors/privateMember/crossModulePrivateLeak/leakingPrivateExtensionFunThroughPrivateInlineChain.kt");
      }

      @Test
      @TestMetadata("leakingPrivateExtensionMember.kt")
      public void testLeakingPrivateExtensionMember() {
        runTest("compiler/testData/klib/syntheticAccessors/privateMember/crossModulePrivateLeak/leakingPrivateExtensionMember.kt");
      }

      @Test
      @TestMetadata("leakingPrivateExtensionVarThroughInlineFun.kt")
      public void testLeakingPrivateExtensionVarThroughInlineFun() {
        runTest("compiler/testData/klib/syntheticAccessors/privateMember/crossModulePrivateLeak/leakingPrivateExtensionVarThroughInlineFun.kt");
      }

      @Test
      @TestMetadata("leakingPrivateExtensionVarThroughPrivateInlineVarChain.kt")
      public void testLeakingPrivateExtensionVarThroughPrivateInlineVarChain() {
        runTest("compiler/testData/klib/syntheticAccessors/privateMember/crossModulePrivateLeak/leakingPrivateExtensionVarThroughPrivateInlineVarChain.kt");
      }

      @Test
      @TestMetadata("leakingPrivateConstructorThroughInternalInlineFun.kt")
      public void testLeakingPrivateConstructorThroughInternalInlineFun() {
        runTest("compiler/testData/klib/syntheticAccessors/privateMember/crossModulePrivateLeak/leakingPrivateConstructorThroughInternalInlineFun.kt");
      }

      @Test
      @TestMetadata("leakingPrivateMethod.kt")
      public void testLeakingPrivateMethod() {
        runTest("compiler/testData/klib/syntheticAccessors/privateMember/crossModulePrivateLeak/leakingPrivateMethod.kt");
      }

      @Test
      @TestMetadata("leakingPrivateMethodFromLocalObjectInsideInternalInline.kt")
      public void testLeakingPrivateMethodFromLocalObjectInsideInternalInline() {
        runTest("compiler/testData/klib/syntheticAccessors/privateMember/crossModulePrivateLeak/leakingPrivateMethodFromLocalObjectInsideInternalInline.kt");
      }

      @Test
      @TestMetadata("leakingPrivateMethodThroughPrivateInlineChain.kt")
      public void testLeakingPrivateMethodThroughPrivateInlineChain() {
        runTest("compiler/testData/klib/syntheticAccessors/privateMember/crossModulePrivateLeak/leakingPrivateMethodThroughPrivateInlineChain.kt");
      }

      @Test
      @TestMetadata("leakingPrivateSetterThroughInlineFun.kt")
      public void testLeakingPrivateSetterThroughInlineFun() {
        runTest("compiler/testData/klib/syntheticAccessors/privateMember/crossModulePrivateLeak/leakingPrivateSetterThroughInlineFun.kt");
      }

      @Test
      @TestMetadata("leakingPrivateSetterThroughInlineVar.kt")
      public void testLeakingPrivateSetterThroughInlineVar() {
        runTest("compiler/testData/klib/syntheticAccessors/privateMember/crossModulePrivateLeak/leakingPrivateSetterThroughInlineVar.kt");
      }

      @Test
      @TestMetadata("leakingPrivateSetterThroughPrivateInlineFunChain.kt")
      public void testLeakingPrivateSetterThroughPrivateInlineFunChain() {
        runTest("compiler/testData/klib/syntheticAccessors/privateMember/crossModulePrivateLeak/leakingPrivateSetterThroughPrivateInlineFunChain.kt");
      }

      @Test
      @TestMetadata("leakingPrivateSetterThroughPrivateInlineVarChain.kt")
      public void testLeakingPrivateSetterThroughPrivateInlineVarChain() {
        runTest("compiler/testData/klib/syntheticAccessors/privateMember/crossModulePrivateLeak/leakingPrivateSetterThroughPrivateInlineVarChain.kt");
      }

      @Test
      @TestMetadata("leakingPrivateVarThroughInlineFun.kt")
      public void testLeakingPrivateVarThroughInlineFun() {
        runTest("compiler/testData/klib/syntheticAccessors/privateMember/crossModulePrivateLeak/leakingPrivateVarThroughInlineFun.kt");
      }

      @Test
      @TestMetadata("leakingPrivateVarThroughInlineFunParameter.kt")
      public void testLeakingPrivateVarThroughInlineFunParameter() {
        runTest("compiler/testData/klib/syntheticAccessors/privateMember/crossModulePrivateLeak/leakingPrivateVarThroughInlineFunParameter.kt");
      }

      @Test
      @TestMetadata("leakingPrivateVarThroughInlineVar.kt")
      public void testLeakingPrivateVarThroughInlineVar() {
        runTest("compiler/testData/klib/syntheticAccessors/privateMember/crossModulePrivateLeak/leakingPrivateVarThroughInlineVar.kt");
      }

      @Test
      @TestMetadata("leakingPrivateVarThroughPrivateInlineFunChain.kt")
      public void testLeakingPrivateVarThroughPrivateInlineFunChain() {
        runTest("compiler/testData/klib/syntheticAccessors/privateMember/crossModulePrivateLeak/leakingPrivateVarThroughPrivateInlineFunChain.kt");
      }

      @Test
      @TestMetadata("leakingPrivateVarThroughPrivateInlineVarChain.kt")
      public void testLeakingPrivateVarThroughPrivateInlineVarChain() {
        runTest("compiler/testData/klib/syntheticAccessors/privateMember/crossModulePrivateLeak/leakingPrivateVarThroughPrivateInlineVarChain.kt");
      }

      @Test
      @TestMetadata("usePrivateConstValFromInternalInline.kt")
      public void testUsePrivateConstValFromInternalInline() {
        runTest("compiler/testData/klib/syntheticAccessors/privateMember/crossModulePrivateLeak/usePrivateConstValFromInternalInline.kt");
      }
    }

    @Nested
    @TestMetadata("compiler/testData/klib/syntheticAccessors/privateMember/singleFile")
    @TestDataPath("$PROJECT_ROOT")
    @EnforcedProperty(property = ClassLevelProperty.TEST_KIND, propertyValue = "STANDALONE")
    @EnforcedProperty(property = ClassLevelProperty.CACHE_MODE, propertyValue = "NO")
    @UseExtTestCaseGroupProvider()
    public class SingleFile {
      @Test
      public void testAllFilesPresentInSingleFile() {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/klib/syntheticAccessors/privateMember/singleFile"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.NATIVE, true);
      }

      @Test
      @TestMetadata("usePrivateExtensionFromInternalInline.kt")
      public void testUsePrivateExtensionFromInternalInline() {
        runTest("compiler/testData/klib/syntheticAccessors/privateMember/singleFile/usePrivateExtensionFromInternalInline.kt");
      }

      @Test
      @TestMetadata("usePrivateConstructorFromInternalInline.kt")
      public void testUsePrivateConstructorFromInternalInline() {
        runTest("compiler/testData/klib/syntheticAccessors/privateMember/singleFile/usePrivateConstructorFromInternalInline.kt");
      }

      @Test
      @TestMetadata("usePrivateMethodFromInternalInline.kt")
      public void testUsePrivateMethodFromInternalInline() {
        runTest("compiler/testData/klib/syntheticAccessors/privateMember/singleFile/usePrivateMethodFromInternalInline.kt");
      }

      @Test
      @TestMetadata("usePrivateSetterFromInternalInlineFun.kt")
      public void testUsePrivateSetterFromInternalInlineFun() {
        runTest("compiler/testData/klib/syntheticAccessors/privateMember/singleFile/usePrivateSetterFromInternalInlineFun.kt");
      }

      @Test
      @TestMetadata("usePrivateSetterFromInternalInlineVar.kt")
      public void testUsePrivateSetterFromInternalInlineVar() {
        runTest("compiler/testData/klib/syntheticAccessors/privateMember/singleFile/usePrivateSetterFromInternalInlineVar.kt");
      }

      @Test
      @TestMetadata("usePrivateMethodFromLocalObjectInsideInternalInline.kt")
      public void testUsePrivateMethodFromLocalObjectInsideInternalInline() {
        runTest("compiler/testData/klib/syntheticAccessors/privateMember/singleFile/usePrivateMethodFromLocalObjectInsideInternalInline.kt");
      }

      @Test
      @TestMetadata("usePrivateVarFromInternalInlineFun.kt")
      public void testUsePrivateVarFromInternalInlineFun() {
        runTest("compiler/testData/klib/syntheticAccessors/privateMember/singleFile/usePrivateVarFromInternalInlineFun.kt");
      }

      @Test
      @TestMetadata("usePrivateVarFromInternalInlineVar.kt")
      public void testUsePrivateVarFromInternalInlineVar() {
        runTest("compiler/testData/klib/syntheticAccessors/privateMember/singleFile/usePrivateVarFromInternalInlineVar.kt");
      }
    }
  }

  @Nested
  @TestMetadata("compiler/testData/klib/syntheticAccessors/topLevelPrivate")
  @TestDataPath("$PROJECT_ROOT")
  @EnforcedProperty(property = ClassLevelProperty.TEST_KIND, propertyValue = "STANDALONE")
  @EnforcedProperty(property = ClassLevelProperty.CACHE_MODE, propertyValue = "NO")
  @UseExtTestCaseGroupProvider()
  public class TopLevelPrivate {
    @Test
    public void testAllFilesPresentInTopLevelPrivate() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/klib/syntheticAccessors/topLevelPrivate"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.NATIVE, true);
    }

    @Nested
    @TestMetadata("compiler/testData/klib/syntheticAccessors/topLevelPrivate/crossFilePrivateLeak")
    @TestDataPath("$PROJECT_ROOT")
    @EnforcedProperty(property = ClassLevelProperty.TEST_KIND, propertyValue = "STANDALONE")
    @EnforcedProperty(property = ClassLevelProperty.CACHE_MODE, propertyValue = "NO")
    @UseExtTestCaseGroupProvider()
    public class CrossFilePrivateLeak {
      @Test
      public void testAllFilesPresentInCrossFilePrivateLeak() {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/klib/syntheticAccessors/topLevelPrivate/crossFilePrivateLeak"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.NATIVE, true);
      }

      @Test
      @TestMetadata("leakingPrivateClassThroughtKlass.kt")
      public void testLeakingPrivateClassThroughtKlass() {
        runTest("compiler/testData/klib/syntheticAccessors/topLevelPrivate/crossFilePrivateLeak/leakingPrivateClassThroughtKlass.kt");
      }

      @Test
      @TestMetadata("leakingPrivateClassThroughtTypecheck.kt")
      public void testLeakingPrivateClassThroughtTypecheck() {
        runTest("compiler/testData/klib/syntheticAccessors/topLevelPrivate/crossFilePrivateLeak/leakingPrivateClassThroughtTypecheck.kt");
      }

      @Test
      @TestMetadata("leakingPrivateExtensionFun.kt")
      public void testLeakingPrivateExtensionFun() {
        runTest("compiler/testData/klib/syntheticAccessors/topLevelPrivate/crossFilePrivateLeak/leakingPrivateExtensionFun.kt");
      }

      @Test
      @TestMetadata("leakingPrivateExtensionFunThroughPrivateInlineChain.kt")
      public void testLeakingPrivateExtensionFunThroughPrivateInlineChain() {
        runTest("compiler/testData/klib/syntheticAccessors/topLevelPrivate/crossFilePrivateLeak/leakingPrivateExtensionFunThroughPrivateInlineChain.kt");
      }

      @Test
      @TestMetadata("leakingPrivateExtensionVarThroughInlineFun.kt")
      public void testLeakingPrivateExtensionVarThroughInlineFun() {
        runTest("compiler/testData/klib/syntheticAccessors/topLevelPrivate/crossFilePrivateLeak/leakingPrivateExtensionVarThroughInlineFun.kt");
      }

      @Test
      @TestMetadata("leakingPrivateExtensionVarThroughPrivateInlineVarChain.kt")
      public void testLeakingPrivateExtensionVarThroughPrivateInlineVarChain() {
        runTest("compiler/testData/klib/syntheticAccessors/topLevelPrivate/crossFilePrivateLeak/leakingPrivateExtensionVarThroughPrivateInlineVarChain.kt");
      }

      @Test
      @TestMetadata("leakingPrivateTopLevelFun.kt")
      public void testLeakingPrivateTopLevelFun() {
        runTest("compiler/testData/klib/syntheticAccessors/topLevelPrivate/crossFilePrivateLeak/leakingPrivateTopLevelFun.kt");
      }

      @Test
      @TestMetadata("leakingPrivateTopLevelFunThroughPrivateInlineFunChain.kt")
      public void testLeakingPrivateTopLevelFunThroughPrivateInlineFunChain() {
        runTest("compiler/testData/klib/syntheticAccessors/topLevelPrivate/crossFilePrivateLeak/leakingPrivateTopLevelFunThroughPrivateInlineFunChain.kt");
      }

      @Test
      @TestMetadata("leakingPrivateTopLevelSetterThroughInlineFun.kt")
      public void testLeakingPrivateTopLevelSetterThroughInlineFun() {
        runTest("compiler/testData/klib/syntheticAccessors/topLevelPrivate/crossFilePrivateLeak/leakingPrivateTopLevelSetterThroughInlineFun.kt");
      }

      @Test
      @TestMetadata("leakingPrivateTopLevelSetterThroughInlineVar.kt")
      public void testLeakingPrivateTopLevelSetterThroughInlineVar() {
        runTest("compiler/testData/klib/syntheticAccessors/topLevelPrivate/crossFilePrivateLeak/leakingPrivateTopLevelSetterThroughInlineVar.kt");
      }

      @Test
      @TestMetadata("leakingPrivateTopLevelVarThroughInlineFun.kt")
      public void testLeakingPrivateTopLevelVarThroughInlineFun() {
        runTest("compiler/testData/klib/syntheticAccessors/topLevelPrivate/crossFilePrivateLeak/leakingPrivateTopLevelVarThroughInlineFun.kt");
      }

      @Test
      @TestMetadata("leakingPrivateTopLevelVarThroughInlineFunParameter.kt")
      public void testLeakingPrivateTopLevelVarThroughInlineFunParameter() {
        runTest("compiler/testData/klib/syntheticAccessors/topLevelPrivate/crossFilePrivateLeak/leakingPrivateTopLevelVarThroughInlineFunParameter.kt");
      }

      @Test
      @TestMetadata("leakingPrivateTopLevelVarThroughInlineVar.kt")
      public void testLeakingPrivateTopLevelVarThroughInlineVar() {
        runTest("compiler/testData/klib/syntheticAccessors/topLevelPrivate/crossFilePrivateLeak/leakingPrivateTopLevelVarThroughInlineVar.kt");
      }

      @Test
      @TestMetadata("leakingTopLevelPrivateSetterThroughPrivateInlineFunChain.kt")
      public void testLeakingTopLevelPrivateSetterThroughPrivateInlineFunChain() {
        runTest("compiler/testData/klib/syntheticAccessors/topLevelPrivate/crossFilePrivateLeak/leakingTopLevelPrivateSetterThroughPrivateInlineFunChain.kt");
      }

      @Test
      @TestMetadata("leakingTopLevelPrivateVarThroughPrivateInlineFunChain.kt")
      public void testLeakingTopLevelPrivateVarThroughPrivateInlineFunChain() {
        runTest("compiler/testData/klib/syntheticAccessors/topLevelPrivate/crossFilePrivateLeak/leakingTopLevelPrivateVarThroughPrivateInlineFunChain.kt");
      }

      @Test
      @TestMetadata("leakingTopLevelPrivateVarThroughPrivateInlineVarChain.kt")
      public void testLeakingTopLevelPrivateVarThroughPrivateInlineVarChain() {
        runTest("compiler/testData/klib/syntheticAccessors/topLevelPrivate/crossFilePrivateLeak/leakingTopLevelPrivateVarThroughPrivateInlineVarChain.kt");
      }

      @Test
      @TestMetadata("potentiallyClashingFunAccessors.kt")
      public void testPotentiallyClashingFunAccessors() {
        runTest("compiler/testData/klib/syntheticAccessors/topLevelPrivate/crossFilePrivateLeak/potentiallyClashingFunAccessors.kt");
      }

      @Test
      @TestMetadata("potentiallyClashingVarAccessors.kt")
      public void testPotentiallyClashingVarAccessors() {
        runTest("compiler/testData/klib/syntheticAccessors/topLevelPrivate/crossFilePrivateLeak/potentiallyClashingVarAccessors.kt");
      }

      @Test
      @TestMetadata("usePrivateTopLevelConstValFromInternalInline.kt")
      public void testUsePrivateTopLevelConstValFromInternalInline() {
        runTest("compiler/testData/klib/syntheticAccessors/topLevelPrivate/crossFilePrivateLeak/usePrivateTopLevelConstValFromInternalInline.kt");
      }
    }

    @Nested
    @TestMetadata("compiler/testData/klib/syntheticAccessors/topLevelPrivate/crossModulePrivateLeak")
    @TestDataPath("$PROJECT_ROOT")
    @EnforcedProperty(property = ClassLevelProperty.TEST_KIND, propertyValue = "STANDALONE")
    @EnforcedProperty(property = ClassLevelProperty.CACHE_MODE, propertyValue = "NO")
    @UseExtTestCaseGroupProvider()
    public class CrossModulePrivateLeak {
      @Test
      public void testAllFilesPresentInCrossModulePrivateLeak() {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/klib/syntheticAccessors/topLevelPrivate/crossModulePrivateLeak"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.NATIVE, true);
      }

      @Test
      @TestMetadata("leakingPrivateClassThroughtKlass.kt")
      public void testLeakingPrivateClassThroughtKlass() {
        runTest("compiler/testData/klib/syntheticAccessors/topLevelPrivate/crossModulePrivateLeak/leakingPrivateClassThroughtKlass.kt");
      }

      @Test
      @TestMetadata("leakingPrivateClassThroughtTypecheck.kt")
      public void testLeakingPrivateClassThroughtTypecheck() {
        runTest("compiler/testData/klib/syntheticAccessors/topLevelPrivate/crossModulePrivateLeak/leakingPrivateClassThroughtTypecheck.kt");
      }

      @Test
      @TestMetadata("leakingPrivateExtensionFun.kt")
      public void testLeakingPrivateExtensionFun() {
        runTest("compiler/testData/klib/syntheticAccessors/topLevelPrivate/crossModulePrivateLeak/leakingPrivateExtensionFun.kt");
      }

      @Test
      @TestMetadata("leakingPrivateExtensionFunThroughPrivateInlineChain.kt")
      public void testLeakingPrivateExtensionFunThroughPrivateInlineChain() {
        runTest("compiler/testData/klib/syntheticAccessors/topLevelPrivate/crossModulePrivateLeak/leakingPrivateExtensionFunThroughPrivateInlineChain.kt");
      }

      @Test
      @TestMetadata("leakingPrivateExtensionVarThroughInlineFun.kt")
      public void testLeakingPrivateExtensionVarThroughInlineFun() {
        runTest("compiler/testData/klib/syntheticAccessors/topLevelPrivate/crossModulePrivateLeak/leakingPrivateExtensionVarThroughInlineFun.kt");
      }

      @Test
      @TestMetadata("leakingPrivateExtensionVarThroughPrivateInlineVarChain.kt")
      public void testLeakingPrivateExtensionVarThroughPrivateInlineVarChain() {
        runTest("compiler/testData/klib/syntheticAccessors/topLevelPrivate/crossModulePrivateLeak/leakingPrivateExtensionVarThroughPrivateInlineVarChain.kt");
      }

      @Test
      @TestMetadata("leakingPrivateTopLevelFun.kt")
      public void testLeakingPrivateTopLevelFun() {
        runTest("compiler/testData/klib/syntheticAccessors/topLevelPrivate/crossModulePrivateLeak/leakingPrivateTopLevelFun.kt");
      }

      @Test
      @TestMetadata("leakingPrivateTopLevelFunThroughPrivateInlineFunChain.kt")
      public void testLeakingPrivateTopLevelFunThroughPrivateInlineFunChain() {
        runTest("compiler/testData/klib/syntheticAccessors/topLevelPrivate/crossModulePrivateLeak/leakingPrivateTopLevelFunThroughPrivateInlineFunChain.kt");
      }

      @Test
      @TestMetadata("leakingPrivateTopLevelSetterThroughInlineFun.kt")
      public void testLeakingPrivateTopLevelSetterThroughInlineFun() {
        runTest("compiler/testData/klib/syntheticAccessors/topLevelPrivate/crossModulePrivateLeak/leakingPrivateTopLevelSetterThroughInlineFun.kt");
      }

      @Test
      @TestMetadata("leakingPrivateTopLevelSetterThroughInlineVar.kt")
      public void testLeakingPrivateTopLevelSetterThroughInlineVar() {
        runTest("compiler/testData/klib/syntheticAccessors/topLevelPrivate/crossModulePrivateLeak/leakingPrivateTopLevelSetterThroughInlineVar.kt");
      }

      @Test
      @TestMetadata("leakingPrivateTopLevelVarThroughInlineFun.kt")
      public void testLeakingPrivateTopLevelVarThroughInlineFun() {
        runTest("compiler/testData/klib/syntheticAccessors/topLevelPrivate/crossModulePrivateLeak/leakingPrivateTopLevelVarThroughInlineFun.kt");
      }

      @Test
      @TestMetadata("leakingPrivateTopLevelVarThroughInlineFunParameter.kt")
      public void testLeakingPrivateTopLevelVarThroughInlineFunParameter() {
        runTest("compiler/testData/klib/syntheticAccessors/topLevelPrivate/crossModulePrivateLeak/leakingPrivateTopLevelVarThroughInlineFunParameter.kt");
      }

      @Test
      @TestMetadata("leakingPrivateTopLevelVarThroughInlineVar.kt")
      public void testLeakingPrivateTopLevelVarThroughInlineVar() {
        runTest("compiler/testData/klib/syntheticAccessors/topLevelPrivate/crossModulePrivateLeak/leakingPrivateTopLevelVarThroughInlineVar.kt");
      }

      @Test
      @TestMetadata("leakingTopLevelPrivateSetterThroughPrivateInlineFunChain.kt")
      public void testLeakingTopLevelPrivateSetterThroughPrivateInlineFunChain() {
        runTest("compiler/testData/klib/syntheticAccessors/topLevelPrivate/crossModulePrivateLeak/leakingTopLevelPrivateSetterThroughPrivateInlineFunChain.kt");
      }

      @Test
      @TestMetadata("leakingTopLevelPrivateVarThroughPrivateInlineFunChain.kt")
      public void testLeakingTopLevelPrivateVarThroughPrivateInlineFunChain() {
        runTest("compiler/testData/klib/syntheticAccessors/topLevelPrivate/crossModulePrivateLeak/leakingTopLevelPrivateVarThroughPrivateInlineFunChain.kt");
      }

      @Test
      @TestMetadata("leakingTopLevelPrivateVarThroughPrivateInlineVarChain.kt")
      public void testLeakingTopLevelPrivateVarThroughPrivateInlineVarChain() {
        runTest("compiler/testData/klib/syntheticAccessors/topLevelPrivate/crossModulePrivateLeak/leakingTopLevelPrivateVarThroughPrivateInlineVarChain.kt");
      }

      @Test
      @TestMetadata("potentiallyClashingFunAccessors.kt")
      public void testPotentiallyClashingFunAccessors() {
        runTest("compiler/testData/klib/syntheticAccessors/topLevelPrivate/crossModulePrivateLeak/potentiallyClashingFunAccessors.kt");
      }

      @Test
      @TestMetadata("potentiallyClashingVarAccessors.kt")
      public void testPotentiallyClashingVarAccessors() {
        runTest("compiler/testData/klib/syntheticAccessors/topLevelPrivate/crossModulePrivateLeak/potentiallyClashingVarAccessors.kt");
      }

      @Test
      @TestMetadata("usePrivateTopLevelConstValFromInternalInline.kt")
      public void testUsePrivateTopLevelConstValFromInternalInline() {
        runTest("compiler/testData/klib/syntheticAccessors/topLevelPrivate/crossModulePrivateLeak/usePrivateTopLevelConstValFromInternalInline.kt");
      }
    }

    @Nested
    @TestMetadata("compiler/testData/klib/syntheticAccessors/topLevelPrivate/singleFile")
    @TestDataPath("$PROJECT_ROOT")
    @EnforcedProperty(property = ClassLevelProperty.TEST_KIND, propertyValue = "STANDALONE")
    @EnforcedProperty(property = ClassLevelProperty.CACHE_MODE, propertyValue = "NO")
    @UseExtTestCaseGroupProvider()
    public class SingleFile {
      @Test
      public void testAllFilesPresentInSingleFile() {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/klib/syntheticAccessors/topLevelPrivate/singleFile"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.NATIVE, true);
      }

      @Test
      @TestMetadata("usePrivateTopLevelExtensionFunFromInternalInline.kt")
      public void testUsePrivateTopLevelExtensionFunFromInternalInline() {
        runTest("compiler/testData/klib/syntheticAccessors/topLevelPrivate/singleFile/usePrivateTopLevelExtensionFunFromInternalInline.kt");
      }

      @Test
      @TestMetadata("usePrivateTopLevelFunFromInternalInline.kt")
      public void testUsePrivateTopLevelFunFromInternalInline() {
        runTest("compiler/testData/klib/syntheticAccessors/topLevelPrivate/singleFile/usePrivateTopLevelFunFromInternalInline.kt");
      }

      @Test
      @TestMetadata("usePrivateTopLevelSetterFromInternalInlineFun.kt")
      public void testUsePrivateTopLevelSetterFromInternalInlineFun() {
        runTest("compiler/testData/klib/syntheticAccessors/topLevelPrivate/singleFile/usePrivateTopLevelSetterFromInternalInlineFun.kt");
      }

      @Test
      @TestMetadata("usePrivateTopLevelSetterFromInternalInlineVar.kt")
      public void testUsePrivateTopLevelSetterFromInternalInlineVar() {
        runTest("compiler/testData/klib/syntheticAccessors/topLevelPrivate/singleFile/usePrivateTopLevelSetterFromInternalInlineVar.kt");
      }

      @Test
      @TestMetadata("usePrivateTopLevelVarFromInternalInlineFun.kt")
      public void testUsePrivateTopLevelVarFromInternalInlineFun() {
        runTest("compiler/testData/klib/syntheticAccessors/topLevelPrivate/singleFile/usePrivateTopLevelVarFromInternalInlineFun.kt");
      }

      @Test
      @TestMetadata("usePrivateTopLevelVarFromInternalInlineVar.kt")
      public void testUsePrivateTopLevelVarFromInternalInlineVar() {
        runTest("compiler/testData/klib/syntheticAccessors/topLevelPrivate/singleFile/usePrivateTopLevelVarFromInternalInlineVar.kt");
      }
    }
  }
}
