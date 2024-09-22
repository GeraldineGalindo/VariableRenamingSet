/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 01 23:48:47 GMT 2024
 */

package org.gudy.azureus2.pluginsimpl.local.clientid;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.net.Socket;
import java.util.Properties;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.net.MockSocket;
import org.gudy.azureus2.core3.torrent.TOTorrent;
import org.gudy.azureus2.plugins.clientid.ClientIDGenerator;
import org.gudy.azureus2.pluginsimpl.local.clientid.ClientIDManagerImpl;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ClientIDManagerImpl_ESTest extends ClientIDManagerImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ClientIDManagerImpl clientIDManagerImpl0 = ClientIDManagerImpl.getSingleton();
      MockSocket mockSocket0 = new MockSocket();
      ClientIDManagerImpl.httpFilter clientIDManagerImpl_httpFilter0 = clientIDManagerImpl0.new httpFilter(mockSocket0);
      clientIDManagerImpl_httpFilter0.interruptTask();
      assertNull(clientIDManagerImpl_httpFilter0.getName());
  }
}
