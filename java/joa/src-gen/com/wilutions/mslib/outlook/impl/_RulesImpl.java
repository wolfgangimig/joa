/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C091A9A7-A463-DB41-5DAE-69E7A5F7FCBC}")
public class _RulesImpl extends Dispatch implements com.wilutions.mslib.outlook._Rules {
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
  @DeclDISPID(80)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(80,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(81)  public com.wilutions.mslib.outlook._Rule Item(final Object Index) throws ComException {
    assert(Index != null);
    final Object obj = this._dispatchCall(81,"Item", DISPATCH_METHOD,null,Index);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl._RuleImpl.class);
  }
  @DeclDISPID(64266)  public com.wilutions.mslib.outlook.Rule Create(final String Name, final com.wilutions.mslib.outlook.OlRuleType RuleType) throws ComException {
    assert(Name != null);
    assert(RuleType != null);
    final Object obj = this._dispatchCall(64266,"Create", DISPATCH_METHOD,null,Name,RuleType.value);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(com.wilutions.mslib.outlook.Rule.class);
  }
  @DeclDISPID(61512)  public void Save(final Object ShowProgress) throws ComException {
    assert(ShowProgress != null);
    this._dispatchCall(61512,"Save", DISPATCH_METHOD,null,ShowProgress);
  }
  @DeclDISPID(82)  public void Remove(final Object Index) throws ComException {
    assert(Index != null);
    this._dispatchCall(82,"Remove", DISPATCH_METHOD,null,Index);
  }
  @DeclDISPID(64533)  public Boolean getIsRssRulesProcessingEnabled() throws ComException {
    final Object obj = this._dispatchCall(64533,"IsRssRulesProcessingEnabled", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(64533)  public void setIsRssRulesProcessingEnabled(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(64533,"IsRssRulesProcessingEnabled", DISPATCH_PROPERTYPUT,value);
  }
  public _RulesImpl(String progId) throws ComException {
    super(progId, "{000630CC-0000-0000-C000-000000000046}");
  }
  protected _RulesImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_RulesImpl" + super.toString() + "]";
  }
}
