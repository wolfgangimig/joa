/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * PresenceCapability.
 * PresenceCapability Class 
 */
@CoClass(guid="{8D418098-61CD-4970-A0E0-2E9BD6420976}")
public class PresenceCapability extends Dispatch implements IPresenceCapability {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public PresenceCapabilityType getType() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Type", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return PresenceCapabilityType.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743809)  public Boolean getCanRender() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"CanRender", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743810)  public Boolean getCanCapture() throws ComException {
    final Object obj = this._dispatchCall(1610743810,"CanCapture", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743811)  public Integer getAvailability() throws ComException {
    final Object obj = this._dispatchCall(1610743811,"Availability", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  public PresenceCapability() throws ComException {
    super("{8D418098-61CD-4970-A0E0-2E9BD6420976}", "{10C3ACC7-6C0C-4F35-ADFB-AE0F200A8583}");
  }
  protected PresenceCapability(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[PresenceCapability" + super.toString() + "]";
  }
}
