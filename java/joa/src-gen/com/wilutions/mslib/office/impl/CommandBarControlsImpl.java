/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9A6D-A463-DB41-5DAE-69E7A5F7FCBC}")
public class CommandBarControlsImpl extends Dispatch implements com.wilutions.mslib.office.CommandBarControls {
  @DeclDISPID(1610743808)  public Dispatch getApplication() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"Creator", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610809344)  public com.wilutions.mslib.office.CommandBarControl Add(Object Type, Object Id, Object Parameter, Object Before, Object Temporary) throws ComException {
    assert(Type != null);
    assert(Id != null);
    assert(Parameter != null);
    assert(Before != null);
    assert(Temporary != null);
    final Object obj = this._dispatchCall(1610809344,"Add", DISPATCH_METHOD,null,Type,Id,Parameter,Before,Temporary);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.CommandBarControlImpl.class);
  }
  @DeclDISPID(1610809345)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(1610809345,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(0)  public com.wilutions.mslib.office.CommandBarControl getItem(Object Index) throws ComException {
    assert(Index != null);
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_PROPERTYGET,null,Index);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.CommandBarControlImpl.class);
  }
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException {
    final Object obj = this._dispatchCall(-4,"_NewEnum", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1610809348)  public com.wilutions.mslib.office.CommandBar getParent() throws ComException {
    final Object obj = this._dispatchCall(1610809348,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.CommandBarImpl.class);
  }
  public CommandBarControlsImpl(String progId) throws ComException {
    super(progId);
  }
  protected CommandBarControlsImpl(long ndisp) {
    super(ndisp);
  }
  public CommandBarControlsImpl(Dispatch ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[CommandBarControlsImpl" + super.toString() + "]";
  }
}
