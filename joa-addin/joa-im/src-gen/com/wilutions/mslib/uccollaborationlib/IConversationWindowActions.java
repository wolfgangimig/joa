/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IConversationWindowActions.
 * IConversationWindowActions Interface 
 */
@CoInterface(guid="{663C61F4-A9DA-4A6F-A606-F142F665DF61}")
public interface IConversationWindowActions extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public void AddOfficePowerPointToConversation(final String _PowerPointFilePath, final String _OriginalPowerPointUrl) throws ComException;
  @DeclDISPID(1610743809)  public void AddOfficeOneNoteToConversation(final String _pageId) throws ComException;
  @DeclDISPID(1610743810)  public Boolean CanInvoke(final ConversationWindowAction _action) throws ComException;
}
