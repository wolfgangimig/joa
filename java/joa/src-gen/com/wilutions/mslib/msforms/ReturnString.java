/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * ReturnString.
 * 
 */
@CoClass(guid="{82B02375-B5BC-11CF-810F-00A0C9030074}")
public class ReturnString extends Dispatch implements IReturnString {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(0)  public void setValue(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(0,"Value", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(0)  public String getValue() throws ComException {
    final Object obj = this._dispatchCall(0,"Value", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  public ReturnString() throws ComException {
    super("{82B02375-B5BC-11CF-810F-00A0C9030074}", "{82B02372-B5BC-11CF-810F-00A0C9030074}");
  }
  protected ReturnString(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ReturnString" + super.toString() + "]";
  }
}
