/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C091A964-A463-DB41-5DAE-69E7A5F7FCBC}")
public class ExplorerEvents_10Impl extends Dispatch implements com.wilutions.mslib.outlook.ExplorerEvents_10 {
  @DeclDISPID(61441)  public void onActivate() throws ComException {
    this._dispatchCall(61441,"Activate", DISPATCH_METHOD,null);
  }
  @DeclDISPID(61442)  public void onFolderSwitch() throws ComException {
    this._dispatchCall(61442,"FolderSwitch", DISPATCH_METHOD,null);
  }
  @DeclDISPID(61443)  public void onBeforeFolderSwitch(final IDispatch NewFolder, final ByRef<Boolean> Cancel) throws ComException {
    assert(Cancel != null);
    this._dispatchCall(61443,"BeforeFolderSwitch", DISPATCH_METHOD,null,(NewFolder!=null?NewFolder:Dispatch.NULL),Cancel);
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
  @DeclDISPID(64017)  public void onBeforeMaximize(final ByRef<Boolean> Cancel) throws ComException {
    assert(Cancel != null);
    this._dispatchCall(64017,"BeforeMaximize", DISPATCH_METHOD,null,Cancel);
  }
  @DeclDISPID(64018)  public void onBeforeMinimize(final ByRef<Boolean> Cancel) throws ComException {
    assert(Cancel != null);
    this._dispatchCall(64018,"BeforeMinimize", DISPATCH_METHOD,null,Cancel);
  }
  @DeclDISPID(64019)  public void onBeforeMove(final ByRef<Boolean> Cancel) throws ComException {
    assert(Cancel != null);
    this._dispatchCall(64019,"BeforeMove", DISPATCH_METHOD,null,Cancel);
  }
  @DeclDISPID(64020)  public void onBeforeSize(final ByRef<Boolean> Cancel) throws ComException {
    assert(Cancel != null);
    this._dispatchCall(64020,"BeforeSize", DISPATCH_METHOD,null,Cancel);
  }
  @DeclDISPID(64014)  public void onBeforeItemCopy(final ByRef<Boolean> Cancel) throws ComException {
    assert(Cancel != null);
    this._dispatchCall(64014,"BeforeItemCopy", DISPATCH_METHOD,null,Cancel);
  }
  @DeclDISPID(64015)  public void onBeforeItemCut(final ByRef<Boolean> Cancel) throws ComException {
    assert(Cancel != null);
    this._dispatchCall(64015,"BeforeItemCut", DISPATCH_METHOD,null,Cancel);
  }
  @DeclDISPID(64016)  public void onBeforeItemPaste(final Object ClipboardContent, final com.wilutions.mslib.outlook.MAPIFolder Target, final ByRef<Boolean> Cancel) throws ComException {
    assert(ClipboardContent != null);
    assert(Cancel != null);
    this._dispatchCall(64016,"BeforeItemPaste", DISPATCH_METHOD,null,ClipboardContent,(Target!=null?Target:Dispatch.NULL),Cancel);
  }
  @DeclDISPID(64633)  public void onAttachmentSelectionChange() throws ComException {
    this._dispatchCall(64633,"AttachmentSelectionChange", DISPATCH_METHOD,null);
  }
  @DeclDISPID(64658)  public void onInlineResponse(final IDispatch Item) throws ComException {
    assert(Item != null);
    this._dispatchCall(64658,"InlineResponse", DISPATCH_METHOD,null,Item);
  }
  @DeclDISPID(64662)  public void onInlineResponseClose() throws ComException {
    this._dispatchCall(64662,"InlineResponseClose", DISPATCH_METHOD,null);
  }
  public ExplorerEvents_10Impl(String progId) throws ComException {
    super(progId, "{0006300F-0000-0000-C000-000000000046}");
  }
  protected ExplorerEvents_10Impl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ExplorerEvents_10Impl" + super.toString() + "]";
  }
}
