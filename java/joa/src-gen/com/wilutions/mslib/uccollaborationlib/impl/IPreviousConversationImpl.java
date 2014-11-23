/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{1FD6D303-F432-9F24-374C-26D7B6E28FB4}")
public class IPreviousConversationImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IPreviousConversation {
  @DeclDISPID(1610743808)  public String getId() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Id", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743809)  public String getFrom() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"From", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743810)  public String getFromUri() throws ComException {
    final Object obj = this._dispatchCall(1610743810,"FromUri", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743811)  public String getConferenceUri() throws ComException {
    final Object obj = this._dispatchCall(1610743811,"ConferenceUri", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743812)  public com.wilutions.mslib.uccollaborationlib.ModalityTypes getModalityTypes() throws ComException {
    final Object obj = this._dispatchCall(1610743812,"ModalityTypes", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.ModalityTypes.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743813)  public com.wilutions.mslib.uccollaborationlib.ConversationDirection getDirection() throws ComException {
    final Object obj = this._dispatchCall(1610743813,"Direction", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.ConversationDirection.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743814)  public String getSubject() throws ComException {
    final Object obj = this._dispatchCall(1610743814,"Subject", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743815)  public java.util.Date getReceiveTime() throws ComException {
    final Object obj = this._dispatchCall(1610743815,"ReceiveTime", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (java.util.Date)obj;
  }
  @DeclDISPID(1610743816)  public com.wilutions.mslib.uccollaborationlib.INamedPropertyList getProperties() throws ComException {
    final Object obj = this._dispatchCall(1610743816,"Properties", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.INamedPropertyListImpl.class);
  }
  @DeclDISPID(1610743817)  public Boolean getIsRead() throws ComException {
    final Object obj = this._dispatchCall(1610743817,"IsRead", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  public IPreviousConversationImpl(String progId) throws ComException {
    super(progId, "{DF414A68-5051-4465-AAE2-4F301315734E}");
  }
  protected IPreviousConversationImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IPreviousConversationImpl" + super.toString() + "]";
  }
}
