/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C87670A4-0387-98FF-3320-DBC46B861894}")
public class _IChannelCallbackImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib._IChannelCallback {
  @DeclDISPID(1280)  public void OnStart(final com.wilutions.mslib.uccollaborationlib.IChannel _source, final com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation _asyncOperation) throws ComException {
    this._dispatchCall(1280,"OnStart", DISPATCH_METHOD,null,(_source!=null?_source:Dispatch.NULL),(_asyncOperation!=null?_asyncOperation:Dispatch.NULL));
  }
  @DeclDISPID(1281)  public void OnStop(final com.wilutions.mslib.uccollaborationlib.IChannel _source, final com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation _asyncOperation) throws ComException {
    this._dispatchCall(1281,"OnStop", DISPATCH_METHOD,null,(_source!=null?_source:Dispatch.NULL),(_asyncOperation!=null?_asyncOperation:Dispatch.NULL));
  }
  public _IChannelCallbackImpl(String progId) throws ComException {
    super(progId, "{08E1E9CF-A7E4-43BE-AE8E-B223CE71E46E}");
  }
  protected _IChannelCallbackImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_IChannelCallbackImpl" + super.toString() + "]";
  }
}
