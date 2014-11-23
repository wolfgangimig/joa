/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IConferenceAccessInformation.
 * IConferenceAccessInformation Interface 
 */
@CoInterface(guid="{2F8C3E58-436B-42DB-8924-6C394B37DCA2}")
public interface IConferenceAccessInformation extends IDispatch {
  @DeclDISPID(1610743808)  public String getId() throws ComException;
  @DeclDISPID(1610743809)  public String[] getAutoAttendantNumbers() throws ComException;
  @DeclDISPID(1610743810)  public String getAdmissionKey() throws ComException;
  @DeclDISPID(1610743811)  public String getInternalUrl() throws ComException;
  @DeclDISPID(1610743812)  public String getExternalUrl() throws ComException;
}
