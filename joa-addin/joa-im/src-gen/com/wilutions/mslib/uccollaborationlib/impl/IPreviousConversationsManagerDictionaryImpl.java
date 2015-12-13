/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{D543DF76-6388-9E8A-2FBA-9823FA1AE148}")
public class IPreviousConversationsManagerDictionaryImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IPreviousConversationsManagerDictionary {
  @DeclDISPID(1610743808)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(0)  public com.wilutions.mslib.uccollaborationlib.IPreviousConversationsManager getItem(final com.wilutions.mslib.uccollaborationlib.PreviousConversationsType _key) throws ComException {
    assert(_key != null);
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_PROPERTYGET,null,_key.value);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IPreviousConversationsManagerImpl.class);
  }
  @DeclDISPID(1610743810)  public com.wilutions.mslib.uccollaborationlib.PreviousConversationsType[] getKeys() throws ComException {
    final Object obj = this._dispatchCall(1610743810,"Keys", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (com.wilutions.mslib.uccollaborationlib.PreviousConversationsType[])obj;
  }
  @DeclDISPID(1610743811)  public com.wilutions.mslib.uccollaborationlib.IPreviousConversationsManager[] getValues() throws ComException {
    final Object obj = this._dispatchCall(1610743811,"Values", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (com.wilutions.mslib.uccollaborationlib.IPreviousConversationsManager[])obj;
  }
  @DeclDISPID(1610743812)  public com.wilutions.mslib.uccollaborationlib.PreviousConversationsType GetKeyAt(final Integer _index) throws ComException {
    assert(_index != null);
    final Object obj = this._dispatchCall(1610743812,"GetKeyAt", DISPATCH_METHOD,null,_index);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.PreviousConversationsType.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743813)  public com.wilutions.mslib.uccollaborationlib.IPreviousConversationsManager GetValueAt(final Integer _index) throws ComException {
    assert(_index != null);
    final Object obj = this._dispatchCall(1610743813,"GetValueAt", DISPATCH_METHOD,null,_index);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IPreviousConversationsManagerImpl.class);
  }
  @DeclDISPID(1610743814)  public Boolean TryGetValue(final com.wilutions.mslib.uccollaborationlib.PreviousConversationsType _type, final ByRef<com.wilutions.mslib.uccollaborationlib.IPreviousConversationsManager> _pastConversations) throws ComException {
    assert(_type != null);
    assert(_pastConversations != null);
    final Object obj = this._dispatchCall(1610743814,"TryGetValue", DISPATCH_METHOD,null,_type.value,_pastConversations);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743815)  public Boolean ContainsKey(final com.wilutions.mslib.uccollaborationlib.PreviousConversationsType _type) throws ComException {
    assert(_type != null);
    final Object obj = this._dispatchCall(1610743815,"ContainsKey", DISPATCH_METHOD,null,_type.value);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  public IPreviousConversationsManagerDictionaryImpl(String progId) throws ComException {
    super(progId, "{15D4461D-C7EB-45CB-B214-F1C45FED1DB2}");
  }
  protected IPreviousConversationsManagerDictionaryImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IPreviousConversationsManagerDictionaryImpl" + super.toString() + "]";
  }
}
