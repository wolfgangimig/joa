/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IShareableContentActionAvailabilityChangedEventData.
 * IShareableContentActionAvailabilityChangedEventData Interface 
 */
@CoInterface(guid="{4023052E-E3B7-48A3-BCB3-CA2234D9BAEE}")
public interface IShareableContentActionAvailabilityChangedEventData extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public ShareableContentAction getAction() throws ComException;
  @DeclDISPID(1610743809)  public Boolean getIsAvailable() throws ComException;
}
