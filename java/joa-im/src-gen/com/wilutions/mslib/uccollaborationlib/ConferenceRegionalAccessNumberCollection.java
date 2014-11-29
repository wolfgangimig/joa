/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ConferenceRegionalAccessNumberCollection.
 * ConferenceRegionalAccessNumberCollection Class 
 */
@CoClass(guid="{BA9B1F14-CE79-417E-9320-704C9E391116}")
public class ConferenceRegionalAccessNumberCollection extends Dispatch implements IConferenceRegionalAccessNumberCollection {
  static boolean __typelib__loaded = __TypeLib.load();
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
  @DeclDISPID(0)  public IConferenceRegionalAccessNumber getItem(final Integer _index) throws ComException {
    assert(_index != null);
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_PROPERTYGET,null,_index);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IConferenceRegionalAccessNumberImpl.class);
  }
  public ConferenceRegionalAccessNumberCollection() throws ComException {
    super("{BA9B1F14-CE79-417E-9320-704C9E391116}", "{4CB70415-BA71-491E-B12D-155D85CBDFF1}");
  }
  protected ConferenceRegionalAccessNumberCollection(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ConferenceRegionalAccessNumberCollection" + super.toString() + "]";
  }
}
