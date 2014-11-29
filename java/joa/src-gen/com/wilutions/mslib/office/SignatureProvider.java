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
  @DeclDISPID(1610743808)  public com.wilutions.mslib.stdole.IPictureDisp GenerateSignatureLineImage(final SignatureLineImage siglnimg, final SignatureSetup psigsetup, final SignatureInfo psiginfo, final Object XmlDsigStream) throws ComException;
  @DeclDISPID(1610743809)  public void ShowSignatureSetup(final Object ParentWindow, final SignatureSetup psigsetup) throws ComException;
  @DeclDISPID(1610743810)  public void ShowSigningCeremony(final Object ParentWindow, final SignatureSetup psigsetup, final SignatureInfo psiginfo) throws ComException;
  @DeclDISPID(1610743811)  public void SignXmlDsig(final Object QueryContinue, final SignatureSetup psigsetup, final SignatureInfo psiginfo, final Object XmlDsigStream) throws ComException;
  @DeclDISPID(1610743812)  public void NotifySignatureAdded(final Object ParentWindow, final SignatureSetup psigsetup, final SignatureInfo psiginfo) throws ComException;
  @DeclDISPID(1610743813)  public void VerifyXmlDsig(final Object QueryContinue, final SignatureSetup psigsetup, final SignatureInfo psiginfo, final Object XmlDsigStream, final ByRef<ContentVerificationResults> pcontverres, final ByRef<CertificateVerificationResults> pcertverres) throws ComException;
  @DeclDISPID(1610743814)  public void ShowSignatureDetails(final Object ParentWindow, final SignatureSetup psigsetup, final SignatureInfo psiginfo, final Object XmlDsigStream, final ByRef<ContentVerificationResults> pcontverres, final ByRef<CertificateVerificationResults> pcertverres) throws ComException;
  @DeclDISPID(1610743815)  public Object GetProviderDetail(final SignatureProviderDetail sigprovdet) throws ComException;
  @DeclDISPID(1610743816)  public Byte[] HashStream(final Object QueryContinue, final Object Stream) throws ComException;
}
