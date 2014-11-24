/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IUtilities.
 * IUtilities Interface 
 */
@CoInterface(guid="{87084018-7E74-4F92-AB39-1CF03188580E}")
public interface IUtilities extends IDispatch {
  @DeclDISPID(1610743808)  public INamedPropertyList CreateNamedPropertyList() throws ComException;
  @DeclDISPID(1610743809)  public Boolean getIsDefaultProvider() throws ComException;
  @DeclDISPID(1610743810)  public void SetAsDefaultProvider() throws ComException;
  @DeclDISPID(1610743811)  public Boolean CanInvoke(UtilitiesAction _utilitiesAction, Object _actionContext) throws ComException;
  @DeclDISPID(1610743812)  public void ShowPropertiesDialog(Object _context) throws ComException;
  @DeclDISPID(1610743813)  public IAsynchronousOperation AddToExternalContacts(IContact _contactContext, Object _utilitiesCallback, Object _state) throws ComException;
  @DeclDISPID(1610743814)  public IAsynchronousOperation FindPreviousConversations(Object _context, Object _utilitiesCallback, Object _state) throws ComException;
  @DeclDISPID(1610743815)  public IAsynchronousOperation ComposeEmail(Object _to, String _subject, Object _utilitiesCallback, Object _state) throws ComException;
  @DeclDISPID(1610743816)  public IAsynchronousOperation ScheduleMeeting(Object _paticipants, String _subject, Object _utilitiesCallback, Object _state) throws ComException;
}
