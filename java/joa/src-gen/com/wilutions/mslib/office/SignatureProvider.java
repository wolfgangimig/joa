/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * SignatureProvider.
 * 
 */
@CoInterface(guid="{000CD6A3-0000-0000-C000-000000000046}")
public interface SignatureProvider extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public com.wilutions.mslib.stdole.IPictureDisp GenerateSignatureLineImage(SignatureLineImage siglnimg, SignatureSetup psigsetup, SignatureInfo psiginfo, Object XmlDsigStream) throws ComException;
  @DeclDISPID(1610743809)  public void ShowSignatureSetup(Object ParentWindow, SignatureSetup psigsetup) throws ComException;
  @DeclDISPID(1610743810)  public void ShowSigningCeremony(Object ParentWindow, SignatureSetup psigsetup, SignatureInfo psiginfo) throws ComException;
  @DeclDISPID(1610743811)  public void SignXmlDsig(Object QueryContinue, SignatureSetup psigsetup, SignatureInfo psiginfo, Object XmlDsigStream) throws ComException;
  @DeclDISPID(1610743812)  public void NotifySignatureAdded(Object ParentWindow, SignatureSetup psigsetup, SignatureInfo psiginfo) throws ComException;
  @DeclDISPID(1610743813)  public void VerifyXmlDsig(Object QueryContinue, SignatureSetup psigsetup, SignatureInfo psiginfo, Object XmlDsigStream, ByRef<ContentVerificationResults> pcontverres, ByRef<CertificateVerificationResults> pcertverres) throws ComException;
  @DeclDISPID(1610743814)  public void ShowSignatureDetails(Object ParentWindow, SignatureSetup psigsetup, SignatureInfo psiginfo, Object XmlDsigStream, ByRef<ContentVerificationResults> pcontverres, ByRef<CertificateVerificationResults> pcertverres) throws ComException;
  @DeclDISPID(1610743815)  public Object GetProviderDetail(SignatureProviderDetail sigprovdet) throws ComException;
  @DeclDISPID(1610743816)  public Byte[] HashStream(Object QueryContinue, Object Stream) throws ComException;
}
