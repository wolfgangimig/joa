/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * NavigationGroup.
 * 
 */
@CoClass(guid="{000610F0-0000-0000-C000-000000000046}")
public class NavigationGroup extends Dispatch implements _NavigationGroup {
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
  @DeclDISPID(64448)  public OlGroupType getGroupType() throws ComException {
    final Object obj = this._dispatchCall(64448,"GroupType", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return OlGroupType.valueOf((Integer)obj);
  }
  @DeclDISPID(64449)  public NavigationFolders getNavigationFolders() throws ComException {
    final Object obj = this._dispatchCall(64449,"NavigationFolders", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(NavigationFolders.class);
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
  @DeclDISPID(64455)  public Integer getPosition() throws ComException {
    final Object obj = this._dispatchCall(64455,"Position", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(64455)  public void setPosition(final Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(64455,"Position", DISPATCH_PROPERTYPUT,value);
  }
  public NavigationGroup() throws ComException {
    super("{000610F0-0000-0000-C000-000000000046}", "{000630F0-0000-0000-C000-000000000046}");
  }
  protected NavigationGroup(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[NavigationGroup" + super.toString() + "]";
  }
}
