/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * ApplicationEvents.
 * 
 */
@CoInterface(guid="{0006304E-0000-0000-C000-000000000046}")
public interface ApplicationEvents extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(61442)  public void onItemSend(IDispatch Item, ByRef<Boolean> Cancel) throws ComException;
  @DeclDISPID(61443)  public void onNewMail() throws ComException;
  @DeclDISPID(61444)  public void onReminder(IDispatch Item) throws ComException;
  @DeclDISPID(61445)  public void onOptionsPagesAdd(PropertyPages Pages) throws ComException;
  @DeclDISPID(61446)  public void onStartup() throws ComException;
  @DeclDISPID(61447)  public void onQuit() throws ComException;
}
