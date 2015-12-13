/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{1947D23E-7C43-961A-3B3E-0C6DECC17882}")
public class _IVoiceMailsManagerCallbackImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib._IVoiceMailsManagerCallback {
  @DeclDISPID(4110)  public void OnGetUnreadVoiceMails(final com.wilutions.mslib.uccollaborationlib.IVoiceMailsManager _source, final com.wilutions.mslib.uccollaborationlib.IVoiceMailCollection _items, final com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation _asyncOperation) throws ComException {
    this._dispatchCall(4110,"OnGetUnreadVoiceMails", DISPATCH_METHOD,null,(_source!=null?_source:Dispatch.NULL),(_items!=null?_items:Dispatch.NULL),(_asyncOperation!=null?_asyncOperation:Dispatch.NULL));
  }
  @DeclDISPID(4111)  public void OnGetAllVoiceMails(final com.wilutions.mslib.uccollaborationlib.IVoiceMailsManager _source, final com.wilutions.mslib.uccollaborationlib.IVoiceMailCollection _items, final com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation _asyncOperation) throws ComException {
    this._dispatchCall(4111,"OnGetAllVoiceMails", DISPATCH_METHOD,null,(_source!=null?_source:Dispatch.NULL),(_items!=null?_items:Dispatch.NULL),(_asyncOperation!=null?_asyncOperation:Dispatch.NULL));
  }
  public _IVoiceMailsManagerCallbackImpl(String progId) throws ComException {
    super(progId, "{D9D04B55-D820-4D5B-A690-658A49368478}");
  }
  protected _IVoiceMailsManagerCallbackImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_IVoiceMailsManagerCallbackImpl" + super.toString() + "]";
  }
}
