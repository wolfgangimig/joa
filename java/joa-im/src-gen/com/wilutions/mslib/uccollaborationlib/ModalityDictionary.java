/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ModalityDictionary.
 * ModalityDictionary Class 
 */
@CoClass(guid="{D56D0F3E-24E3-421A-8AE8-5BFB8D97FE90}")
public class ModalityDictionary extends Dispatch implements IModalityDictionary {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(0)  public IModality getItem(ModalityTypes _modalityType) throws ComException {
    assert(_modalityType != null);
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_PROPERTYGET,null,_modalityType.value);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IModalityImpl.class);
  }
  @DeclDISPID(1610743810)  public ModalityTypes[] getKeys() throws ComException {
    final Object obj = this._dispatchCall(1610743810,"Keys", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (ModalityTypes[])obj;
  }
  @DeclDISPID(1610743811)  public IModality[] getValues() throws ComException {
    final Object obj = this._dispatchCall(1610743811,"Values", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IModality[])obj;
  }
  @DeclDISPID(1610743812)  public Boolean TryGetValue(ModalityTypes _modalityType, ByRef<IModality> _itemValue) throws ComException {
    assert(_modalityType != null);
    assert(_itemValue != null);
    final Object obj = this._dispatchCall(1610743812,"TryGetValue", DISPATCH_METHOD,null,_modalityType.value,_itemValue);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743813)  public ModalityTypes GetKeyAt(Integer _index) throws ComException {
    assert(_index != null);
    final Object obj = this._dispatchCall(1610743813,"GetKeyAt", DISPATCH_METHOD,null,_index);
    if (obj == null) return null;
    return ModalityTypes.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743814)  public IModality GetValueAt(Integer _index) throws ComException {
    assert(_index != null);
    final Object obj = this._dispatchCall(1610743814,"GetValueAt", DISPATCH_METHOD,null,_index);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IModalityImpl.class);
  }
  @DeclDISPID(1610743815)  public Boolean ContainsKey(ModalityTypes _modalityType) throws ComException {
    assert(_modalityType != null);
    final Object obj = this._dispatchCall(1610743815,"ContainsKey", DISPATCH_METHOD,null,_modalityType.value);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  public ModalityDictionary() throws ComException {
    super("{D56D0F3E-24E3-421A-8AE8-5BFB8D97FE90}", "{ED5040FA-8F8F-4876-BF6D-9C62F5EFFD5B}");
  }
  protected ModalityDictionary(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ModalityDictionary" + super.toString() + "]";
  }
}
