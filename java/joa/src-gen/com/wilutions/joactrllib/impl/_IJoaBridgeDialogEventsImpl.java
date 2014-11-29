/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.joactrllib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{E1C694EB-A571-9955-24B4-44D48E33E48E}")
public class _IJoaBridgeDialogEventsImpl extends Dispatch implements com.wilutions.joactrllib._IJoaBridgeDialogEvents {
  @DeclDISPID(1)  public void onShow(Long HWND) throws ComException {
    assert(HWND != null);
    this._dispatchCall(1,"Show", DISPATCH_METHOD,null,HWND);
  }
  @DeclDISPID(2)  public void onClosed() throws ComException {
    this._dispatchCall(2,"Closed", DISPATCH_METHOD,null);
  }
  @DeclDISPID(3)  public void onSystemMenuClose() throws ComException {
    this._dispatchCall(3,"SystemMenuClose", DISPATCH_METHOD,null);
  }
  public _IJoaBridgeDialogEventsImpl(String progId) throws ComException {
    super(progId, "{21510D80-0112-4214-B91A-2D332BC41874}");
  }
  protected _IJoaBridgeDialogEventsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_IJoaBridgeDialogEventsImpl" + super.toString() + "]";
  }
}
