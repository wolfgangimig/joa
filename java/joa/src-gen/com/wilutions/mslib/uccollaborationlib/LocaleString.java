/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * LocaleString.
 * Class representing a string with locale ID. 
 */
@CoClass(guid="{8CD4531B-D249-489C-B55A-37E4A0BADB25}")
public class LocaleString extends Dispatch implements ILocaleString {
  @DeclDISPID(1610743808)  public Integer getLocaleId() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"LocaleId", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610743809)  public String getValue() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"Value", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  public LocaleString() throws ComException {
    super("{8CD4531B-D249-489C-B55A-37E4A0BADB25}", "{C12F0DE5-9A7D-425C-B391-8BE004EAA2F6}");
  }
  protected LocaleString(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[LocaleString" + super.toString() + "]";
  }
}
