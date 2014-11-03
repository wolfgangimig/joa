/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * FoldersEvents.
 * 
 */
@CoInterface(guid="{00063076-0000-0000-C000-000000000046}")
public interface FoldersEvents extends IDispatch {
  @DeclDISPID(61441)  public void onFolderAdd(MAPIFolder Folder) throws ComException;
  @DeclDISPID(61442)  public void onFolderChange(MAPIFolder Folder) throws ComException;
  @DeclDISPID(61443)  public void onFolderRemove() throws ComException;
}
