/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ConferenceInfoPropertyDictionary.
 * ConferenceInfoPropertyDictionary Class 
 */
@CoClass(guid="{40368B76-A6AD-44C8-A088-CDEA0214CB10}")
public class ConferenceInfoPropertyDictionary extends Dispatch implements IConferenceInfoPropertyDictionary {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(0)  public Object getItem(final ConferenceInfoProperty _key) throws ComException {
    assert(_key != null);
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_PROPERTYGET,null,_key.value);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(0)  public void setItem(final ConferenceInfoProperty _key, final Object value2) throws ComException {
    assert(value2 != null);
    assert(_key != null);
    this._dispatchCall(0,"Item", DISPATCH_PROPERTYPUT,value2,_key.value);
  }
  @DeclDISPID(1610743811)  public void Add(final ConferenceInfoProperty _key, final Object _value) throws ComException {
    assert(_key != null);
    assert(_value != null);
    this._dispatchCall(1610743811,"Add", DISPATCH_METHOD,null,_key.value,_value);
  }
  @DeclDISPID(1610743812)  public ConferenceInfoProperty[] getKeys() throws ComException {
    final Object obj = this._dispatchCall(1610743812,"Keys", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (ConferenceInfoProperty[])obj;
  }
  @DeclDISPID(1610743813)  public Object[] getValues() throws ComException {
    final Object obj = this._dispatchCall(1610743813,"Values", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object[])obj;
  }
  @DeclDISPID(1610743814)  public Boolean TryGetValue(final ConferenceInfoProperty _key, final ByRef<Object> _value) throws ComException {
    assert(_key != null);
    assert(_value != null);
    final Object obj = this._dispatchCall(1610743814,"TryGetValue", DISPATCH_METHOD,null,_key.value,_value);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743815)  public ConferenceInfoProperty GetKeyAt(final Integer _index) throws ComException {
    assert(_index != null);
    final Object obj = this._dispatchCall(1610743815,"GetKeyAt", DISPATCH_METHOD,null,_index);
    if (obj == null) return null;
    return ConferenceInfoProperty.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743816)  public Object GetValueAt(final Integer _index) throws ComException {
    assert(_index != null);
    final Object obj = this._dispatchCall(1610743816,"GetValueAt", DISPATCH_METHOD,null,_index);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1610743817)  public Boolean ContainsKey(final ConferenceInfoProperty _key) throws ComException {
    assert(_key != null);
    final Object obj = this._dispatchCall(1610743817,"ContainsKey", DISPATCH_METHOD,null,_key.value);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743818)  public void RemoveAt(final Integer _index) throws ComException {
    assert(_index != null);
    this._dispatchCall(1610743818,"RemoveAt", DISPATCH_METHOD,null,_index);
  }
  @DeclDISPID(1610743819)  public void Remove(final ConferenceInfoProperty _key) throws ComException {
    assert(_key != null);
    this._dispatchCall(1610743819,"Remove", DISPATCH_METHOD,null,_key.value);
  }
  @DeclDISPID(1610743820)  public void RemoveAll() throws ComException {
    this._dispatchCall(1610743820,"RemoveAll", DISPATCH_METHOD,null);
  }
  public ConferenceInfoPropertyDictionary() throws ComException {
    super("{40368B76-A6AD-44C8-A088-CDEA0214CB10}", "{2D3D62CA-E9F6-4F94-8EBD-5FABAB29E6A5}");
  }
  protected ConferenceInfoPropertyDictionary(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ConferenceInfoPropertyDictionary" + super.toString() + "]";
  }
}
