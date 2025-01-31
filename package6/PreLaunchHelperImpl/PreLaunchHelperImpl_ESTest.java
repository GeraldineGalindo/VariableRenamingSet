/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 01 23:02:55 GMT 2024
 */

package net.sourceforge.squirrel_sql.client.update.gui.installer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.HeadlessException;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import net.sourceforge.squirrel_sql.client.update.UpdateUtil;
import net.sourceforge.squirrel_sql.client.update.UpdateUtilImpl;
import net.sourceforge.squirrel_sql.client.update.gui.ArtifactStatus;
import net.sourceforge.squirrel_sql.client.update.gui.installer.ArtifactInstallerFactory;
import net.sourceforge.squirrel_sql.client.update.gui.installer.ArtifactInstallerFactoryImpl;
import net.sourceforge.squirrel_sql.client.update.gui.installer.PreLaunchHelperImpl;
import net.sourceforge.squirrel_sql.fw.util.IOUtilities;
import net.sourceforge.squirrel_sql.fw.util.IOUtilitiesImpl;
import net.sourceforge.squirrel_sql.fw.util.ScriptLineFixer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class PreLaunchHelperImpl_ESTest extends PreLaunchHelperImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PreLaunchHelperImpl preLaunchHelperImpl0 = new PreLaunchHelperImpl();
      preLaunchHelperImpl0.setScriptLocation(";?'%v(");
      String string0 = preLaunchHelperImpl0.getScriptLocation();
      assertEquals(";?'%v(", string0);
  }
}
