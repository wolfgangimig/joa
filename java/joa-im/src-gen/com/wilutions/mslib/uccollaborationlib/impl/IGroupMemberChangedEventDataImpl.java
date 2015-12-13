/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{8BADBD79-652A-9513-3ABD-050C6AB0ACC4}")
public class IGroupMemberChangedEventDataImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IGroupMemberChangedEventData {
  @DeclDISPID(1610743808)  public com.wilutions.mslib.uccollaborationlib.IContact getContact() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Contact", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IContactImpl.class);
  }
  public IGroupMemberChangedEventDataImpl(String progId) throws ComException {
    super(progId, "{4B3A2412-C149-4E52-A713-6CEBCF47503E}");
  }
  protected IGroupMemberChangedEventDataImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IGroupMemberChangedEventDataImpl" + super.toString() + "]";
  }
}
