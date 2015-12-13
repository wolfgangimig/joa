/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{3D0799D8-E3FC-9057-00CD-19433BF075BC}")
public class IContactSettingDictionaryImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IContactSettingDictionary {
  @DeclDISPID(1610743808)  public com.wilutions.mslib.uccollaborationlib.ContactSetting[] getKeys() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Keys", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (com.wilutions.mslib.uccollaborationlib.ContactSetting[])obj;
  }
  @DeclDISPID(1610743809)  public Object[] getValues() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"Values", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object[])obj;
  }
  @DeclDISPID(1610743810)  public Boolean TryGetValue(final com.wilutions.mslib.uccollaborationlib.ContactSetting _key, final ByRef<Object> _value) throws ComException {
    assert(_key != null);
    assert(_value != null);
    final Object obj = this._dispatchCall(1610743810,"TryGetValue", DISPATCH_METHOD,null,_key.value,_value);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(0)  public Object getItem(final com.wilutions.mslib.uccollaborationlib.ContactSetting _key) throws ComException {
    assert(_key != null);
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_PROPERTYGET,null,_key.value);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1610743812)  public com.wilutions.mslib.uccollaborationlib.ContactSetting GetKeyAt(final Integer _index) throws ComException {
    assert(_index != null);
    final Object obj = this._dispatchCall(1610743812,"GetKeyAt", DISPATCH_METHOD,null,_index);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.ContactSetting.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743813)  public Object GetValueAt(final Integer _index) throws ComException {
    assert(_index != null);
    final Object obj = this._dispatchCall(1610743813,"GetValueAt", DISPATCH_METHOD,null,_index);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1610743814)  public Boolean ContainsKey(final com.wilutions.mslib.uccollaborationlib.ContactSetting _key) throws ComException {
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
  public IContactSettingDictionaryImpl(String progId) throws ComException {
    super(progId, "{FD9000B3-479F-4B16-9D63-70A49E078946}");
  }
  protected IContactSettingDictionaryImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IContactSettingDictionaryImpl" + super.toString() + "]";
  }
}
