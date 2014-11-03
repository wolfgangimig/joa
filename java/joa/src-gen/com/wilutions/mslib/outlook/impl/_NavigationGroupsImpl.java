/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C091A984-A463-DB41-5DAE-69E7A5F7FCBC}")
public class _NavigationGroupsImpl extends Dispatch implements com.wilutions.mslib.outlook._NavigationGroups {
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
  @DeclDISPID(81)  public com.wilutions.mslib.outlook._NavigationGroup Item(Object Index) throws ComException {
    assert(Index != null);
    final Object obj = this._dispatchCall(81,"Item", DISPATCH_METHOD,null,Index);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.impl._NavigationGroupImpl.class);
  }
  @DeclDISPID(64445)  public com.wilutions.mslib.outlook.NavigationGroup Create(String GroupDisplayName) throws ComException {
    assert(GroupDisplayName != null);
    final Object obj = this._dispatchCall(64445,"Create", DISPATCH_METHOD,null,GroupDisplayName);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.NavigationGroup.class);
  }
  @DeclDISPID(64446)  public void Delete(com.wilutions.mslib.outlook.NavigationGroup Group) throws ComException {
    this._dispatchCall(64446,"Delete", DISPATCH_METHOD,null,(Group!=null?Group:Dispatch.NULL));
  }
  @DeclDISPID(64447)  public com.wilutions.mslib.outlook.NavigationGroup GetDefaultNavigationGroup(com.wilutions.mslib.outlook.OlGroupType DefaultFolderGroup) throws ComException {
    assert(DefaultFolderGroup != null);
    final Object obj = this._dispatchCall(64447,"GetDefaultNavigationGroup", DISPATCH_METHOD,null,DefaultFolderGroup.value);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.NavigationGroup.class);
  }
  public _NavigationGroupsImpl(String progId) throws ComException {
    super(progId);
  }
  protected _NavigationGroupsImpl(long ndisp) {
    super(ndisp);
  }
  public _NavigationGroupsImpl(Dispatch ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_NavigationGroupsImpl" + super.toString() + "]";
  }
}
