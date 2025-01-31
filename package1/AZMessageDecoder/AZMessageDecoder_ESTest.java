/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 01 23:37:08 GMT 2024
 */

package com.aelitis.azureus.core.peermanager.messaging.azureus;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.aelitis.azureus.core.networkmanager.ProtocolEndpoint;
import com.aelitis.azureus.core.networkmanager.Transport;
import com.aelitis.azureus.core.networkmanager.impl.TransportCipher;
import com.aelitis.azureus.core.networkmanager.impl.TransportHelperFilter;
import com.aelitis.azureus.core.networkmanager.impl.TransportHelperFilterInserter;
import com.aelitis.azureus.core.networkmanager.impl.TransportHelperFilterStreamCipher;
import com.aelitis.azureus.core.networkmanager.impl.TransportHelperFilterSwitcher;
import com.aelitis.azureus.core.networkmanager.impl.TransportHelperFilterTransparent;
import com.aelitis.azureus.core.networkmanager.impl.tcp.LightweightTCPTransport;
import com.aelitis.azureus.core.networkmanager.impl.tcp.ProtocolEndpointTCP;
import com.aelitis.azureus.core.networkmanager.impl.tcp.TCPTransportHelper;
import com.aelitis.azureus.core.networkmanager.impl.tcp.TCPTransportImpl;
import com.aelitis.azureus.core.peermanager.messaging.Message;
import com.aelitis.azureus.core.peermanager.messaging.azureus.AZMessageDecoder;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.NotYetConnectedException;
import java.nio.channels.SocketChannel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class AZMessageDecoder_ESTest extends AZMessageDecoder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AZMessageDecoder aZMessageDecoder0 = new AZMessageDecoder();
      byte[] byteArray0 = new byte[2];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      TCPTransportHelper tCPTransportHelper0 = new TCPTransportHelper((SocketChannel) null);
      TransportHelperFilterTransparent transportHelperFilterTransparent0 = new TransportHelperFilterTransparent(tCPTransportHelper0, true);
      TransportHelperFilterSwitcher transportHelperFilterSwitcher0 = new TransportHelperFilterSwitcher(transportHelperFilterTransparent0, transportHelperFilterTransparent0, 65536, (-128));
      TransportHelperFilterSwitcher transportHelperFilterSwitcher1 = new TransportHelperFilterSwitcher(transportHelperFilterSwitcher0, transportHelperFilterTransparent0, byteBuffer0);
      ProtocolEndpoint protocolEndpoint0 = mock(ProtocolEndpoint.class, new ViolatedAssumptionAnswer());
      LightweightTCPTransport lightweightTCPTransport0 = new LightweightTCPTransport(protocolEndpoint0, transportHelperFilterSwitcher1);
      aZMessageDecoder0.performStreamDecode(lightweightTCPTransport0, 1529);
      int int0 = aZMessageDecoder0.getProtocolBytesDecoded();
      assertTrue(aZMessageDecoder0.getLastReadMadeProgress());
      assertEquals(2, int0);
  }
}
