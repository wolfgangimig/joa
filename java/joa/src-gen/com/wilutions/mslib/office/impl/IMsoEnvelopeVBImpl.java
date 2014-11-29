/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C091EBC7-A463-DB41-5DAE-69E7A5F7FCBC}")
public class IMsoEnvelopeVBImpl extends Dispatch implements com.wilutions.mslib.office.IMsoEnvelopeVB {
  @DeclDISPID(1)  public String getIntroduction() throws ComException {
    final Object obj = this._dispatchCall(1,"Introduction", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1)  public void setIntroduction(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(1,"Introduction", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(2)  public IDispatch getItem() throws ComException {
    final Object obj = this._dispatchCall(2,"Item", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(3)  public IDispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(3,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(4)  public IDispatch getCommandBars() throws ComException {
    final Object obj = this._dispatchCall(4,"CommandBars", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  public IMsoEnvelopeVBImpl(String progId) throws ComException {
    super(progId, "{000672AC-0000-0000-C000-000000000046}");
  }
  protected IMsoEnvelopeVBImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IMsoEnvelopeVBImpl" + super.toString() + "]";
  }
}
