/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IClientStateChangedEventData.
 * IClientStateChangedEventData Interface 
 */
@CoInterface(guid="{9B3A702D-5BE1-4FCE-ADB3-EBBD23E078C3}")
public interface IClientStateChangedEventData extends IDispatch {
  @DeclDISPID(1610743808)  public ClientState getNewState() throws ComException;
  @DeclDISPID(1610743809)  public ClientState getOldState() throws ComException;
  @DeclDISPID(1610743810)  public Integer getStatusCode() throws ComException;
}
