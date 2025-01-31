/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 02 02:15:16 GMT 2024
 */

package com.liferay.portlet.shopping.model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.Repository;
import com.liferay.portal.model.RepositoryWrapper;
import com.liferay.portal.model.Subscription;
import com.liferay.portal.model.SubscriptionWrapper;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.shopping.model.ShoppingCategory;
import com.liferay.portlet.shopping.model.ShoppingCategoryWrapper;
import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ShoppingCategoryWrapper_ESTest extends ShoppingCategoryWrapper_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      ShoppingCategory shoppingCategory0 = mock(ShoppingCategory.class, new ViolatedAssumptionAnswer());
      ShoppingCategoryWrapper shoppingCategoryWrapper0 = new ShoppingCategoryWrapper(shoppingCategory0);
      ServiceContext serviceContext0 = new ServiceContext();
      Date date0 = serviceContext0.getModifiedDate((Date) null);
      Repository repository0 = mock(Repository.class, new ViolatedAssumptionAnswer());
      doReturn("name").when(repository0).getTypeSettings();
      doReturn((-1L)).when(repository0).getClassNameId();
      doReturn((-1993L)).when(repository0).getCompanyId();
      doReturn(date0).when(repository0).getCreateDate();
      doReturn("s_@}K,y\u0006khka6").when(repository0).getDescription();
      doReturn(0L).when(repository0).getDlFolderId();
      doReturn(0L).when(repository0).getGroupId();
      doReturn((Date) null).when(repository0).getModifiedDate();
      doReturn("").when(repository0).getName();
      doReturn("yaF1l").when(repository0).getPortletId();
      doReturn((-1L)).when(repository0).getRepositoryId();
      doReturn(0L).when(repository0).getUserId();
      doReturn("").when(repository0).getUserName();
      doReturn("z+!,pE@1,7r x}YF0").when(repository0).getUuid();
      RepositoryWrapper repositoryWrapper0 = new RepositoryWrapper(repository0);
      Map<String, Object> map0 = repositoryWrapper0.getModelAttributes();
      shoppingCategoryWrapper0.setModelAttributes(map0);
      assertEquals(14, map0.size());
  }
}
