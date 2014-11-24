/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C091A950-A463-DB41-5DAE-69E7A5F7FCBC}")
public class RecipientsImpl extends Dispatch implements com.wilutions.mslib.outlook.Recipients {
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
  @DeclDISPID(81)  public com.wilutions.mslib.outlook.Recipient Item(Object Index) throws ComException {
    assert(Index != null);
    final Object obj = this._dispatchCall(81,"Item", DISPATCH_METHOD,null,Index);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl.RecipientImpl.class);
  }
  @DeclDISPID(111)  public com.wilutions.mslib.outlook.Recipient Add(String Name) throws ComException {
    assert(Name != null);
    final Object obj = this._dispatchCall(111,"Add", DISPATCH_METHOD,null,Name);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl.RecipientImpl.class);
  }
  @DeclDISPID(84)  public void Remove(Integer Index) throws ComException {
    assert(Index != null);
    this._dispatchCall(84,"Remove", DISPATCH_METHOD,null,Index);
  }
  @DeclDISPID(126)  public Boolean ResolveAll() throws ComException {
    final Object obj = this._dispatchCall(126,"ResolveAll", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  public RecipientsImpl(String progId) throws ComException {
    super(progId, "{0006303B-0000-0000-C000-000000000046}");
  }
  protected RecipientsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[RecipientsImpl" + super.toString() + "]";
  }
}
