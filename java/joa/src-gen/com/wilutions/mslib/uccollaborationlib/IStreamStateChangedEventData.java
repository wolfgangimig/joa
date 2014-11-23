/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IStreamStateChangedEventData.
 * IStreamStateChangedEventData Interface 
 */
@CoInterface(guid="{CA7EEB7A-7DC3-4FFE-A174-23DB5A003C04}")
public interface IStreamStateChangedEventData extends IDispatch {
  @DeclDISPID(1610743808)  public IChannel getChannel() throws ComException;
  @DeclDISPID(1610743809)  public MediaStreamDirection getDirection() throws ComException;
  @DeclDISPID(1610743810)  public Boolean getIsActive() throws ComException;
}
