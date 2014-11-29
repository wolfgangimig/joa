/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IUtilities.
 * IUtilities Interface 
 */
@CoInterface(guid="{87084018-7E74-4F92-AB39-1CF03188580E}")
public interface IUtilities extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public INamedPropertyList CreateNamedPropertyList() throws ComException;
  @DeclDISPID(1610743809)  public Boolean getIsDefaultProvider() throws ComException;
  @DeclDISPID(1610743810)  public void SetAsDefaultProvider() throws ComException;
  @DeclDISPID(1610743811)  public Boolean CanInvoke(final UtilitiesAction _utilitiesAction, final Object _actionContext) throws ComException;
  @DeclDISPID(1610743812)  public void ShowPropertiesDialog(final Object _context) throws ComException;
  @DeclDISPID(1610743813)  public IAsynchronousOperation AddToExternalContacts(final IContact _contactContext, final Object _utilitiesCallback, final Object _state) throws ComException;
  @DeclDISPID(1610743814)  public IAsynchronousOperation FindPreviousConversations(final Object _context, final Object _utilitiesCallback, final Object _state) throws ComException;
  @DeclDISPID(1610743815)  public IAsynchronousOperation ComposeEmail(final Object _to, final String _subject, final Object _utilitiesCallback, final Object _state) throws ComException;
  @DeclDISPID(1610743816)  public IAsynchronousOperation ScheduleMeeting(final Object _paticipants, final String _subject, final Object _utilitiesCallback, final Object _state) throws ComException;
}
