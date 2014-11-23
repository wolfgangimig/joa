/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{6C3C6377-A35B-970C-32D0-5B8FD638B634}")
public class IPreviousConversationsManagerImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IPreviousConversationsManager {
  @DeclDISPID(1610743808)  public com.wilutions.mslib.uccollaborationlib.PreviousConversationsType getType() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Type", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.PreviousConversationsType.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743809)  public com.wilutions.mslib.uccollaborationlib.PreviousConversationsConnectionState getConnectionState() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"ConnectionState", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.PreviousConversationsConnectionState.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743810)  public void Connect() throws ComException {
    this._dispatchCall(1610743810,"Connect", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1610743811)  public void Reset() throws ComException {
    this._dispatchCall(1610743811,"Reset", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1610743812)  public Integer getNewItemCountSinceLastReset() throws ComException {
    final Object obj = this._dispatchCall(1610743812,"NewItemCountSinceLastReset", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610743813)  public java.util.Date getAccessTime() throws ComException {
    final Object obj = this._dispatchCall(1610743813,"AccessTime", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (java.util.Date)obj;
  }
  @DeclDISPID(1610743814)  public Integer getMaxItems() throws ComException {
    final Object obj = this._dispatchCall(1610743814,"MaxItems", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610743814)  public void setMaxItems(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743814,"MaxItems", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743816)  public com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation GetUnreadItems(Object _previousConversationsManagerCallback, Object _state) throws ComException {
    assert(_previousConversationsManagerCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743816,"GetUnreadItems", DISPATCH_METHOD,null,_previousConversationsManagerCallback,_state);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743817)  public com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation GetAllItems(Object _previousConversationsManagerCallback, Object _state) throws ComException {
    assert(_previousConversationsManagerCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743817,"GetAllItems", DISPATCH_METHOD,null,_previousConversationsManagerCallback,_state);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  public IPreviousConversationsManagerImpl(String progId) throws ComException {
    super(progId, "{ACABFA1C-0738-4C4D-AF7E-326873CF4ACE}");
  }
  protected IPreviousConversationsManagerImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IPreviousConversationsManagerImpl" + super.toString() + "]";
  }
}
