/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IConferenceTelephoneAccessInformation.
 * IConferenceTelephoneAccessInformation Interface 
 */
@CoInterface(guid="{66D1FFC0-C234-4F3D-ABAA-98222A69E525}")
public interface IConferenceTelephoneAccessInformation extends IDispatch {
  @DeclDISPID(1610743808)  public String getExternalWebLink() throws ComException;
  @DeclDISPID(1610743809)  public String getInternalWebLink() throws ComException;
  @DeclDISPID(1610743810)  public IConferenceRegionalAccessInformationCollection getRegionalAccessInformation() throws ComException;
}
