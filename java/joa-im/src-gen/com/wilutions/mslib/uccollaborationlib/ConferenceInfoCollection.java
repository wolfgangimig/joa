/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ConferenceInfoCollection.
 * ConferenceInfoCollection Class 
 */
@CoClass(guid="{8B8CBACF-0AA1-419E-94D2-60F844A6FB9E}")
public class ConferenceInfoCollection extends Dispatch implements IConferenceInfoCollection {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(0)  public IConferenceInfo getItem(Integer _index) throws ComException {
    assert(_index != null);
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_PROPERTYGET,null,_index);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IConferenceInfoImpl.class);
  }
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException {
    final Object obj = this._dispatchCall(-4,"_NewEnum", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  public ConferenceInfoCollection() throws ComException {
    super("{8B8CBACF-0AA1-419E-94D2-60F844A6FB9E}", "{1FF8AA01-D8AF-4B2B-B254-BEFEFABAF2D6}");
  }
  protected ConferenceInfoCollection(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ConferenceInfoCollection" + super.toString() + "]";
  }
}
