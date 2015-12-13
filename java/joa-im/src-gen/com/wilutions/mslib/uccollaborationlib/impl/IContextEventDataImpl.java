/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{E1F503DD-3134-92C4-0F99-20F0DA967A68}")
public class IContextEventDataImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IContextEventData {
  @DeclDISPID(1610743808)  public String getApplicationId() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"ApplicationId", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743809)  public String getContextDataType() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"ContextDataType", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743810)  public String getContextData() throws ComException {
    final Object obj = this._dispatchCall(1610743810,"ContextData", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  public IContextEventDataImpl(String progId) throws ComException {
    super(progId, "{21629AB6-9557-4985-9237-49177F618692}");
  }
  protected IContextEventDataImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IContextEventDataImpl" + super.toString() + "]";
  }
}
