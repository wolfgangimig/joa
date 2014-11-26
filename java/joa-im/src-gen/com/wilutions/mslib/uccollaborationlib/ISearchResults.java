/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ISearchResults.
 * ISearchResults Interface 
 */
@CoInterface(guid="{7356D7BB-FD71-4554-84A1-3BBE28726551}")
public interface ISearchResults extends IDispatch {
  @DeclDISPID(1610743808)  public Boolean getIsMoreAvailable() throws ComException;
  @DeclDISPID(1610743809)  public IDispatch[] getAllContactsAndGroups() throws ComException;
  @DeclDISPID(1610743810)  public IContact[] getContacts() throws ComException;
  @DeclDISPID(1610743811)  public IGroup[] getGroups() throws ComException;
  @DeclDISPID(1610743812)  public ISearchResult[] getAllResults() throws ComException;
}
