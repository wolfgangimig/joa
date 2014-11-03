/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9A8E-A463-DB41-5DAE-69E7A5F7FCBC}")
public class PickerResultsImpl extends Dispatch implements com.wilutions.mslib.office.PickerResults {
  @DeclDISPID(1610743808)  public Dispatch getApplication() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"Creator", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(0)  public com.wilutions.mslib.office.PickerResult getItem(Integer Index) throws ComException {
    assert(Index != null);
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_PROPERTYGET,null,Index);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.PickerResultImpl.class);
  }
  @DeclDISPID(1)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(1,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(2)  public com.wilutions.mslib.office.PickerResult Add(String Id, String DisplayName, String Type, String SIPId, Object ItemData, Object SubItems) throws ComException {
    assert(Id != null);
    assert(DisplayName != null);
    assert(Type != null);
    assert(SIPId != null);
    assert(ItemData != null);
    assert(SubItems != null);
    final Object obj = this._dispatchCall(2,"Add", DISPATCH_METHOD,null,Id,DisplayName,Type,SIPId,ItemData,SubItems);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.PickerResultImpl.class);
  }
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException {
    final Object obj = this._dispatchCall(-4,"_NewEnum", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  public PickerResultsImpl(String progId) throws ComException {
    super(progId);
  }
  protected PickerResultsImpl(long ndisp) {
    super(ndisp);
  }
  public PickerResultsImpl(Dispatch ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[PickerResultsImpl" + super.toString() + "]";
  }
}
