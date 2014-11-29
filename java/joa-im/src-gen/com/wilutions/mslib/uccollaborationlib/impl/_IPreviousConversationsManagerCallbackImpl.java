/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{8B3B2DD3-B655-99F9-200F-B8B494BF84F7}")
public class _IPreviousConversationsManagerCallbackImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib._IPreviousConversationsManagerCallback {
  @DeclDISPID(4120)  public void OnGetUnreadItems(final com.wilutions.mslib.uccollaborationlib.IPreviousConversationsManager _source, final com.wilutions.mslib.uccollaborationlib.IPreviousConversationCollection _items, final com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation _asyncOperation) throws ComException {
    this._dispatchCall(4120,"OnGetUnreadItems", DISPATCH_METHOD,null,(_source!=null?_source:Dispatch.NULL),(_items!=null?_items:Dispatch.NULL),(_asyncOperation!=null?_asyncOperation:Dispatch.NULL));
  }
  @DeclDISPID(4121)  public void OnGetAllItems(final com.wilutions.mslib.uccollaborationlib.IPreviousConversationsManager _source, final com.wilutions.mslib.uccollaborationlib.IPreviousConversationCollection _items, final com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation _asyncOperation) throws ComException {
    this._dispatchCall(4121,"OnGetAllItems", DISPATCH_METHOD,null,(_source!=null?_source:Dispatch.NULL),(_items!=null?_items:Dispatch.NULL),(_asyncOperation!=null?_asyncOperation:Dispatch.NULL));
  }
  public _IPreviousConversationsManagerCallbackImpl(String progId) throws ComException {
    super(progId, "{4BACB4B8-1236-42B8-BDA1-D1533148780D}");
  }
  protected _IPreviousConversationsManagerCallbackImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_IPreviousConversationsManagerCallbackImpl" + super.toString() + "]";
  }
}
