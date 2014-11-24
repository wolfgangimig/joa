/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9A2B-A463-DB41-5DAE-69E7A5F7FCBC}")
public class ScriptsImpl extends Dispatch implements com.wilutions.mslib.office.Scripts {
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"Creator", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610809344)  public IDispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(1610809344,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(1610809345)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(1610809345,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException {
    final Object obj = this._dispatchCall(-4,"_NewEnum", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(0)  public com.wilutions.mslib.office.Script Item(Object Index) throws ComException {
    assert(Index != null);
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_METHOD,null,Index);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.ScriptImpl.class);
  }
  @DeclDISPID(1610809348)  public com.wilutions.mslib.office.Script Add(IDispatch Anchor, com.wilutions.mslib.office.MsoScriptLocation Location, com.wilutions.mslib.office.MsoScriptLanguage Language, String Id, String Extended, String ScriptText) throws ComException {
    assert(Location != null);
    assert(Language != null);
    assert(Id != null);
    assert(Extended != null);
    assert(ScriptText != null);
    final Object obj = this._dispatchCall(1610809348,"Add", DISPATCH_METHOD,null,(Anchor!=null?Anchor:Dispatch.NULL),Location.value,Language.value,Id,Extended,ScriptText);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.ScriptImpl.class);
  }
  @DeclDISPID(1610809349)  public void Delete() throws ComException {
    this._dispatchCall(1610809349,"Delete", DISPATCH_METHOD,null);
  }
  public ScriptsImpl(String progId) throws ComException {
    super(progId, "{000C0340-0000-0000-C000-000000000046}");
  }
  protected ScriptsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ScriptsImpl" + super.toString() + "]";
  }
}
