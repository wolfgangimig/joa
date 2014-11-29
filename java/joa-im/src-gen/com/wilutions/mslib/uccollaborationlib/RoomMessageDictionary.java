/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * RoomMessageDictionary.
 * RoomMessageDictionary class. 
 */
@CoClass(guid="{6C4DB7F3-3A3B-410C-944C-027289E79804}")
public class RoomMessageDictionary extends Dispatch implements IRoomMessageDictionary {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(0)  public Object getItem(RoomMessageFormat _key) throws ComException {
    assert(_key != null);
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_PROPERTYGET,null,_key.value);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(0)  public void setItem(RoomMessageFormat _key, Object value2) throws ComException {
    assert(value2 != null);
    assert(_key != null);
    this._dispatchCall(0,"Item", DISPATCH_PROPERTYPUT,value2,_key.value);
  }
  @DeclDISPID(1610743811)  public void Add(RoomMessageFormat _key, Object _value) throws ComException {
    assert(_key != null);
    assert(_value != null);
    this._dispatchCall(1610743811,"Add", DISPATCH_METHOD,null,_key.value,_value);
  }
  @DeclDISPID(1610743812)  public RoomMessageFormat[] getKeys() throws ComException {
    final Object obj = this._dispatchCall(1610743812,"Keys", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (RoomMessageFormat[])obj;
  }
  @DeclDISPID(1610743813)  public Object[] getValues() throws ComException {
    final Object obj = this._dispatchCall(1610743813,"Values", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object[])obj;
  }
  @DeclDISPID(1610743814)  public Boolean TryGetValue(RoomMessageFormat _key, ByRef<Object> _itemValue) throws ComException {
    assert(_key != null);
    assert(_itemValue != null);
    final Object obj = this._dispatchCall(1610743814,"TryGetValue", DISPATCH_METHOD,null,_key.value,_itemValue);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743815)  public RoomMessageFormat GetKeyAt(Integer _index) throws ComException {
    assert(_index != null);
    final Object obj = this._dispatchCall(1610743815,"GetKeyAt", DISPATCH_METHOD,null,_index);
    if (obj == null) return null;
    return RoomMessageFormat.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743816)  public Object GetValueAt(Integer _index) throws ComException {
    assert(_index != null);
    final Object obj = this._dispatchCall(1610743816,"GetValueAt", DISPATCH_METHOD,null,_index);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1610743817)  public Boolean ContainsKey(RoomMessageFormat _key) throws ComException {
    assert(_key != null);
    final Object obj = this._dispatchCall(1610743817,"ContainsKey", DISPATCH_METHOD,null,_key.value);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743818)  public void RemoveAt(Integer _index) throws ComException {
    assert(_index != null);
    this._dispatchCall(1610743818,"RemoveAt", DISPATCH_METHOD,null,_index);
  }
  @DeclDISPID(1610743819)  public void Remove(RoomMessageFormat _key) throws ComException {
    assert(_key != null);
    this._dispatchCall(1610743819,"Remove", DISPATCH_METHOD,null,_key.value);
  }
  @DeclDISPID(1610743820)  public void RemoveAll() throws ComException {
    this._dispatchCall(1610743820,"RemoveAll", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1610743821)  public RoomMessageType getType() throws ComException {
    final Object obj = this._dispatchCall(1610743821,"Type", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return RoomMessageType.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743821)  public void setType(RoomMessageType value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743821,"Type", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(1610743823)  public String getStoryTitle() throws ComException {
    final Object obj = this._dispatchCall(1610743823,"StoryTitle", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743823)  public void setStoryTitle(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743823,"StoryTitle", DISPATCH_PROPERTYPUT,value);
  }
  public RoomMessageDictionary() throws ComException {
    super("{6C4DB7F3-3A3B-410C-944C-027289E79804}", "{603E2454-725A-4679-A6A8-363B21633CB2}");
  }
  protected RoomMessageDictionary(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[RoomMessageDictionary" + super.toString() + "]";
  }
}
