/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 02 04:14:21 GMT 2024
 */

package macaw.presentationLayer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import macaw.businessLayer.DerivedVariable;
import macaw.businessLayer.MacawCurationAPI;
import macaw.businessLayer.User;
import macaw.businessLayer.ValueLabel;
import macaw.businessLayer.Variable;
import macaw.persistenceLayer.demo.DemonstrationCurationService;
import macaw.persistenceLayer.demo.DemonstrationRetrievalService;
import macaw.persistenceLayer.production.ProductionCurationService;
import macaw.presentationLayer.VariableLabelTableModel;
import macaw.system.SessionProperties;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class VariableLabelTableModel_ESTest extends VariableLabelTableModel_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ValueLabel valueLabel0 = new ValueLabel();
      ValueLabel.EditingOperationType valueLabel_EditingOperationType0 = ValueLabel.EditingOperationType.EDIT;
      valueLabel0.setEditingOperationType(valueLabel_EditingOperationType0);
      VariableLabelTableModel variableLabelTableModel0 = new VariableLabelTableModel((MacawCurationAPI) null, true);
      variableLabelTableModel0.addValueLabel(0, valueLabel0);
      Object object0 = variableLabelTableModel0.getValueAt(0, 2147483645);
      variableLabelTableModel0.setValueAt(object0, 0, 2);
      assertEquals(1, variableLabelTableModel0.getRowCount());
  }
}
