/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ConferenceRegionalAccessInformationCollection.
 * ConferenceRegionalAccessInformationCollection Class 
 */
@CoClass(guid="{F080136D-D09A-42DE-B9E4-2E926D1A430F}")
public class ConferenceRegionalAccessInformationCollection extends Dispatch implements IConferenceRegionalAccessInformationCollection {
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
  @DeclDISPID(0)  public IConferenceRegionalAccessInformation getItem(Integer _index) throws ComException {
    assert(_index != null);
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_PROPERTYGET,null,_index);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IConferenceRegionalAccessInformationImpl.class);
  }
  public ConferenceRegionalAccessInformationCollection() throws ComException {
    super("{F080136D-D09A-42DE-B9E4-2E926D1A430F}", "{A0984F01-5D2C-4302-87A0-69BE7B015143}");
  }
  protected ConferenceRegionalAccessInformationCollection(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ConferenceRegionalAccessInformationCollection" + super.toString() + "]";
  }
}
