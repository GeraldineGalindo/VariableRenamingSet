/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 01 23:40:26 GMT 2024
 */

package org.bouncycastle.asn1.pkcs;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.BERSequence;
import org.bouncycastle.asn1.BERSet;
import org.bouncycastle.asn1.DERConstructedSet;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERSet;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.pkcs.CertificationRequestInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x509.X509DefaultEntryConverter;
import org.bouncycastle.asn1.x509.X509Name;
import org.bouncycastle.asn1.x509.X509NameEntryConverter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CertificationRequestInfo_ESTest extends CertificationRequestInfo_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Vector<DERInteger> vector0 = new Vector<DERInteger>();
      Hashtable<DERInteger, DERInteger> hashtable0 = new Hashtable<DERInteger, DERInteger>();
      X509DefaultEntryConverter x509DefaultEntryConverter0 = new X509DefaultEntryConverter();
      X509Name x509Name0 = new X509Name(vector0, hashtable0, x509DefaultEntryConverter0);
      SubjectPublicKeyInfo subjectPublicKeyInfo0 = new SubjectPublicKeyInfo((AlgorithmIdentifier) null, (DEREncodable) null);
      DERTaggedObject dERTaggedObject0 = new DERTaggedObject(1286, subjectPublicKeyInfo0);
      ASN1Set aSN1Set0 = ASN1Set.getInstance((ASN1TaggedObject) dERTaggedObject0, false);
      CertificationRequestInfo certificationRequestInfo0 = new CertificationRequestInfo(x509Name0, subjectPublicKeyInfo0, aSN1Set0);
      ASN1Set aSN1Set1 = certificationRequestInfo0.getAttributes();
      assertEquals("[[null, #0303000500]]", aSN1Set1.toString());
  }
}
