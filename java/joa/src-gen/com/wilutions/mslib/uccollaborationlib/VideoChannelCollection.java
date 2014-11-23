/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * VideoChannelCollection.
 * VideoChannelCollection Class 
 */
@CoClass(guid="{67C2D762-4E8D-45BF-94F0-68D99103567A}")
public class VideoChannelCollection extends Dispatch implements IVideoChannelCollection {
  @DeclDISPID(1610743808)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(0)  public IVideoChannel getItem(Integer _index) throws ComException {
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
  @DeclDISPID(1610743811)  public Integer IndexOf(IVideoChannel _videoChannel) throws ComException {
    final Object obj = this._dispatchCall(1610743811,"IndexOf", DISPATCH_METHOD,null,(_videoChannel!=null?_videoChannel:Dispatch.NULL));
    if (obj == null) return null;
    return (Integer)obj;
  }
  public VideoChannelCollection() throws ComException {
    super("{67C2D762-4E8D-45BF-94F0-68D99103567A}", "{3CD1DB65-D85B-4912-8536-6BD8E19F1738}");
  }
  protected VideoChannelCollection(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[VideoChannelCollection" + super.toString() + "]";
  }
}
