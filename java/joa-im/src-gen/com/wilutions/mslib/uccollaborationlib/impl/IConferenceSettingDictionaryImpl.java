/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{7D1E8FFC-6D5D-914A-06C2-69AC7DEC9212}")
public class IConferenceSettingDictionaryImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IConferenceSettingDictionary {
  @DeclDISPID(1610743808)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(0)  public Object getItem(com.wilutions.mslib.uccollaborationlib.ConferenceSetting _key) throws ComException {
    assert(_key != null);
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_PROPERTYGET,null,_key.value);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(0)  public void setItem(com.wilutions.mslib.uccollaborationlib.ConferenceSetting _key, Object value2) throws ComException {
    assert(value2 != null);
    assert(_key != null);
    this._dispatchCall(0,"Item", DISPATCH_PROPERTYPUT,value2,_key.value);
  }
  @DeclDISPID(1610743811)  public void Add(com.wilutions.mslib.uccollaborationlib.ConferenceSetting _key, Object _value) throws ComException {
    assert(_key != null);
    assert(_value != null);
    this._dispatchCall(1610743811,"Add", DISPATCH_METHOD,null,_key.value,_value);
  }
  @DeclDISPID(1610743812)  public com.wilutions.mslib.uccollaborationlib.ConferenceSetting[] getKeys() throws ComException {
    final Object obj = this._dispatchCall(1610743812,"Keys", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (com.wilutions.mslib.uccollaborationlib.ConferenceSetting[])obj;
  }
  @DeclDISPID(1610743813)  public Object[] getValues() throws ComException {
    final Object obj = this._dispatchCall(1610743813,"Values", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object[])obj;
  }
  @DeclDISPID(1610743814)  public Boolean TryGetValue(com.wilutions.mslib.uccollaborationlib.ConferenceSetting _key, ByRef<Object> _value) throws ComException {
    assert(_key != null);
    assert(_value != null);
    final Object obj = this._dispatchCall(1610743814,"TryGetValue", DISPATCH_METHOD,null,_key.value,_value);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743815)  public com.wilutions.mslib.uccollaborationlib.ConferenceSetting GetKeyAt(Integer _index) throws ComException {
    assert(_index != null);
    final Object obj = this._dispatchCall(1610743815,"GetKeyAt", DISPATCH_METHOD,null,_index);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.ConferenceSetting.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743816)  public Object GetValueAt(Integer _index) throws ComException {
    assert(_index != null);
    final Object obj = this._dispatchCall(1610743816,"GetValueAt", DISPATCH_METHOD,null,_index);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1610743817)  public Boolean ContainsKey(com.wilutions.mslib.uccollaborationlib.ConferenceSetting _key) throws ComException {
    assert(_key != null);
    final Object obj = this._dispatchCall(1610743817,"ContainsKey", DISPATCH_METHOD,null,_key.value);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743818)  public void RemoveAt(Integer _index) throws ComException {
    assert(_index != null);
    this._dispatchCall(1610743818,"RemoveAt", DISPATCH_METHOD,null,_index);
  }
  @DeclDISPID(1610743819)  public void Remove(com.wilutions.mslib.uccollaborationlib.ConferenceSetting _key) throws ComException {
    assert(_key != null);
    this._dispatchCall(1610743819,"Remove", DISPATCH_METHOD,null,_key.value);
  }
  @DeclDISPID(1610743820)  public void RemoveAll() throws ComException {
    this._dispatchCall(1610743820,"RemoveAll", DISPATCH_METHOD,null);
  }
  public IConferenceSettingDictionaryImpl(String progId) throws ComException {
    super(progId, "{BD891697-C93E-4A0B-9B6C-004BD81B6EE8}");
  }
  protected IConferenceSettingDictionaryImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IConferenceSettingDictionaryImpl" + super.toString() + "]";
  }
}
