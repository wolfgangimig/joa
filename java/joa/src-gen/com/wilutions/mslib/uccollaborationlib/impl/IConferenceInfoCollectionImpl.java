/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{DF6F336A-7CCC-906A-2FFA-D7195F4D0E2C}")
public class IConferenceInfoCollectionImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IConferenceInfoCollection {
  @DeclDISPID(1610743808)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(0)  public com.wilutions.mslib.uccollaborationlib.IConferenceInfo getItem(Integer _index) throws ComException {
    assert(_index != null);
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_PROPERTYGET,null,_index);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IConferenceInfoImpl.class);
  }
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException {
    final Object obj = this._dispatchCall(-4,"_NewEnum", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  public IConferenceInfoCollectionImpl(String progId) throws ComException {
    super(progId, "{1FF8AA01-D8AF-4B2B-B254-BEFEFABAF2D6}");
  }
  protected IConferenceInfoCollectionImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IConferenceInfoCollectionImpl" + super.toString() + "]";
  }
}
