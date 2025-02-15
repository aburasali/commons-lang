/*
 * This file was automatically generated by EvoSuite
 * Thu Sep 26 02:40:04 GMT 2019
 */

package org.apache.commons.lang3.mutable;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.lang3.mutable.MutableFloat;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MutableFloat_ESTest extends MutableFloat_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MutableFloat mutableFloat0 = new MutableFloat();
      MutableFloat mutableFloat1 = new MutableFloat((-1.0F));
      Short short0 = new Short((short)1342);
      mutableFloat1.add((Number) short0);
      boolean boolean0 = mutableFloat0.equals(mutableFloat1);
      assertEquals(1341.0F, mutableFloat1.getValue(), 0.01F);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MutableFloat mutableFloat0 = new MutableFloat((-1140.0F));
      Byte byte0 = new Byte((byte)111);
      mutableFloat0.subtract((Number) byte0);
      assertEquals("-1251.0", mutableFloat0.toString());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MutableFloat mutableFloat0 = new MutableFloat("1");
      assertEquals(1.0F, mutableFloat0.getValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MutableFloat mutableFloat0 = new MutableFloat(671.0F);
      mutableFloat0.addAndGet(620.3877F);
      mutableFloat0.toFloat();
      assertEquals((byte)11, mutableFloat0.byteValue());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MutableFloat mutableFloat0 = new MutableFloat((-1.0F));
      Float float0 = mutableFloat0.toFloat();
      assertEquals((-1.0F), (float)float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Short short0 = new Short((short)0);
      MutableFloat mutableFloat0 = new MutableFloat((Number) short0);
      long long0 = mutableFloat0.longValue();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Float float0 = new Float(0.0);
      MutableFloat mutableFloat0 = new MutableFloat((Number) float0);
      mutableFloat0.increment();
      long long0 = mutableFloat0.longValue();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Float float0 = new Float(0.0);
      MutableFloat mutableFloat0 = new MutableFloat((Number) float0);
      mutableFloat0.increment();
      int int0 = mutableFloat0.intValue();
      assertEquals(1.0F, mutableFloat0.floatValue(), 0.01F);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MutableFloat mutableFloat0 = new MutableFloat((-1925.9805F));
      int int0 = mutableFloat0.intValue();
      assertEquals((-1925), int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MutableFloat mutableFloat0 = new MutableFloat();
      mutableFloat0.decrement();
      float float0 = mutableFloat0.incrementAndGet();
      assertEquals(0, mutableFloat0.intValue());
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Double double0 = new Double(2420.7722);
      MutableFloat mutableFloat0 = new MutableFloat(double0);
      float float0 = mutableFloat0.incrementAndGet();
      assertEquals(2421.7722F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MutableFloat mutableFloat0 = new MutableFloat(635.91046F);
      Float float0 = mutableFloat0.getValue();
      assertEquals(635.91046F, (float)float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Long long0 = new Long(0L);
      MutableFloat mutableFloat0 = new MutableFloat((Number) long0);
      mutableFloat0.decrementAndGet();
      mutableFloat0.getValue();
      assertEquals((-1), mutableFloat0.intValue());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MutableFloat mutableFloat0 = new MutableFloat((-1925.9805F));
      float float0 = mutableFloat0.getAndIncrement();
      assertEquals((-1924.9805F), mutableFloat0.getValue(), 0.01F);
      assertEquals((-1925.9805F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MutableFloat mutableFloat0 = new MutableFloat(0.0F);
      float float0 = mutableFloat0.getAndDecrement();
      assertEquals((-1.0F), mutableFloat0.getValue(), 0.01F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Float float0 = new Float(1118.0);
      MutableFloat mutableFloat0 = new MutableFloat((Number) float0);
      float float1 = mutableFloat0.getAndDecrement();
      assertEquals((byte)93, mutableFloat0.byteValue());
      assertEquals(1118.0F, float1, 0.01F);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Double double0 = new Double(2420.7722);
      MutableFloat mutableFloat0 = new MutableFloat(double0);
      float float0 = mutableFloat0.getAndAdd((Number) double0);
      assertEquals(4841.5444F, mutableFloat0.toFloat(), 0.01F);
      assertEquals(2420.7722F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Float float0 = new Float(1092.3767383992051);
      MutableFloat mutableFloat0 = new MutableFloat((Number) float0);
      float float1 = mutableFloat0.getAndAdd((-298.9765F));
      assertEquals((byte)25, mutableFloat0.byteValue());
      assertEquals(1092.3767F, float1, 0.01F);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MutableFloat mutableFloat0 = new MutableFloat();
      MutableFloat mutableFloat1 = new MutableFloat(3831.5F);
      mutableFloat0.getAndAdd((Number) mutableFloat1);
      float float0 = mutableFloat0.floatValue();
      assertEquals("3831.5", mutableFloat0.toString());
      assertEquals(3831.5F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MutableFloat mutableFloat0 = new MutableFloat();
      mutableFloat0.decrement();
      float float0 = mutableFloat0.floatValue();
      assertEquals("-1.0", mutableFloat0.toString());
      assertEquals((-1.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MutableFloat mutableFloat0 = new MutableFloat(0.0F);
      double double0 = mutableFloat0.doubleValue();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Float float0 = new Float(0.0);
      MutableFloat mutableFloat0 = new MutableFloat((Number) float0);
      mutableFloat0.increment();
      double double0 = mutableFloat0.doubleValue();
      assertEquals(1.0F, mutableFloat0.toFloat(), 0.01F);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Float float0 = new Float(0.0);
      MutableFloat mutableFloat0 = new MutableFloat((Number) float0);
      mutableFloat0.increment();
      mutableFloat0.getAndIncrement();
      mutableFloat0.add((float) 1);
      mutableFloat0.decrementAndGet();
      mutableFloat0.decrement();
      float float1 = mutableFloat0.decrementAndGet();
      assertEquals(0L, mutableFloat0.longValue());
      assertEquals(0.0F, float1, 0.01F);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Long long0 = new Long(0L);
      MutableFloat mutableFloat0 = new MutableFloat((Number) long0);
      MutableFloat mutableFloat1 = new MutableFloat((-2047.2F));
      int int0 = mutableFloat0.compareTo(mutableFloat1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Double double0 = new Double((-427.29786119));
      MutableFloat mutableFloat0 = new MutableFloat(double0);
      mutableFloat0.getAndAdd((Number) double0);
      MutableFloat mutableFloat1 = new MutableFloat((-427.29785F));
      int int0 = mutableFloat0.compareTo(mutableFloat1);
      assertEquals((byte) (-86), mutableFloat0.byteValue());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MutableFloat mutableFloat0 = new MutableFloat();
      float float0 = mutableFloat0.addAndGet((Number) mutableFloat0);
      assertEquals(0.0F, mutableFloat0.toFloat(), 0.01F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      MutableFloat mutableFloat0 = new MutableFloat();
      Integer integer0 = new Integer(1);
      float float0 = mutableFloat0.addAndGet((Number) integer0);
      assertEquals(1L, mutableFloat0.longValue());
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MutableFloat mutableFloat0 = new MutableFloat();
      Integer integer0 = new Integer(453);
      mutableFloat0.subtract(1566.346F);
      float float0 = mutableFloat0.addAndGet((Number) integer0);
      assertEquals((-1113.346F), mutableFloat0.toFloat(), 0.01F);
      assertEquals((-1113.346F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Integer integer0 = new Integer(0);
      MutableFloat mutableFloat0 = new MutableFloat((Number) integer0);
      float float0 = mutableFloat0.addAndGet((float) 0);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      MutableFloat mutableFloat0 = new MutableFloat();
      // Undeclared exception!
      try { 
        mutableFloat0.subtract((Number) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.mutable.MutableFloat", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      MutableFloat mutableFloat0 = new MutableFloat(0.0F);
      // Undeclared exception!
      try { 
        mutableFloat0.setValue((Number) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.mutable.MutableFloat", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      MutableFloat mutableFloat0 = new MutableFloat(0.0F);
      // Undeclared exception!
      try { 
        mutableFloat0.getAndAdd((Number) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.mutable.MutableFloat", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      MutableFloat mutableFloat0 = new MutableFloat(0.81173056F);
      // Undeclared exception!
      try { 
        mutableFloat0.compareTo((MutableFloat) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.mutable.MutableFloat", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      MutableFloat mutableFloat0 = new MutableFloat();
      // Undeclared exception!
      try { 
        mutableFloat0.add((Number) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.mutable.MutableFloat", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      MutableFloat mutableFloat0 = null;
      try {
        mutableFloat0 = new MutableFloat((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      MutableFloat mutableFloat0 = null;
      try {
        mutableFloat0 = new MutableFloat((Number) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.mutable.MutableFloat", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      MutableFloat mutableFloat0 = new MutableFloat();
      float float0 = mutableFloat0.floatValue();
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      MutableFloat mutableFloat0 = new MutableFloat((-189.16F));
      MutableFloat mutableFloat1 = new MutableFloat();
      boolean boolean0 = mutableFloat1.equals(mutableFloat0);
      assertFalse(mutableFloat0.equals((Object)mutableFloat1));
      assertFalse(boolean0);
      assertEquals((-189.16F), mutableFloat0.toFloat(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      MutableFloat mutableFloat0 = new MutableFloat((-189.16F));
      boolean boolean0 = mutableFloat0.equals(mutableFloat0);
      assertTrue(boolean0);
      assertEquals((byte)67, mutableFloat0.byteValue());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      MutableFloat mutableFloat0 = new MutableFloat((-189.16F));
      Object object0 = new Object();
      boolean boolean0 = mutableFloat0.equals(object0);
      assertFalse(boolean0);
      assertEquals((byte)67, mutableFloat0.byteValue());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      MutableFloat mutableFloat0 = new MutableFloat();
      String string0 = mutableFloat0.toString();
      assertEquals("0.0", string0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      MutableFloat mutableFloat0 = new MutableFloat((-189.16F));
      double double0 = mutableFloat0.doubleValue();
      assertEquals((-189.16000366210938), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      MutableFloat mutableFloat0 = new MutableFloat((-189.16F));
      float float0 = mutableFloat0.addAndGet((float) (-189L));
      assertEquals((-378.16F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      MutableFloat mutableFloat0 = new MutableFloat();
      float float0 = mutableFloat0.getAndIncrement();
      assertEquals(1.0F, mutableFloat0.toFloat(), 0.01F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      MutableFloat mutableFloat0 = new MutableFloat();
      Float float0 = mutableFloat0.toFloat();
      assertEquals(0.0F, (float)float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      MutableFloat mutableFloat0 = new MutableFloat();
      Float float0 = mutableFloat0.getValue();
      assertEquals(0.0F, (float)float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      MutableFloat mutableFloat0 = new MutableFloat();
      float float0 = mutableFloat0.getAndAdd((float) (-1));
      assertEquals((-1.0F), mutableFloat0.getValue(), 0.01F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      MutableFloat mutableFloat0 = new MutableFloat();
      // Undeclared exception!
      try { 
        mutableFloat0.addAndGet((Number) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.mutable.MutableFloat", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      MutableFloat mutableFloat0 = new MutableFloat((-189.16F));
      float float0 = mutableFloat0.getAndDecrement();
      assertEquals((-190.16000366210938), mutableFloat0.doubleValue(), 0.01);
      assertEquals((-189.16F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Long long0 = new Long(44L);
      MutableFloat mutableFloat0 = new MutableFloat((Number) long0);
      boolean boolean0 = mutableFloat0.isInfinite();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      MutableFloat mutableFloat0 = new MutableFloat();
      mutableFloat0.decrementAndGet();
      float float0 = mutableFloat0.getAndAdd((-1193.6346F));
      assertEquals((-1194.6346F), mutableFloat0.floatValue(), 0.01F);
      assertEquals((-1.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      MutableFloat mutableFloat0 = new MutableFloat((-189.16F));
      mutableFloat0.isNaN();
      assertEquals("-189.16", mutableFloat0.toString());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      MutableFloat mutableFloat0 = new MutableFloat();
      mutableFloat0.setValue((-1.0F));
      assertEquals((-1.0F), mutableFloat0.toFloat(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      MutableFloat mutableFloat0 = new MutableFloat((-189.16F));
      mutableFloat0.hashCode();
      assertEquals((byte)67, mutableFloat0.byteValue());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      MutableFloat mutableFloat0 = new MutableFloat();
      int int0 = mutableFloat0.intValue();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      MutableFloat mutableFloat0 = new MutableFloat((-189.16F));
      float float0 = mutableFloat0.incrementAndGet();
      assertEquals((-188.16F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      MutableFloat mutableFloat0 = null;
      try {
        mutableFloat0 = new MutableFloat("");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      MutableFloat mutableFloat0 = new MutableFloat((-189.16F));
      mutableFloat0.setValue((Number) mutableFloat0);
      assertEquals((-189.16F), mutableFloat0.toFloat(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      MutableFloat mutableFloat0 = new MutableFloat((-189.16F));
      long long0 = mutableFloat0.longValue();
      assertEquals((-189L), long0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      MutableFloat mutableFloat0 = new MutableFloat();
      int int0 = mutableFloat0.compareTo(mutableFloat0);
      assertEquals(0, int0);
  }
}
