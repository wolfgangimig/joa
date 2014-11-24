/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IChannel.
 * IChannel Interface 
 */
@CoInterface(guid="{61C747F6-157C-4CAE-A37C-EC4352175860}")
public interface IChannel extends IDispatch {
  @DeclDISPID(1610743808)  public ChannelType getType() throws ComException;
  @DeclDISPID(1610743809)  public ChannelState getState() throws ComException;
  @DeclDISPID(1610743810)  public IModality getModality() throws ComException;
  @DeclDISPID(1610743811)  public Boolean getIsContributing() throws ComException;
  @DeclDISPID(1610743812)  public IAsynchronousOperation Start(Object _mediaChannelCallback, Object _state) throws ComException;
  @DeclDISPID(1610743813)  public IAsynchronousOperation Stop(Object _mediaChannelCallback, Object _state) throws ComException;
  @DeclDISPID(1610743814)  public Boolean CanInvoke(ChannelAction _action) throws ComException;
}
