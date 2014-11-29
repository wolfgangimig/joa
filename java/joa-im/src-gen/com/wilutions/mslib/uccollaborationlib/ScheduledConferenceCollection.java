/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ScheduledConferenceCollection.
 * ScheduledConferenceCollection Class 
 */
@CoClass(guid="{584DC0A4-F664-4A1D-B781-662C082D6B78}")
public class ScheduledConferenceCollection extends Dispatch implements IScheduledConferenceCollection {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(0)  public IScheduledConference getItem(Integer _index) throws ComException {
    assert(_index != null);
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_PROPERTYGET,null,_index);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IScheduledConferenceImpl.class);
  }
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException {
    final Object obj = this._dispatchCall(-4,"_NewEnum", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  public ScheduledConferenceCollection() throws ComException {
    super("{584DC0A4-F664-4A1D-B781-662C082D6B78}", "{F423726D-0E9B-4B55-9569-E79865210F69}");
  }
  protected ScheduledConferenceCollection(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ScheduledConferenceCollection" + super.toString() + "]";
  }
}
