/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{B00FF4A5-EECB-96BA-07EB-221B5255FA0F}")
public class _IChannel2CallbackImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib._IChannel2Callback {
  @DeclDISPID(5160)  public void OnPause(final com.wilutions.mslib.uccollaborationlib.IChannel2 _source, final com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation _asyncOperation) throws ComException {
    this._dispatchCall(5160,"OnPause", DISPATCH_METHOD,null,(_source!=null?_source:Dispatch.NULL),(_asyncOperation!=null?_asyncOperation:Dispatch.NULL));
  }
  @DeclDISPID(5161)  public void OnResume(final com.wilutions.mslib.uccollaborationlib.IChannel2 _source, final com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation _asyncOperation) throws ComException {
    this._dispatchCall(5161,"OnResume", DISPATCH_METHOD,null,(_source!=null?_source:Dispatch.NULL),(_asyncOperation!=null?_asyncOperation:Dispatch.NULL));
  }
  public _IChannel2CallbackImpl(String progId) throws ComException {
    super(progId, "{70986DCE-4AA8-4DFB-9A45-4BFCF7A206F5}");
  }
  protected _IChannel2CallbackImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_IChannel2CallbackImpl" + super.toString() + "]";
  }
}
