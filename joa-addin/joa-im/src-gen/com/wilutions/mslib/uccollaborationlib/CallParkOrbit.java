/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * CallParkOrbit.
 * CallParkOrbit Class 
 */
@CoClass(guid="{378BF356-0EA3-4025-84FC-F64430ADC784}")
public class CallParkOrbit extends Dispatch implements ICallParkOrbit {
  static boolean __typelib__loaded = __TypeLib.load();
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
  public CallParkOrbit() throws ComException {
    super("{378BF356-0EA3-4025-84FC-F64430ADC784}", "{7CC306E9-2546-4101-82AB-29613AD6F7A7}");
  }
  protected CallParkOrbit(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[CallParkOrbit" + super.toString() + "]";
  }
}
