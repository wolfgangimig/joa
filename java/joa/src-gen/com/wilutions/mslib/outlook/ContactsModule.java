/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * ContactsModule.
 * 
 */
@CoClass(guid="{000610EB-0000-0000-C000-000000000046}")
public class ContactsModule extends Dispatch implements _ContactsModule {
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
  @DeclDISPID(64441)  public OlNavigationModuleType getNavigationModuleType() throws ComException {
    final Object obj = this._dispatchCall(64441,"NavigationModuleType", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return OlNavigationModuleType.valueOf((Integer)obj);
  }
  @DeclDISPID(8450)  public String getName() throws ComException {
    final Object obj = this._dispatchCall(8450,"Name", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(64442)  public Integer getPosition() throws ComException {
    final Object obj = this._dispatchCall(64442,"Position", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(64442)  public void setPosition(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(64442,"Position", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(64443)  public Boolean getVisible() throws ComException {
    final Object obj = this._dispatchCall(64443,"Visible", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(64443)  public void setVisible(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(64443,"Visible", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(64444)  public _NavigationGroups getNavigationGroups() throws ComException {
    final Object obj = this._dispatchCall(64444,"NavigationGroups", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl._NavigationGroupsImpl.class);
  }
  public ContactsModule() throws ComException {
    super("{000610EB-0000-0000-C000-000000000046}", "{000630EB-0000-0000-C000-000000000046}");
  }
  protected ContactsModule(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ContactsModule" + super.toString() + "]";
  }
}
