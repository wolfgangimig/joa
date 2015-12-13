/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IParticipantInfo.
 * IParticipantInfo Interface 
 */
@CoInterface(guid="{B3FF95BD-B743-498C-9973-7F8A2A78576A}")
public interface IParticipantInfo extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public String getUri() throws ComException;
  @DeclDISPID(1610743809)  public Boolean getIsRepresenting() throws ComException;
  @DeclDISPID(1610743810)  public String getRepresentedUri() throws ComException;
  @DeclDISPID(1610743811)  public String getDisplayName() throws ComException;
  @DeclDISPID(1610743811)  public void setDisplayName(final String value) throws ComException;
  @DeclDISPID(1610743813)  public String getRepresentedDisplayName() throws ComException;
  @DeclDISPID(1610743813)  public void setRepresentedDisplayName(final String value) throws ComException;
}
