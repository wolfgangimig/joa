/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{0E814C2B-1D8B-9C03-1BF7-F39D947D0768}")
public class IDeviceImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IDevice {
  @DeclDISPID(1610743808)  public String getName() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Name", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743809)  public Boolean getIsActive() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"IsActive", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743810)  public String getId() throws ComException {
    final Object obj = this._dispatchCall(1610743810,"Id", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  public IDeviceImpl(String progId) throws ComException {
    super(progId, "{CE16D540-B9E8-4742-8659-9A7A318AFB92}");
  }
  protected IDeviceImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IDeviceImpl" + super.toString() + "]";
  }
}
