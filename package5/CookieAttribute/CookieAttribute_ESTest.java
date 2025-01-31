/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 02 03:01:53 GMT 2024
 */

package org.jsecurity.web.attr;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.beans.PropertyEditorSupport;
import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestWrapper;
import javax.servlet.ServletResponse;
import javax.servlet.ServletResponseWrapper;
import javax.swing.JComboBox;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jsecurity.web.attr.CookieAttribute;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CookieAttribute_ESTest extends CookieAttribute_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Class<PropertyEditorSupport> class0 = PropertyEditorSupport.class;
      CookieAttribute<PropertyEditorSupport> cookieAttribute0 = new CookieAttribute<PropertyEditorSupport>("Added Cookie [", "v8eb|ipE0N7jYnYs-", 0, class0);
      String string0 = cookieAttribute0.getPath();
      assertEquals("v8eb|ipE0N7jYnYs-", string0);
      assertEquals(0, cookieAttribute0.getMaxAge());
      assertNotNull(string0);
      assertFalse(cookieAttribute0.isSecure());
  }
}
