/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.messengerapi.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{EEC7CD17-0CC9-9421-28D0-76A6E2E6FC81}")
public class IMessengerServiceImpl extends Dispatch implements com.wilutions.mslib.messengerapi.IMessengerService {
  @DeclDISPID(2178)  public String getServiceName() throws ComException {
    final Object obj = this._dispatchCall(2178,"ServiceName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(2183)  public String getServiceId() throws ComException {
    final Object obj = this._dispatchCall(2183,"ServiceId", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(2179)  public String getMyFriendlyName() throws ComException {
    final Object obj = this._dispatchCall(2179,"MyFriendlyName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(2181)  public com.wilutions.mslib.messengerapi.MISTATUS getMyStatus() throws ComException {
    final Object obj = this._dispatchCall(2181,"MyStatus", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.messengerapi.MISTATUS.valueOf((Integer)obj);
  }
  @DeclDISPID(2184)  public String getMySigninName() throws ComException {
    final Object obj = this._dispatchCall(2184,"MySigninName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(2182)  public Object getProperty(final com.wilutions.mslib.messengerapi.MSERVICEPROPERTY ePropType) throws ComException {
    assert(ePropType != null);
    final Object obj = this._dispatchCall(2182,"Property", DISPATCH_PROPERTYGET,null,ePropType.value);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(2182)  public void setProperty(final com.wilutions.mslib.messengerapi.MSERVICEPROPERTY ePropType, final Object value2) throws ComException {
    assert(value2 != null);
    assert(ePropType != null);
    this._dispatchCall(2182,"Property", DISPATCH_PROPERTYPUT,value2,ePropType.value);
  }
  public IMessengerServiceImpl(String progId) throws ComException {
    super(progId, "{2E50547C-A8AA-4F60-B57E-1F414711007B}");
  }
  protected IMessengerServiceImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IMessengerServiceImpl" + super.toString() + "]";
  }
}
