/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{552E3AE9-4E33-9EA5-0BF0-D38642D6C140}")
public class _IAudioChannelCallbackImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib._IAudioChannelCallback {
  @DeclDISPID(1260)  public void OnSendDtmf(final com.wilutions.mslib.uccollaborationlib.IAudioChannel _source, final com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation _asyncOperation) throws ComException {
    this._dispatchCall(1260,"OnSendDtmf", DISPATCH_METHOD,null,(_source!=null?_source:Dispatch.NULL),(_asyncOperation!=null?_asyncOperation:Dispatch.NULL));
  }
  public _IAudioChannelCallbackImpl(String progId) throws ComException {
    super(progId, "{95B9A382-EA50-45E4-965E-BA61E7213DBA}");
  }
  protected _IAudioChannelCallbackImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_IAudioChannelCallbackImpl" + super.toString() + "]";
  }
}
