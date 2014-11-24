/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IChannelStateChangedEventData.
 * IChannelStateChangedEventData Interface 
 */
@CoInterface(guid="{2495B94C-38AF-439B-BBA0-0AD38D959CE4}")
public interface IChannelStateChangedEventData extends IDispatch {
  @DeclDISPID(1610743808)  public ChannelState getOldState() throws ComException;
  @DeclDISPID(1610743809)  public ChannelState getNewState() throws ComException;
}
