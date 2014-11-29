/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{A0A9BD3F-D639-9D38-3B06-5FDC8494C048}")
public class IRoomMessageDictionaryImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IRoomMessageDictionary {
  @DeclDISPID(1610743808)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(0)  public Object getItem(final com.wilutions.mslib.uccollaborationlib.RoomMessageFormat _key) throws ComException {
    assert(_key != null);
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_PROPERTYGET,null,_key.value);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(0)  public void setItem(final com.wilutions.mslib.uccollaborationlib.RoomMessageFormat _key, final Object value2) throws ComException {
    assert(value2 != null);
    assert(_key != null);
    this._dispatchCall(0,"Item", DISPATCH_PROPERTYPUT,value2,_key.value);
  }
  @DeclDISPID(1610743811)  public void Add(final com.wilutions.mslib.uccollaborationlib.RoomMessageFormat _key, final Object _value) throws ComException {
    assert(_key != null);
    assert(_value != null);
    this._dispatchCall(1610743811,"Add", DISPATCH_METHOD,null,_key.value,_value);
  }
  @DeclDISPID(1610743812)  public com.wilutions.mslib.uccollaborationlib.RoomMessageFormat[] getKeys() throws ComException {
    final Object obj = this._dispatchCall(1610743812,"Keys", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (com.wilutions.mslib.uccollaborationlib.RoomMessageFormat[])obj;
  }
  @DeclDISPID(1610743813)  public Object[] getValues() throws ComException {
    final Object obj = this._dispatchCall(1610743813,"Values", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object[])obj;
  }
  @DeclDISPID(1610743814)  public Boolean TryGetValue(final com.wilutions.mslib.uccollaborationlib.RoomMessageFormat _key, final ByRef<Object> _itemValue) throws ComException {
    assert(_key != null);
    assert(_itemValue != null);
    final Object obj = this._dispatchCall(1610743814,"TryGetValue", DISPATCH_METHOD,null,_key.value,_itemValue);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743815)  public com.wilutions.mslib.uccollaborationlib.RoomMessageFormat GetKeyAt(final Integer _index) throws ComException {
    assert(_index != null);
    final Object obj = this._dispatchCall(1610743815,"GetKeyAt", DISPATCH_METHOD,null,_index);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.RoomMessageFormat.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743816)  public Object GetValueAt(final Integer _index) throws ComException {
    assert(_index != null);
    final Object obj = this._dispatchCall(1610743816,"GetValueAt", DISPATCH_METHOD,null,_index);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1610743817)  public Boolean ContainsKey(final com.wilutions.mslib.uccollaborationlib.RoomMessageFormat _key) throws ComException {
    assert(_key != null);
    final Object obj = this._dispatchCall(1610743817,"ContainsKey", DISPATCH_METHOD,null,_key.value);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743818)  public void RemoveAt(final Integer _index) throws ComException {
    assert(_index != null);
    this._dispatchCall(1610743818,"RemoveAt", DISPATCH_METHOD,null,_index);
  }
  @DeclDISPID(1610743819)  public void Remove(final com.wilutions.mslib.uccollaborationlib.RoomMessageFormat _key) throws ComException {
    assert(_key != null);
    this._dispatchCall(1610743819,"Remove", DISPATCH_METHOD,null,_key.value);
  }
  @DeclDISPID(1610743820)  public void RemoveAll() throws ComException {
    this._dispatchCall(1610743820,"RemoveAll", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1610743821)  public com.wilutions.mslib.uccollaborationlib.RoomMessageType getType() throws ComException {
    final Object obj = this._dispatchCall(1610743821,"Type", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.RoomMessageType.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743821)  public void setType(final com.wilutions.mslib.uccollaborationlib.RoomMessageType value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743821,"Type", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(1610743823)  public String getStoryTitle() throws ComException {
    final Object obj = this._dispatchCall(1610743823,"StoryTitle", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743823)  public void setStoryTitle(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743823,"StoryTitle", DISPATCH_PROPERTYPUT,value);
  }
  public IRoomMessageDictionaryImpl(String progId) throws ComException {
    super(progId, "{603E2454-725A-4679-A6A8-363B21633CB2}");
  }
  protected IRoomMessageDictionaryImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IRoomMessageDictionaryImpl" + super.toString() + "]";
  }
}
