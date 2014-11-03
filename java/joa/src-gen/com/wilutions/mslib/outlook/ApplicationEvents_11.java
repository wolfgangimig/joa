/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * ApplicationEvents_11.
 * 
 */
@CoInterface(guid="{0006302C-0000-0000-C000-000000000046}")
public interface ApplicationEvents_11 extends IDispatch {
  @DeclDISPID(61442)  public void onItemSend(Dispatch Item, ByRef<Boolean> Cancel) throws ComException;
  @DeclDISPID(61443)  public void onNewMail() throws ComException;
  @DeclDISPID(61444)  public void onReminder(Dispatch Item) throws ComException;
  @DeclDISPID(61445)  public void onOptionsPagesAdd(PropertyPages Pages) throws ComException;
  @DeclDISPID(61446)  public void onStartup() throws ComException;
  @DeclDISPID(61447)  public void onQuit() throws ComException;
  @DeclDISPID(64106)  public void onAdvancedSearchComplete(Search SearchObject) throws ComException;
  @DeclDISPID(64107)  public void onAdvancedSearchStopped(Search SearchObject) throws ComException;
  @DeclDISPID(64144)  public void onMAPILogonComplete() throws ComException;
  @DeclDISPID(64181)  public void onNewMailEx(String EntryIDCollection) throws ComException;
  @DeclDISPID(64423)  public void onItemLoad(Dispatch Item) throws ComException;
  @DeclDISPID(64513)  public void onBeforeFolderSharingDialog(MAPIFolder FolderToShare, ByRef<Boolean> Cancel) throws ComException;
}
