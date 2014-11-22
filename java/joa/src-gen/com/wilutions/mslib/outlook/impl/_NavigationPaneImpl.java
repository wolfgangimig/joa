/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C091A98D-A463-DB41-5DAE-69E7A5F7FCBC}")
public class _NavigationPaneImpl extends Dispatch implements com.wilutions.mslib.outlook._NavigationPane {
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
  @DeclDISPID(64436)  public Boolean getIsCollapsed() throws ComException {
    final Object obj = this._dispatchCall(64436,"IsCollapsed", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(64436)  public void setIsCollapsed(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(64436,"IsCollapsed", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(64437)  public com.wilutions.mslib.outlook.NavigationModule getCurrentModule() throws ComException {
    final Object obj = this._dispatchCall(64437,"CurrentModule", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.NavigationModule.class);
  }
  @DeclDISPID(64437)  public void setCurrentModule(com.wilutions.mslib.outlook.NavigationModule value) throws ComException {
    this._dispatchCall(64437,"CurrentModule", DISPATCH_PROPERTYPUTREF,(value!=null?value:Dispatch.NULL));
  }
  @DeclDISPID(64438)  public Integer getDisplayedModuleCount() throws ComException {
    final Object obj = this._dispatchCall(64438,"DisplayedModuleCount", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(64438)  public void setDisplayedModuleCount(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(64438,"DisplayedModuleCount", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(64439)  public com.wilutions.mslib.outlook.NavigationModules getModules() throws ComException {
    final Object obj = this._dispatchCall(64439,"Modules", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.NavigationModules.class);
  }
  public _NavigationPaneImpl(String progId) throws ComException {
    super(progId, "{000630E6-0000-0000-C000-000000000046}");
  }
  protected _NavigationPaneImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_NavigationPaneImpl" + super.toString() + "]";
  }
}
