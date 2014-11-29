/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9A57-A463-DB41-5DAE-69E7A5F7FCBC}")
public class _CustomTaskPaneEventsImpl extends Dispatch implements com.wilutions.mslib.office._CustomTaskPaneEvents {
  @DeclDISPID(1)  public void onVisibleStateChange(com.wilutions.mslib.office._CustomTaskPane CustomTaskPaneInst) throws ComException {
    this._dispatchCall(1,"VisibleStateChange", DISPATCH_METHOD,null,(CustomTaskPaneInst!=null?CustomTaskPaneInst:Dispatch.NULL));
  }
  @DeclDISPID(2)  public void onDockPositionStateChange(com.wilutions.mslib.office._CustomTaskPane CustomTaskPaneInst) throws ComException {
    this._dispatchCall(2,"DockPositionStateChange", DISPATCH_METHOD,null,(CustomTaskPaneInst!=null?CustomTaskPaneInst:Dispatch.NULL));
  }
  public _CustomTaskPaneEventsImpl(String progId) throws ComException {
    super(progId, "{000C033C-0000-0000-C000-000000000046}");
  }
  protected _CustomTaskPaneEventsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_CustomTaskPaneEventsImpl" + super.toString() + "]";
  }
}
