/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{73521E45-FD7F-9135-022A-D9E95C8754C2}")
public class IConferenceInfoImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IConferenceInfo {
  @DeclDISPID(1610743808)  public String getId() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Id", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743809)  public Boolean getAlreadyScheduled() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"AlreadyScheduled", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743810)  public String getUri() throws ComException {
    final Object obj = this._dispatchCall(1610743810,"Uri", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743811)  public com.wilutions.mslib.uccollaborationlib.ConferenceAdmissionType getAdmissionType() throws ComException {
    final Object obj = this._dispatchCall(1610743811,"AdmissionType", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.ConferenceAdmissionType.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743811)  public void setAdmissionType(com.wilutions.mslib.uccollaborationlib.ConferenceAdmissionType value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743811,"AdmissionType", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(1610743813)  public String getAdmissionKey() throws ComException {
    final Object obj = this._dispatchCall(1610743813,"AdmissionKey", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743813)  public void setAdmissionKey(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743813,"AdmissionKey", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743815)  public com.wilutions.mslib.uccollaborationlib.IConferenceInfoPropertyDictionary getConferenceInfoProperties() throws ComException {
    final Object obj = this._dispatchCall(1610743815,"ConferenceInfoProperties", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IConferenceInfoPropertyDictionaryImpl.class);
  }
  public IConferenceInfoImpl(String progId) throws ComException {
    super(progId, "{B3C5872E-591C-4A74-9F84-B00EF970A838}");
  }
  protected IConferenceInfoImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IConferenceInfoImpl" + super.toString() + "]";
  }
}
