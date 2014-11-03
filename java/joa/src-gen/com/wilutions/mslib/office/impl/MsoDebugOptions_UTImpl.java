/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9AE0-A463-DB41-5DAE-69E7A5F7FCBC}")
public class MsoDebugOptions_UTImpl extends Dispatch implements com.wilutions.mslib.office.MsoDebugOptions_UT {
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
  @DeclDISPID(0)  public String getName() throws ComException {
    final Object obj = this._dispatchCall(0,"Name", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1)  public String getCollectionName() throws ComException {
    final Object obj = this._dispatchCall(1,"CollectionName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(2)  public com.wilutions.mslib.office.MsoDebugOptions_UTRunResult Run() throws ComException {
    final Object obj = this._dispatchCall(2,"Run", DISPATCH_METHOD,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.MsoDebugOptions_UTRunResultImpl.class);
  }
  public MsoDebugOptions_UTImpl(String progId) throws ComException {
    super(progId);
  }
  protected MsoDebugOptions_UTImpl(long ndisp) {
    super(ndisp);
  }
  public MsoDebugOptions_UTImpl(Dispatch ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[MsoDebugOptions_UTImpl" + super.toString() + "]";
  }
}
