/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{30591864-470C-9799-3598-38BC3F99F506}")
public class IContactInformationDictionaryImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IContactInformationDictionary {
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
  @DeclDISPID(0)  public Object getItem(final com.wilutions.mslib.uccollaborationlib.ContactInformationType _key) throws ComException {
    assert(_key != null);
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_PROPERTYGET,null,_key.value);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1610743811)  public com.wilutions.mslib.uccollaborationlib.ContactInformationType[] getKeys() throws ComException {
    final Object obj = this._dispatchCall(1610743811,"Keys", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (com.wilutions.mslib.uccollaborationlib.ContactInformationType[])obj;
  }
  @DeclDISPID(1610743812)  public Boolean TryGetValue(final com.wilutions.mslib.uccollaborationlib.ContactInformationType _key, final ByRef<Object> _value) throws ComException {
    assert(_key != null);
    assert(_value != null);
    final Object obj = this._dispatchCall(1610743812,"TryGetValue", DISPATCH_METHOD,null,_key.value,_value);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743813)  public com.wilutions.mslib.uccollaborationlib.ContactInformationType GetKeyAt(final Integer _index) throws ComException {
    assert(_index != null);
    final Object obj = this._dispatchCall(1610743813,"GetKeyAt", DISPATCH_METHOD,null,_index);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.ContactInformationType.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743814)  public Object GetValueAt(final Integer _index) throws ComException {
    assert(_index != null);
    final Object obj = this._dispatchCall(1610743814,"GetValueAt", DISPATCH_METHOD,null,_index);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1610743815)  public Boolean ContainsKey(final com.wilutions.mslib.uccollaborationlib.ContactInformationType _key) throws ComException {
    assert(_key != null);
    final Object obj = this._dispatchCall(1610743815,"ContainsKey", DISPATCH_METHOD,null,_key.value);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  public IContactInformationDictionaryImpl(String progId) throws ComException {
    super(progId, "{F0CE810F-E36F-4CD8-A836-515B9A6E09FC}");
  }
  protected IContactInformationDictionaryImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IContactInformationDictionaryImpl" + super.toString() + "]";
  }
}
