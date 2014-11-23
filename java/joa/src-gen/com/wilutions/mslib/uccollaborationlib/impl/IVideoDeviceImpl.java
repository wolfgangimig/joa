/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{1AEB6EEF-C3BC-99DD-1F55-F31A3C013031}")
public class IVideoDeviceImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IVideoDevice {
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
  public IVideoDeviceImpl(String progId) throws ComException {
    super(progId, "{DA7CF784-67DF-429C-82FB-9AFD99F6CCCB}");
  }
  protected IVideoDeviceImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IVideoDeviceImpl" + super.toString() + "]";
  }
}
