/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 02 01:10:53 GMT 2024
 */

package com.liferay.portal.kernel.cluster;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.liferay.portal.cluster.AddressImpl;
import com.liferay.portal.cluster.ClusterExecutorImpl;
import com.liferay.portal.cluster.DebuggingClusterEventListenerImpl;
import com.liferay.portal.kernel.cluster.Address;
import com.liferay.portal.kernel.cluster.ClusterEventListener;
import com.liferay.portal.kernel.cluster.ClusterExecutor;
import com.liferay.portal.kernel.cluster.ClusterExecutorUtil;
import com.liferay.portal.kernel.cluster.ClusterNode;
import com.liferay.portal.kernel.cluster.ClusterRequest;
import com.liferay.portal.kernel.cluster.ClusterResponseCallback;
import com.liferay.portal.kernel.cluster.FutureClusterResponses;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ClusterExecutorUtil_ESTest extends ClusterExecutorUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClusterExecutor clusterExecutor0 = ClusterExecutorUtil.getClusterExecutor();
      assertNull(clusterExecutor0);
  }
}
