/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9ACC-A463-DB41-5DAE-69E7A5F7FCBC}")
public class IRibbonUIImpl extends Dispatch implements com.wilutions.mslib.office.IRibbonUI {
  @DeclDISPID(1)  public void Invalidate() throws ComException {
    this._dispatchCall(1,"Invalidate", DISPATCH_METHOD,null);
  }
  @DeclDISPID(2)  public void InvalidateControl(String ControlID) throws ComException {
    assert(ControlID != null);
    this._dispatchCall(2,"InvalidateControl", DISPATCH_METHOD,null,ControlID);
  }
  @DeclDISPID(3)  public void InvalidateControlMso(String ControlID) throws ComException {
    assert(ControlID != null);
    this._dispatchCall(3,"InvalidateControlMso", DISPATCH_METHOD,null,ControlID);
  }
  @DeclDISPID(4)  public void ActivateTab(String ControlID) throws ComException {
    assert(ControlID != null);
    this._dispatchCall(4,"ActivateTab", DISPATCH_METHOD,null,ControlID);
  }
  @DeclDISPID(5)  public void ActivateTabMso(String ControlID) throws ComException {
    assert(ControlID != null);
    this._dispatchCall(5,"ActivateTabMso", DISPATCH_METHOD,null,ControlID);
  }
  @DeclDISPID(6)  public void ActivateTabQ(String ControlID, String Namespace) throws ComException {
    assert(ControlID != null);
    assert(Namespace != null);
    this._dispatchCall(6,"ActivateTabQ", DISPATCH_METHOD,null,ControlID,Namespace);
  }
  public IRibbonUIImpl(String progId) throws ComException {
    super(progId);
  }
  protected IRibbonUIImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IRibbonUIImpl" + super.toString() + "]";
  }
}
