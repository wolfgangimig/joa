/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * UserDefinedProperties.
 * 
 */
@CoClass(guid="{00061047-0000-0000-C000-000000000046}")
public class UserDefinedProperties extends Dispatch implements _UserDefinedProperties {
  @DeclDISPID(61440)  public _Application getApplication() throws ComException {
    final Object obj = this._dispatchCall(61440,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.impl._ApplicationImpl.class);
  }
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException {
    final Object obj = this._dispatchCall(61450,"Class", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return OlObjectClass.valueOf((Integer)obj);
  }
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException {
    final Object obj = this._dispatchCall(61451,"Session", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.impl._NameSpaceImpl.class);
  }
  @DeclDISPID(61441)  public Dispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(61441,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(80)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(80,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(81)  public _UserDefinedProperty Item(Object Index) throws ComException {
    assert(Index != null);
    final Object obj = this._dispatchCall(81,"Item", DISPATCH_METHOD,null,Index);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.impl._UserDefinedPropertyImpl.class);
  }
  @DeclDISPID(102)  public UserDefinedProperty Add(String Name, OlUserPropertyType Type, Object DisplayFormat, Object Formula) throws ComException {
    assert(Name != null);
    assert(Type != null);
    assert(DisplayFormat != null);
    assert(Formula != null);
    final Object obj = this._dispatchCall(102,"Add", DISPATCH_METHOD,null,Name,Type.value,DisplayFormat,Formula);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(UserDefinedProperty.class);
  }
  @DeclDISPID(103)  public UserDefinedProperty Find(String Name) throws ComException {
    assert(Name != null);
    final Object obj = this._dispatchCall(103,"Find", DISPATCH_METHOD,null,Name);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(UserDefinedProperty.class);
  }
  @DeclDISPID(82)  public void Remove(Integer Index) throws ComException {
    assert(Index != null);
    this._dispatchCall(82,"Remove", DISPATCH_METHOD,null,Index);
  }
  @DeclDISPID(64069)  public void Refresh() throws ComException {
    this._dispatchCall(64069,"Refresh", DISPATCH_METHOD,null);
  }
  public UserDefinedProperties() throws ComException {
    super("{00061047-0000-0000-C000-000000000046}");
  }
  protected UserDefinedProperties(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[UserDefinedProperties" + super.toString() + "]";
  }
}
