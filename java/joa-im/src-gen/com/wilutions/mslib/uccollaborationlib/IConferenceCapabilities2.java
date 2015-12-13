/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IConferenceCapabilities2.
 * IConferenceCapabilities2 Interface 
 */
@CoInterface(guid="{E5CFF4A5-83A8-4FD8-8DAA-77A3E2288D4A}")
public interface IConferenceCapabilities2 extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(268435457)  public Boolean getIsAudioPresentationModeAllowed() throws ComException;
  @DeclDISPID(268435458)  public String getCustomLogoUrl() throws ComException;
  @DeclDISPID(268435459)  public String getCustomHelpUrl() throws ComException;
  @DeclDISPID(268435460)  public String getCustomLegalUrl() throws ComException;
  @DeclDISPID(268435461)  public String getCustomFooterText() throws ComException;
  @DeclDISPID(268435462)  public Boolean getIsMainVideoPresentationModeAllowed() throws ComException;
  @DeclDISPID(268435463)  public Boolean getIsPanoVideoPresentationModeAllowed() throws ComException;
}
