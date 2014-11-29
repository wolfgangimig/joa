/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C091A925-A463-DB41-5DAE-69E7A5F7FCBC}")
public class ApplicationEventsImpl extends Dispatch implements com.wilutions.mslib.outlook.ApplicationEvents {
  @DeclDISPID(61442)  public void onItemSend(final IDispatch Item, final ByRef<Boolean> Cancel) throws ComException {
    assert(Cancel != null);
    this._dispatchCall(61442,"ItemSend", DISPATCH_METHOD,null,(Item!=null?Item:Dispatch.NULL),Cancel);
  }
  @DeclDISPID(61443)  public void onNewMail() throws ComException {
    this._dispatchCall(61443,"NewMail", DISPATCH_METHOD,null);
  }
  @DeclDISPID(61444)  public void onReminder(final IDispatch Item) throws ComException {
    this._dispatchCall(61444,"Reminder", DISPATCH_METHOD,null,(Item!=null?Item:Dispatch.NULL));
  }
  @DeclDISPID(61445)  public void onOptionsPagesAdd(final com.wilutions.mslib.outlook.PropertyPages Pages) throws ComException {
    this._dispatchCall(61445,"OptionsPagesAdd", DISPATCH_METHOD,null,(Pages!=null?Pages:Dispatch.NULL));
  }
  @DeclDISPID(61446)  public void onStartup() throws ComException {
    this._dispatchCall(61446,"Startup", DISPATCH_METHOD,null);
  }
  @DeclDISPID(61447)  public void onQuit() throws ComException {
    this._dispatchCall(61447,"Quit", DISPATCH_METHOD,null);
  }
  public ApplicationEventsImpl(String progId) throws ComException {
    super(progId, "{0006304E-0000-0000-C000-000000000046}");
  }
  protected ApplicationEventsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ApplicationEventsImpl" + super.toString() + "]";
  }
}
