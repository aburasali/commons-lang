/*
 * This file was automatically generated by EvoSuite
 * Thu Sep 26 02:52:59 GMT 2019
 */

package org.apache.commons.lang3.text;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang3.text.StrLookup;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class StrLookup_ESTest extends StrLookup_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StrLookup<String> strLookup0 = StrLookup.systemPropertiesLookup();
      // Undeclared exception!
      try { 
        strLookup0.lookup((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StrLookup<String> strLookup0 = StrLookup.systemPropertiesLookup();
      String string0 = strLookup0.lookup("org.apache.commons.lang3.text.StrLookup$1");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      StrLookup.MapStrLookup<String> strLookup_MapStrLookup0 = new StrLookup.MapStrLookup<String>(hashMap0);
      String string0 = strLookup_MapStrLookup0.lookup("Lm7|A}-aL");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      StrLookup<?> strLookup0 = StrLookup.noneLookup();
      assertNotNull(strLookup0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      StrLookup<String> strLookup0 = StrLookup.systemPropertiesLookup();
      String string0 = strLookup0.lookup("");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      StrLookup<Object> strLookup0 = StrLookup.mapLookup((Map<String, Object>) null);
      String string0 = strLookup0.lookup("wFDLy+309ig");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      StrLookup.MapStrLookup<String> strLookup_MapStrLookup0 = new StrLookup.MapStrLookup<String>(hashMap0);
      hashMap0.put("BUxj!%T`H=h@zEX`s", "BUxj!%T`H=h@zEX`s");
      String string0 = strLookup_MapStrLookup0.lookup("BUxj!%T`H=h@zEX`s");
      assertNotNull(string0);
  }
}
