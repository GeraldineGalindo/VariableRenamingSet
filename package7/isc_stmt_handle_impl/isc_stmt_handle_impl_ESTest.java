/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 02 02:39:51 GMT 2024
 */

package org.firebirdsql.gds.impl.jni;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.firebirdsql.gds.GDSException;
import org.firebirdsql.gds.XSQLDA;
import org.firebirdsql.gds.impl.jni.isc_db_handle_impl;
import org.firebirdsql.gds.impl.jni.isc_stmt_handle_impl;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class isc_stmt_handle_impl_ESTest extends isc_stmt_handle_impl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      isc_stmt_handle_impl0.ensureCapacity(1);
      assertEquals(0, isc_stmt_handle_impl0.size());
      
      byte[][] byteArray0 = new byte[1][9];
      isc_stmt_handle_impl0.addRow(byteArray0);
      int int0 = isc_stmt_handle_impl0.size();
      assertEquals(1, int0);
  }
}
