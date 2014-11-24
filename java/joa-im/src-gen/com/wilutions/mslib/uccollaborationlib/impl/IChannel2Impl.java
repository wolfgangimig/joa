/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{BBAE521C-EE88-9996-2EFF-A2B3D7363A57}")
public class IChannel2Impl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IChannel2 {
  @DeclDISPID(268435457)  public com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation Pause(Object _callback, Object _state) throws ComException {
    assert(_callback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(268435457,"Pause", DISPATCH_METHOD,null,_callback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(268435458)  public com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation Resume(Object _callback, Object _state) throws ComException {
    assert(_callback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(268435458,"Resume", DISPATCH_METHOD,null,_callback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  public IChannel2Impl(String progId) throws ComException {
    super(progId, "{7B39CB77-4AEB-42D7-B351-CB5472C1C6AD}");
  }
  protected IChannel2Impl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IChannel2Impl" + super.toString() + "]";
  }
}
