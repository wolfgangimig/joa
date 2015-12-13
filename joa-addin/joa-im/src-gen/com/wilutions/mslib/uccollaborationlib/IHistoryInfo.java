/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IHistoryInfo.
 * IHistoryInfo Interface 
 */
@CoInterface(guid="{3DEBDC7E-811F-4304-BDD7-7D98C732026C}")
public interface IHistoryInfo extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public HistoryInfoEntryType getType() throws ComException;
  @DeclDISPID(1610743809)  public String getUri() throws ComException;
  @DeclDISPID(1610743810)  public Integer getStatus() throws ComException;
  @DeclDISPID(1610743811)  public IHistoryInfo[] getNestedHistory() throws ComException;
}
