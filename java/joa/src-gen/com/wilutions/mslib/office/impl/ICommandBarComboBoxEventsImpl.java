/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{956F11FD-D36B-CA90-3145-6987AD61E15F}")
public class ICommandBarComboBoxEventsImpl extends Dispatch implements com.wilutions.mslib.office.ICommandBarComboBoxEvents {
  @DeclDISPID(1)  public void onChange(final com.wilutions.mslib.office.CommandBarComboBox Ctrl) throws ComException {
    this._dispatchCall(1,"Change", DISPATCH_METHOD,null,Dispatch.param(Ctrl));
  }
  public ICommandBarComboBoxEventsImpl(String progId) throws ComException {
    super(progId, "{55F88896-7708-11D1-ACEB-006008961DA5}");
  }
  protected ICommandBarComboBoxEventsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ICommandBarComboBoxEventsImpl" + super.toString() + "]";
  }
}
