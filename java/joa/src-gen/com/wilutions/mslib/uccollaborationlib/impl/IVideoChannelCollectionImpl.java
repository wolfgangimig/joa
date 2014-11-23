/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{FC46420E-7C38-9253-1898-023F4468EBC2}")
public class IVideoChannelCollectionImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IVideoChannelCollection {
  @DeclDISPID(1610743808)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(0)  public com.wilutions.mslib.uccollaborationlib.IVideoChannel getItem(Integer _index) throws ComException {
    assert(_index != null);
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_PROPERTYGET,null,_index);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IVideoChannelImpl.class);
  }
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException {
    final Object obj = this._dispatchCall(-4,"_NewEnum", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1610743811)  public Integer IndexOf(com.wilutions.mslib.uccollaborationlib.IVideoChannel _videoChannel) throws ComException {
    final Object obj = this._dispatchCall(1610743811,"IndexOf", DISPATCH_METHOD,null,(_videoChannel!=null?_videoChannel:Dispatch.NULL));
    if (obj == null) return null;
    return (Integer)obj;
  }
  public IVideoChannelCollectionImpl(String progId) throws ComException {
    super(progId, "{3CD1DB65-D85B-4912-8536-6BD8E19F1738}");
  }
  protected IVideoChannelCollectionImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IVideoChannelCollectionImpl" + super.toString() + "]";
  }
}
