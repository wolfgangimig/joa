/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B4FC8-A463-DB41-5DAE-69E7A5F7FCBC}")
public class SignatureProviderImpl extends Dispatch implements com.wilutions.mslib.office.SignatureProvider {
  @DeclDISPID(1610743808)  public com.wilutions.mslib.stdole.IPictureDisp GenerateSignatureLineImage(final com.wilutions.mslib.office.SignatureLineImage siglnimg, final com.wilutions.mslib.office.SignatureSetup psigsetup, final com.wilutions.mslib.office.SignatureInfo psiginfo, final Object XmlDsigStream) throws ComException {
    assert(siglnimg != null);
    assert(XmlDsigStream != null);
    final Object obj = this._dispatchCall(1610743808,"GenerateSignatureLineImage", DISPATCH_METHOD,null,siglnimg.value,Dispatch.param(psigsetup),Dispatch.param(psiginfo),XmlDsigStream);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.stdole.impl.IPictureDispImpl.class);
  }
  @DeclDISPID(1610743809)  public void ShowSignatureSetup(final Object ParentWindow, final com.wilutions.mslib.office.SignatureSetup psigsetup) throws ComException {
    assert(ParentWindow != null);
    this._dispatchCall(1610743809,"ShowSignatureSetup", DISPATCH_METHOD,null,ParentWindow,Dispatch.param(psigsetup));
  }
  @DeclDISPID(1610743810)  public void ShowSigningCeremony(final Object ParentWindow, final com.wilutions.mslib.office.SignatureSetup psigsetup, final com.wilutions.mslib.office.SignatureInfo psiginfo) throws ComException {
    assert(ParentWindow != null);
    this._dispatchCall(1610743810,"ShowSigningCeremony", DISPATCH_METHOD,null,ParentWindow,Dispatch.param(psigsetup),Dispatch.param(psiginfo));
  }
  @DeclDISPID(1610743811)  public void SignXmlDsig(final Object QueryContinue, final com.wilutions.mslib.office.SignatureSetup psigsetup, final com.wilutions.mslib.office.SignatureInfo psiginfo, final Object XmlDsigStream) throws ComException {
    assert(QueryContinue != null);
    assert(XmlDsigStream != null);
    this._dispatchCall(1610743811,"SignXmlDsig", DISPATCH_METHOD,null,QueryContinue,Dispatch.param(psigsetup),Dispatch.param(psiginfo),XmlDsigStream);
  }
  @DeclDISPID(1610743812)  public void NotifySignatureAdded(final Object ParentWindow, final com.wilutions.mslib.office.SignatureSetup psigsetup, final com.wilutions.mslib.office.SignatureInfo psiginfo) throws ComException {
    assert(ParentWindow != null);
    this._dispatchCall(1610743812,"NotifySignatureAdded", DISPATCH_METHOD,null,ParentWindow,Dispatch.param(psigsetup),Dispatch.param(psiginfo));
  }
  @DeclDISPID(1610743813)  public void VerifyXmlDsig(final Object QueryContinue, final com.wilutions.mslib.office.SignatureSetup psigsetup, final com.wilutions.mslib.office.SignatureInfo psiginfo, final Object XmlDsigStream, final ByRef<com.wilutions.mslib.office.ContentVerificationResults> pcontverres, final ByRef<com.wilutions.mslib.office.CertificateVerificationResults> pcertverres) throws ComException {
    assert(QueryContinue != null);
    assert(XmlDsigStream != null);
    this._dispatchCall(1610743813,"VerifyXmlDsig", DISPATCH_METHOD,null,QueryContinue,Dispatch.param(psigsetup),Dispatch.param(psiginfo),XmlDsigStream,Dispatch.param(pcontverres),Dispatch.param(pcertverres));
  }
  @DeclDISPID(1610743814)  public void ShowSignatureDetails(final Object ParentWindow, final com.wilutions.mslib.office.SignatureSetup psigsetup, final com.wilutions.mslib.office.SignatureInfo psiginfo, final Object XmlDsigStream, final ByRef<com.wilutions.mslib.office.ContentVerificationResults> pcontverres, final ByRef<com.wilutions.mslib.office.CertificateVerificationResults> pcertverres) throws ComException {
    assert(ParentWindow != null);
    assert(XmlDsigStream != null);
    this._dispatchCall(1610743814,"ShowSignatureDetails", DISPATCH_METHOD,null,ParentWindow,Dispatch.param(psigsetup),Dispatch.param(psiginfo),XmlDsigStream,Dispatch.param(pcontverres),Dispatch.param(pcertverres));
  }
  @DeclDISPID(1610743815)  public Object GetProviderDetail(final com.wilutions.mslib.office.SignatureProviderDetail sigprovdet) throws ComException {
    assert(sigprovdet != null);
    final Object obj = this._dispatchCall(1610743815,"GetProviderDetail", DISPATCH_METHOD,null,sigprovdet.value);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1610743816)  public Byte[] HashStream(final Object QueryContinue, final Object Stream) throws ComException {
    assert(QueryContinue != null);
    assert(Stream != null);
    final Object obj = this._dispatchCall(1610743816,"HashStream", DISPATCH_METHOD,null,QueryContinue,Stream);
    if (obj == null) return null;
    return (Byte[])obj;
  }
  public SignatureProviderImpl(String progId) throws ComException {
    super(progId, "{000CD6A3-0000-0000-C000-000000000046}");
  }
  protected SignatureProviderImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[SignatureProviderImpl" + super.toString() + "]";
  }
}
