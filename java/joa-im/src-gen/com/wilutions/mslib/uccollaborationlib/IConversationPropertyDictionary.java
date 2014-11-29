/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IConversationPropertyDictionary.
 * IConversationPropertyDictionary Interface 
 */
@CoInterface(guid="{00E22CBB-3170-453A-AE62-EAFBC75A9F8D}")
public interface IConversationPropertyDictionary extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public Integer getCount() throws ComException;
  @DeclDISPID(0)  public Object getItem(final ConversationProperty _propertyType) throws ComException;
  @DeclDISPID(1610743810)  public ConversationProperty[] getKeys() throws ComException;
  @DeclDISPID(1610743811)  public Object[] getValues() throws ComException;
  @DeclDISPID(1610743812)  public Boolean TryGetValue(final ConversationProperty _propertyType, final ByRef<Object> _itemValue) throws ComException;
  @DeclDISPID(1610743813)  public ConversationProperty GetKeyAt(final Integer _index) throws ComException;
  @DeclDISPID(1610743814)  public Object GetValueAt(final Integer _index) throws ComException;
  @DeclDISPID(1610743815)  public Boolean ContainsKey(final ConversationProperty _propertyType) throws ComException;
}
