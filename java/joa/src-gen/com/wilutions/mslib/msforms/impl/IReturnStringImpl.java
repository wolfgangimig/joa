/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{4227BA19-11DF-CA8E-1CA1-69476CF4FC8E}")
public class IReturnStringImpl extends Dispatch implements com.wilutions.mslib.msforms.IReturnString {
  @DeclDISPID(0)  public void setValue(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(0,"Value", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(0)  public String getValue() throws ComException {
    final Object obj = this._dispatchCall(0,"Value", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  public IReturnStringImpl(String progId) throws ComException {
    super(progId);
  }
  protected IReturnStringImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IReturnStringImpl" + super.toString() + "]";
  }
}
