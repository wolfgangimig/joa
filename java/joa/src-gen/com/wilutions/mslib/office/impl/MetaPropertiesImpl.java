/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9AE5-A463-DB41-5DAE-69E7A5F7FCBC}")
public class MetaPropertiesImpl extends Dispatch implements com.wilutions.mslib.office.MetaProperties {
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
  @DeclDISPID(0)  public com.wilutions.mslib.office.MetaProperty getItem(Object Index) throws ComException {
    assert(Index != null);
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_PROPERTYGET,null,Index);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.MetaPropertyImpl.class);
  }
  @DeclDISPID(1)  public com.wilutions.mslib.office.MetaProperty GetItemByInternalName(String InternalName) throws ComException {
    assert(InternalName != null);
    final Object obj = this._dispatchCall(1,"GetItemByInternalName", DISPATCH_METHOD,null,InternalName);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.MetaPropertyImpl.class);
  }
  @DeclDISPID(2)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(2,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(3)  public String Validate() throws ComException {
    final Object obj = this._dispatchCall(3,"Validate", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(5)  public Dispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(5,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(6)  public String getSchemaXml() throws ComException {
    final Object obj = this._dispatchCall(6,"SchemaXml", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException {
    final Object obj = this._dispatchCall(-4,"_NewEnum", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  public MetaPropertiesImpl(String progId) throws ComException {
    super(progId);
  }
  protected MetaPropertiesImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[MetaPropertiesImpl" + super.toString() + "]";
  }
}
