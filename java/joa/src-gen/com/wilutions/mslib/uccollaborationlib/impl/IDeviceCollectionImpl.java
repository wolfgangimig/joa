/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{DF192704-DDF0-998F-05A4-CB179264428B}")
public class IDeviceCollectionImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IDeviceCollection {
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
  @DeclDISPID(0)  public com.wilutions.mslib.uccollaborationlib.IDevice getItem(Integer _index) throws ComException {
    assert(_index != null);
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_PROPERTYGET,null,_index);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IDeviceImpl.class);
  }
  @DeclDISPID(1610743811)  public Integer IndexOf(com.wilutions.mslib.uccollaborationlib.IDevice _device) throws ComException {
    final Object obj = this._dispatchCall(1610743811,"IndexOf", DISPATCH_METHOD,null,(_device!=null?_device:Dispatch.NULL));
    if (obj == null) return null;
    return (Integer)obj;
  }
  public IDeviceCollectionImpl(String progId) throws ComException {
    super(progId, "{1F8EBE6F-7993-42CE-980A-A2F03793BE71}");
  }
  protected IDeviceCollectionImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IDeviceCollectionImpl" + super.toString() + "]";
  }
}
