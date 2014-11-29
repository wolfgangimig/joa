/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ConversationContext.
 * ConversationContext class provides access to the conversation details. 
 */
@CoClass(guid="{3AFA5D5F-C3D5-453F-96E0-30C3DBC34951}")
public class ConversationContext extends Dispatch implements IConversationContext {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public String getId() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Id", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743809)  public ConversationContextType getType() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"Type", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return ConversationContextType.valueOf((Integer)obj);
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
  @DeclDISPID(1610743811)  public void setIsRequired(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743811,"IsRequired", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743813)  public IParticipantInfo getFrom() throws ComException {
    final Object obj = this._dispatchCall(1610743813,"From", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IParticipantInfoImpl.class);
  }
  @DeclDISPID(1610743813)  public void setFrom(final IParticipantInfo value) throws ComException {
    this._dispatchCall(1610743813,"From", DISPATCH_PROPERTYPUT,(value!=null?value:Dispatch.NULL));
  }
  @DeclDISPID(1610743815)  public IParticipantInfo getTo() throws ComException {
    final Object obj = this._dispatchCall(1610743815,"To", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IParticipantInfoImpl.class);
  }
  @DeclDISPID(1610743815)  public void setTo(final IParticipantInfo value) throws ComException {
    this._dispatchCall(1610743815,"To", DISPATCH_PROPERTYPUT,(value!=null?value:Dispatch.NULL));
  }
  @DeclDISPID(1610743817)  public String getConversationId() throws ComException {
    final Object obj = this._dispatchCall(1610743817,"ConversationId", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743817)  public void setConversationId(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743817,"ConversationId", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743819)  public String getDate() throws ComException {
    final Object obj = this._dispatchCall(1610743819,"Date", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743819)  public void setDate(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743819,"Date", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743821)  public IParticipantInfo[] getParticipants() throws ComException {
    final Object obj = this._dispatchCall(1610743821,"Participants", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IParticipantInfo[])obj;
  }
  @DeclDISPID(1610743821)  public void setParticipants(final IParticipantInfo[] value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743821,"Participants", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743823)  public ModalityTypes getModalityTypes() throws ComException {
    final Object obj = this._dispatchCall(1610743823,"ModalityTypes", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return ModalityTypes.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743823)  public void setModalityTypes(final ModalityTypes value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743823,"ModalityTypes", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(1610743825)  public String getDataFormat() throws ComException {
    final Object obj = this._dispatchCall(1610743825,"DataFormat", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743825)  public void setDataFormat(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743825,"DataFormat", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743827)  public String getData() throws ComException {
    final Object obj = this._dispatchCall(1610743827,"Data", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743827)  public void setData(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743827,"Data", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743829)  public IConversationContextCollection getSubContexts() throws ComException {
    final Object obj = this._dispatchCall(1610743829,"SubContexts", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IConversationContextCollectionImpl.class);
  }
  @DeclDISPID(1610743830)  public IParticipantInfo CreateParticipantInfo(final String _uri, final String _representedUri) throws ComException {
    assert(_uri != null);
    assert(_representedUri != null);
    final Object obj = this._dispatchCall(1610743830,"CreateParticipantInfo", DISPATCH_METHOD,null,_uri,_representedUri);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IParticipantInfoImpl.class);
  }
  public ConversationContext() throws ComException {
    super("{3AFA5D5F-C3D5-453F-96E0-30C3DBC34951}", "{04378C72-E58F-47C0-8621-901B85CA2ED4}");
  }
  protected ConversationContext(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ConversationContext" + super.toString() + "]";
  }
}
