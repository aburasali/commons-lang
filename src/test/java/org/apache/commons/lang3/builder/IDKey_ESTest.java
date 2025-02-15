/*
 * This file was automatically generated by EvoSuite
 * Thu Sep 26 01:52:30 GMT 2019
 */

package org.apache.commons.lang3.builder;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.lang3.builder.IDKey;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class IDKey_ESTest extends IDKey_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Object object0 = new Object();
      IDKey iDKey0 = new IDKey(object0);
      IDKey iDKey1 = new IDKey(object0);
      boolean boolean0 = iDKey0.equals(iDKey1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Object object0 = new Object();
      IDKey iDKey0 = new IDKey(object0);
      IDKey iDKey1 = new IDKey(iDKey0);
      boolean boolean0 = iDKey0.equals(iDKey1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Object object0 = new Object();
      IDKey iDKey0 = new IDKey(object0);
      IDKey iDKey1 = new IDKey(iDKey0);
      boolean boolean0 = iDKey1.equals(iDKey0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Object object0 = new Object();
      IDKey iDKey0 = new IDKey(object0);
      boolean boolean0 = iDKey0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Object object0 = new Object();
      IDKey iDKey0 = new IDKey(object0);
      iDKey0.hashCode();
  }
}
