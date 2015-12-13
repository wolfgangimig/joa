/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * AudioChannel.
 * AudioChannel class defines the audio media channel.This class handles the events defined in 
 * the interface IChannelEvents. 
 */
@CoClass(guid="{D5975289-8D98-481A-92A7-F8536085D621}")
public class AudioChannel extends Dispatch implements IAudioChannel {
  static boolean __typelib__loaded = __TypeLib.load();
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
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IModalityImpl.class);
  }
  @DeclDISPID(1610743811)  public Boolean getIsContributing() throws ComException {
    final Object obj = this._dispatchCall(1610743811,"IsContributing", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743812)  public IAsynchronousOperation Start(final Object _mediaChannelCallback, final Object _state) throws ComException {
    assert(_mediaChannelCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743812,"Start", DISPATCH_METHOD,null,_mediaChannelCallback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743813)  public IAsynchronousOperation Stop(final Object _mediaChannelCallback, final Object _state) throws ComException {
    assert(_mediaChannelCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743813,"Stop", DISPATCH_METHOD,null,_mediaChannelCallback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743814)  public Boolean CanInvoke(final ChannelAction _action) throws ComException {
    assert(_action != null);
    final Object obj = this._dispatchCall(1610743814,"CanInvoke", DISPATCH_METHOD,null,_action.value);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610809344)  public IAsynchronousOperation SendDtmf(final String _tones, final Object _modalityCallback, final Object _state) throws ComException {
    assert(_tones != null);
    assert(_modalityCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610809344,"SendDtmf", DISPATCH_METHOD,null,_tones,_modalityCallback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  public AudioChannel() throws ComException {
    super("{D5975289-8D98-481A-92A7-F8536085D621}", "{8E839AF9-9508-475A-AA47-3EE8A946B75E}");
  }
  protected AudioChannel(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[AudioChannel" + super.toString() + "]";
  }
}
