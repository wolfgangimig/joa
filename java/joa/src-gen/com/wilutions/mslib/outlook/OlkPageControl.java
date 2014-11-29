/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlkPageControl.
 * 
 */
@CoClass(guid="{0006F055-0000-0000-C000-000000000046}")
public class OlkPageControl extends Dispatch implements _OlkPageControl {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(64465)  public OlPageType getPage() throws ComException {
    final Object obj = this._dispatchCall(64465,"Page", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return OlPageType.valueOf((Integer)obj);
  }
  @DeclDISPID(64465)  public void setPage(final OlPageType value) throws ComException {
    assert(value != null);
    this._dispatchCall(64465,"Page", DISPATCH_PROPERTYPUT,value.value);
  }
  public OlkPageControl() throws ComException {
    super("{0006F055-0000-0000-C000-000000000046}", "{000672F8-0000-0000-C000-000000000046}");
  }
  protected OlkPageControl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[OlkPageControl" + super.toString() + "]";
  }
}
