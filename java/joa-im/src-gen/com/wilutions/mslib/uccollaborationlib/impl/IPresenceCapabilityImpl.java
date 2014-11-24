/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{D05435AC-C86F-9474-3055-C7E885FD7979}")
public class IPresenceCapabilityImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IPresenceCapability {
  @DeclDISPID(1610743808)  public com.wilutions.mslib.uccollaborationlib.PresenceCapabilityType getType() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Type", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.PresenceCapabilityType.valueOf((Integer)obj);
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
  public IPresenceCapabilityImpl(String progId) throws ComException {
    super(progId, "{10C3ACC7-6C0C-4F35-ADFB-AE0F200A8583}");
  }
  protected IPresenceCapabilityImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IPresenceCapabilityImpl" + super.toString() + "]";
  }
}
