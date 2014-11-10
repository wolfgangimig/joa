/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * Account.
 * 
 */
@CoClass(guid="{000610C5-0000-0000-C000-000000000046}")
public class Account extends Dispatch implements _Account {
  @DeclDISPID(61440)  public _Application getApplication() throws ComException {
    final Object obj = this._dispatchCall(61440,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.impl._ApplicationImpl.class);
  }
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException {
    final Object obj = this._dispatchCall(61450,"Class", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return OlObjectClass.valueOf((Integer)obj);
  }
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException {
    final Object obj = this._dispatchCall(61451,"Session", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.impl._NameSpaceImpl.class);
  }
  @DeclDISPID(61441)  public Dispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(61441,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(64210)  public OlAccountType getAccountType() throws ComException {
    final Object obj = this._dispatchCall(64210,"AccountType", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return OlAccountType.valueOf((Integer)obj);
  }
  @DeclDISPID(12289)  public String getDisplayName() throws ComException {
    final Object obj = this._dispatchCall(12289,"DisplayName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(64211)  public String getUserName() throws ComException {
    final Object obj = this._dispatchCall(64211,"UserName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(64212)  public String getSmtpAddress() throws ComException {
    final Object obj = this._dispatchCall(64212,"SmtpAddress", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(64623)  public OlAutoDiscoverConnectionMode getAutoDiscoverConnectionMode() throws ComException {
    final Object obj = this._dispatchCall(64623,"AutoDiscoverConnectionMode", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return OlAutoDiscoverConnectionMode.valueOf((Integer)obj);
  }
  @DeclDISPID(64622)  public Recipient getCurrentUser() throws ComException {
    final Object obj = this._dispatchCall(64622,"CurrentUser", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.impl.RecipientImpl.class);
  }
  @DeclDISPID(64624)  public String getAutoDiscoverXml() throws ComException {
    final Object obj = this._dispatchCall(64624,"AutoDiscoverXml", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(64614)  public Store getDeliveryStore() throws ComException {
    final Object obj = this._dispatchCall(64614,"DeliveryStore", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(Store.class);
  }
  @DeclDISPID(64615)  public OlExchangeConnectionMode getExchangeConnectionMode() throws ComException {
    final Object obj = this._dispatchCall(64615,"ExchangeConnectionMode", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return OlExchangeConnectionMode.valueOf((Integer)obj);
  }
  @DeclDISPID(64616)  public String getExchangeMailboxServerName() throws ComException {
    final Object obj = this._dispatchCall(64616,"ExchangeMailboxServerName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(64617)  public String getExchangeMailboxServerVersion() throws ComException {
    final Object obj = this._dispatchCall(64617,"ExchangeMailboxServerVersion", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(64618)  public AddressEntry GetAddressEntryFromID(String ID) throws ComException {
    assert(ID != null);
    final Object obj = this._dispatchCall(64618,"GetAddressEntryFromID", DISPATCH_METHOD,null,ID);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.impl.AddressEntryImpl.class);
  }
  @DeclDISPID(64619)  public Recipient GetRecipientFromID(String EntryID) throws ComException {
    assert(EntryID != null);
    final Object obj = this._dispatchCall(64619,"GetRecipientFromID", DISPATCH_METHOD,null,EntryID);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.impl.RecipientImpl.class);
  }
  public Account() throws ComException {
    super("{000610C5-0000-0000-C000-000000000046}");
  }
  protected Account(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[Account" + super.toString() + "]";
  }
}
