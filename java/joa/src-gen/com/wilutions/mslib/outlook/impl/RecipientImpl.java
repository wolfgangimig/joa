/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C091A92E-A463-DB41-5DAE-69E7A5F7FCBC}")
public class RecipientImpl extends Dispatch implements com.wilutions.mslib.outlook.Recipient {
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
  @DeclDISPID(109)  public IDispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(109,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(12291)  public String getAddress() throws ComException {
    final Object obj = this._dispatchCall(12291,"Address", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(121)  public com.wilutions.mslib.outlook.AddressEntry getAddressEntry() throws ComException {
    final Object obj = this._dispatchCall(121,"AddressEntry", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl.AddressEntryImpl.class);
  }
  @DeclDISPID(121)  public void setAddressEntry(com.wilutions.mslib.outlook.AddressEntry value) throws ComException {
    this._dispatchCall(121,"AddressEntry", DISPATCH_PROPERTYPUTREF,(value!=null?value:Dispatch.NULL));
  }
  @DeclDISPID(106)  public String getAutoResponse() throws ComException {
    final Object obj = this._dispatchCall(106,"AutoResponse", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(106)  public void setAutoResponse(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(106,"AutoResponse", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(14592)  public com.wilutions.mslib.outlook.OlDisplayType getDisplayType() throws ComException {
    final Object obj = this._dispatchCall(14592,"DisplayType", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.outlook.OlDisplayType.valueOf((Integer)obj);
  }
  @DeclDISPID(61470)  public String getEntryID() throws ComException {
    final Object obj = this._dispatchCall(61470,"EntryID", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(91)  public Integer getIndex() throws ComException {
    final Object obj = this._dispatchCall(91,"Index", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(102)  public com.wilutions.mslib.outlook.OlResponseStatus getMeetingResponseStatus() throws ComException {
    final Object obj = this._dispatchCall(102,"MeetingResponseStatus", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.outlook.OlResponseStatus.valueOf((Integer)obj);
  }
  @DeclDISPID(12289)  public String getName() throws ComException {
    final Object obj = this._dispatchCall(12289,"Name", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(100)  public Boolean getResolved() throws ComException {
    final Object obj = this._dispatchCall(100,"Resolved", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(118)  public com.wilutions.mslib.outlook.OlTrackingStatus getTrackingStatus() throws ComException {
    final Object obj = this._dispatchCall(118,"TrackingStatus", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.outlook.OlTrackingStatus.valueOf((Integer)obj);
  }
  @DeclDISPID(118)  public void setTrackingStatus(com.wilutions.mslib.outlook.OlTrackingStatus value) throws ComException {
    assert(value != null);
    this._dispatchCall(118,"TrackingStatus", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(119)  public java.util.Date getTrackingStatusTime() throws ComException {
    final Object obj = this._dispatchCall(119,"TrackingStatusTime", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (java.util.Date)obj;
  }
  @DeclDISPID(119)  public void setTrackingStatusTime(java.util.Date value) throws ComException {
    assert(value != null);
    this._dispatchCall(119,"TrackingStatusTime", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(3093)  public Integer getType() throws ComException {
    final Object obj = this._dispatchCall(3093,"Type", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(3093)  public void setType(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(3093,"Type", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(110)  public void Delete() throws ComException {
    this._dispatchCall(110,"Delete", DISPATCH_METHOD,null);
  }
  @DeclDISPID(111)  public String FreeBusy(java.util.Date Start, Integer MinPerChar, Object CompleteFormat) throws ComException {
    assert(Start != null);
    assert(MinPerChar != null);
    assert(CompleteFormat != null);
    final Object obj = this._dispatchCall(111,"FreeBusy", DISPATCH_METHOD,null,Start,MinPerChar,CompleteFormat);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(113)  public Boolean Resolve() throws ComException {
    final Object obj = this._dispatchCall(113,"Resolve", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(64253)  public com.wilutions.mslib.outlook.PropertyAccessor getPropertyAccessor() throws ComException {
    final Object obj = this._dispatchCall(64253,"PropertyAccessor", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(com.wilutions.mslib.outlook.PropertyAccessor.class);
  }
  @DeclDISPID(64628)  public Boolean getSendable() throws ComException {
    final Object obj = this._dispatchCall(64628,"Sendable", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(64628)  public void setSendable(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(64628,"Sendable", DISPATCH_PROPERTYPUT,value);
  }
  public RecipientImpl(String progId) throws ComException {
    super(progId, "{00063045-0000-0000-C000-000000000046}");
  }
  protected RecipientImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[RecipientImpl" + super.toString() + "]";
  }
}
