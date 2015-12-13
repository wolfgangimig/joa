/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{4AF33119-5808-960B-0FC0-53D12CA1D0E6}")
public class CustomTaskPaneEventsImpl extends Dispatch implements com.wilutions.mslib.office.CustomTaskPaneEvents {
  @DeclDISPID(1)  public void onVisibleStateChange(final com.wilutions.mslib.office._CustomTaskPane CustomTaskPaneInst) throws ComException {
    this._dispatchCall(1,"VisibleStateChange", DISPATCH_METHOD,null,Dispatch.param(CustomTaskPaneInst));
  }
  @DeclDISPID(2)  public void onDockPositionStateChange(final com.wilutions.mslib.office._CustomTaskPane CustomTaskPaneInst) throws ComException {
    this._dispatchCall(2,"DockPositionStateChange", DISPATCH_METHOD,null,Dispatch.param(CustomTaskPaneInst));
  }
  public CustomTaskPaneEventsImpl(String progId) throws ComException {
    super(progId, "{8A64A872-FC6B-4D4A-926E-3A3689562C1C}");
  }
  protected CustomTaskPaneEventsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[CustomTaskPaneEventsImpl" + super.toString() + "]";
  }
}
