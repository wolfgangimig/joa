/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B4FC9-A463-DB41-5DAE-69E7A5F7FCBC}")
public class SignatureInfoImpl extends Dispatch implements com.wilutions.mslib.office.SignatureInfo {
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"Creator", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1)  public Boolean getReadOnly() throws ComException {
    final Object obj = this._dispatchCall(1,"ReadOnly", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(2)  public String getSignatureProvider() throws ComException {
    final Object obj = this._dispatchCall(2,"SignatureProvider", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(3)  public String getSignatureText() throws ComException {
    final Object obj = this._dispatchCall(3,"SignatureText", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(3)  public void setSignatureText(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(3,"SignatureText", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(4)  public com.wilutions.mslib.stdole.IPictureDisp getSignatureImage() throws ComException {
    final Object obj = this._dispatchCall(4,"SignatureImage", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.stdole.impl.IPictureDispImpl.class);
  }
  @DeclDISPID(4)  public void setSignatureImage(final com.wilutions.mslib.stdole.IPictureDisp value) throws ComException {
    this._dispatchCall(4,"SignatureImage", DISPATCH_PROPERTYPUT,(value!=null?value:Dispatch.NULL));
  }
  @DeclDISPID(5)  public String getSignatureComment() throws ComException {
    final Object obj = this._dispatchCall(5,"SignatureComment", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(5)  public void setSignatureComment(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(5,"SignatureComment", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(6)  public Object GetSignatureDetail(final com.wilutions.mslib.office.SignatureDetail sigdet) throws ComException {
    assert(sigdet != null);
    final Object obj = this._dispatchCall(6,"GetSignatureDetail", DISPATCH_METHOD,null,sigdet.value);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(7)  public Object GetCertificateDetail(final com.wilutions.mslib.office.CertificateDetail certdet) throws ComException {
    assert(certdet != null);
    final Object obj = this._dispatchCall(7,"GetCertificateDetail", DISPATCH_METHOD,null,certdet.value);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(8)  public com.wilutions.mslib.office.ContentVerificationResults getContentVerificationResults() throws ComException {
    final Object obj = this._dispatchCall(8,"ContentVerificationResults", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.ContentVerificationResults.valueOf((Integer)obj);
  }
  @DeclDISPID(9)  public com.wilutions.mslib.office.CertificateVerificationResults getCertificateVerificationResults() throws ComException {
    final Object obj = this._dispatchCall(9,"CertificateVerificationResults", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.CertificateVerificationResults.valueOf((Integer)obj);
  }
  @DeclDISPID(10)  public Boolean getIsValid() throws ComException {
    final Object obj = this._dispatchCall(10,"IsValid", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(11)  public Boolean getIsCertificateExpired() throws ComException {
    final Object obj = this._dispatchCall(11,"IsCertificateExpired", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(12)  public Boolean getIsCertificateRevoked() throws ComException {
    final Object obj = this._dispatchCall(12,"IsCertificateRevoked", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(13)  public Boolean getIsCertificateUntrusted() throws ComException {
    final Object obj = this._dispatchCall(13,"IsCertificateUntrusted", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(14)  public void ShowSignatureCertificate(final Object ParentWindow) throws ComException {
    assert(ParentWindow != null);
    this._dispatchCall(14,"ShowSignatureCertificate", DISPATCH_METHOD,null,ParentWindow);
  }
  @DeclDISPID(15)  public void SelectSignatureCertificate(final Object ParentWindow) throws ComException {
    assert(ParentWindow != null);
    this._dispatchCall(15,"SelectSignatureCertificate", DISPATCH_METHOD,null,ParentWindow);
  }
  @DeclDISPID(16)  public void SelectCertificateDetailByThumbprint(final String bstrThumbprint) throws ComException {
    assert(bstrThumbprint != null);
    this._dispatchCall(16,"SelectCertificateDetailByThumbprint", DISPATCH_METHOD,null,bstrThumbprint);
  }
  public SignatureInfoImpl(String progId) throws ComException {
    super(progId, "{000CD6A2-0000-0000-C000-000000000046}");
  }
  protected SignatureInfoImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[SignatureInfoImpl" + super.toString() + "]";
  }
}
