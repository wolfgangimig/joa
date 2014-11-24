/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ILyncClientNotificationReceivedEventData.
 * ILyncClientNotificationReceivedEventData Interface 
 */
@CoInterface(guid="{9AB20314-B258-48F8-B659-AD250DFA20F5}")
public interface ILyncClientNotificationReceivedEventData extends IDispatch {
  @DeclDISPID(1610743808)  public LyncClientNotification getType() throws ComException;
  @DeclDISPID(1610743809)  public MapiStatus getMapiStatus() throws ComException;
}
