/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IParticipant2.
 * IParticipant2 Interface 
 */
@CoInterface(guid="{D60B1701-766D-401E-8586-83E0C9106BE0}")
public interface IParticipant2 extends IDispatch {
  @DeclDISPID(268435457)  public IAsynchronousOperation PinVideo(Object _callback, Object _state) throws ComException;
  @DeclDISPID(268435458)  public IAsynchronousOperation UnPinVideo(Object _callback, Object _state) throws ComException;
  @DeclDISPID(268435459)  public IAsynchronousOperation LockVideo(Object _callback, Object _state) throws ComException;
  @DeclDISPID(268435460)  public IAsynchronousOperation UnLockVideo(Object _callback, Object _state) throws ComException;
}
