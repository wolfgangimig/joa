/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{26FB38A7-39D3-9D3F-01CE-03648F3A9B7A}")
public class IVideoChannelImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IVideoChannel {
  @DeclDISPID(1610743808)  public com.wilutions.mslib.uccollaborationlib.ChannelType getType() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Type", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.ChannelType.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743809)  public com.wilutions.mslib.uccollaborationlib.ChannelState getState() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"State", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.ChannelState.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743810)  public com.wilutions.mslib.uccollaborationlib.IModality getModality() throws ComException {
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
  @DeclDISPID(1610743812)  public com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation Start(Object _mediaChannelCallback, Object _state) throws ComException {
    assert(_mediaChannelCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743812,"Start", DISPATCH_METHOD,null,_mediaChannelCallback,_state);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743813)  public com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation Stop(Object _mediaChannelCallback, Object _state) throws ComException {
    assert(_mediaChannelCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743813,"Stop", DISPATCH_METHOD,null,_mediaChannelCallback,_state);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743814)  public Boolean CanInvoke(com.wilutions.mslib.uccollaborationlib.ChannelAction _action) throws ComException {
    assert(_action != null);
    final Object obj = this._dispatchCall(1610743814,"CanInvoke", DISPATCH_METHOD,null,_action.value);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610809344)  public com.wilutions.mslib.uccollaborationlib.IVideoWindow getRenderVideoWindow() throws ComException {
    final Object obj = this._dispatchCall(1610809344,"RenderVideoWindow", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IVideoWindowImpl.class);
  }
  @DeclDISPID(1610809345)  public com.wilutions.mslib.uccollaborationlib.IVideoWindow getCaptureVideoWindow() throws ComException {
    final Object obj = this._dispatchCall(1610809345,"CaptureVideoWindow", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IVideoWindowImpl.class);
  }
  public IVideoChannelImpl(String progId) throws ComException {
    super(progId, "{E66CA1CC-9DB0-467E-9C60-6A832ACD6780}");
  }
  protected IVideoChannelImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IVideoChannelImpl" + super.toString() + "]";
  }
}
