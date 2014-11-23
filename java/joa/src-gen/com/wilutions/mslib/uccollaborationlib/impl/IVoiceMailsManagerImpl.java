/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{22DBBDEF-636E-9FEA-17E0-98BFFFE05F1B}")
public class IVoiceMailsManagerImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IVoiceMailsManager {
  @DeclDISPID(1610743808)  public com.wilutions.mslib.uccollaborationlib.PreviousConversationsConnectionState getConnectionState() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"ConnectionState", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.PreviousConversationsConnectionState.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743809)  public void Connect() throws ComException {
    this._dispatchCall(1610743809,"Connect", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1610743810)  public void Reset() throws ComException {
    this._dispatchCall(1610743810,"Reset", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1610743811)  public Integer getNewVoiceMailCountSinceLastReset() throws ComException {
    final Object obj = this._dispatchCall(1610743811,"NewVoiceMailCountSinceLastReset", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610743812)  public Integer getMaxItems() throws ComException {
    final Object obj = this._dispatchCall(1610743812,"MaxItems", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610743812)  public void setMaxItems(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743812,"MaxItems", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743814)  public com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation GetUnreadVoiceMails(Object _voiceMailsManagerCallback, Object _state) throws ComException {
    assert(_voiceMailsManagerCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743814,"GetUnreadVoiceMails", DISPATCH_METHOD,null,_voiceMailsManagerCallback,_state);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743815)  public com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation GetAllVoiceMails(Object _voiceMailsManagerCallback, Object _state) throws ComException {
    assert(_voiceMailsManagerCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743815,"GetAllVoiceMails", DISPATCH_METHOD,null,_voiceMailsManagerCallback,_state);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  public IVoiceMailsManagerImpl(String progId) throws ComException {
    super(progId, "{E24C2484-C70D-44AB-8A4E-F1585A17A3E1}");
  }
  protected IVoiceMailsManagerImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IVoiceMailsManagerImpl" + super.toString() + "]";
  }
}
