/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * ReturnBoolean.
 * 
 */
@CoClass(guid="{82B02374-B5BC-11CF-810F-00A0C9030074}")
public class ReturnBoolean extends Dispatch implements IReturnBoolean {
  @DeclDISPID(0)  public void setValue(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(0,"Value", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(0)  public Boolean getValue() throws ComException {
    final Object obj = this._dispatchCall(0,"Value", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  public ReturnBoolean() throws ComException {
    super("{82B02374-B5BC-11CF-810F-00A0C9030074}");
  }
  protected ReturnBoolean(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ReturnBoolean" + super.toString() + "]";
  }
}
