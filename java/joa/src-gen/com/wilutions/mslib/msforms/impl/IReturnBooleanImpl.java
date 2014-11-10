/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{4227BA1A-11DF-CA8E-1CA1-69476CF4FC8E}")
public class IReturnBooleanImpl extends Dispatch implements com.wilutions.mslib.msforms.IReturnBoolean {
  @DeclDISPID(0)  public void setValue(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(0,"Value", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(0)  public Boolean getValue() throws ComException {
    final Object obj = this._dispatchCall(0,"Value", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  public IReturnBooleanImpl(String progId) throws ComException {
    super(progId);
  }
  protected IReturnBooleanImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IReturnBooleanImpl" + super.toString() + "]";
  }
}
