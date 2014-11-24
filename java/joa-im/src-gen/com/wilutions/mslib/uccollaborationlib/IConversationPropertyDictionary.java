/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IConversationPropertyDictionary.
 * IConversationPropertyDictionary Interface 
 */
@CoInterface(guid="{00E22CBB-3170-453A-AE62-EAFBC75A9F8D}")
public interface IConversationPropertyDictionary extends IDispatch {
  @DeclDISPID(1610743808)  public Integer getCount() throws ComException;
  @DeclDISPID(0)  public Object getItem(ConversationProperty _propertyType) throws ComException;
  @DeclDISPID(1610743810)  public ConversationProperty[] getKeys() throws ComException;
  @DeclDISPID(1610743811)  public Object[] getValues() throws ComException;
  @DeclDISPID(1610743812)  public Boolean TryGetValue(ConversationProperty _propertyType, ByRef<Object> _itemValue) throws ComException;
  @DeclDISPID(1610743813)  public ConversationProperty GetKeyAt(Integer _index) throws ComException;
  @DeclDISPID(1610743814)  public Object GetValueAt(Integer _index) throws ComException;
  @DeclDISPID(1610743815)  public Boolean ContainsKey(ConversationProperty _propertyType) throws ComException;
}
