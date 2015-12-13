/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{4227BA1B-11DF-CA8E-1CA1-69476CF4FC8E}")
public class IReturnIntegerImpl extends Dispatch implements com.wilutions.mslib.msforms.IReturnInteger {
  @DeclDISPID(0)  public void setValue(final Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(0,"Value", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(0)  public Integer getValue() throws ComException {
    final Object obj = this._dispatchCall(0,"Value", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  public IReturnIntegerImpl(String progId) throws ComException {
    super(progId, "{82B02370-B5BC-11CF-810F-00A0C9030074}");
  }
  protected IReturnIntegerImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IReturnIntegerImpl" + super.toString() + "]";
  }
}
