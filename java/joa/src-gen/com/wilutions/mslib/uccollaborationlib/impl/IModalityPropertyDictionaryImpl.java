/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{A290D06F-2965-98BF-389F-8FDA520A3E1D}")
public class IModalityPropertyDictionaryImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IModalityPropertyDictionary {
  @DeclDISPID(1610743808)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(0)  public Object getItem(com.wilutions.mslib.uccollaborationlib.ModalityProperty _propertyType) throws ComException {
    assert(_propertyType != null);
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_PROPERTYGET,null,_propertyType.value);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1610743810)  public com.wilutions.mslib.uccollaborationlib.ModalityProperty[] getKeys() throws ComException {
    final Object obj = this._dispatchCall(1610743810,"Keys", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (com.wilutions.mslib.uccollaborationlib.ModalityProperty[])obj;
  }
  @DeclDISPID(1610743811)  public Object[] getValues() throws ComException {
    final Object obj = this._dispatchCall(1610743811,"Values", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object[])obj;
  }
  @DeclDISPID(1610743812)  public Boolean TryGetValue(com.wilutions.mslib.uccollaborationlib.ModalityProperty _propertyType, ByRef<Object> _itemValue) throws ComException {
    assert(_propertyType != null);
    assert(_itemValue != null);
    final Object obj = this._dispatchCall(1610743812,"TryGetValue", DISPATCH_METHOD,null,_propertyType.value,_itemValue);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743813)  public com.wilutions.mslib.uccollaborationlib.ModalityProperty GetKeyAt(Integer _index) throws ComException {
    assert(_index != null);
    final Object obj = this._dispatchCall(1610743813,"GetKeyAt", DISPATCH_METHOD,null,_index);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.ModalityProperty.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743814)  public Object GetValueAt(Integer _index) throws ComException {
    assert(_index != null);
    final Object obj = this._dispatchCall(1610743814,"GetValueAt", DISPATCH_METHOD,null,_index);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1610743815)  public Boolean ContainsKey(com.wilutions.mslib.uccollaborationlib.ModalityProperty _propertyType) throws ComException {
    assert(_propertyType != null);
    final Object obj = this._dispatchCall(1610743815,"ContainsKey", DISPATCH_METHOD,null,_propertyType.value);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  public IModalityPropertyDictionaryImpl(String progId) throws ComException {
    super(progId, "{62074904-8D06-43FE-A531-E63DF7FDC2E7}");
  }
  protected IModalityPropertyDictionaryImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IModalityPropertyDictionaryImpl" + super.toString() + "]";
  }
}
