/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IConversationContextCollection.
 * IConversationContextCollection Interface 
 */
@CoInterface(guid="{8A88C016-AA5D-4EAE-9C79-7AA5C360ED76}")
public interface IConversationContextCollection extends IDispatch {
  @DeclDISPID(1610743808)  public Integer getCount() throws ComException;
  @DeclDISPID(0)  public IConversationContext getItem(Integer _index) throws ComException;
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException;
}
