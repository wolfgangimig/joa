/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * _IParticipant2Callback.
 * _IParticipant2Callback Interface 
 */
@CoInterface(guid="{36CDC166-4F21-46AD-A60E-8551F26C1D41}")
public interface _IParticipant2Callback extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(5140)  public void OnPinVideo(final IParticipant2 _source, final IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(5142)  public void OnUnPinVideo(final IParticipant2 _source, final IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(5141)  public void OnLockVideo(final IParticipant2 _source, final IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(5143)  public void OnUnLockVideo(final IParticipant2 _source, final IAsynchronousOperation _asyncOperation) throws ComException;
}
