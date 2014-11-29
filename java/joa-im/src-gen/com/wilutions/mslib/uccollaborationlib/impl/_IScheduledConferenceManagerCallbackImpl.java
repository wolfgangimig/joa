/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{E10A584D-3E2B-937E-1D6C-56C5164384D3}")
public class _IScheduledConferenceManagerCallbackImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib._IScheduledConferenceManagerCallback {
  @DeclDISPID(5130)  public void OnGetScheduledConferenceItems(final com.wilutions.mslib.uccollaborationlib.IScheduledConferenceManager _source, final com.wilutions.mslib.uccollaborationlib.IScheduledConferenceCollection _items, final com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation _asyncOperation) throws ComException {
    this._dispatchCall(5130,"OnGetScheduledConferenceItems", DISPATCH_METHOD,null,(_source!=null?_source:Dispatch.NULL),(_items!=null?_items:Dispatch.NULL),(_asyncOperation!=null?_asyncOperation:Dispatch.NULL));
  }
  public _IScheduledConferenceManagerCallbackImpl(String progId) throws ComException {
    super(progId, "{219DC126-9A48-483F-80C2-3F22B3B47829}");
  }
  protected _IScheduledConferenceManagerCallbackImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_IScheduledConferenceManagerCallbackImpl" + super.toString() + "]";
  }
}
