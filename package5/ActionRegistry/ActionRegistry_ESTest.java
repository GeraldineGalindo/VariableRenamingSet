/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 02 05:02:35 GMT 2024
 */

package wheel.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import wheel.ErrorPage;
import wheel.components.Component;
import wheel.components.XmlEntityRef;
import wheel.util.ActionRegistry;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ActionRegistry_ESTest extends ActionRegistry_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ActionRegistry actionRegistry0 = new ActionRegistry();
      actionRegistry0.addEntry("wheel.ErrorPage", "wheel.ErrorPage", false);
      ErrorPage errorPage0 = new ErrorPage();
      boolean boolean0 = actionRegistry0.needsRebuilding(errorPage0, "wheel.ErrorPage");
      assertFalse(boolean0);
  }
}
