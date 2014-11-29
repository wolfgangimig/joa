/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C091A91D-A463-DB41-5DAE-69E7A5F7FCBC}")
public class FoldersEventsImpl extends Dispatch implements com.wilutions.mslib.outlook.FoldersEvents {
  @DeclDISPID(61441)  public void onFolderAdd(final com.wilutions.mslib.outlook.MAPIFolder Folder) throws ComException {
    this._dispatchCall(61441,"FolderAdd", DISPATCH_METHOD,null,(Folder!=null?Folder:Dispatch.NULL));
  }
  @DeclDISPID(61442)  public void onFolderChange(final com.wilutions.mslib.outlook.MAPIFolder Folder) throws ComException {
    this._dispatchCall(61442,"FolderChange", DISPATCH_METHOD,null,(Folder!=null?Folder:Dispatch.NULL));
  }
  @DeclDISPID(61443)  public void onFolderRemove() throws ComException {
    this._dispatchCall(61443,"FolderRemove", DISPATCH_METHOD,null);
  }
  public FoldersEventsImpl(String progId) throws ComException {
    super(progId, "{00063076-0000-0000-C000-000000000046}");
  }
  protected FoldersEventsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[FoldersEventsImpl" + super.toString() + "]";
  }
}
