/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * VoiceMail.
 * VoiceMail Class 
 */
@CoClass(guid="{56D29009-C2F0-48B5-89C1-0F725199ECEA}")
public class VoiceMail extends Dispatch implements IVoiceMail {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public String getId() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Id", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743809)  public String getEntryId() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"EntryId", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743810)  public String getSender() throws ComException {
    final Object obj = this._dispatchCall(1610743810,"Sender", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743811)  public String getSenderUri() throws ComException {
    final Object obj = this._dispatchCall(1610743811,"SenderUri", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743812)  public java.util.Date getReceiveTime() throws ComException {
    final Object obj = this._dispatchCall(1610743812,"ReceiveTime", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (java.util.Date)obj;
  }
  @DeclDISPID(1610743813)  public INamedPropertyList getProperties() throws ComException {
    final Object obj = this._dispatchCall(1610743813,"Properties", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.INamedPropertyListImpl.class);
  }
  @DeclDISPID(1610743814)  public Boolean getIsRead() throws ComException {
    final Object obj = this._dispatchCall(1610743814,"IsRead", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743815)  public IConversation CallVoiceMail() throws ComException {
    final Object obj = this._dispatchCall(1610743815,"CallVoiceMail", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IConversationImpl.class);
  }
  @DeclDISPID(1610743816)  public IAsynchronousOperation Delete(final Object _callback, final Object _state) throws ComException {
    assert(_callback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743816,"Delete", DISPATCH_METHOD,null,_callback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  public VoiceMail() throws ComException {
    super("{56D29009-C2F0-48B5-89C1-0F725199ECEA}", "{25A47938-5C31-4F43-9108-DA01EE5869C0}");
  }
  protected VoiceMail(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[VoiceMail" + super.toString() + "]";
  }
}
