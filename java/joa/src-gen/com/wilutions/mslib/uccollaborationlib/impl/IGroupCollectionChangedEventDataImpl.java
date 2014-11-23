/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{2C00EAC6-D941-9042-24E7-3777F058F3E3}")
public class IGroupCollectionChangedEventDataImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IGroupCollectionChangedEventData {
  @DeclDISPID(1610743808)  public com.wilutions.mslib.uccollaborationlib.IGroup getGroup() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Group", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IGroupImpl.class);
  }
  public IGroupCollectionChangedEventDataImpl(String progId) throws ComException {
    super(progId, "{EC9773AD-7D22-4B03-B949-5E9055AF0F19}");
  }
  protected IGroupCollectionChangedEventDataImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IGroupCollectionChangedEventDataImpl" + super.toString() + "]";
  }
}
