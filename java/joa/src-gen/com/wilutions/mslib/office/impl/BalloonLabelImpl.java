/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9A5B-A463-DB41-5DAE-69E7A5F7FCBC}")
public class BalloonLabelImpl extends Dispatch implements com.wilutions.mslib.office.BalloonLabel {
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
  @DeclDISPID(1610809346)  public Dispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(1610809346,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(1610809347)  public void setText(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610809347,"Text", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610809347)  public String getText() throws ComException {
    final Object obj = this._dispatchCall(1610809347,"Text", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  public BalloonLabelImpl(String progId) throws ComException {
    super(progId);
  }
  protected BalloonLabelImpl(long ndisp) {
    super(ndisp);
  }
  public BalloonLabelImpl(Dispatch ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[BalloonLabelImpl" + super.toString() + "]";
  }
}
