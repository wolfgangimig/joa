/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * VoiceMailsManager.
 * VoiceMailsManager Class 
 */
@CoClass(guid="{60A46701-3E4C-4115-83A3-B64EEE5B4C0D}")
public class VoiceMailsManager extends Dispatch implements IVoiceMailsManager {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public PreviousConversationsConnectionState getConnectionState() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"ConnectionState", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return PreviousConversationsConnectionState.valueOf((Integer)obj);
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
  @DeclDISPID(1610743812)  public void setMaxItems(final Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743812,"MaxItems", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743814)  public IAsynchronousOperation GetUnreadVoiceMails(final Object _voiceMailsManagerCallback, final Object _state) throws ComException {
    assert(_voiceMailsManagerCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743814,"GetUnreadVoiceMails", DISPATCH_METHOD,null,_voiceMailsManagerCallback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743815)  public IAsynchronousOperation GetAllVoiceMails(final Object _voiceMailsManagerCallback, final Object _state) throws ComException {
    assert(_voiceMailsManagerCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743815,"GetAllVoiceMails", DISPATCH_METHOD,null,_voiceMailsManagerCallback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  public VoiceMailsManager() throws ComException {
    super("{60A46701-3E4C-4115-83A3-B64EEE5B4C0D}", "{E24C2484-C70D-44AB-8A4E-F1585A17A3E1}");
  }
  protected VoiceMailsManager(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[VoiceMailsManager" + super.toString() + "]";
  }
}
