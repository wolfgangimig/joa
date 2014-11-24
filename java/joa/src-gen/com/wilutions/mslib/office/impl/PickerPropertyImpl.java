/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9A89-A463-DB41-5DAE-69E7A5F7FCBC}")
public class PickerPropertyImpl extends Dispatch implements com.wilutions.mslib.office.PickerProperty {
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"Creator", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1)  public String getId() throws ComException {
    final Object obj = this._dispatchCall(1,"Id", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(2)  public Object getValue() throws ComException {
    final Object obj = this._dispatchCall(2,"Value", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(3)  public com.wilutions.mslib.office.MsoPickerField getType() throws ComException {
    final Object obj = this._dispatchCall(3,"Type", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoPickerField.valueOf((Integer)obj);
  }
  public PickerPropertyImpl(String progId) throws ComException {
    super(progId, "{000C03E2-0000-0000-C000-000000000046}");
  }
  protected PickerPropertyImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[PickerPropertyImpl" + super.toString() + "]";
  }
}
