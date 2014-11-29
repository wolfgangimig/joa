/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C091A941-A463-DB41-5DAE-69E7A5F7FCBC}")
public class InspectorEvents_10Impl extends Dispatch implements com.wilutions.mslib.outlook.InspectorEvents_10 {
  @DeclDISPID(61441)  public void onActivate() throws ComException {
    this._dispatchCall(61441,"Activate", DISPATCH_METHOD,null);
  }
  @DeclDISPID(61446)  public void onDeactivate() throws ComException {
    this._dispatchCall(61446,"Deactivate", DISPATCH_METHOD,null);
  }
  @DeclDISPID(61448)  public void onClose() throws ComException {
    this._dispatchCall(61448,"Close", DISPATCH_METHOD,null);
  }
  @DeclDISPID(64017)  public void onBeforeMaximize(ByRef<Boolean> Cancel) throws ComException {
    assert(Cancel != null);
    this._dispatchCall(64017,"BeforeMaximize", DISPATCH_METHOD,null,Cancel);
  }
  @DeclDISPID(64018)  public void onBeforeMinimize(ByRef<Boolean> Cancel) throws ComException {
    assert(Cancel != null);
    this._dispatchCall(64018,"BeforeMinimize", DISPATCH_METHOD,null,Cancel);
  }
  @DeclDISPID(64019)  public void onBeforeMove(ByRef<Boolean> Cancel) throws ComException {
    assert(Cancel != null);
    this._dispatchCall(64019,"BeforeMove", DISPATCH_METHOD,null,Cancel);
  }
  @DeclDISPID(64020)  public void onBeforeSize(ByRef<Boolean> Cancel) throws ComException {
    assert(Cancel != null);
    this._dispatchCall(64020,"BeforeSize", DISPATCH_METHOD,null,Cancel);
  }
  @DeclDISPID(64500)  public void onPageChange(String ActivePageName) throws ComException {
    assert(ActivePageName != null);
    this._dispatchCall(64500,"PageChange", DISPATCH_METHOD,null,ActivePageName);
  }
  @DeclDISPID(64633)  public void onAttachmentSelectionChange() throws ComException {
    this._dispatchCall(64633,"AttachmentSelectionChange", DISPATCH_METHOD,null);
  }
  public InspectorEvents_10Impl(String progId) throws ComException {
    super(progId, "{0006302A-0000-0000-C000-000000000046}");
  }
  protected InspectorEvents_10Impl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[InspectorEvents_10Impl" + super.toString() + "]";
  }
}
