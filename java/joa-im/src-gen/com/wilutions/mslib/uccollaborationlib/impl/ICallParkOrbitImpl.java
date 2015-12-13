/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{BC549F82-8125-9A40-1F05-40869F210B5D}")
public class ICallParkOrbitImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.ICallParkOrbit {
  @DeclDISPID(1610743808)  public String getFriendlyOrbit() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"FriendlyOrbit", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743809)  public String getSafeRetrieveUri() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"SafeRetrieveUri", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743810)  public String getMsParkedCall() throws ComException {
    final Object obj = this._dispatchCall(1610743810,"MsParkedCall", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  public ICallParkOrbitImpl(String progId) throws ComException {
    super(progId, "{7CC306E9-2546-4101-82AB-29613AD6F7A7}");
  }
  protected ICallParkOrbitImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ICallParkOrbitImpl" + super.toString() + "]";
  }
}
