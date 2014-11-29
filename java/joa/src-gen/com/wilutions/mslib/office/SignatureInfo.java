/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * SignatureInfo.
 * 
 */
@CoInterface(guid="{000CD6A2-0000-0000-C000-000000000046}")
public interface SignatureInfo extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(1)  public Boolean getReadOnly() throws ComException;
  @DeclDISPID(2)  public String getSignatureProvider() throws ComException;
  @DeclDISPID(3)  public String getSignatureText() throws ComException;
  @DeclDISPID(3)  public void setSignatureText(String value) throws ComException;
  @DeclDISPID(4)  public com.wilutions.mslib.stdole.IPictureDisp getSignatureImage() throws ComException;
  @DeclDISPID(4)  public void setSignatureImage(com.wilutions.mslib.stdole.IPictureDisp value) throws ComException;
  @DeclDISPID(5)  public String getSignatureComment() throws ComException;
  @DeclDISPID(5)  public void setSignatureComment(String value) throws ComException;
  @DeclDISPID(6)  public Object GetSignatureDetail(SignatureDetail sigdet) throws ComException;
  @DeclDISPID(7)  public Object GetCertificateDetail(CertificateDetail certdet) throws ComException;
  @DeclDISPID(8)  public ContentVerificationResults getContentVerificationResults() throws ComException;
  @DeclDISPID(9)  public CertificateVerificationResults getCertificateVerificationResults() throws ComException;
  @DeclDISPID(10)  public Boolean getIsValid() throws ComException;
  @DeclDISPID(11)  public Boolean getIsCertificateExpired() throws ComException;
  @DeclDISPID(12)  public Boolean getIsCertificateRevoked() throws ComException;
  @DeclDISPID(13)  public Boolean getIsCertificateUntrusted() throws ComException;
  @DeclDISPID(14)  public void ShowSignatureCertificate(Object ParentWindow) throws ComException;
  @DeclDISPID(15)  public void SelectSignatureCertificate(Object ParentWindow) throws ComException;
  @DeclDISPID(16)  public void SelectCertificateDetailByThumbprint(String bstrThumbprint) throws ComException;
}
