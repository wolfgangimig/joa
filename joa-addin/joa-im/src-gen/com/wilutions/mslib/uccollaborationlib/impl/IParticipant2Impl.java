/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{169C8E6A-D20E-9B5F-1828-EA076CE7971A}")
public class IParticipant2Impl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IParticipant2 {
  @DeclDISPID(268435457)  public com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation PinVideo(final Object _callback, final Object _state) throws ComException {
    assert(_callback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(268435457,"PinVideo", DISPATCH_METHOD,null,_callback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(268435458)  public com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation UnPinVideo(final Object _callback, final Object _state) throws ComException {
    assert(_callback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(268435458,"UnPinVideo", DISPATCH_METHOD,null,_callback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(268435459)  public com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation LockVideo(final Object _callback, final Object _state) throws ComException {
    assert(_callback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(268435459,"LockVideo", DISPATCH_METHOD,null,_callback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(268435460)  public com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation UnLockVideo(final Object _callback, final Object _state) throws ComException {
    assert(_callback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(268435460,"UnLockVideo", DISPATCH_METHOD,null,_callback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  public IParticipant2Impl(String progId) throws ComException {
    super(progId, "{D60B1701-766D-401E-8586-83E0C9106BE0}");
  }
  protected IParticipant2Impl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IParticipant2Impl" + super.toString() + "]";
  }
}
