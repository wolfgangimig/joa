/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ContactSettingDictionary.
 * Represents a collection of key/value pairs of contact properties. 
 */
@CoClass(guid="{60A8F660-C321-4761-8AFF-41072DCFDD03}")
public class ContactSettingDictionary extends Dispatch implements IContactSettingDictionary {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public ContactSetting[] getKeys() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Keys", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (ContactSetting[])obj;
  }
  @DeclDISPID(1610743809)  public Object[] getValues() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"Values", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object[])obj;
  }
  @DeclDISPID(1610743810)  public Boolean TryGetValue(ContactSetting _key, ByRef<Object> _value) throws ComException {
    assert(_key != null);
    assert(_value != null);
    final Object obj = this._dispatchCall(1610743810,"TryGetValue", DISPATCH_METHOD,null,_key.value,_value);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(0)  public Object getItem(ContactSetting _key) throws ComException {
    assert(_key != null);
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_PROPERTYGET,null,_key.value);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1610743812)  public ContactSetting GetKeyAt(Integer _index) throws ComException {
    assert(_index != null);
    final Object obj = this._dispatchCall(1610743812,"GetKeyAt", DISPATCH_METHOD,null,_index);
    if (obj == null) return null;
    return ContactSetting.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743813)  public Object GetValueAt(Integer _index) throws ComException {
    assert(_index != null);
    final Object obj = this._dispatchCall(1610743813,"GetValueAt", DISPATCH_METHOD,null,_index);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1610743814)  public Boolean ContainsKey(ContactSetting _key) throws ComException {
    assert(_key != null);
    final Object obj = this._dispatchCall(1610743814,"ContainsKey", DISPATCH_METHOD,null,_key.value);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743815)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(1610743815,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  public ContactSettingDictionary() throws ComException {
    super("{60A8F660-C321-4761-8AFF-41072DCFDD03}", "{FD9000B3-479F-4B16-9D63-70A49E078946}");
  }
  protected ContactSettingDictionary(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ContactSettingDictionary" + super.toString() + "]";
  }
}
