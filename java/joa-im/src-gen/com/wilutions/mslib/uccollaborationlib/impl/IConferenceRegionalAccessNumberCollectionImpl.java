/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{8C209D7E-1E12-925F-2C83-7CBA203C230B}")
public class IConferenceRegionalAccessNumberCollectionImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IConferenceRegionalAccessNumberCollection {
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException {
    final Object obj = this._dispatchCall(-4,"_NewEnum", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1610743809)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(0)  public com.wilutions.mslib.uccollaborationlib.IConferenceRegionalAccessNumber getItem(final Integer _index) throws ComException {
    assert(_index != null);
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_PROPERTYGET,null,_index);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IConferenceRegionalAccessNumberImpl.class);
  }
  public IConferenceRegionalAccessNumberCollectionImpl(String progId) throws ComException {
    super(progId, "{4CB70415-BA71-491E-B12D-155D85CBDFF1}");
  }
  protected IConferenceRegionalAccessNumberCollectionImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IConferenceRegionalAccessNumberCollectionImpl" + super.toString() + "]";
  }
}
