/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{25586DCE-27CB-9499-1004-1E4447DF71B0}")
public class IConferenceCapabilities2Impl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IConferenceCapabilities2 {
  @DeclDISPID(268435457)  public Boolean getIsAudioPresentationModeAllowed() throws ComException {
    final Object obj = this._dispatchCall(268435457,"IsAudioPresentationModeAllowed", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(268435458)  public String getCustomLogoUrl() throws ComException {
    final Object obj = this._dispatchCall(268435458,"CustomLogoUrl", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(268435459)  public String getCustomHelpUrl() throws ComException {
    final Object obj = this._dispatchCall(268435459,"CustomHelpUrl", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(268435460)  public String getCustomLegalUrl() throws ComException {
    final Object obj = this._dispatchCall(268435460,"CustomLegalUrl", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(268435461)  public String getCustomFooterText() throws ComException {
    final Object obj = this._dispatchCall(268435461,"CustomFooterText", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(268435462)  public Boolean getIsMainVideoPresentationModeAllowed() throws ComException {
    final Object obj = this._dispatchCall(268435462,"IsMainVideoPresentationModeAllowed", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(268435463)  public Boolean getIsPanoVideoPresentationModeAllowed() throws ComException {
    final Object obj = this._dispatchCall(268435463,"IsPanoVideoPresentationModeAllowed", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  public IConferenceCapabilities2Impl(String progId) throws ComException {
    super(progId, "{E5CFF4A5-83A8-4FD8-8DAA-77A3E2288D4A}");
  }
  protected IConferenceCapabilities2Impl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IConferenceCapabilities2Impl" + super.toString() + "]";
  }
}
