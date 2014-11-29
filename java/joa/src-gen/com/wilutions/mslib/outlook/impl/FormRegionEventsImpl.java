/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C091A930-A463-DB41-5DAE-69E7A5F7FCBC}")
public class FormRegionEventsImpl extends Dispatch implements com.wilutions.mslib.outlook.FormRegionEvents {
  @DeclDISPID(64312)  public void onExpanded(Boolean Expand) throws ComException {
    assert(Expand != null);
    this._dispatchCall(64312,"Expanded", DISPATCH_METHOD,null,Expand);
  }
  @DeclDISPID(61444)  public void onClose() throws ComException {
    this._dispatchCall(61444,"Close", DISPATCH_METHOD,null);
  }
  public FormRegionEventsImpl(String progId) throws ComException {
    super(progId, "{0006305B-0000-0000-C000-000000000046}");
  }
  protected FormRegionEventsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[FormRegionEventsImpl" + super.toString() + "]";
  }
}
