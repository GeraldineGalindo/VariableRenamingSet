/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 02 02:10:51 GMT 2024
 */

package com.liferay.portlet.polls.model.impl;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.liferay.portal.kernel.util.LocalizationUtil;
import com.liferay.portal.model.Repository;
import com.liferay.portal.model.RepositoryWrapper;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.LocalizationImpl;
import com.liferay.portlet.polls.model.PollsChoice;
import com.liferay.portlet.polls.model.PollsChoiceSoap;
import com.liferay.portlet.polls.model.PollsChoiceWrapper;
import com.liferay.portlet.polls.model.impl.PollsChoiceImpl;
import com.liferay.portlet.polls.model.impl.PollsChoiceModelImpl;
import java.io.Serializable;
import java.lang.reflect.Proxy;
import java.util.Date;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class PollsChoiceModelImpl_ESTest extends PollsChoiceModelImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PollsChoiceSoap pollsChoiceSoap0 = new PollsChoiceSoap();
      PollsChoice pollsChoice0 = PollsChoiceModelImpl.toModel(pollsChoiceSoap0);
      PollsChoiceModelImpl pollsChoiceModelImpl0 = new PollsChoiceModelImpl();
      pollsChoiceModelImpl0.setName("IjK2V");
      int int0 = pollsChoiceModelImpl0.compareTo(pollsChoice0);
      assertEquals((-1L), pollsChoiceModelImpl0.getColumnBitmask());
      assertEquals(5, int0);
  }
}
