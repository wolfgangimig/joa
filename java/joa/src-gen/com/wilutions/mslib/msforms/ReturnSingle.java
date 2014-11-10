/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * ReturnSingle.
 * 
 */
@CoClass(guid="{8A683C92-BA84-11CF-8110-00A0C9030074}")
public class ReturnSingle extends Dispatch implements IReturnSingle {
  @DeclDISPID(0)  public void setValue(Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(0,"Value", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(0)  public Float getValue() throws ComException {
    final Object obj = this._dispatchCall(0,"Value", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  public ReturnSingle() throws ComException {
    super("{8A683C92-BA84-11CF-8110-00A0C9030074}");
  }
  protected ReturnSingle(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ReturnSingle" + super.toString() + "]";
  }
}
