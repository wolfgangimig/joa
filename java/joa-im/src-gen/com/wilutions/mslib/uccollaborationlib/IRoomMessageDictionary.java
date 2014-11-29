/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IRoomMessageDictionary.
 * IRoomMessageDictionary Interface 
 */
@CoInterface(guid="{603E2454-725A-4679-A6A8-363B21633CB2}")
public interface IRoomMessageDictionary extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public Integer getCount() throws ComException;
  @DeclDISPID(0)  public Object getItem(final RoomMessageFormat _key) throws ComException;
  @DeclDISPID(0)  public void setItem(final RoomMessageFormat _key, final Object value2) throws ComException;
  @DeclDISPID(1610743811)  public void Add(final RoomMessageFormat _key, final Object _value) throws ComException;
  @DeclDISPID(1610743812)  public RoomMessageFormat[] getKeys() throws ComException;
  @DeclDISPID(1610743813)  public Object[] getValues() throws ComException;
  @DeclDISPID(1610743814)  public Boolean TryGetValue(final RoomMessageFormat _key, final ByRef<Object> _itemValue) throws ComException;
  @DeclDISPID(1610743815)  public RoomMessageFormat GetKeyAt(final Integer _index) throws ComException;
  @DeclDISPID(1610743816)  public Object GetValueAt(final Integer _index) throws ComException;
  @DeclDISPID(1610743817)  public Boolean ContainsKey(final RoomMessageFormat _key) throws ComException;
  @DeclDISPID(1610743818)  public void RemoveAt(final Integer _index) throws ComException;
  @DeclDISPID(1610743819)  public void Remove(final RoomMessageFormat _key) throws ComException;
  @DeclDISPID(1610743820)  public void RemoveAll() throws ComException;
  @DeclDISPID(1610743821)  public RoomMessageType getType() throws ComException;
  @DeclDISPID(1610743821)  public void setType(final RoomMessageType value) throws ComException;
  @DeclDISPID(1610743823)  public String getStoryTitle() throws ComException;
  @DeclDISPID(1610743823)  public void setStoryTitle(final String value) throws ComException;
}
