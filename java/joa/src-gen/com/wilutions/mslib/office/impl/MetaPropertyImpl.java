/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9AE4-A463-DB41-5DAE-69E7A5F7FCBC}")
public class MetaPropertyImpl extends Dispatch implements com.wilutions.mslib.office.MetaProperty {
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
  @DeclDISPID(0)  public Object getValue() throws ComException {
    final Object obj = this._dispatchCall(0,"Value", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(0)  public void setValue(final Object value) throws ComException {
    assert(value != null);
    this._dispatchCall(0,"Value", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1)  public String getName() throws ComException {
    final Object obj = this._dispatchCall(1,"Name", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(2)  public String getId() throws ComException {
    final Object obj = this._dispatchCall(2,"Id", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(3)  public Boolean getIsReadOnly() throws ComException {
    final Object obj = this._dispatchCall(3,"IsReadOnly", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(4)  public Boolean getIsRequired() throws ComException {
    final Object obj = this._dispatchCall(4,"IsRequired", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(5)  public com.wilutions.mslib.office.MsoMetaPropertyType getType() throws ComException {
    final Object obj = this._dispatchCall(5,"Type", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoMetaPropertyType.valueOf((Integer)obj);
  }
  @DeclDISPID(6)  public String Validate() throws ComException {
    final Object obj = this._dispatchCall(6,"Validate", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(8)  public IDispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(8,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  public MetaPropertyImpl(String progId) throws ComException {
    super(progId, "{000C038F-0000-0000-C000-000000000046}");
  }
  protected MetaPropertyImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[MetaPropertyImpl" + super.toString() + "]";
  }
}
