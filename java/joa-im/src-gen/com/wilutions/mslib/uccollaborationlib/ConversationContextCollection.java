/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ConversationContextCollection.
 * ConversationContextCollection Class 
 */
@CoClass(guid="{653A42DA-8411-4902-8013-574F1AEEC476}")
public class ConversationContextCollection extends Dispatch implements IConversationContextCollection {
  @DeclDISPID(1610743808)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(0)  public IConversationContext getItem(Integer _index) throws ComException {
    assert(_index != null);
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_PROPERTYGET,null,_index);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IConversationContextImpl.class);
  }
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException {
    final Object obj = this._dispatchCall(-4,"_NewEnum", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  public ConversationContextCollection() throws ComException {
    super("{653A42DA-8411-4902-8013-574F1AEEC476}", "{8A88C016-AA5D-4EAE-9C79-7AA5C360ED76}");
  }
  protected ConversationContextCollection(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ConversationContextCollection" + super.toString() + "]";
  }
}
