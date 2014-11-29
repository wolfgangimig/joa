/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IAudioChannel.
 * IAudioChannel Interface 
 */
@CoInterface(guid="{8E839AF9-9508-475A-AA47-3EE8A946B75E}")
public interface IAudioChannel extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public ChannelType getType() throws ComException;
  @DeclDISPID(1610743809)  public ChannelState getState() throws ComException;
  @DeclDISPID(1610743810)  public IModality getModality() throws ComException;
  @DeclDISPID(1610743811)  public Boolean getIsContributing() throws ComException;
  @DeclDISPID(1610743812)  public IAsynchronousOperation Start(final Object _mediaChannelCallback, final Object _state) throws ComException;
  @DeclDISPID(1610743813)  public IAsynchronousOperation Stop(final Object _mediaChannelCallback, final Object _state) throws ComException;
  @DeclDISPID(1610743814)  public Boolean CanInvoke(final ChannelAction _action) throws ComException;
  @DeclDISPID(1610809344)  public IAsynchronousOperation SendDtmf(final String _tones, final Object _modalityCallback, final Object _state) throws ComException;
}
