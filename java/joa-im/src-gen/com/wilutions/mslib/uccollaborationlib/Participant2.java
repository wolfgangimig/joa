/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * Participant2.
 * Wave 15 Additions to the Participant Class 
 */
@CoClass(guid="{6FB3B002-987C-460C-9E9F-B45F2ED3B1E9}")
public class Participant2 extends Dispatch implements IParticipant2 {
  @DeclDISPID(268435457)  public IAsynchronousOperation PinVideo(Object _callback, Object _state) throws ComException {
    assert(_callback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(268435457,"PinVideo", DISPATCH_METHOD,null,_callback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(268435458)  public IAsynchronousOperation UnPinVideo(Object _callback, Object _state) throws ComException {
    assert(_callback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(268435458,"UnPinVideo", DISPATCH_METHOD,null,_callback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(268435459)  public IAsynchronousOperation LockVideo(Object _callback, Object _state) throws ComException {
    assert(_callback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(268435459,"LockVideo", DISPATCH_METHOD,null,_callback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(268435460)  public IAsynchronousOperation UnLockVideo(Object _callback, Object _state) throws ComException {
    assert(_callback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(268435460,"UnLockVideo", DISPATCH_METHOD,null,_callback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  public Participant2() throws ComException {
    super("{6FB3B002-987C-460C-9E9F-B45F2ED3B1E9}", "{D60B1701-766D-401E-8586-83E0C9106BE0}");
  }
  protected Participant2(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[Participant2" + super.toString() + "]";
  }
}
