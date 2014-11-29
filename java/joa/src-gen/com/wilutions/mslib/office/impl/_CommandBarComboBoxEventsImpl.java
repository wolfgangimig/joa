/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9A3F-A463-DB41-5DAE-69E7A5F7FCBC}")
public class _CommandBarComboBoxEventsImpl extends Dispatch implements com.wilutions.mslib.office._CommandBarComboBoxEvents {
  @DeclDISPID(1)  public void onChange(com.wilutions.mslib.office.CommandBarComboBox Ctrl) throws ComException {
    this._dispatchCall(1,"Change", DISPATCH_METHOD,null,(Ctrl!=null?Ctrl:Dispatch.NULL));
  }
  public _CommandBarComboBoxEventsImpl(String progId) throws ComException {
    super(progId, "{000C0354-0000-0000-C000-000000000046}");
  }
  protected _CommandBarComboBoxEventsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_CommandBarComboBoxEventsImpl" + super.toString() + "]";
  }
}
