/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C091A99C-A463-DB41-5DAE-69E7A5F7FCBC}")
public class MAPIFolderEvents_12Impl extends Dispatch implements com.wilutions.mslib.outlook.MAPIFolderEvents_12 {
  @DeclDISPID(64424)  public void onBeforeFolderMove(final com.wilutions.mslib.outlook.MAPIFolder MoveTo, final ByRef<Boolean> Cancel) throws ComException {
    assert(Cancel != null);
    this._dispatchCall(64424,"BeforeFolderMove", DISPATCH_METHOD,null,(MoveTo!=null?MoveTo:Dispatch.NULL),Cancel);
  }
  @DeclDISPID(64425)  public void onBeforeItemMove(final IDispatch Item, final com.wilutions.mslib.outlook.MAPIFolder MoveTo, final ByRef<Boolean> Cancel) throws ComException {
    assert(Cancel != null);
    this._dispatchCall(64425,"BeforeItemMove", DISPATCH_METHOD,null,(Item!=null?Item:Dispatch.NULL),(MoveTo!=null?MoveTo:Dispatch.NULL),Cancel);
  }
  public MAPIFolderEvents_12Impl(String progId) throws ComException {
    super(progId, "{000630F7-0000-0000-C000-000000000046}");
  }
  protected MAPIFolderEvents_12Impl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[MAPIFolderEvents_12Impl" + super.toString() + "]";
  }
}
