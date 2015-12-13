/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{0709D802-F73C-9100-104C-AFBD352EACC7}")
public class IModalityStateChangePropertyDictionaryImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IModalityStateChangePropertyDictionary {
  @DeclDISPID(1610743808)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(0)  public Object getItem(final com.wilutions.mslib.uccollaborationlib.ModalityStateChangeProperty _modalityType) throws ComException {
    assert(_modalityType != null);
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_PROPERTYGET,null,_modalityType.value);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1610743810)  public com.wilutions.mslib.uccollaborationlib.ModalityStateChangeProperty[] getKeys() throws ComException {
    final Object obj = this._dispatchCall(1610743810,"Keys", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (com.wilutions.mslib.uccollaborationlib.ModalityStateChangeProperty[])obj;
  }
  @DeclDISPID(1610743811)  public Object[] getValues() throws ComException {
    final Object obj = this._dispatchCall(1610743811,"Values", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object[])obj;
  }
  @DeclDISPID(1610743812)  public Boolean TryGetValue(final com.wilutions.mslib.uccollaborationlib.ModalityStateChangeProperty _modalityType, final ByRef<Object> _itemValue) throws ComException {
    assert(_modalityType != null);
    assert(_itemValue != null);
    final Object obj = this._dispatchCall(1610743812,"TryGetValue", DISPATCH_METHOD,null,_modalityType.value,_itemValue);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743813)  public com.wilutions.mslib.uccollaborationlib.ModalityStateChangeProperty GetKeyAt(final Integer _index) throws ComException {
    assert(_index != null);
    final Object obj = this._dispatchCall(1610743813,"GetKeyAt", DISPATCH_METHOD,null,_index);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.ModalityStateChangeProperty.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743814)  public Object GetValueAt(final Integer _index) throws ComException {
    assert(_index != null);
    final Object obj = this._dispatchCall(1610743814,"GetValueAt", DISPATCH_METHOD,null,_index);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1610743815)  public Boolean ContainsKey(final com.wilutions.mslib.uccollaborationlib.ModalityStateChangeProperty _modalityType) throws ComException {
    assert(_modalityType != null);
    final Object obj = this._dispatchCall(1610743815,"ContainsKey", DISPATCH_METHOD,null,_modalityType.value);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  public IModalityStateChangePropertyDictionaryImpl(String progId) throws ComException {
    super(progId, "{C79E4169-535F-4A41-8DE2-C65A90D9503D}");
  }
  protected IModalityStateChangePropertyDictionaryImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IModalityStateChangePropertyDictionaryImpl" + super.toString() + "]";
  }
}
