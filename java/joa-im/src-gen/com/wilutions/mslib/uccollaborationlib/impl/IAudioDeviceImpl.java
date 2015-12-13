/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{70277193-96B9-97F1-3C8A-B804FD6629C0}")
public class IAudioDeviceImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IAudioDevice {
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
  @DeclDISPID(1610809344)  public com.wilutions.mslib.uccollaborationlib.DeviceType getType() throws ComException {
    final Object obj = this._dispatchCall(1610809344,"Type", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.DeviceType.valueOf((Integer)obj);
  }
  @DeclDISPID(1610809345)  public Integer getPriority() throws ComException {
    final Object obj = this._dispatchCall(1610809345,"Priority", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610809346)  public Boolean getIsCertified() throws ComException {
    final Object obj = this._dispatchCall(1610809346,"IsCertified", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  public IAudioDeviceImpl(String progId) throws ComException {
    super(progId, "{B0B0E8F8-32DA-4CB0-A124-D1E35891D53A}");
  }
  protected IAudioDeviceImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IAudioDeviceImpl" + super.toString() + "]";
  }
}
