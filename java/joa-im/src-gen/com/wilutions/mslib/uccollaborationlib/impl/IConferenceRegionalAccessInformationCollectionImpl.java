/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{600FD66A-F94F-9843-1A0E-0059DEF6ADB9}")
public class IConferenceRegionalAccessInformationCollectionImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IConferenceRegionalAccessInformationCollection {
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
  @DeclDISPID(0)  public com.wilutions.mslib.uccollaborationlib.IConferenceRegionalAccessInformation getItem(final Integer _index) throws ComException {
    assert(_index != null);
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_PROPERTYGET,null,_index);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IConferenceRegionalAccessInformationImpl.class);
  }
  public IConferenceRegionalAccessInformationCollectionImpl(String progId) throws ComException {
    super(progId, "{A0984F01-5D2C-4302-87A0-69BE7B015143}");
  }
  protected IConferenceRegionalAccessInformationCollectionImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IConferenceRegionalAccessInformationCollectionImpl" + super.toString() + "]";
  }
}
