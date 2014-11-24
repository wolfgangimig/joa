/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{2DC7D991-2BEC-9337-22C3-F585501801A1}")
public class IModalityDictionaryImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IModalityDictionary {
  @DeclDISPID(1610743808)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(0)  public com.wilutions.mslib.uccollaborationlib.IModality getItem(com.wilutions.mslib.uccollaborationlib.ModalityTypes _modalityType) throws ComException {
    assert(_modalityType != null);
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_PROPERTYGET,null,_modalityType.value);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IModalityImpl.class);
  }
  @DeclDISPID(1610743810)  public com.wilutions.mslib.uccollaborationlib.ModalityTypes[] getKeys() throws ComException {
    final Object obj = this._dispatchCall(1610743810,"Keys", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (com.wilutions.mslib.uccollaborationlib.ModalityTypes[])obj;
  }
  @DeclDISPID(1610743811)  public com.wilutions.mslib.uccollaborationlib.IModality[] getValues() throws ComException {
    final Object obj = this._dispatchCall(1610743811,"Values", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (com.wilutions.mslib.uccollaborationlib.IModality[])obj;
  }
  @DeclDISPID(1610743812)  public Boolean TryGetValue(com.wilutions.mslib.uccollaborationlib.ModalityTypes _modalityType, ByRef<com.wilutions.mslib.uccollaborationlib.IModality> _itemValue) throws ComException {
    assert(_modalityType != null);
    assert(_itemValue != null);
    final Object obj = this._dispatchCall(1610743812,"TryGetValue", DISPATCH_METHOD,null,_modalityType.value,_itemValue);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743813)  public com.wilutions.mslib.uccollaborationlib.ModalityTypes GetKeyAt(Integer _index) throws ComException {
    assert(_index != null);
    final Object obj = this._dispatchCall(1610743813,"GetKeyAt", DISPATCH_METHOD,null,_index);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.ModalityTypes.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743814)  public com.wilutions.mslib.uccollaborationlib.IModality GetValueAt(Integer _index) throws ComException {
    assert(_index != null);
    final Object obj = this._dispatchCall(1610743814,"GetValueAt", DISPATCH_METHOD,null,_index);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IModalityImpl.class);
  }
  @DeclDISPID(1610743815)  public Boolean ContainsKey(com.wilutions.mslib.uccollaborationlib.ModalityTypes _modalityType) throws ComException {
    assert(_modalityType != null);
    final Object obj = this._dispatchCall(1610743815,"ContainsKey", DISPATCH_METHOD,null,_modalityType.value);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  public IModalityDictionaryImpl(String progId) throws ComException {
    super(progId, "{ED5040FA-8F8F-4876-BF6D-9C62F5EFFD5B}");
  }
  protected IModalityDictionaryImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IModalityDictionaryImpl" + super.toString() + "]";
  }
}
