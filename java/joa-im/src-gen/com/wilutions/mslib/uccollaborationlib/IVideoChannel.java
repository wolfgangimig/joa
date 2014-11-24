/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IVideoChannel.
 * IVideoChannel Interface 
 */
@CoInterface(guid="{E66CA1CC-9DB0-467E-9C60-6A832ACD6780}")
public interface IVideoChannel extends IDispatch {
  @DeclDISPID(1610743808)  public ChannelType getType() throws ComException;
  @DeclDISPID(1610743809)  public ChannelState getState() throws ComException;
  @DeclDISPID(1610743810)  public IModality getModality() throws ComException;
  @DeclDISPID(1610743811)  public Boolean getIsContributing() throws ComException;
  @DeclDISPID(1610743812)  public IAsynchronousOperation Start(Object _mediaChannelCallback, Object _state) throws ComException;
  @DeclDISPID(1610743813)  public IAsynchronousOperation Stop(Object _mediaChannelCallback, Object _state) throws ComException;
  @DeclDISPID(1610743814)  public Boolean CanInvoke(ChannelAction _action) throws ComException;
  @DeclDISPID(1610809344)  public IVideoWindow getRenderVideoWindow() throws ComException;
  @DeclDISPID(1610809345)  public IVideoWindow getCaptureVideoWindow() throws ComException;
}
