/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B8C59-A463-DB41-5DAE-69E7A5F7FCBC}")
public class ODSOColumnsImpl extends Dispatch implements com.wilutions.mslib.office.ODSOColumns {
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
  @DeclDISPID(1)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(1,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(2)  public IDispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(2,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(1610809346)  public IDispatch Item(final Object varIndex) throws ComException {
    assert(varIndex != null);
    final Object obj = this._dispatchCall(1610809346,"Item", DISPATCH_METHOD,null,varIndex);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  public ODSOColumnsImpl(String progId) throws ComException {
    super(progId, "{000C1532-0000-0000-C000-000000000046}");
  }
  protected ODSOColumnsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ODSOColumnsImpl" + super.toString() + "]";
  }
}
