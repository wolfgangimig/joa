/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C091A994-A463-DB41-5DAE-69E7A5F7FCBC}")
public class _SolutionsModuleImpl extends Dispatch implements com.wilutions.mslib.outlook._SolutionsModule {
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
  @DeclDISPID(64442)  public void setPosition(final Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(64442,"Position", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(64443)  public Boolean getVisible() throws ComException {
    final Object obj = this._dispatchCall(64443,"Visible", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(64443)  public void setVisible(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(64443,"Visible", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(64574)  public void AddSolution(final com.wilutions.mslib.outlook.MAPIFolder Solution, final com.wilutions.mslib.outlook.OlSolutionScope Scope) throws ComException {
    assert(Scope != null);
    this._dispatchCall(64574,"AddSolution", DISPATCH_METHOD,null,(Solution!=null?Solution:Dispatch.NULL),Scope.value);
  }
  public _SolutionsModuleImpl(String progId) throws ComException {
    super(progId, "{000630FF-0000-0000-C000-000000000046}");
  }
  protected _SolutionsModuleImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_SolutionsModuleImpl" + super.toString() + "]";
  }
}
