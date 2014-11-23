/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{01B8948E-3E1E-991D-2E3F-E207A11D5E0C}")
public class ILocaleStringImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.ILocaleString {
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
  public ILocaleStringImpl(String progId) throws ComException {
    super(progId, "{C12F0DE5-9A7D-425C-B391-8BE004EAA2F6}");
  }
  protected ILocaleStringImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ILocaleStringImpl" + super.toString() + "]";
  }
}
