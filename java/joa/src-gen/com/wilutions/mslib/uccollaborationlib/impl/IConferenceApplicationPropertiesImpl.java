/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{A42070C6-7D43-95EB-0869-F4727B6D32DE}")
public class IConferenceApplicationPropertiesImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IConferenceApplicationProperties {
  @DeclDISPID(1610743808)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610743809)  public void GetItem(Integer index, ByRef<String> _key, ByRef<String> _value) throws ComException {
    assert(index != null);
    assert(_key != null);
    assert(_value != null);
    this._dispatchCall(1610743809,"GetItem", DISPATCH_METHOD,null,index,_key,_value);
  }
  @DeclDISPID(1610743810)  public String getItem(String _key) throws ComException {
    assert(_key != null);
    final Object obj = this._dispatchCall(1610743810,"Item", DISPATCH_PROPERTYGET,null,_key);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743811)  public void Add(String _key, String _value) throws ComException {
    assert(_key != null);
    assert(_value != null);
    this._dispatchCall(1610743811,"Add", DISPATCH_METHOD,null,_key,_value);
  }
  @DeclDISPID(1610743812)  public void Remove(String _key) throws ComException {
    assert(_key != null);
    this._dispatchCall(1610743812,"Remove", DISPATCH_METHOD,null,_key);
  }
  @DeclDISPID(1610743813)  public void RemoveAll() throws ComException {
    this._dispatchCall(1610743813,"RemoveAll", DISPATCH_METHOD,null);
  }
  public IConferenceApplicationPropertiesImpl(String progId) throws ComException {
    super(progId, "{64B7E9AD-D920-4EAA-95C7-9D95DE9ACE24}");
  }
  protected IConferenceApplicationPropertiesImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IConferenceApplicationPropertiesImpl" + super.toString() + "]";
  }
}
