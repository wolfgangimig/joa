/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * _IParticipantCallback.
 * _IParticipantCallback Interface 
 */
@CoInterface(guid="{26C8D96D-7D22-4E9E-948A-EDCCB4CA9C64}")
public interface _IParticipantCallback extends IDispatch {
  @DeclDISPID(1152)  public void OnSetMuteAction(IParticipant _source, IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(1151)  public void OnSetParticipantProperty(IParticipant _source, ParticipantProperty _propertyType, IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(1153)  public void OnAdmit(IParticipant _source, IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(1154)  public void OnDeny(IParticipant _source, IAsynchronousOperation _asyncOperation) throws ComException;
}
