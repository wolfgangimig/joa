/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * Channel2.
 * Wave 15 additional Channel Class 
 */
@CoClass(guid="{A351A6D6-9B47-41A3-A6D3-07DDF2203E7D}")
public class Channel2 extends Dispatch implements IChannel2 {
  @DeclDISPID(268435457)  public IAsynchronousOperation Pause(Object _callback, Object _state) throws ComException {
    assert(_callback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(268435457,"Pause", DISPATCH_METHOD,null,_callback,_state);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(268435458)  public IAsynchronousOperation Resume(Object _callback, Object _state) throws ComException {
    assert(_callback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(268435458,"Resume", DISPATCH_METHOD,null,_callback,_state);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  public Channel2() throws ComException {
    super("{A351A6D6-9B47-41A3-A6D3-07DDF2203E7D}", "{7B39CB77-4AEB-42D7-B351-CB5472C1C6AD}");
  }
  protected Channel2(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[Channel2" + super.toString() + "]";
  }
}
