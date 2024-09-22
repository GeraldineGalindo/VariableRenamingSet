/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 02 01:57:55 GMT 2024
 */

package com.liferay.portlet.documentlibrary.model.impl;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.liferay.portal.kernel.util.UnicodeProperties;
import com.liferay.portal.model.EmailAddress;
import com.liferay.portal.model.EmailAddressWrapper;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portlet.documentlibrary.model.DLFileEntry;
import com.liferay.portlet.documentlibrary.model.DLFileEntrySoap;
import com.liferay.portlet.documentlibrary.model.DLFileEntryWrapper;
import com.liferay.portlet.documentlibrary.model.impl.DLFileEntryImpl;
import com.liferay.portlet.documentlibrary.model.impl.DLFileEntryModelImpl;
import java.io.Serializable;
import java.lang.reflect.Proxy;
import java.sql.Time;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.firebirdsql.gds.XSQLVAR;
import org.hibernate.collection.PersistentSortedMap;
import org.hibernate.engine.SessionImplementor;
import org.hibernate.impl.CriteriaImpl;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DLFileEntryModelImpl_ESTest extends DLFileEntryModelImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      DLFileEntryImpl dLFileEntryImpl0 = new DLFileEntryImpl();
      SessionImplementor sessionImplementor0 = mock(SessionImplementor.class, new ViolatedAssumptionAnswer());
      CriteriaImpl criteriaImpl0 = new CriteriaImpl("drop table DLFileEntry", ".+(f*u", sessionImplementor0);
      SessionImplementor sessionImplementor1 = criteriaImpl0.getSession();
      TreeMap<Date, Date> treeMap0 = new TreeMap<Date, Date>();
      java.sql.Date date0 = XSQLVAR.decodeDate((byte[]) null);
      SortedMap<Date, Date> sortedMap0 = treeMap0.subMap((Date) date0, (Date) date0);
      PersistentSortedMap persistentSortedMap0 = new PersistentSortedMap(sessionImplementor1, sortedMap0);
      // Undeclared exception!
      try { 
        dLFileEntryImpl0.setModelAttributes(persistentSortedMap0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
