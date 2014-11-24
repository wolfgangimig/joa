/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{415E4854-009A-9552-0F7D-D2C0BB7A0F28}")
public class IPreviousConversationCollectionImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IPreviousConversationCollection {
  @DeclDISPID(1610743808)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(0)  public com.wilutions.mslib.uccollaborationlib.IPreviousConversation getItem(Integer _index) throws ComException {
    assert(_index != null);
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_PROPERTYGET,null,_index);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IPreviousConversationImpl.class);
  }
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException {
    final Object obj = this._dispatchCall(-4,"_NewEnum", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  public IPreviousConversationCollectionImpl(String progId) throws ComException {
    super(progId, "{81C9D13F-A4F9-4E13-92D3-BB271E8DF3D2}");
  }
  protected IPreviousConversationCollectionImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IPreviousConversationCollectionImpl" + super.toString() + "]";
  }
}
