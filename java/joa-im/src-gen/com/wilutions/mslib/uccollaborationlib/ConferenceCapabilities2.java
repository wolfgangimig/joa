/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ConferenceCapabilities2.
 * ConferenceCapabilities2 Class 
 */
@CoClass(guid="{E8451131-7352-4906-9E57-5CB164FEE062}")
public class ConferenceCapabilities2 extends Dispatch implements IConferenceCapabilities2 {
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
  public ConferenceCapabilities2() throws ComException {
    super("{E8451131-7352-4906-9E57-5CB164FEE062}", "{E5CFF4A5-83A8-4FD8-8DAA-77A3E2288D4A}");
  }
  protected ConferenceCapabilities2(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ConferenceCapabilities2" + super.toString() + "]";
  }
}
