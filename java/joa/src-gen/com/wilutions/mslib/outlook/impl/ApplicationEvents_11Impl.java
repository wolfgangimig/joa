/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C091A947-A463-DB41-5DAE-69E7A5F7FCBC}")
public class ApplicationEvents_11Impl extends Dispatch implements com.wilutions.mslib.outlook.ApplicationEvents_11 {
  @DeclDISPID(61442)  public void onItemSend(IDispatch Item, ByRef<Boolean> Cancel) throws ComException {
    assert(Cancel != null);
    this._dispatchCall(61442,"ItemSend", DISPATCH_METHOD,null,(Item!=null?Item:Dispatch.NULL),Cancel);
  }
  @DeclDISPID(61443)  public void onNewMail() throws ComException {
    this._dispatchCall(61443,"NewMail", DISPATCH_METHOD,null);
  }
  @DeclDISPID(61444)  public void onReminder(IDispatch Item) throws ComException {
    this._dispatchCall(61444,"Reminder", DISPATCH_METHOD,null,(Item!=null?Item:Dispatch.NULL));
  }
  @DeclDISPID(61445)  public void onOptionsPagesAdd(com.wilutions.mslib.outlook.PropertyPages Pages) throws ComException {
    this._dispatchCall(61445,"OptionsPagesAdd", DISPATCH_METHOD,null,(Pages!=null?Pages:Dispatch.NULL));
  }
  @DeclDISPID(61446)  public void onStartup() throws ComException {
    this._dispatchCall(61446,"Startup", DISPATCH_METHOD,null);
  }
  @DeclDISPID(61447)  public void onQuit() throws ComException {
    this._dispatchCall(61447,"Quit", DISPATCH_METHOD,null);
  }
  @DeclDISPID(64106)  public void onAdvancedSearchComplete(com.wilutions.mslib.outlook.Search SearchObject) throws ComException {
    this._dispatchCall(64106,"AdvancedSearchComplete", DISPATCH_METHOD,null,(SearchObject!=null?SearchObject:Dispatch.NULL));
  }
  @DeclDISPID(64107)  public void onAdvancedSearchStopped(com.wilutions.mslib.outlook.Search SearchObject) throws ComException {
    this._dispatchCall(64107,"AdvancedSearchStopped", DISPATCH_METHOD,null,(SearchObject!=null?SearchObject:Dispatch.NULL));
  }
  @DeclDISPID(64144)  public void onMAPILogonComplete() throws ComException {
    this._dispatchCall(64144,"MAPILogonComplete", DISPATCH_METHOD,null);
  }
  @DeclDISPID(64181)  public void onNewMailEx(String EntryIDCollection) throws ComException {
    assert(EntryIDCollection != null);
    this._dispatchCall(64181,"NewMailEx", DISPATCH_METHOD,null,EntryIDCollection);
  }
  @DeclDISPID(64423)  public void onItemLoad(IDispatch Item) throws ComException {
    this._dispatchCall(64423,"ItemLoad", DISPATCH_METHOD,null,(Item!=null?Item:Dispatch.NULL));
  }
  @DeclDISPID(64513)  public void onBeforeFolderSharingDialog(com.wilutions.mslib.outlook.MAPIFolder FolderToShare, ByRef<Boolean> Cancel) throws ComException {
    assert(Cancel != null);
    this._dispatchCall(64513,"BeforeFolderSharingDialog", DISPATCH_METHOD,null,(FolderToShare!=null?FolderToShare:Dispatch.NULL),Cancel);
  }
  public ApplicationEvents_11Impl(String progId) throws ComException {
    super(progId, "{0006302C-0000-0000-C000-000000000046}");
  }
  protected ApplicationEvents_11Impl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ApplicationEvents_11Impl" + super.toString() + "]";
  }
}
