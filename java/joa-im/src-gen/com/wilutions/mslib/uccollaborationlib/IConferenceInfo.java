/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IConferenceInfo.
 * IConferenceInfo Interface 
 */
@CoInterface(guid="{B3C5872E-591C-4A74-9F84-B00EF970A838}")
public interface IConferenceInfo extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public String getId() throws ComException;
  @DeclDISPID(1610743809)  public Boolean getAlreadyScheduled() throws ComException;
  @DeclDISPID(1610743810)  public String getUri() throws ComException;
  @DeclDISPID(1610743811)  public ConferenceAdmissionType getAdmissionType() throws ComException;
  @DeclDISPID(1610743811)  public void setAdmissionType(final ConferenceAdmissionType value) throws ComException;
  @DeclDISPID(1610743813)  public String getAdmissionKey() throws ComException;
  @DeclDISPID(1610743813)  public void setAdmissionKey(final String value) throws ComException;
  @DeclDISPID(1610743815)  public IConferenceInfoPropertyDictionary getConferenceInfoProperties() throws ComException;
}
