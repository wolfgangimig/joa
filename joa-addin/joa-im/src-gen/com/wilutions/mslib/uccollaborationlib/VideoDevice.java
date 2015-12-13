/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * VideoDevice.
 * VideoDevice Class 
 */
@CoClass(guid="{BACCB218-6318-4AD9-B0A0-5B578C05F84E}")
public class VideoDevice extends Dispatch implements IVideoDevice {
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
  public VideoDevice() throws ComException {
    super("{BACCB218-6318-4AD9-B0A0-5B578C05F84E}", "{DA7CF784-67DF-429C-82FB-9AFD99F6CCCB}");
  }
  protected VideoDevice(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[VideoDevice" + super.toString() + "]";
  }
}
