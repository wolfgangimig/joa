/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9A45-A463-DB41-5DAE-69E7A5F7FCBC}")
public class BalloonLabelsImpl extends Dispatch implements com.wilutions.mslib.office.BalloonLabels {
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
  @DeclDISPID(1610809344)  public String getName() throws ComException {
    final Object obj = this._dispatchCall(1610809344,"Name", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610809345)  public Dispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(1610809345,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(0)  public Dispatch getItem(Integer Index) throws ComException {
    assert(Index != null);
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_PROPERTYGET,null,Index);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(1610809347)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(1610809347,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610809347)  public void setCount(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610809347,"Count", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException {
    final Object obj = this._dispatchCall(-4,"_NewEnum", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  public BalloonLabelsImpl(String progId) throws ComException {
    super(progId);
  }
  protected BalloonLabelsImpl(long ndisp) {
    super(ndisp);
  }
  public BalloonLabelsImpl(Dispatch ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[BalloonLabelsImpl" + super.toString() + "]";
  }
}
