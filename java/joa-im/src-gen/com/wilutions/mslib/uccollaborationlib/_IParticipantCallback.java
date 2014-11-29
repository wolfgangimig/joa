/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * _IParticipantCallback.
 * _IParticipantCallback Interface 
 */
@CoInterface(guid="{26C8D96D-7D22-4E9E-948A-EDCCB4CA9C64}")
public interface _IParticipantCallback extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1152)  public void OnSetMuteAction(final IParticipant _source, final IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(1151)  public void OnSetParticipantProperty(final IParticipant _source, final ParticipantProperty _propertyType, final IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(1153)  public void OnAdmit(final IParticipant _source, final IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(1154)  public void OnDeny(final IParticipant _source, final IAsynchronousOperation _asyncOperation) throws ComException;
}
