/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ModalityStateChangePropertyDictionary.
 * ModalityStateChangePropertyDictionary Class 
 */
@CoClass(guid="{4A53D656-346E-4DDB-ADAB-7F504CE6C02C}")
public class ModalityStateChangePropertyDictionary extends Dispatch implements IModalityStateChangePropertyDictionary {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(0)  public Object getItem(ModalityStateChangeProperty _modalityType) throws ComException {
    assert(_modalityType != null);
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_PROPERTYGET,null,_modalityType.value);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1610743810)  public ModalityStateChangeProperty[] getKeys() throws ComException {
    final Object obj = this._dispatchCall(1610743810,"Keys", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (ModalityStateChangeProperty[])obj;
  }
  @DeclDISPID(1610743811)  public Object[] getValues() throws ComException {
    final Object obj = this._dispatchCall(1610743811,"Values", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object[])obj;
  }
  @DeclDISPID(1610743812)  public Boolean TryGetValue(ModalityStateChangeProperty _modalityType, ByRef<Object> _itemValue) throws ComException {
    assert(_modalityType != null);
    assert(_itemValue != null);
    final Object obj = this._dispatchCall(1610743812,"TryGetValue", DISPATCH_METHOD,null,_modalityType.value,_itemValue);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743813)  public ModalityStateChangeProperty GetKeyAt(Integer _index) throws ComException {
    assert(_index != null);
    final Object obj = this._dispatchCall(1610743813,"GetKeyAt", DISPATCH_METHOD,null,_index);
    if (obj == null) return null;
    return ModalityStateChangeProperty.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743814)  public Object GetValueAt(Integer _index) throws ComException {
    assert(_index != null);
    final Object obj = this._dispatchCall(1610743814,"GetValueAt", DISPATCH_METHOD,null,_index);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1610743815)  public Boolean ContainsKey(ModalityStateChangeProperty _modalityType) throws ComException {
    assert(_modalityType != null);
    final Object obj = this._dispatchCall(1610743815,"ContainsKey", DISPATCH_METHOD,null,_modalityType.value);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  public ModalityStateChangePropertyDictionary() throws ComException {
    super("{4A53D656-346E-4DDB-ADAB-7F504CE6C02C}", "{C79E4169-535F-4A41-8DE2-C65A90D9503D}");
  }
  protected ModalityStateChangePropertyDictionary(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ModalityStateChangePropertyDictionary" + super.toString() + "]";
  }
}
