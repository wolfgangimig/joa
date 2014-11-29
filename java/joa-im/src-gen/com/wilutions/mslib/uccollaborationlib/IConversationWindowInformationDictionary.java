/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IConversationWindowInformationDictionary.
 * IConversationWindowInformationDictionary Interface 
 */
@CoInterface(guid="{109D32CE-E09F-46F5-9ECB-01E1D273B7DA}")
public interface IConversationWindowInformationDictionary extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public Integer getCount() throws ComException;
  @DeclDISPID(0)  public Object getItem(ConversationWindowInformationType _key) throws ComException;
  @DeclDISPID(1610743810)  public ConversationWindowInformationType[] getKeys() throws ComException;
  @DeclDISPID(1610743811)  public Object[] getValues() throws ComException;
  @DeclDISPID(1610743812)  public Boolean TryGetValue(ConversationWindowInformationType _key, ByRef<Object> _itemValue) throws ComException;
  @DeclDISPID(1610743813)  public ConversationWindowInformationType GetKeyAt(Integer _index) throws ComException;
  @DeclDISPID(1610743814)  public Object GetValueAt(Integer _index) throws ComException;
  @DeclDISPID(1610743815)  public Boolean ContainsKey(ConversationWindowInformationType _key) throws ComException;
}
