/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * ReturnInteger.
 * 
 */
@CoClass(guid="{82B02373-B5BC-11CF-810F-00A0C9030074}")
public class ReturnInteger extends Dispatch implements IReturnInteger {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(0)  public void setValue(final Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(0,"Value", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(0)  public Integer getValue() throws ComException {
    final Object obj = this._dispatchCall(0,"Value", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  public ReturnInteger() throws ComException {
    super("{82B02373-B5BC-11CF-810F-00A0C9030074}", "{82B02370-B5BC-11CF-810F-00A0C9030074}");
  }
  protected ReturnInteger(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ReturnInteger" + super.toString() + "]";
  }
}
