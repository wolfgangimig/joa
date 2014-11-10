/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9AFE-A463-DB41-5DAE-69E7A5F7FCBC}")
public class IRibbonControlImpl extends Dispatch implements com.wilutions.mslib.office.IRibbonControl {
  @DeclDISPID(1)  public String getId() throws ComException {
    final Object obj = this._dispatchCall(1,"Id", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(2)  public Dispatch getContext() throws ComException {
    final Object obj = this._dispatchCall(2,"Context", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(3)  public String getTag() throws ComException {
    final Object obj = this._dispatchCall(3,"Tag", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  public IRibbonControlImpl(String progId) throws ComException {
    super(progId);
  }
  protected IRibbonControlImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IRibbonControlImpl" + super.toString() + "]";
  }
}
