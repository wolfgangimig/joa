/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * HTMLReset2.
 * 
 */
@CoClass(guid="{227B1F3B-C276-4DE0-9FAA-C0AD42ADDCF0}")
public class HTMLReset2 extends Dispatch implements IWHTMLReset {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(602)  public void setCaption(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(602,"Caption", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(602)  public String getCaption() throws ComException {
    final Object obj = this._dispatchCall(602,"Caption", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(-541)  public void setHTMLName(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(-541,"HTMLName", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(-541)  public String getHTMLName() throws ComException {
    final Object obj = this._dispatchCall(-541,"HTMLName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  public HTMLReset2() throws ComException {
    super("{227B1F3B-C276-4DE0-9FAA-C0AD42ADDCF0}", "{5512D115-5CC6-11CF-8D67-00AA00BDCE1D}");
  }
  protected HTMLReset2(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[HTMLReset2" + super.toString() + "]";
  }
}
