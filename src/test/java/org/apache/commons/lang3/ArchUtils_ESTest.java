/*
 * This file was automatically generated by EvoSuite
 * Thu Sep 26 02:48:02 GMT 2019
 */

package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.lang3.ArchUtils;
import org.apache.commons.lang3.arch.Processor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ArchUtils_ESTest extends ArchUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Processor processor0 = ArchUtils.getProcessor("rDu");
      assertNull(processor0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Processor processor0 = ArchUtils.getProcessor("power_pc");
      assertEquals(Processor.Type.PPC, processor0.getType());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ArchUtils archUtils0 = new ArchUtils();
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Processor processor0 = ArchUtils.getProcessor();
      assertEquals(Processor.Arch.BIT_64, processor0.getArch());
  }
}
