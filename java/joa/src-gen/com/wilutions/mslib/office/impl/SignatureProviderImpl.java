/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B4FC8-A463-DB41-5DAE-69E7A5F7FCBC}")
public class SignatureProviderImpl extends Dispatch implements com.wilutions.mslib.office.SignatureProvider {
  @DeclDISPID(1610743808)  public com.wilutions.mslib.stdole.IPictureDisp GenerateSignatureLineImage(com.wilutions.mslib.office.SignatureLineImage siglnimg, com.wilutions.mslib.office.SignatureSetup psigsetup, com.wilutions.mslib.office.SignatureInfo psiginfo, Object XmlDsigStream) throws ComException {
    assert(siglnimg != null);
    assert(XmlDsigStream != null);
    final Object obj = this._dispatchCall(1610743808,"GenerateSignatureLineImage", DISPATCH_METHOD,null,siglnimg.value,(psigsetup!=null?psigsetup:Dispatch.NULL),(psiginfo!=null?psiginfo:Dispatch.NULL),XmlDsigStream);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.stdole.impl.IPictureDispImpl.class);
  }
  @DeclDISPID(1610743809)  public void ShowSignatureSetup(Object ParentWindow, com.wilutions.mslib.office.SignatureSetup psigsetup) throws ComException {
    assert(ParentWindow != null);
    this._dispatchCall(1610743809,"ShowSignatureSetup", DISPATCH_METHOD,null,ParentWindow,(psigsetup!=null?psigsetup:Dispatch.NULL));
  }
  @DeclDISPID(1610743810)  public void ShowSigningCeremony(Object ParentWindow, com.wilutions.mslib.office.SignatureSetup psigsetup, com.wilutions.mslib.office.SignatureInfo psiginfo) throws ComException {
    assert(ParentWindow != null);
    this._dispatchCall(1610743810,"ShowSigningCeremony", DISPATCH_METHOD,null,ParentWindow,(psigsetup!=null?psigsetup:Dispatch.NULL),(psiginfo!=null?psiginfo:Dispatch.NULL));
  }
  @DeclDISPID(1610743811)  public void SignXmlDsig(Object QueryContinue, com.wilutions.mslib.office.SignatureSetup psigsetup, com.wilutions.mslib.office.SignatureInfo psiginfo, Object XmlDsigStream) throws ComException {
    assert(QueryContinue != null);
    assert(XmlDsigStream != null);
    this._dispatchCall(1610743811,"SignXmlDsig", DISPATCH_METHOD,null,QueryContinue,(psigsetup!=null?psigsetup:Dispatch.NULL),(psiginfo!=null?psiginfo:Dispatch.NULL),XmlDsigStream);
  }
  @DeclDISPID(1610743812)  public void NotifySignatureAdded(Object ParentWindow, com.wilutions.mslib.office.SignatureSetup psigsetup, com.wilutions.mslib.office.SignatureInfo psiginfo) throws ComException {
    assert(ParentWindow != null);
    this._dispatchCall(1610743812,"NotifySignatureAdded", DISPATCH_METHOD,null,ParentWindow,(psigsetup!=null?psigsetup:Dispatch.NULL),(psiginfo!=null?psiginfo:Dispatch.NULL));
  }
  @DeclDISPID(1610743813)  public void VerifyXmlDsig(Object QueryContinue, com.wilutions.mslib.office.SignatureSetup psigsetup, com.wilutions.mslib.office.SignatureInfo psiginfo, Object XmlDsigStream, ByRef<com.wilutions.mslib.office.ContentVerificationResults> pcontverres, ByRef<com.wilutions.mslib.office.CertificateVerificationResults> pcertverres) throws ComException {
    assert(QueryContinue != null);
    assert(XmlDsigStream != null);
    this._dispatchCall(1610743813,"VerifyXmlDsig", DISPATCH_METHOD,null,QueryContinue,(psigsetup!=null?psigsetup:Dispatch.NULL),(psiginfo!=null?psiginfo:Dispatch.NULL),XmlDsigStream,(pcontverres!=null?pcontverres:Dispatch.NULL),(pcertverres!=null?pcertverres:Dispatch.NULL));
  }
  @DeclDISPID(1610743814)  public void ShowSignatureDetails(Object ParentWindow, com.wilutions.mslib.office.SignatureSetup psigsetup, com.wilutions.mslib.office.SignatureInfo psiginfo, Object XmlDsigStream, ByRef<com.wilutions.mslib.office.ContentVerificationResults> pcontverres, ByRef<com.wilutions.mslib.office.CertificateVerificationResults> pcertverres) throws ComException {
    assert(ParentWindow != null);
    assert(XmlDsigStream != null);
    this._dispatchCall(1610743814,"ShowSignatureDetails", DISPATCH_METHOD,null,ParentWindow,(psigsetup!=null?psigsetup:Dispatch.NULL),(psiginfo!=null?psiginfo:Dispatch.NULL),XmlDsigStream,(pcontverres!=null?pcontverres:Dispatch.NULL),(pcertverres!=null?pcertverres:Dispatch.NULL));
  }
  @DeclDISPID(1610743815)  public Object GetProviderDetail(com.wilutions.mslib.office.SignatureProviderDetail sigprovdet) throws ComException {
    assert(sigprovdet != null);
    final Object obj = this._dispatchCall(1610743815,"GetProviderDetail", DISPATCH_METHOD,null,sigprovdet.value);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1610743816)  public Byte[] HashStream(Object QueryContinue, Object Stream) throws ComException {
    assert(QueryContinue != null);
    assert(Stream != null);
    final Object obj = this._dispatchCall(1610743816,"HashStream", DISPATCH_METHOD,null,QueryContinue,Stream);
    if (obj == null) return null;
    return (Byte[])obj;
  }
  public SignatureProviderImpl(String progId) throws ComException {
    super(progId);
  }
  protected SignatureProviderImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[SignatureProviderImpl" + super.toString() + "]";
  }
}
