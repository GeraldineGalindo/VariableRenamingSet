/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 02 04:04:11 GMT 2024
 */

package org.exolab.jms.tranlog;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedOutputStream;
import java.io.ObjectInput;
import java.io.ObjectOutputStream;
import java.io.PipedOutputStream;
import javax.transaction.xa.Xid;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.exolab.jms.tranlog.ExternalXid;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ExternalXid_ESTest extends ExternalXid_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byte[] byteArray1 = new byte[0];
      ExternalXid externalXid0 = new ExternalXid(35, byteArray0, byteArray1);
      ExternalXid externalXid1 = new ExternalXid(externalXid0);
      boolean boolean0 = externalXid0.equals(externalXid1);
      assertEquals(35, externalXid0.getFormatId());
      assertFalse(boolean0);
  }
}
