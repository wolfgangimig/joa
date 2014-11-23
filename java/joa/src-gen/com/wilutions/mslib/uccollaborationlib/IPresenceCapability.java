/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IPresenceCapability.
 * IPresenceCapability Interface 
 */
@CoInterface(guid="{10C3ACC7-6C0C-4F35-ADFB-AE0F200A8583}")
public interface IPresenceCapability extends IDispatch {
  @DeclDISPID(1610743808)  public PresenceCapabilityType getType() throws ComException;
  @DeclDISPID(1610743809)  public Boolean getCanRender() throws ComException;
  @DeclDISPID(1610743810)  public Boolean getCanCapture() throws ComException;
  @DeclDISPID(1610743811)  public Integer getAvailability() throws ComException;
}
