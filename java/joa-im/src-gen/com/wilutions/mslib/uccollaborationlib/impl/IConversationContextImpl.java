/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C4A01519-41EC-9C81-1B8F-F9FC203DD22E}")
public class IConversationContextImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IConversationContext {
  @DeclDISPID(1610743808)  public String getId() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Id", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743809)  public com.wilutions.mslib.uccollaborationlib.ConversationContextType getType() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"Type", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.ConversationContextType.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743810)  public Boolean getIsActive() throws ComException {
    final Object obj = this._dispatchCall(1610743810,"IsActive", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743811)  public Boolean getIsRequired() throws ComException {
    final Object obj = this._dispatchCall(1610743811,"IsRequired", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743811)  public void setIsRequired(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743811,"IsRequired", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743813)  public com.wilutions.mslib.uccollaborationlib.IParticipantInfo getFrom() throws ComException {
    final Object obj = this._dispatchCall(1610743813,"From", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IParticipantInfoImpl.class);
  }
  @DeclDISPID(1610743813)  public void setFrom(com.wilutions.mslib.uccollaborationlib.IParticipantInfo value) throws ComException {
    this._dispatchCall(1610743813,"From", DISPATCH_PROPERTYPUT,(value!=null?value:Dispatch.NULL));
  }
  @DeclDISPID(1610743815)  public com.wilutions.mslib.uccollaborationlib.IParticipantInfo getTo() throws ComException {
    final Object obj = this._dispatchCall(1610743815,"To", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IParticipantInfoImpl.class);
  }
  @DeclDISPID(1610743815)  public void setTo(com.wilutions.mslib.uccollaborationlib.IParticipantInfo value) throws ComException {
    this._dispatchCall(1610743815,"To", DISPATCH_PROPERTYPUT,(value!=null?value:Dispatch.NULL));
  }
  @DeclDISPID(1610743817)  public String getConversationId() throws ComException {
    final Object obj = this._dispatchCall(1610743817,"ConversationId", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743817)  public void setConversationId(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743817,"ConversationId", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743819)  public String getDate() throws ComException {
    final Object obj = this._dispatchCall(1610743819,"Date", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743819)  public void setDate(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743819,"Date", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743821)  public com.wilutions.mslib.uccollaborationlib.IParticipantInfo[] getParticipants() throws ComException {
    final Object obj = this._dispatchCall(1610743821,"Participants", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (com.wilutions.mslib.uccollaborationlib.IParticipantInfo[])obj;
  }
  @DeclDISPID(1610743821)  public void setParticipants(com.wilutions.mslib.uccollaborationlib.IParticipantInfo[] value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743821,"Participants", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743823)  public com.wilutions.mslib.uccollaborationlib.ModalityTypes getModalityTypes() throws ComException {
    final Object obj = this._dispatchCall(1610743823,"ModalityTypes", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.ModalityTypes.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743823)  public void setModalityTypes(com.wilutions.mslib.uccollaborationlib.ModalityTypes value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743823,"ModalityTypes", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(1610743825)  public String getDataFormat() throws ComException {
    final Object obj = this._dispatchCall(1610743825,"DataFormat", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743825)  public void setDataFormat(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743825,"DataFormat", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743827)  public String getData() throws ComException {
    final Object obj = this._dispatchCall(1610743827,"Data", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743827)  public void setData(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743827,"Data", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743829)  public com.wilutions.mslib.uccollaborationlib.IConversationContextCollection getSubContexts() throws ComException {
    final Object obj = this._dispatchCall(1610743829,"SubContexts", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IConversationContextCollectionImpl.class);
  }
  @DeclDISPID(1610743830)  public com.wilutions.mslib.uccollaborationlib.IParticipantInfo CreateParticipantInfo(String _uri, String _representedUri) throws ComException {
    assert(_uri != null);
    assert(_representedUri != null);
    final Object obj = this._dispatchCall(1610743830,"CreateParticipantInfo", DISPATCH_METHOD,null,_uri,_representedUri);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IParticipantInfoImpl.class);
  }
  public IConversationContextImpl(String progId) throws ComException {
    super(progId, "{04378C72-E58F-47C0-8621-901B85CA2ED4}");
  }
  protected IConversationContextImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IConversationContextImpl" + super.toString() + "]";
  }
}
