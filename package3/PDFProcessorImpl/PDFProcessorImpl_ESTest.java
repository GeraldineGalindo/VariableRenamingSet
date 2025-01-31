/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 02 02:02:37 GMT 2024
 */

package com.liferay.portlet.documentlibrary.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.liferay.portal.kernel.lar.PortletDataContext;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.repository.model.FileVersion;
import com.liferay.portal.kernel.util.FileUtil;
import com.liferay.portal.kernel.xml.Element;
import com.liferay.portal.lar.PortletDataContextImpl;
import com.liferay.portal.repository.liferayrepository.model.LiferayFileVersion;
import com.liferay.portal.repository.proxy.FileEntryProxyBean;
import com.liferay.portal.repository.proxy.FileVersionProxyBean;
import com.liferay.portal.util.FileImpl;
import com.liferay.portal.xml.ElementImpl;
import com.liferay.portal.zip.ZipWriterImpl;
import com.liferay.portlet.documentlibrary.model.DLFileEntry;
import com.liferay.portlet.documentlibrary.model.DLFileVersion;
import com.liferay.portlet.documentlibrary.model.DLFileVersionWrapper;
import com.liferay.portlet.documentlibrary.util.DLPreviewableProcessor;
import com.liferay.portlet.documentlibrary.util.PDFProcessorImpl;
import java.io.File;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.portlet.EventRequest;
import javax.portlet.filter.EventRequestWrapper;
import org.apache.pdfbox.pdmodel.PDDocumentInformation;
import org.dom4j.Namespace;
import org.dom4j.QName;
import org.dom4j.bean.BeanElement;
import org.dom4j.util.UserDataElement;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class PDFProcessorImpl_ESTest extends PDFProcessorImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PDFProcessorImpl pDFProcessorImpl0 = new PDFProcessorImpl();
      DLFileVersion dLFileVersion0 = mock(DLFileVersion.class, new ViolatedAssumptionAnswer());
      LiferayFileVersion liferayFileVersion0 = new LiferayFileVersion(dLFileVersion0);
      DLFileVersion dLFileVersion1 = mock(DLFileVersion.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(dLFileVersion1).getExtension();
      doReturn(0L, 0L).when(dLFileVersion1).getFileVersionId();
      DLFileVersionWrapper dLFileVersionWrapper0 = new DLFileVersionWrapper(dLFileVersion1);
      LiferayFileVersion liferayFileVersion1 = new LiferayFileVersion(dLFileVersionWrapper0);
      // Undeclared exception!
      try { 
        pDFProcessorImpl0.trigger(liferayFileVersion0, liferayFileVersion1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }
}
