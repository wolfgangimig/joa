/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{6476488F-DC5A-9C7A-0854-34D478372E27}")
public class IConversationCollectionImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IConversationCollection {
  @DeclDISPID(1610743808)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(0)  public com.wilutions.mslib.uccollaborationlib.IConversation getItem(final Integer _index) throws ComException {
    assert(_index != null);
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_PROPERTYGET,null,_index);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IConversationImpl.class);
  }
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException {
    final Object obj = this._dispatchCall(-4,"_NewEnum", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1610743811)  public Integer IndexOf(final com.wilutions.mslib.uccollaborationlib.IConversation _conversation) throws ComException {
    final Object obj = this._dispatchCall(1610743811,"IndexOf", DISPATCH_METHOD,null,(_conversation!=null?_conversation:Dispatch.NULL));
    if (obj == null) return null;
    return (Integer)obj;
  }
  public IConversationCollectionImpl(String progId) throws ComException {
    super(progId, "{A4E1D1E4-7839-473B-95FA-5D33DDC0D2DD}");
  }
  protected IConversationCollectionImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IConversationCollectionImpl" + super.toString() + "]";
  }
}
