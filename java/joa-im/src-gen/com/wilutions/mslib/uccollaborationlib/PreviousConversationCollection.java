/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * PreviousConversationCollection.
 * PreviousConversationCollection Class 
 */
@CoClass(guid="{563B1F6B-F388-448C-B679-AF1FA3A4329A}")
public class PreviousConversationCollection extends Dispatch implements IPreviousConversationCollection {
  @DeclDISPID(1610743808)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(0)  public IPreviousConversation getItem(Integer _index) throws ComException {
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
  public PreviousConversationCollection() throws ComException {
    super("{563B1F6B-F388-448C-B679-AF1FA3A4329A}", "{81C9D13F-A4F9-4E13-92D3-BB271E8DF3D2}");
  }
  protected PreviousConversationCollection(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[PreviousConversationCollection" + super.toString() + "]";
  }
}
