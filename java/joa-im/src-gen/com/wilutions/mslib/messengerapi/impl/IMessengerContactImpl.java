/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.messengerapi.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{27D00364-1F7A-9FE4-0B21-06A67CC91C46}")
public class IMessengerContactImpl extends Dispatch implements com.wilutions.mslib.messengerapi.IMessengerContact {
  @DeclDISPID(1536)  public String getFriendlyName() throws ComException {
    final Object obj = this._dispatchCall(1536,"FriendlyName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1537)  public com.wilutions.mslib.messengerapi.MISTATUS getStatus() throws ComException {
    final Object obj = this._dispatchCall(1537,"Status", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.messengerapi.MISTATUS.valueOf((Integer)obj);
  }
  @DeclDISPID(1538)  public String getSigninName() throws ComException {
    final Object obj = this._dispatchCall(1538,"SigninName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1539)  public String getServiceName() throws ComException {
    final Object obj = this._dispatchCall(1539,"ServiceName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1540)  public Boolean getBlocked() throws ComException {
    final Object obj = this._dispatchCall(1540,"Blocked", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1540)  public void setBlocked(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1540,"Blocked", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1543)  public Boolean getCanPage() throws ComException {
    final Object obj = this._dispatchCall(1543,"CanPage", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1544)  public String getPhoneNumber(final com.wilutions.mslib.messengerapi.MPHONE_TYPE PhoneType) throws ComException {
    assert(PhoneType != null);
    final Object obj = this._dispatchCall(1544,"PhoneNumber", DISPATCH_PROPERTYGET,null,PhoneType.value);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1541)  public Boolean getIsSelf() throws ComException {
    final Object obj = this._dispatchCall(1541,"IsSelf", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1542)  public Object getProperty(final com.wilutions.mslib.messengerapi.MCONTACTPROPERTY ePropType) throws ComException {
    assert(ePropType != null);
    final Object obj = this._dispatchCall(1542,"Property", DISPATCH_PROPERTYGET,null,ePropType.value);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1542)  public void setProperty(final com.wilutions.mslib.messengerapi.MCONTACTPROPERTY ePropType, final Object value2) throws ComException {
    assert(value2 != null);
    assert(ePropType != null);
    this._dispatchCall(1542,"Property", DISPATCH_PROPERTYPUT,value2,ePropType.value);
  }
  @DeclDISPID(1545)  public String getServiceId() throws ComException {
    final Object obj = this._dispatchCall(1545,"ServiceId", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  public IMessengerContactImpl(String progId) throws ComException {
    super(progId, "{E7479A0F-BB19-44A5-968F-6F41D93EE0BC}");
  }
  protected IMessengerContactImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IMessengerContactImpl" + super.toString() + "]";
  }
}
