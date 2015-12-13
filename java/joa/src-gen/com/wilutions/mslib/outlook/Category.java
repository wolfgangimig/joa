/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * Category.
 * 
 */
@CoClass(guid="{000610E3-0000-0000-C000-000000000046}")
public class Category extends Dispatch implements _Category {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(61440)  public _Application getApplication() throws ComException {
    final Object obj = this._dispatchCall(61440,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl._ApplicationImpl.class);
  }
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException {
    final Object obj = this._dispatchCall(61450,"Class", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return OlObjectClass.valueOf((Integer)obj);
  }
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException {
    final Object obj = this._dispatchCall(61451,"Session", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl._NameSpaceImpl.class);
  }
  @DeclDISPID(61441)  public IDispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(61441,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(8450)  public String getName() throws ComException {
    final Object obj = this._dispatchCall(8450,"Name", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(8450)  public void setName(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(8450,"Name", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(64419)  public OlCategoryColor getColor() throws ComException {
    final Object obj = this._dispatchCall(64419,"Color", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return OlCategoryColor.valueOf((Integer)obj);
  }
  @DeclDISPID(64419)  public void setColor(final OlCategoryColor value) throws ComException {
    assert(value != null);
    this._dispatchCall(64419,"Color", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(64420)  public OlCategoryShortcutKey getShortcutKey() throws ComException {
    final Object obj = this._dispatchCall(64420,"ShortcutKey", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return OlCategoryShortcutKey.valueOf((Integer)obj);
  }
  @DeclDISPID(64420)  public void setShortcutKey(final OlCategoryShortcutKey value) throws ComException {
    assert(value != null);
    this._dispatchCall(64420,"ShortcutKey", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(64464)  public String getCategoryID() throws ComException {
    final Object obj = this._dispatchCall(64464,"CategoryID", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(64539)  public com.wilutions.mslib.stdole.OLE_COLOR getCategoryBorderColor() throws ComException {
    final Object obj = this._dispatchCall(64539,"CategoryBorderColor", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Integer als = (Integer)obj;
    return new com.wilutions.mslib.stdole.OLE_COLOR(als);
  }
  @DeclDISPID(64540)  public com.wilutions.mslib.stdole.OLE_COLOR getCategoryGradientTopColor() throws ComException {
    final Object obj = this._dispatchCall(64540,"CategoryGradientTopColor", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Integer als = (Integer)obj;
    return new com.wilutions.mslib.stdole.OLE_COLOR(als);
  }
  @DeclDISPID(64541)  public com.wilutions.mslib.stdole.OLE_COLOR getCategoryGradientBottomColor() throws ComException {
    final Object obj = this._dispatchCall(64541,"CategoryGradientBottomColor", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Integer als = (Integer)obj;
    return new com.wilutions.mslib.stdole.OLE_COLOR(als);
  }
  public Category() throws ComException {
    super("{000610E3-0000-0000-C000-000000000046}", "{000630E3-0000-0000-C000-000000000046}");
  }
  protected Category(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[Category" + super.toString() + "]";
  }
}
