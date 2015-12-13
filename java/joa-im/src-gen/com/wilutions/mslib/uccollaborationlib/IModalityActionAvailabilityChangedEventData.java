/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IModalityActionAvailabilityChangedEventData.
 * IModalityActionAvailabilityChangedEventData Interface 
 */
@CoInterface(guid="{DEDDD7BD-4763-41D2-9AAA-B2C143457CA4}")
public interface IModalityActionAvailabilityChangedEventData extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public ModalityAction getAction() throws ComException;
  @DeclDISPID(1610743809)  public Boolean getIsAvailable() throws ComException;
}
