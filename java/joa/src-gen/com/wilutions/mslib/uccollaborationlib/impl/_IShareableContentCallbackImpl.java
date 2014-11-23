/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{F1101137-0CCC-960A-132E-9D5E71B05B48}")
public class _IShareableContentCallbackImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib._IShareableContentCallback {
  @DeclDISPID(5110)  public void OnDownloadFile(com.wilutions.mslib.uccollaborationlib.IShareableContent _source, String _localPath, com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation _asyncOperation) throws ComException {
    assert(_localPath != null);
    this._dispatchCall(5110,"OnDownloadFile", DISPATCH_METHOD,null,(_source!=null?_source:Dispatch.NULL),_localPath,(_asyncOperation!=null?_asyncOperation:Dispatch.NULL));
  }
  public _IShareableContentCallbackImpl(String progId) throws ComException {
    super(progId, "{3187885C-A8AF-4D4B-8E80-F4B9D447A7B2}");
  }
  protected _IShareableContentCallbackImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_IShareableContentCallbackImpl" + super.toString() + "]";
  }
}
