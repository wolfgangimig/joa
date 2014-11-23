/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * VideoChannel.
 * VideoChannel class defines the video media channel.This class handles events defined in the 
 * interface IChannelEvents. 
 */
@CoClass(guid="{90B18225-0BC7-4120-84AF-20056F7E7DA4}")
public class VideoChannel extends Dispatch implements IVideoChannel {
  @DeclDISPID(1610743808)  public ChannelType getType() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Type", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return ChannelType.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743809)  public ChannelState getState() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"State", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return ChannelState.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743810)  public IModality getModality() throws ComException {
    final Object obj = this._dispatchCall(1610743810,"Modality", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IModalityImpl.class);
  }
  @DeclDISPID(1610743811)  public Boolean getIsContributing() throws ComException {
    final Object obj = this._dispatchCall(1610743811,"IsContributing", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743812)  public IAsynchronousOperation Start(Object _mediaChannelCallback, Object _state) throws ComException {
    assert(_mediaChannelCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743812,"Start", DISPATCH_METHOD,null,_mediaChannelCallback,_state);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743813)  public IAsynchronousOperation Stop(Object _mediaChannelCallback, Object _state) throws ComException {
    assert(_mediaChannelCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743813,"Stop", DISPATCH_METHOD,null,_mediaChannelCallback,_state);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743814)  public Boolean CanInvoke(ChannelAction _action) throws ComException {
    assert(_action != null);
    final Object obj = this._dispatchCall(1610743814,"CanInvoke", DISPATCH_METHOD,null,_action.value);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610809344)  public IVideoWindow getRenderVideoWindow() throws ComException {
    final Object obj = this._dispatchCall(1610809344,"RenderVideoWindow", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IVideoWindowImpl.class);
  }
  @DeclDISPID(1610809345)  public IVideoWindow getCaptureVideoWindow() throws ComException {
    final Object obj = this._dispatchCall(1610809345,"CaptureVideoWindow", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IVideoWindowImpl.class);
  }
  public VideoChannel() throws ComException {
    super("{90B18225-0BC7-4120-84AF-20056F7E7DA4}", "{E66CA1CC-9DB0-467E-9C60-6A832ACD6780}");
  }
  protected VideoChannel(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[VideoChannel" + super.toString() + "]";
  }
}
