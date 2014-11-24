/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * ItemsEvents.
 * 
 */
@CoInterface(guid="{00063077-0000-0000-C000-000000000046}")
public interface ItemsEvents extends IDispatch {
  @DeclDISPID(61441)  public void onItemAdd(IDispatch Item) throws ComException;
  @DeclDISPID(61442)  public void onItemChange(IDispatch Item) throws ComException;
  @DeclDISPID(61443)  public void onItemRemove() throws ComException;
}
