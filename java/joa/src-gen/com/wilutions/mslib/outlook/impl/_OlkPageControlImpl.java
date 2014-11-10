/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C091EB93-A463-DB41-5DAE-69E7A5F7FCBC}")
public class _OlkPageControlImpl extends Dispatch implements com.wilutions.mslib.outlook._OlkPageControl {
  @DeclDISPID(64465)  public com.wilutions.mslib.outlook.OlPageType getPage() throws ComException {
    final Object obj = this._dispatchCall(64465,"Page", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.outlook.OlPageType.valueOf((Integer)obj);
  }
  @DeclDISPID(64465)  public void setPage(com.wilutions.mslib.outlook.OlPageType value) throws ComException {
    assert(value != null);
    this._dispatchCall(64465,"Page", DISPATCH_PROPERTYPUT,value.value);
  }
  public _OlkPageControlImpl(String progId) throws ComException {
    super(progId);
  }
  protected _OlkPageControlImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_OlkPageControlImpl" + super.toString() + "]";
  }
}
