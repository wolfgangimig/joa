/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * PreviousConversation.
 * PreviousConversation Class 
 */
@CoClass(guid="{CA757729-DA0F-452D-B001-936556BFC1D8}")
public class PreviousConversation extends Dispatch implements IPreviousConversation {
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
  @DeclDISPID(1610743812)  public ModalityTypes getModalityTypes() throws ComException {
    final Object obj = this._dispatchCall(1610743812,"ModalityTypes", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return ModalityTypes.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743813)  public ConversationDirection getDirection() throws ComException {
    final Object obj = this._dispatchCall(1610743813,"Direction", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return ConversationDirection.valueOf((Integer)obj);
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
  @DeclDISPID(1610743816)  public INamedPropertyList getProperties() throws ComException {
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
  public PreviousConversation() throws ComException {
    super("{CA757729-DA0F-452D-B001-936556BFC1D8}", "{DF414A68-5051-4465-AAE2-4F301315734E}");
  }
  protected PreviousConversation(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[PreviousConversation" + super.toString() + "]";
  }
}
