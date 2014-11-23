/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{B3C14ED0-5912-9E15-190F-52598D8599AB}")
public class ISearchResultsImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.ISearchResults {
  @DeclDISPID(1610743808)  public Boolean getIsMoreAvailable() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"IsMoreAvailable", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743809)  public Dispatch[] getAllContactsAndGroups() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"AllContactsAndGroups", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch[])obj;
  }
  @DeclDISPID(1610743810)  public com.wilutions.mslib.uccollaborationlib.IContact[] getContacts() throws ComException {
    final Object obj = this._dispatchCall(1610743810,"Contacts", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (com.wilutions.mslib.uccollaborationlib.IContact[])obj;
  }
  @DeclDISPID(1610743811)  public com.wilutions.mslib.uccollaborationlib.IGroup[] getGroups() throws ComException {
    final Object obj = this._dispatchCall(1610743811,"Groups", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (com.wilutions.mslib.uccollaborationlib.IGroup[])obj;
  }
  @DeclDISPID(1610743812)  public com.wilutions.mslib.uccollaborationlib.ISearchResult[] getAllResults() throws ComException {
    final Object obj = this._dispatchCall(1610743812,"AllResults", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (com.wilutions.mslib.uccollaborationlib.ISearchResult[])obj;
  }
  public ISearchResultsImpl(String progId) throws ComException {
    super(progId, "{7356D7BB-FD71-4554-84A1-3BBE28726551}");
  }
  protected ISearchResultsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ISearchResultsImpl" + super.toString() + "]";
  }
}
