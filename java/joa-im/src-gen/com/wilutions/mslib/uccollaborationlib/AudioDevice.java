/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * AudioDevice.
 * AudioDevice Class 
 */
@CoClass(guid="{ED1CE184-17AA-497F-ABF2-C69B2144DF2A}")
public class AudioDevice extends Dispatch implements IAudioDevice {
  static boolean __typelib__loaded = __TypeLib.load();
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
  @DeclDISPID(1610809344)  public DeviceType getType() throws ComException {
    final Object obj = this._dispatchCall(1610809344,"Type", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return DeviceType.valueOf((Integer)obj);
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
  public AudioDevice() throws ComException {
    super("{ED1CE184-17AA-497F-ABF2-C69B2144DF2A}", "{B0B0E8F8-32DA-4CB0-A124-D1E35891D53A}");
  }
  protected AudioDevice(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[AudioDevice" + super.toString() + "]";
  }
}
