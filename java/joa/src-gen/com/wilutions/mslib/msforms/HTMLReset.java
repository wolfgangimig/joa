/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * HTMLReset.
 * 
 */
@CoClass(guid="{5512D114-5CC6-11CF-8D67-00AA00BDCE1D}")
public class HTMLReset extends Dispatch implements IWHTMLReset {
  @DeclDISPID(602)  public void setCaption(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(602,"Caption", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(602)  public String getCaption() throws ComException {
    final Object obj = this._dispatchCall(602,"Caption", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(-541)  public void setHTMLName(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(-541,"HTMLName", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(-541)  public String getHTMLName() throws ComException {
    final Object obj = this._dispatchCall(-541,"HTMLName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  public HTMLReset() throws ComException {
    super("{5512D114-5CC6-11CF-8D67-00AA00BDCE1D}", "{5512D115-5CC6-11CF-8D67-00AA00BDCE1D}");
  }
  protected HTMLReset(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[HTMLReset" + super.toString() + "]";
  }
}
