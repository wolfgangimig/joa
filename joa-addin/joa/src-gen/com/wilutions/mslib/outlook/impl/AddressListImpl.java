/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C091A922-A463-DB41-5DAE-69E7A5F7FCBC}")
public class AddressListImpl extends Dispatch implements com.wilutions.mslib.outlook.AddressList {
  @DeclDISPID(61440)  public com.wilutions.mslib.outlook._Application getApplication() throws ComException {
    final Object obj = this._dispatchCall(61440,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl._ApplicationImpl.class);
  }
  @DeclDISPID(61450)  public com.wilutions.mslib.outlook.OlObjectClass getClass_() throws ComException {
    final Object obj = this._dispatchCall(61450,"Class", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.outlook.OlObjectClass.valueOf((Integer)obj);
  }
  @DeclDISPID(61451)  public com.wilutions.mslib.outlook._NameSpace getSession() throws ComException {
    final Object obj = this._dispatchCall(61451,"Session", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl._NameSpaceImpl.class);
  }
  @DeclDISPID(61441)  public IDispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(61441,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(256)  public com.wilutions.mslib.outlook.AddressEntries getAddressEntries() throws ComException {
    final Object obj = this._dispatchCall(256,"AddressEntries", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl.AddressEntriesImpl.class);
  }
  @DeclDISPID(61470)  public String getID() throws ComException {
    final Object obj = this._dispatchCall(61470,"ID", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(91)  public Integer getIndex() throws ComException {
    final Object obj = this._dispatchCall(91,"Index", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(61463)  public Boolean getIsReadOnly() throws ComException {
    final Object obj = this._dispatchCall(61463,"IsReadOnly", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(12289)  public String getName() throws ComException {
    final Object obj = this._dispatchCall(12289,"Name", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(64250)  public com.wilutions.mslib.outlook.MAPIFolder GetContactsFolder() throws ComException {
    final Object obj = this._dispatchCall(64250,"GetContactsFolder", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl.MAPIFolderImpl.class);
  }
  @DeclDISPID(64237)  public com.wilutions.mslib.outlook.OlAddressListType getAddressListType() throws ComException {
    final Object obj = this._dispatchCall(64237,"AddressListType", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.outlook.OlAddressListType.valueOf((Integer)obj);
  }
  @DeclDISPID(64238)  public Integer getResolutionOrder() throws ComException {
    final Object obj = this._dispatchCall(64238,"ResolutionOrder", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(64248)  public Boolean getIsInitialAddressList() throws ComException {
    final Object obj = this._dispatchCall(64248,"IsInitialAddressList", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(64253)  public com.wilutions.mslib.outlook.PropertyAccessor getPropertyAccessor() throws ComException {
    final Object obj = this._dispatchCall(64253,"PropertyAccessor", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(com.wilutions.mslib.outlook.PropertyAccessor.class);
  }
  public AddressListImpl(String progId) throws ComException {
    super(progId, "{00063049-0000-0000-C000-000000000046}");
  }
  protected AddressListImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[AddressListImpl" + super.toString() + "]";
  }
}
