/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * DeviceCollection.
 * DeviceCollection Class 
 */
@CoClass(guid="{A0BA7D36-93CD-48C0-A168-3EF5933CEE8A}")
public class DeviceCollection extends Dispatch implements IDeviceCollection {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException {
    final Object obj = this._dispatchCall(-4,"_NewEnum", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1610743809)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(0)  public IDevice getItem(Integer _index) throws ComException {
    assert(_index != null);
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_PROPERTYGET,null,_index);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IDeviceImpl.class);
  }
  @DeclDISPID(1610743811)  public Integer IndexOf(IDevice _device) throws ComException {
    final Object obj = this._dispatchCall(1610743811,"IndexOf", DISPATCH_METHOD,null,(_device!=null?_device:Dispatch.NULL));
    if (obj == null) return null;
    return (Integer)obj;
  }
  public DeviceCollection() throws ComException {
    super("{A0BA7D36-93CD-48C0-A168-3EF5933CEE8A}", "{1F8EBE6F-7993-42CE-980A-A2F03793BE71}");
  }
  protected DeviceCollection(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[DeviceCollection" + super.toString() + "]";
  }
}
