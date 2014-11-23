/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IConversationStateChangePropertyDictionary.
 * IConversationStateChangePropertyDictionary Interface 
 */
@CoInterface(guid="{56F7DEC0-59CA-47C6-9F35-D5066A702B39}")
public interface IConversationStateChangePropertyDictionary extends IDispatch {
  @DeclDISPID(1610743808)  public Integer getCount() throws ComException;
  @DeclDISPID(0)  public Object getItem(ConversationStateChangeProperty _modalityType) throws ComException;
  @DeclDISPID(1610743810)  public ConversationStateChangeProperty[] getKeys() throws ComException;
  @DeclDISPID(1610743811)  public Object[] getValues() throws ComException;
  @DeclDISPID(1610743812)  public Boolean TryGetValue(ConversationStateChangeProperty _propertyType, ByRef<Object> _itemValue) throws ComException;
  @DeclDISPID(1610743813)  public ConversationStateChangeProperty GetKeyAt(Integer _index) throws ComException;
  @DeclDISPID(1610743814)  public Object GetValueAt(Integer _index) throws ComException;
  @DeclDISPID(1610743815)  public Boolean ContainsKey(ConversationStateChangeProperty _propertyType) throws ComException;
}
