/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9AFD-A463-DB41-5DAE-69E7A5F7FCBC}")
public class IRibbonExtensibilityImpl extends Dispatch implements com.wilutions.mslib.office.IRibbonExtensibility {
  @DeclDISPID(1)  public String GetCustomUI(String RibbonID) throws ComException {
    assert(RibbonID != null);
    final Object obj = this._dispatchCall(1,"GetCustomUI", DISPATCH_METHOD,null,RibbonID);
    if (obj == null) return null;
    return (String)obj;
  }
  public IRibbonExtensibilityImpl(String progId) throws ComException {
    super(progId, "{000C0396-0000-0000-C000-000000000046}");
  }
  protected IRibbonExtensibilityImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IRibbonExtensibilityImpl" + super.toString() + "]";
  }
}
