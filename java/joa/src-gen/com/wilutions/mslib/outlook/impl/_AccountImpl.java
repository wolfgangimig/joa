/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C091A9AE-A463-DB41-5DAE-69E7A5F7FCBC}")
public class _AccountImpl extends Dispatch implements com.wilutions.mslib.outlook._Account {
  @DeclDISPID(61440)  public com.wilutions.mslib.outlook._Application getApplication() throws ComException {
    final Object obj = this._dispatchCall(61440,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.impl._ApplicationImpl.class);
  }
  @DeclDISPID(61450)  public com.wilutions.mslib.outlook.OlObjectClass getClass_() throws ComException {
    final Object obj = this._dispatchCall(61450,"Class", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.outlook.OlObjectClass.valueOf((Integer)obj);
  }
  @DeclDISPID(61451)  public com.wilutions.mslib.outlook._NameSpace getSession() throws ComException {
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
  @DeclDISPID(64210)  public com.wilutions.mslib.outlook.OlAccountType getAccountType() throws ComException {
    final Object obj = this._dispatchCall(64210,"AccountType", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.outlook.OlAccountType.valueOf((Integer)obj);
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
  @DeclDISPID(64623)  public com.wilutions.mslib.outlook.OlAutoDiscoverConnectionMode getAutoDiscoverConnectionMode() throws ComException {
    final Object obj = this._dispatchCall(64623,"AutoDiscoverConnectionMode", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.outlook.OlAutoDiscoverConnectionMode.valueOf((Integer)obj);
  }
  @DeclDISPID(64622)  public com.wilutions.mslib.outlook.Recipient getCurrentUser() throws ComException {
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
  @DeclDISPID(64614)  public com.wilutions.mslib.outlook.Store getDeliveryStore() throws ComException {
    final Object obj = this._dispatchCall(64614,"DeliveryStore", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.Store.class);
  }
  @DeclDISPID(64615)  public com.wilutions.mslib.outlook.OlExchangeConnectionMode getExchangeConnectionMode() throws ComException {
    final Object obj = this._dispatchCall(64615,"ExchangeConnectionMode", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.outlook.OlExchangeConnectionMode.valueOf((Integer)obj);
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
  @DeclDISPID(64618)  public com.wilutions.mslib.outlook.AddressEntry GetAddressEntryFromID(String ID) throws ComException {
    assert(ID != null);
    final Object obj = this._dispatchCall(64618,"GetAddressEntryFromID", DISPATCH_METHOD,null,ID);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.impl.AddressEntryImpl.class);
  }
  @DeclDISPID(64619)  public com.wilutions.mslib.outlook.Recipient GetRecipientFromID(String EntryID) throws ComException {
    assert(EntryID != null);
    final Object obj = this._dispatchCall(64619,"GetRecipientFromID", DISPATCH_METHOD,null,EntryID);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.impl.RecipientImpl.class);
  }
  public _AccountImpl(String progId) throws ComException {
    super(progId, "{000630C5-0000-0000-C000-000000000046}");
  }
  protected _AccountImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_AccountImpl" + super.toString() + "]";
  }
}
