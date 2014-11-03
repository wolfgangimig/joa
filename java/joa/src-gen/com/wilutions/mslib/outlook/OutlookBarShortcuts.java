/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OutlookBarShortcuts.
 * 
 */
@CoClass(guid="{00063057-0000-0000-C000-000000000046}")
public class OutlookBarShortcuts extends Dispatch implements _OutlookBarShortcuts {
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
  @DeclDISPID(81)  public OutlookBarShortcut Item(Object Index) throws ComException {
    assert(Index != null);
    final Object obj = this._dispatchCall(81,"Item", DISPATCH_METHOD,null,Index);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.impl.OutlookBarShortcutImpl.class);
  }
  @DeclDISPID(95)  public OutlookBarShortcut Add(Object Target, String Name, Object Index) throws ComException {
    assert(Target != null);
    assert(Name != null);
    assert(Index != null);
    final Object obj = this._dispatchCall(95,"Add", DISPATCH_METHOD,null,Target,Name,Index);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.impl.OutlookBarShortcutImpl.class);
  }
  @DeclDISPID(84)  public void Remove(Object Index) throws ComException {
    assert(Index != null);
    this._dispatchCall(84,"Remove", DISPATCH_METHOD,null,Index);
  }
  public OutlookBarShortcuts() throws ComException {
    super("{00063057-0000-0000-C000-000000000046}");
  }
  protected OutlookBarShortcuts(long ndisp) {
    super(ndisp);
  }
  public OutlookBarShortcuts(Dispatch ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[OutlookBarShortcuts" + super.toString() + "]";
  }
}
