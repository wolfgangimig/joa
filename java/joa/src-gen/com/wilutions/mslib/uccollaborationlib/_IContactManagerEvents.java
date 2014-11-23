/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * _IContactManagerEvents.
 * _IContactManagerEvents Interface 
 */
@CoInterface(guid="{50D86EE2-288F-44F5-8144-69F6E3B24B90}")
public interface _IContactManagerEvents extends IDispatch {
  @DeclDISPID(200)  public void onOnGroupAdded(IContactManager _eventSource, IGroupCollectionChangedEventData _eventData) throws ComException;
  @DeclDISPID(201)  public void onOnGroupRemoved(IContactManager _eventSource, IGroupCollectionChangedEventData _eventData) throws ComException;
  @DeclDISPID(202)  public void onOnSearchProviderStateChanged(IContactManager _eventSource, ISearchProviderStateChangedEventData _eventData) throws ComException;
}
