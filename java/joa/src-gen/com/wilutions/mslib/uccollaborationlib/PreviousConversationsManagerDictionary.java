/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * PreviousConversationsManagerDictionary.
 * PreviousConversationsManagerDictionary Class 
 */
@CoClass(guid="{4A7391D7-1A17-4996-9412-6828849395E8}")
public class PreviousConversationsManagerDictionary extends Dispatch implements IPreviousConversationsManagerDictionary {
  @DeclDISPID(1610743808)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(0)  public IPreviousConversationsManager getItem(PreviousConversationsType _key) throws ComException {
    assert(_key != null);
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_PROPERTYGET,null,_key.value);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IPreviousConversationsManagerImpl.class);
  }
  @DeclDISPID(1610743810)  public PreviousConversationsType[] getKeys() throws ComException {
    final Object obj = this._dispatchCall(1610743810,"Keys", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (PreviousConversationsType[])obj;
  }
  @DeclDISPID(1610743811)  public IPreviousConversationsManager[] getValues() throws ComException {
    final Object obj = this._dispatchCall(1610743811,"Values", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IPreviousConversationsManager[])obj;
  }
  @DeclDISPID(1610743812)  public PreviousConversationsType GetKeyAt(Integer _index) throws ComException {
    assert(_index != null);
    final Object obj = this._dispatchCall(1610743812,"GetKeyAt", DISPATCH_METHOD,null,_index);
    if (obj == null) return null;
    return PreviousConversationsType.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743813)  public IPreviousConversationsManager GetValueAt(Integer _index) throws ComException {
    assert(_index != null);
    final Object obj = this._dispatchCall(1610743813,"GetValueAt", DISPATCH_METHOD,null,_index);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IPreviousConversationsManagerImpl.class);
  }
  @DeclDISPID(1610743814)  public Boolean TryGetValue(PreviousConversationsType _type, ByRef<IPreviousConversationsManager> _pastConversations) throws ComException {
    assert(_type != null);
    assert(_pastConversations != null);
    final Object obj = this._dispatchCall(1610743814,"TryGetValue", DISPATCH_METHOD,null,_type.value,_pastConversations);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743815)  public Boolean ContainsKey(PreviousConversationsType _type) throws ComException {
    assert(_type != null);
    final Object obj = this._dispatchCall(1610743815,"ContainsKey", DISPATCH_METHOD,null,_type.value);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  public PreviousConversationsManagerDictionary() throws ComException {
    super("{4A7391D7-1A17-4996-9412-6828849395E8}", "{15D4461D-C7EB-45CB-B214-F1C45FED1DB2}");
  }
  protected PreviousConversationsManagerDictionary(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[PreviousConversationsManagerDictionary" + super.toString() + "]";
  }
}
