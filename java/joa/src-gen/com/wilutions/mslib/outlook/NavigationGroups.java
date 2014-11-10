/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * NavigationGroups.
 * 
 */
@CoClass(guid="{000610F4-0000-0000-C000-000000000046}")
public class NavigationGroups extends Dispatch implements _NavigationGroups {
  @DeclDISPID(61440)  public _Application getApplication() throws ComException {
    final Object obj = this._dispatchCall(61440,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.impl._ApplicationImpl.class);
  }
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException {
    final Object obj = this._dispatchCall(61450,"Class", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return OlObjectClass.valueOf((Integer)obj);
  }
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException {
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
  @DeclDISPID(81)  public _NavigationGroup Item(Object Index) throws ComException {
    assert(Index != null);
    final Object obj = this._dispatchCall(81,"Item", DISPATCH_METHOD,null,Index);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.impl._NavigationGroupImpl.class);
  }
  @DeclDISPID(64445)  public NavigationGroup Create(String GroupDisplayName) throws ComException {
    assert(GroupDisplayName != null);
    final Object obj = this._dispatchCall(64445,"Create", DISPATCH_METHOD,null,GroupDisplayName);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(NavigationGroup.class);
  }
  @DeclDISPID(64446)  public void Delete(NavigationGroup Group) throws ComException {
    this._dispatchCall(64446,"Delete", DISPATCH_METHOD,null,(Group!=null?Group:Dispatch.NULL));
  }
  @DeclDISPID(64447)  public NavigationGroup GetDefaultNavigationGroup(OlGroupType DefaultFolderGroup) throws ComException {
    assert(DefaultFolderGroup != null);
    final Object obj = this._dispatchCall(64447,"GetDefaultNavigationGroup", DISPATCH_METHOD,null,DefaultFolderGroup.value);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(NavigationGroup.class);
  }
  public NavigationGroups() throws ComException {
    super("{000610F4-0000-0000-C000-000000000046}");
  }
  protected NavigationGroups(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[NavigationGroups" + super.toString() + "]";
  }
}
