/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * _IContactEvents.
 * _IContactEvents Interface 
 */
@CoInterface(guid="{B1C6ECC3-1EA7-495D-9337-02FE4FB723F0}")
public interface _IContactEvents extends IDispatch {
  @DeclDISPID(400)  public void onOnContactInformationChanged(IContact _eventSource, IContactInformationChangedEventData _eventData) throws ComException;
  @DeclDISPID(401)  public void onOnSettingChanged(IContact _eventSource, IContactSettingChangedEventData _eventData) throws ComException;
  @DeclDISPID(402)  public void onOnUriChanged(IContact _eventSource, IUriChangedEventData _eventData) throws ComException;
}
