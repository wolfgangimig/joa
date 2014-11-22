/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C091A985-A463-DB41-5DAE-69E7A5F7FCBC}")
public class _NotesModuleImpl extends Dispatch implements com.wilutions.mslib.outlook._NotesModule {
  @DeclDISPID(61440)  public com.wilutions.mslib.outlook._Application getApplication() throws ComException {
    final Object obj = this._dispatchCall(61440,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.impl._ApplicationImpl.class);
  }
  @DeclDISPID(61450)  public com.wilutions.mslib.outlook.OlObjectClass getClass_() throws ComException {
    final Object obj = this._dispatchCall(61450,"Class", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.outlook.OlObjectClass.valueOf((Integer)obj);
  }
  @DeclDISPID(61451)  public com.wilutions.mslib.outlook._NameSpace getSession() throws ComException {
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
  @DeclDISPID(64441)  public com.wilutions.mslib.outlook.OlNavigationModuleType getNavigationModuleType() throws ComException {
    final Object obj = this._dispatchCall(64441,"NavigationModuleType", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.outlook.OlNavigationModuleType.valueOf((Integer)obj);
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
  @DeclDISPID(64444)  public com.wilutions.mslib.outlook._NavigationGroups getNavigationGroups() throws ComException {
    final Object obj = this._dispatchCall(64444,"NavigationGroups", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.impl._NavigationGroupsImpl.class);
  }
  public _NotesModuleImpl(String progId) throws ComException {
    super(progId, "{000630EE-0000-0000-C000-000000000046}");
  }
  protected _NotesModuleImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_NotesModuleImpl" + super.toString() + "]";
  }
}
