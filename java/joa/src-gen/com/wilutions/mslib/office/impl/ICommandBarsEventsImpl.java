/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{956F11F9-D36B-CA90-3145-6987AD61E15F}")
public class ICommandBarsEventsImpl extends Dispatch implements com.wilutions.mslib.office.ICommandBarsEvents {
  @DeclDISPID(1)  public void onOnUpdate() throws ComException {
    this._dispatchCall(1,"OnUpdate", DISPATCH_METHOD,null);
  }
  public ICommandBarsEventsImpl(String progId) throws ComException {
    super(progId, "{55F88892-7708-11D1-ACEB-006008961DA5}");
  }
  protected ICommandBarsEventsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ICommandBarsEventsImpl" + super.toString() + "]";
  }
}
