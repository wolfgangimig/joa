/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * AutoFormatRules.
 * 
 */
@CoClass(guid="{0006F0A2-0000-0000-C000-000000000046}")
public class AutoFormatRules extends Dispatch implements _AutoFormatRules {
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
  @DeclDISPID(81)  public AutoFormatRule Item(Object Index) throws ComException {
    assert(Index != null);
    final Object obj = this._dispatchCall(81,"Item", DISPATCH_METHOD,null,Index);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(AutoFormatRule.class);
  }
  @DeclDISPID(95)  public AutoFormatRule Add(String Name) throws ComException {
    assert(Name != null);
    final Object obj = this._dispatchCall(95,"Add", DISPATCH_METHOD,null,Name);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(AutoFormatRule.class);
  }
  @DeclDISPID(64342)  public AutoFormatRule Insert(String Name, Object Index) throws ComException {
    assert(Name != null);
    assert(Index != null);
    final Object obj = this._dispatchCall(64342,"Insert", DISPATCH_METHOD,null,Name,Index);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(AutoFormatRule.class);
  }
  @DeclDISPID(82)  public void Remove(Object Index) throws ComException {
    assert(Index != null);
    this._dispatchCall(82,"Remove", DISPATCH_METHOD,null,Index);
  }
  @DeclDISPID(64343)  public void RemoveAll() throws ComException {
    this._dispatchCall(64343,"RemoveAll", DISPATCH_METHOD,null);
  }
  @DeclDISPID(61512)  public void Save() throws ComException {
    this._dispatchCall(61512,"Save", DISPATCH_METHOD,null);
  }
  public AutoFormatRules() throws ComException {
    super("{0006F0A2-0000-0000-C000-000000000046}", "{00063094-0000-0000-C000-000000000046}");
  }
  protected AutoFormatRules(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[AutoFormatRules" + super.toString() + "]";
  }
}
