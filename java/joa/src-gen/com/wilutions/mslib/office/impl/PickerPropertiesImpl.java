/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9A88-A463-DB41-5DAE-69E7A5F7FCBC}")
public class PickerPropertiesImpl extends Dispatch implements com.wilutions.mslib.office.PickerProperties {
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
  @DeclDISPID(0)  public com.wilutions.mslib.office.PickerProperty getItem(Integer Index) throws ComException {
    assert(Index != null);
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_PROPERTYGET,null,Index);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.PickerPropertyImpl.class);
  }
  @DeclDISPID(1)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(1,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(2)  public com.wilutions.mslib.office.PickerProperty Add(String Id, String Value, com.wilutions.mslib.office.MsoPickerField Type) throws ComException {
    assert(Id != null);
    assert(Value != null);
    assert(Type != null);
    final Object obj = this._dispatchCall(2,"Add", DISPATCH_METHOD,null,Id,Value,Type.value);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.PickerPropertyImpl.class);
  }
  @DeclDISPID(3)  public void Remove(String Id) throws ComException {
    assert(Id != null);
    this._dispatchCall(3,"Remove", DISPATCH_METHOD,null,Id);
  }
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException {
    final Object obj = this._dispatchCall(-4,"_NewEnum", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  public PickerPropertiesImpl(String progId) throws ComException {
    super(progId);
  }
  protected PickerPropertiesImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[PickerPropertiesImpl" + super.toString() + "]";
  }
}
