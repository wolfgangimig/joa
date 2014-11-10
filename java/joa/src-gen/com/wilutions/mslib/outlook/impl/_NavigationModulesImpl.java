/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C091A98C-A463-DB41-5DAE-69E7A5F7FCBC}")
public class _NavigationModulesImpl extends Dispatch implements com.wilutions.mslib.outlook._NavigationModules {
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
  @DeclDISPID(80)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(80,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(81)  public com.wilutions.mslib.outlook._NavigationModule Item(Object Index) throws ComException {
    assert(Index != null);
    final Object obj = this._dispatchCall(81,"Item", DISPATCH_METHOD,null,Index);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.impl._NavigationModuleImpl.class);
  }
  @DeclDISPID(64440)  public com.wilutions.mslib.outlook.NavigationModule GetNavigationModule(com.wilutions.mslib.outlook.OlNavigationModuleType ModuleType) throws ComException {
    assert(ModuleType != null);
    final Object obj = this._dispatchCall(64440,"GetNavigationModule", DISPATCH_METHOD,null,ModuleType.value);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.NavigationModule.class);
  }
  public _NavigationModulesImpl(String progId) throws ComException {
    super(progId);
  }
  protected _NavigationModulesImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_NavigationModulesImpl" + super.toString() + "]";
  }
}
