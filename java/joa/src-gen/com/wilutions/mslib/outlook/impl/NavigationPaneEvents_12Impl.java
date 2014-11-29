/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C091A998-A463-DB41-5DAE-69E7A5F7FCBC}")
public class NavigationPaneEvents_12Impl extends Dispatch implements com.wilutions.mslib.outlook.NavigationPaneEvents_12 {
  @DeclDISPID(64457)  public void onModuleSwitch(final com.wilutions.mslib.outlook.NavigationModule CurrentModule) throws ComException {
    this._dispatchCall(64457,"ModuleSwitch", DISPATCH_METHOD,null,(CurrentModule!=null?CurrentModule:Dispatch.NULL));
  }
  public NavigationPaneEvents_12Impl(String progId) throws ComException {
    super(progId, "{000630F3-0000-0000-C000-000000000046}");
  }
  protected NavigationPaneEvents_12Impl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[NavigationPaneEvents_12Impl" + super.toString() + "]";
  }
}
