/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C84A6CAF-5E71-9239-2FC0-AF3599B2C8E9}")
public class _IDeviceManagerCallbackImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib._IDeviceManagerCallback {
  @DeclDISPID(600)  public void OnPlayAudioFile(final com.wilutions.mslib.uccollaborationlib.IDeviceManager _source, final com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation _asyncOperation) throws ComException {
    this._dispatchCall(600,"OnPlayAudioFile", DISPATCH_METHOD,null,(_source!=null?_source:Dispatch.NULL),(_asyncOperation!=null?_asyncOperation:Dispatch.NULL));
  }
  public _IDeviceManagerCallbackImpl(String progId) throws ComException {
    super(progId, "{08DDF5C4-FA12-4978-B26E-C6D23C453413}");
  }
  protected _IDeviceManagerCallbackImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_IDeviceManagerCallbackImpl" + super.toString() + "]";
  }
}
