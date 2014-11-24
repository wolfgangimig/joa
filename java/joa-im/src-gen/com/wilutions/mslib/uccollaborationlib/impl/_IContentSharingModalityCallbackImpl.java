/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{44A3900F-DC43-95FD-217D-19CE8329DF12}")
public class _IContentSharingModalityCallbackImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib._IContentSharingModalityCallback {
  @DeclDISPID(5100)  public void OnCreateContent(com.wilutions.mslib.uccollaborationlib.IContentSharingModality _source, com.wilutions.mslib.uccollaborationlib.IShareableContent _content, com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation _asyncOperation) throws ComException {
    this._dispatchCall(5100,"OnCreateContent", DISPATCH_METHOD,null,(_source!=null?_source:Dispatch.NULL),(_content!=null?_content:Dispatch.NULL),(_asyncOperation!=null?_asyncOperation:Dispatch.NULL));
  }
  public _IContentSharingModalityCallbackImpl(String progId) throws ComException {
    super(progId, "{84340964-7820-4EBC-BCD3-702926DE23E8}");
  }
  protected _IContentSharingModalityCallbackImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_IContentSharingModalityCallbackImpl" + super.toString() + "]";
  }
}
