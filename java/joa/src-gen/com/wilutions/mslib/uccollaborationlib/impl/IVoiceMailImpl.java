/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{E533E053-F852-9402-0CA6-B3E64BAF953A}")
public class IVoiceMailImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IVoiceMail {
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
  @DeclDISPID(1610743813)  public com.wilutions.mslib.uccollaborationlib.INamedPropertyList getProperties() throws ComException {
    final Object obj = this._dispatchCall(1610743813,"Properties", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.INamedPropertyListImpl.class);
  }
  @DeclDISPID(1610743814)  public Boolean getIsRead() throws ComException {
    final Object obj = this._dispatchCall(1610743814,"IsRead", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743815)  public com.wilutions.mslib.uccollaborationlib.IConversation CallVoiceMail() throws ComException {
    final Object obj = this._dispatchCall(1610743815,"CallVoiceMail", DISPATCH_METHOD,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IConversationImpl.class);
  }
  @DeclDISPID(1610743816)  public com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation Delete(Object _callback, Object _state) throws ComException {
    assert(_callback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743816,"Delete", DISPATCH_METHOD,null,_callback,_state);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  public IVoiceMailImpl(String progId) throws ComException {
    super(progId, "{25A47938-5C31-4F43-9108-DA01EE5869C0}");
  }
  protected IVoiceMailImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IVoiceMailImpl" + super.toString() + "]";
  }
}
