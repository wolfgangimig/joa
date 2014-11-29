/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ConversationStateChangePropertyDictionary.
 * ConversationStateChangePropertyDictionary Class 
 */
@CoClass(guid="{3E40C2D1-0A01-4D22-A5B8-3DA4E7FD0170}")
public class ConversationStateChangePropertyDictionary extends Dispatch implements IConversationStateChangePropertyDictionary {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(0)  public Object getItem(ConversationStateChangeProperty _modalityType) throws ComException {
    assert(_modalityType != null);
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_PROPERTYGET,null,_modalityType.value);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1610743810)  public ConversationStateChangeProperty[] getKeys() throws ComException {
    final Object obj = this._dispatchCall(1610743810,"Keys", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (ConversationStateChangeProperty[])obj;
  }
  @DeclDISPID(1610743811)  public Object[] getValues() throws ComException {
    final Object obj = this._dispatchCall(1610743811,"Values", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object[])obj;
  }
  @DeclDISPID(1610743812)  public Boolean TryGetValue(ConversationStateChangeProperty _propertyType, ByRef<Object> _itemValue) throws ComException {
    assert(_propertyType != null);
    assert(_itemValue != null);
    final Object obj = this._dispatchCall(1610743812,"TryGetValue", DISPATCH_METHOD,null,_propertyType.value,_itemValue);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743813)  public ConversationStateChangeProperty GetKeyAt(Integer _index) throws ComException {
    assert(_index != null);
    final Object obj = this._dispatchCall(1610743813,"GetKeyAt", DISPATCH_METHOD,null,_index);
    if (obj == null) return null;
    return ConversationStateChangeProperty.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743814)  public Object GetValueAt(Integer _index) throws ComException {
    assert(_index != null);
    final Object obj = this._dispatchCall(1610743814,"GetValueAt", DISPATCH_METHOD,null,_index);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1610743815)  public Boolean ContainsKey(ConversationStateChangeProperty _propertyType) throws ComException {
    assert(_propertyType != null);
    final Object obj = this._dispatchCall(1610743815,"ContainsKey", DISPATCH_METHOD,null,_propertyType.value);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  public ConversationStateChangePropertyDictionary() throws ComException {
    super("{3E40C2D1-0A01-4D22-A5B8-3DA4E7FD0170}", "{56F7DEC0-59CA-47C6-9F35-D5066A702B39}");
  }
  protected ConversationStateChangePropertyDictionary(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ConversationStateChangePropertyDictionary" + super.toString() + "]";
  }
}
