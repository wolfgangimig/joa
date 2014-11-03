/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C091A915-A463-DB41-5DAE-69E7A5F7FCBC}")
public class PropertyPageImpl extends Dispatch implements com.wilutions.mslib.outlook.PropertyPage {
  @DeclDISPID(8448)  public void GetPageInfo(ByRef<String> HelpFile, ByRef<Integer> HelpContext) throws ComException {
    assert(HelpFile != null);
    assert(HelpContext != null);
    this._dispatchCall(8448,"GetPageInfo", DISPATCH_METHOD,null,HelpFile,HelpContext);
  }
  @DeclDISPID(8449)  public Boolean getDirty() throws ComException {
    final Object obj = this._dispatchCall(8449,"Dirty", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(8450)  public void Apply() throws ComException {
    this._dispatchCall(8450,"Apply", DISPATCH_METHOD,null);
  }
  public PropertyPageImpl(String progId) throws ComException {
    super(progId);
  }
  protected PropertyPageImpl(long ndisp) {
    super(ndisp);
  }
  public PropertyPageImpl(Dispatch ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[PropertyPageImpl" + super.toString() + "]";
  }
}
