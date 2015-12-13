/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{D00AABA5-44FC-9DB4-0365-680677844B20}")
public class IConversationWindowInformationDictionaryImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IConversationWindowInformationDictionary {
  @DeclDISPID(1610743808)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(0)  public Object getItem(final com.wilutions.mslib.uccollaborationlib.ConversationWindowInformationType _key) throws ComException {
    assert(_key != null);
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_PROPERTYGET,null,_key.value);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1610743810)  public com.wilutions.mslib.uccollaborationlib.ConversationWindowInformationType[] getKeys() throws ComException {
    final Object obj = this._dispatchCall(1610743810,"Keys", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (com.wilutions.mslib.uccollaborationlib.ConversationWindowInformationType[])obj;
  }
  @DeclDISPID(1610743811)  public Object[] getValues() throws ComException {
    final Object obj = this._dispatchCall(1610743811,"Values", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object[])obj;
  }
  @DeclDISPID(1610743812)  public Boolean TryGetValue(final com.wilutions.mslib.uccollaborationlib.ConversationWindowInformationType _key, final ByRef<Object> _itemValue) throws ComException {
    assert(_key != null);
    assert(_itemValue != null);
    final Object obj = this._dispatchCall(1610743812,"TryGetValue", DISPATCH_METHOD,null,_key.value,_itemValue);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743813)  public com.wilutions.mslib.uccollaborationlib.ConversationWindowInformationType GetKeyAt(final Integer _index) throws ComException {
    assert(_index != null);
    final Object obj = this._dispatchCall(1610743813,"GetKeyAt", DISPATCH_METHOD,null,_index);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.ConversationWindowInformationType.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743814)  public Object GetValueAt(final Integer _index) throws ComException {
    assert(_index != null);
    final Object obj = this._dispatchCall(1610743814,"GetValueAt", DISPATCH_METHOD,null,_index);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1610743815)  public Boolean ContainsKey(final com.wilutions.mslib.uccollaborationlib.ConversationWindowInformationType _key) throws ComException {
    assert(_key != null);
    final Object obj = this._dispatchCall(1610743815,"ContainsKey", DISPATCH_METHOD,null,_key.value);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  public IConversationWindowInformationDictionaryImpl(String progId) throws ComException {
    super(progId, "{109D32CE-E09F-46F5-9ECB-01E1D273B7DA}");
  }
  protected IConversationWindowInformationDictionaryImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IConversationWindowInformationDictionaryImpl" + super.toString() + "]";
  }
}
