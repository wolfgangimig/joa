/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IRoomMessageDictionary.
 * IRoomMessageDictionary Interface 
 */
@CoInterface(guid="{603E2454-725A-4679-A6A8-363B21633CB2}")
public interface IRoomMessageDictionary extends IDispatch {
  @DeclDISPID(1610743808)  public Integer getCount() throws ComException;
  @DeclDISPID(0)  public Object getItem(RoomMessageFormat _key) throws ComException;
  @DeclDISPID(0)  public void setItem(RoomMessageFormat _key, Object value2) throws ComException;
  @DeclDISPID(1610743811)  public void Add(RoomMessageFormat _key, Object _value) throws ComException;
  @DeclDISPID(1610743812)  public RoomMessageFormat[] getKeys() throws ComException;
  @DeclDISPID(1610743813)  public Object[] getValues() throws ComException;
  @DeclDISPID(1610743814)  public Boolean TryGetValue(RoomMessageFormat _key, ByRef<Object> _itemValue) throws ComException;
  @DeclDISPID(1610743815)  public RoomMessageFormat GetKeyAt(Integer _index) throws ComException;
  @DeclDISPID(1610743816)  public Object GetValueAt(Integer _index) throws ComException;
  @DeclDISPID(1610743817)  public Boolean ContainsKey(RoomMessageFormat _key) throws ComException;
  @DeclDISPID(1610743818)  public void RemoveAt(Integer _index) throws ComException;
  @DeclDISPID(1610743819)  public void Remove(RoomMessageFormat _key) throws ComException;
  @DeclDISPID(1610743820)  public void RemoveAll() throws ComException;
  @DeclDISPID(1610743821)  public RoomMessageType getType() throws ComException;
  @DeclDISPID(1610743821)  public void setType(RoomMessageType value) throws ComException;
  @DeclDISPID(1610743823)  public String getStoryTitle() throws ComException;
  @DeclDISPID(1610743823)  public void setStoryTitle(String value) throws ComException;
}
