/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{0AD0122F-EBAD-9BC3-1AAE-E50BCC0CAC1B}")
public class IShareableContentPropertyDictionaryImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IShareableContentPropertyDictionary {
  @DeclDISPID(1610743808)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(0)  public Object getItem(com.wilutions.mslib.uccollaborationlib.ShareableContentProperty _propertyType) throws ComException {
    assert(_propertyType != null);
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_PROPERTYGET,null,_propertyType.value);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1610743810)  public com.wilutions.mslib.uccollaborationlib.ShareableContentProperty[] getKeys() throws ComException {
    final Object obj = this._dispatchCall(1610743810,"Keys", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (com.wilutions.mslib.uccollaborationlib.ShareableContentProperty[])obj;
  }
  @DeclDISPID(1610743811)  public Object[] getValues() throws ComException {
    final Object obj = this._dispatchCall(1610743811,"Values", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object[])obj;
  }
  @DeclDISPID(1610743812)  public Boolean TryGetValue(com.wilutions.mslib.uccollaborationlib.ShareableContentProperty _propertyType, ByRef<Object> _itemValue) throws ComException {
    assert(_propertyType != null);
    assert(_itemValue != null);
    final Object obj = this._dispatchCall(1610743812,"TryGetValue", DISPATCH_METHOD,null,_propertyType.value,_itemValue);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743813)  public com.wilutions.mslib.uccollaborationlib.ShareableContentProperty GetKeyAt(Integer _index) throws ComException {
    assert(_index != null);
    final Object obj = this._dispatchCall(1610743813,"GetKeyAt", DISPATCH_METHOD,null,_index);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.ShareableContentProperty.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743814)  public Object GetValueAt(Integer _index) throws ComException {
    assert(_index != null);
    final Object obj = this._dispatchCall(1610743814,"GetValueAt", DISPATCH_METHOD,null,_index);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1610743815)  public Boolean ContainsKey(com.wilutions.mslib.uccollaborationlib.ShareableContentProperty _propertyType) throws ComException {
    assert(_propertyType != null);
    final Object obj = this._dispatchCall(1610743815,"ContainsKey", DISPATCH_METHOD,null,_propertyType.value);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  public IShareableContentPropertyDictionaryImpl(String progId) throws ComException {
    super(progId, "{CA478B44-4FCE-4082-8700-8CEC69FB50E1}");
  }
  protected IShareableContentPropertyDictionaryImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IShareableContentPropertyDictionaryImpl" + super.toString() + "]";
  }
}
