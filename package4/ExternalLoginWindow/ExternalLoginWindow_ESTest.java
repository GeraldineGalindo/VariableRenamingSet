/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 01 23:25:16 GMT 2024
 */

package com.aelitis.azureus.core.metasearch.impl;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.aelitis.azureus.core.metasearch.impl.ExternalLoginListener;
import com.aelitis.azureus.core.metasearch.impl.ExternalLoginWindow;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ExternalLoginWindow_ESTest extends ExternalLoginWindow_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ExternalLoginListener externalLoginListener0 = mock(ExternalLoginListener.class, new ViolatedAssumptionAnswer());
      ExternalLoginWindow externalLoginWindow0 = null;
      try {
        externalLoginWindow0 = new ExternalLoginWindow(externalLoginListener0, "get", "F{q];pvmnh|Wn", true, "session", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.gudy.azureus2.ui.swt.components.shell.ShellFactory", e);
      }
  }
}
