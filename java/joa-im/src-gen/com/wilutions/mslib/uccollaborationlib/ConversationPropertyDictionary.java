/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ConversationPropertyDictionary.
 * ConversationPropertyDictionary Class 
 */
@CoClass(guid="{CE124F88-3665-4A4A-B2E0-76355F832ADF}")
public class ConversationPropertyDictionary extends Dispatch implements IConversationPropertyDictionary {
  @DeclDISPID(1610743808)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(0)  public Object getItem(ConversationProperty _propertyType) throws ComException {
    assert(_propertyType != null);
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_PROPERTYGET,null,_propertyType.value);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1610743810)  public ConversationProperty[] getKeys() throws ComException {
    final Object obj = this._dispatchCall(1610743810,"Keys", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (ConversationProperty[])obj;
  }
  @DeclDISPID(1610743811)  public Object[] getValues() throws ComException {
    final Object obj = this._dispatchCall(1610743811,"Values", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object[])obj;
  }
  @DeclDISPID(1610743812)  public Boolean TryGetValue(ConversationProperty _propertyType, ByRef<Object> _itemValue) throws ComException {
    assert(_propertyType != null);
    assert(_itemValue != null);
    final Object obj = this._dispatchCall(1610743812,"TryGetValue", DISPATCH_METHOD,null,_propertyType.value,_itemValue);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743813)  public ConversationProperty GetKeyAt(Integer _index) throws ComException {
    assert(_index != null);
    final Object obj = this._dispatchCall(1610743813,"GetKeyAt", DISPATCH_METHOD,null,_index);
    if (obj == null) return null;
    return ConversationProperty.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743814)  public Object GetValueAt(Integer _index) throws ComException {
    assert(_index != null);
    final Object obj = this._dispatchCall(1610743814,"GetValueAt", DISPATCH_METHOD,null,_index);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1610743815)  public Boolean ContainsKey(ConversationProperty _propertyType) throws ComException {
    assert(_propertyType != null);
    final Object obj = this._dispatchCall(1610743815,"ContainsKey", DISPATCH_METHOD,null,_propertyType.value);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  public ConversationPropertyDictionary() throws ComException {
    super("{CE124F88-3665-4A4A-B2E0-76355F832ADF}", "{00E22CBB-3170-453A-AE62-EAFBC75A9F8D}");
  }
  protected ConversationPropertyDictionary(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ConversationPropertyDictionary" + super.toString() + "]";
  }
}
