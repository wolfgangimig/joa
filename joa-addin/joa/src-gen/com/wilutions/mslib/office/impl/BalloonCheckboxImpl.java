/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9A43-A463-DB41-5DAE-69E7A5F7FCBC}")
public class BalloonCheckboxImpl extends Dispatch implements com.wilutions.mslib.office.BalloonCheckbox {
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
  @DeclDISPID(0)  public String getItem() throws ComException {
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610809345)  public String getName() throws ComException {
    final Object obj = this._dispatchCall(1610809345,"Name", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610809346)  public IDispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(1610809346,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(1610809347)  public void setChecked(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610809347,"Checked", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610809347)  public Boolean getChecked() throws ComException {
    final Object obj = this._dispatchCall(1610809347,"Checked", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610809349)  public void setText(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610809349,"Text", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610809349)  public String getText() throws ComException {
    final Object obj = this._dispatchCall(1610809349,"Text", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  public BalloonCheckboxImpl(String progId) throws ComException {
    super(progId, "{000C0328-0000-0000-C000-000000000046}");
  }
  protected BalloonCheckboxImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[BalloonCheckboxImpl" + super.toString() + "]";
  }
}
