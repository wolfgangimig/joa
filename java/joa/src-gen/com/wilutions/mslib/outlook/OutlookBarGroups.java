/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OutlookBarGroups.
 * 
 */
@CoClass(guid="{00063056-0000-0000-C000-000000000046}")
public class OutlookBarGroups extends Dispatch implements _OutlookBarGroups {
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
  @DeclDISPID(80)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(80,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(81)  public OutlookBarGroup Item(final Object Index) throws ComException {
    assert(Index != null);
    final Object obj = this._dispatchCall(81,"Item", DISPATCH_METHOD,null,Index);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl.OutlookBarGroupImpl.class);
  }
  @DeclDISPID(95)  public OutlookBarGroup Add(final String Name, final Object Index) throws ComException {
    assert(Name != null);
    assert(Index != null);
    final Object obj = this._dispatchCall(95,"Add", DISPATCH_METHOD,null,Name,Variant.param(Index));
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl.OutlookBarGroupImpl.class);
  }
  @DeclDISPID(84)  public void Remove(final Object Index) throws ComException {
    assert(Index != null);
    this._dispatchCall(84,"Remove", DISPATCH_METHOD,null,Index);
  }
  public OutlookBarGroups() throws ComException {
    super("{00063056-0000-0000-C000-000000000046}", "{00063072-0000-0000-C000-000000000046}");
  }
  protected OutlookBarGroups(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[OutlookBarGroups" + super.toString() + "]";
  }
}
