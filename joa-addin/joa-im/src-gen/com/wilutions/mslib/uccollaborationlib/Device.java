/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * Device.
 * Device Class 
 */
@CoClass(guid="{81CB2AE5-6C07-4BC6-BC2B-F1C04545CE54}")
public class Device extends Dispatch implements IDevice {
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
  public Device() throws ComException {
    super("{81CB2AE5-6C07-4BC6-BC2B-F1C04545CE54}", "{CE16D540-B9E8-4742-8659-9A7A318AFB92}");
  }
  protected Device(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[Device" + super.toString() + "]";
  }
}
