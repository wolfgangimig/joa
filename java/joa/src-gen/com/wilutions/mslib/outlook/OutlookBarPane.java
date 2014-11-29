/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OutlookBarPane.
 * 
 */
@CoClass(guid="{00063055-0000-0000-C000-000000000046}")
public class OutlookBarPane extends Dispatch implements _OutlookBarPane {
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
  @DeclDISPID(8448)  public OutlookBarStorage getContents() throws ComException {
    final Object obj = this._dispatchCall(8448,"Contents", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl.OutlookBarStorageImpl.class);
  }
  @DeclDISPID(0)  public String getName() throws ComException {
    final Object obj = this._dispatchCall(0,"Name", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(8451)  public Boolean getVisible() throws ComException {
    final Object obj = this._dispatchCall(8451,"Visible", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(8451)  public void setVisible(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(8451,"Visible", DISPATCH_PROPERTYPUT,value);
  }
  public OutlookBarPane() throws ComException {
    super("{00063055-0000-0000-C000-000000000046}", "{00063070-0000-0000-C000-000000000046}");
  }
  protected OutlookBarPane(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[OutlookBarPane" + super.toString() + "]";
  }
}
