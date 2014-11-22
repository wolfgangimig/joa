/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9AE7-A463-DB41-5DAE-69E7A5F7FCBC}")
public class MsoDebugOptions_UTRunResultImpl extends Dispatch implements com.wilutions.mslib.office.MsoDebugOptions_UTRunResult {
  @DeclDISPID(1610743808)  public Dispatch getApplication() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"Creator", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(0)  public Boolean getPassed() throws ComException {
    final Object obj = this._dispatchCall(0,"Passed", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1)  public String getErrorString() throws ComException {
    final Object obj = this._dispatchCall(1,"ErrorString", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  public MsoDebugOptions_UTRunResultImpl(String progId) throws ComException {
    super(progId, "{000C038C-0000-0000-C000-000000000046}");
  }
  protected MsoDebugOptions_UTRunResultImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[MsoDebugOptions_UTRunResultImpl" + super.toString() + "]";
  }
}
