/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C091A99F-A463-DB41-5DAE-69E7A5F7FCBC}")
public class NavigationGroupsEvents_12Impl extends Dispatch implements com.wilutions.mslib.outlook.NavigationGroupsEvents_12 {
  @DeclDISPID(64458)  public void onSelectedChange(final com.wilutions.mslib.outlook.NavigationFolder NavigationFolder) throws ComException {
    this._dispatchCall(64458,"SelectedChange", DISPATCH_METHOD,null,Dispatch.param(NavigationFolder));
  }
  @DeclDISPID(64459)  public void onNavigationFolderAdd(final com.wilutions.mslib.outlook.NavigationFolder NavigationFolder) throws ComException {
    this._dispatchCall(64459,"NavigationFolderAdd", DISPATCH_METHOD,null,Dispatch.param(NavigationFolder));
  }
  @DeclDISPID(64460)  public void onNavigationFolderRemove() throws ComException {
    this._dispatchCall(64460,"NavigationFolderRemove", DISPATCH_METHOD,null);
  }
  public NavigationGroupsEvents_12Impl(String progId) throws ComException {
    super(progId, "{000630F4-0000-0000-C000-000000000046}");
  }
  protected NavigationGroupsEvents_12Impl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[NavigationGroupsEvents_12Impl" + super.toString() + "]";
  }
}
