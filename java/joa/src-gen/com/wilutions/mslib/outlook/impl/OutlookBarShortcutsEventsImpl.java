/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C091A917-A463-DB41-5DAE-69E7A5F7FCBC}")
public class OutlookBarShortcutsEventsImpl extends Dispatch implements com.wilutions.mslib.outlook.OutlookBarShortcutsEvents {
  @DeclDISPID(61441)  public void onShortcutAdd(com.wilutions.mslib.outlook.OutlookBarShortcut NewShortcut) throws ComException {
    this._dispatchCall(61441,"ShortcutAdd", DISPATCH_METHOD,null,(NewShortcut!=null?NewShortcut:Dispatch.NULL));
  }
  @DeclDISPID(61442)  public void onBeforeShortcutAdd(ByRef<Boolean> Cancel) throws ComException {
    assert(Cancel != null);
    this._dispatchCall(61442,"BeforeShortcutAdd", DISPATCH_METHOD,null,Cancel);
  }
  @DeclDISPID(61443)  public void onBeforeShortcutRemove(com.wilutions.mslib.outlook.OutlookBarShortcut Shortcut, ByRef<Boolean> Cancel) throws ComException {
    assert(Cancel != null);
    this._dispatchCall(61443,"BeforeShortcutRemove", DISPATCH_METHOD,null,(Shortcut!=null?Shortcut:Dispatch.NULL),Cancel);
  }
  public OutlookBarShortcutsEventsImpl(String progId) throws ComException {
    super(progId, "{0006307C-0000-0000-C000-000000000046}");
  }
  protected OutlookBarShortcutsEventsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[OutlookBarShortcutsEventsImpl" + super.toString() + "]";
  }
}
