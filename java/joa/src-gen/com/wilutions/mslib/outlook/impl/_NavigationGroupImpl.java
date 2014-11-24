/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C091A99B-A463-DB41-5DAE-69E7A5F7FCBC}")
public class _NavigationGroupImpl extends Dispatch implements com.wilutions.mslib.outlook._NavigationGroup {
  @DeclDISPID(61440)  public com.wilutions.mslib.outlook._Application getApplication() throws ComException {
    final Object obj = this._dispatchCall(61440,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl._ApplicationImpl.class);
  }
  @DeclDISPID(61450)  public com.wilutions.mslib.outlook.OlObjectClass getClass_() throws ComException {
    final Object obj = this._dispatchCall(61450,"Class", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.outlook.OlObjectClass.valueOf((Integer)obj);
  }
  @DeclDISPID(61451)  public com.wilutions.mslib.outlook._NameSpace getSession() throws ComException {
    final Object obj = this._dispatchCall(61451,"Session", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl._NameSpaceImpl.class);
  }
  @DeclDISPID(61441)  public IDispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(61441,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(64448)  public com.wilutions.mslib.outlook.OlGroupType getGroupType() throws ComException {
    final Object obj = this._dispatchCall(64448,"GroupType", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.outlook.OlGroupType.valueOf((Integer)obj);
  }
  @DeclDISPID(64449)  public com.wilutions.mslib.outlook.NavigationFolders getNavigationFolders() throws ComException {
    final Object obj = this._dispatchCall(64449,"NavigationFolders", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(com.wilutions.mslib.outlook.NavigationFolders.class);
  }
  @DeclDISPID(8450)  public String getName() throws ComException {
    final Object obj = this._dispatchCall(8450,"Name", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(8450)  public void setName(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(8450,"Name", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(64455)  public Integer getPosition() throws ComException {
    final Object obj = this._dispatchCall(64455,"Position", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(64455)  public void setPosition(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(64455,"Position", DISPATCH_PROPERTYPUT,value);
  }
  public _NavigationGroupImpl(String progId) throws ComException {
    super(progId, "{000630F0-0000-0000-C000-000000000046}");
  }
  protected _NavigationGroupImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_NavigationGroupImpl" + super.toString() + "]";
  }
}
