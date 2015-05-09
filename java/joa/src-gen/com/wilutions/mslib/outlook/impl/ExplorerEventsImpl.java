/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C091A924-A463-DB41-5DAE-69E7A5F7FCBC}")
public class ExplorerEventsImpl extends Dispatch implements com.wilutions.mslib.outlook.ExplorerEvents {
  @DeclDISPID(61441)  public void onActivate() throws ComException {
    this._dispatchCall(61441,"Activate", DISPATCH_METHOD,null);
  }
  @DeclDISPID(61442)  public void onFolderSwitch() throws ComException {
    this._dispatchCall(61442,"FolderSwitch", DISPATCH_METHOD,null);
  }
  @DeclDISPID(61443)  public void onBeforeFolderSwitch(final IDispatch NewFolder, final ByRef<Boolean> Cancel) throws ComException {
    assert(Cancel != null);
    this._dispatchCall(61443,"BeforeFolderSwitch", DISPATCH_METHOD,null,Dispatch.param(NewFolder),Cancel);
  }
  @DeclDISPID(61444)  public void onViewSwitch() throws ComException {
    this._dispatchCall(61444,"ViewSwitch", DISPATCH_METHOD,null);
  }
  @DeclDISPID(61445)  public void onBeforeViewSwitch(final Object NewView, final ByRef<Boolean> Cancel) throws ComException {
    assert(NewView != null);
    assert(Cancel != null);
    this._dispatchCall(61445,"BeforeViewSwitch", DISPATCH_METHOD,null,NewView,Cancel);
  }
  @DeclDISPID(61446)  public void onDeactivate() throws ComException {
    this._dispatchCall(61446,"Deactivate", DISPATCH_METHOD,null);
  }
  @DeclDISPID(61447)  public void onSelectionChange() throws ComException {
    this._dispatchCall(61447,"SelectionChange", DISPATCH_METHOD,null);
  }
  @DeclDISPID(61448)  public void onClose() throws ComException {
    this._dispatchCall(61448,"Close", DISPATCH_METHOD,null);
  }
  public ExplorerEventsImpl(String progId) throws ComException {
    super(progId, "{0006304F-0000-0000-C000-000000000046}");
  }
  protected ExplorerEventsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ExplorerEventsImpl" + super.toString() + "]";
  }
}
