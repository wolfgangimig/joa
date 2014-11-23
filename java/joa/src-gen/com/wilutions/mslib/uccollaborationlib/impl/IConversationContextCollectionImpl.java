/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{4A1F597D-0E3E-95EF-01D7-13426697118C}")
public class IConversationContextCollectionImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IConversationContextCollection {
  @DeclDISPID(1610743808)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(0)  public com.wilutions.mslib.uccollaborationlib.IConversationContext getItem(Integer _index) throws ComException {
    assert(_index != null);
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_PROPERTYGET,null,_index);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IConversationContextImpl.class);
  }
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException {
    final Object obj = this._dispatchCall(-4,"_NewEnum", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  public IConversationContextCollectionImpl(String progId) throws ComException {
    super(progId, "{8A88C016-AA5D-4EAE-9C79-7AA5C360ED76}");
  }
  protected IConversationContextCollectionImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IConversationContextCollectionImpl" + super.toString() + "]";
  }
}
