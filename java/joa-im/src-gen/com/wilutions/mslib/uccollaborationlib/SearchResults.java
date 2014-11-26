/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * SearchResults.
 * Represents all results of a search. 
 */
@CoClass(guid="{E73DDB55-ACB3-4F33-A0ED-7B22D68BF311}")
public class SearchResults extends Dispatch implements ISearchResults {
  @DeclDISPID(1610743808)  public Boolean getIsMoreAvailable() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"IsMoreAvailable", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743809)  public IDispatch[] getAllContactsAndGroups() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"AllContactsAndGroups", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch[])obj;
  }
  @DeclDISPID(1610743810)  public IContact[] getContacts() throws ComException {
    final Object obj = this._dispatchCall(1610743810,"Contacts", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IContact[])obj;
  }
  @DeclDISPID(1610743811)  public IGroup[] getGroups() throws ComException {
    final Object obj = this._dispatchCall(1610743811,"Groups", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IGroup[])obj;
  }
  @DeclDISPID(1610743812)  public ISearchResult[] getAllResults() throws ComException {
    final Object obj = this._dispatchCall(1610743812,"AllResults", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (ISearchResult[])obj;
  }
  public SearchResults() throws ComException {
    super("{E73DDB55-ACB3-4F33-A0ED-7B22D68BF311}", "{7356D7BB-FD71-4554-84A1-3BBE28726551}");
  }
  protected SearchResults(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[SearchResults" + super.toString() + "]";
  }
}
