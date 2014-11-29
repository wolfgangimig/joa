/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9A8F-A463-DB41-5DAE-69E7A5F7FCBC}")
public class PickerResultImpl extends Dispatch implements com.wilutions.mslib.office.PickerResult {
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
  @DeclDISPID(2)  public String getDisplayName() throws ComException {
    final Object obj = this._dispatchCall(2,"DisplayName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(2)  public void setDisplayName(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(2,"DisplayName", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(3)  public String getType() throws ComException {
    final Object obj = this._dispatchCall(3,"Type", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(3)  public void setType(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(3,"Type", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(4)  public String getSIPId() throws ComException {
    final Object obj = this._dispatchCall(4,"SIPId", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(4)  public void setSIPId(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(4,"SIPId", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(5)  public Object getItemData() throws ComException {
    final Object obj = this._dispatchCall(5,"ItemData", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(5)  public void setItemData(final Object value) throws ComException {
    assert(value != null);
    this._dispatchCall(5,"ItemData", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(6)  public Object getSubItems() throws ComException {
    final Object obj = this._dispatchCall(6,"SubItems", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(6)  public void setSubItems(final Object value) throws ComException {
    assert(value != null);
    this._dispatchCall(6,"SubItems", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(7)  public Object getDuplicateResults() throws ComException {
    final Object obj = this._dispatchCall(7,"DuplicateResults", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(8)  public com.wilutions.mslib.office.PickerFields getFields() throws ComException {
    final Object obj = this._dispatchCall(8,"Fields", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.PickerFieldsImpl.class);
  }
  @DeclDISPID(8)  public void setFields(final com.wilutions.mslib.office.PickerFields value) throws ComException {
    this._dispatchCall(8,"Fields", DISPATCH_PROPERTYPUT,(value!=null?value:Dispatch.NULL));
  }
  public PickerResultImpl(String progId) throws ComException {
    super(progId, "{000C03E4-0000-0000-C000-000000000046}");
  }
  protected PickerResultImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[PickerResultImpl" + super.toString() + "]";
  }
}
