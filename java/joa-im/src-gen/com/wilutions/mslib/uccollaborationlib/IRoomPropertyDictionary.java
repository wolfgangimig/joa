/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IRoomPropertyDictionary.
 * IRoomPropertyDictionary Interface 
 */
@CoInterface(guid="{7BF20B14-58D1-494B-B301-9B16BACC9610}")
public interface IRoomPropertyDictionary extends IDispatch {
  @DeclDISPID(1610743808)  public Integer getCount() throws ComException;
  @DeclDISPID(0)  public Object getItem(RoomProperty _propertyType) throws ComException;
  @DeclDISPID(1610743810)  public RoomProperty[] getKeys() throws ComException;
  @DeclDISPID(1610743811)  public Object[] getValues() throws ComException;
  @DeclDISPID(1610743812)  public Boolean TryGetValue(RoomProperty _propertyType, ByRef<Object> _itemValue) throws ComException;
  @DeclDISPID(1610743813)  public RoomProperty GetKeyAt(Integer _index) throws ComException;
  @DeclDISPID(1610743814)  public Object GetValueAt(Integer _index) throws ComException;
  @DeclDISPID(1610743815)  public Boolean ContainsKey(RoomProperty _propertyType) throws ComException;
}
