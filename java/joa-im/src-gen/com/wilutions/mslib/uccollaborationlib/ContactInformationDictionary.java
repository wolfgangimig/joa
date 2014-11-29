/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ContactInformationDictionary.
 * Represents a collection of key/value pairs of contact information. 
 */
@CoClass(guid="{0858AB97-0E11-49BD-8F88-4E2AE0232E33}")
public class ContactInformationDictionary extends Dispatch implements IContactInformationDictionary {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public Object[] getValues() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Values", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object[])obj;
  }
  @DeclDISPID(1610743809)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(0)  public Object getItem(ContactInformationType _key) throws ComException {
    assert(_key != null);
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_PROPERTYGET,null,_key.value);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1610743811)  public ContactInformationType[] getKeys() throws ComException {
    final Object obj = this._dispatchCall(1610743811,"Keys", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (ContactInformationType[])obj;
  }
  @DeclDISPID(1610743812)  public Boolean TryGetValue(ContactInformationType _key, ByRef<Object> _value) throws ComException {
    assert(_key != null);
    assert(_value != null);
    final Object obj = this._dispatchCall(1610743812,"TryGetValue", DISPATCH_METHOD,null,_key.value,_value);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743813)  public ContactInformationType GetKeyAt(Integer _index) throws ComException {
    assert(_index != null);
    final Object obj = this._dispatchCall(1610743813,"GetKeyAt", DISPATCH_METHOD,null,_index);
    if (obj == null) return null;
    return ContactInformationType.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743814)  public Object GetValueAt(Integer _index) throws ComException {
    assert(_index != null);
    final Object obj = this._dispatchCall(1610743814,"GetValueAt", DISPATCH_METHOD,null,_index);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1610743815)  public Boolean ContainsKey(ContactInformationType _key) throws ComException {
    assert(_key != null);
    final Object obj = this._dispatchCall(1610743815,"ContainsKey", DISPATCH_METHOD,null,_key.value);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  public ContactInformationDictionary() throws ComException {
    super("{0858AB97-0E11-49BD-8F88-4E2AE0232E33}", "{F0CE810F-E36F-4CD8-A836-515B9A6E09FC}");
  }
  protected ContactInformationDictionary(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ContactInformationDictionary" + super.toString() + "]";
  }
}
