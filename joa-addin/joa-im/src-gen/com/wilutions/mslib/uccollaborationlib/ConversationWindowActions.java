/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ConversationWindowActions.
 * ConversationWindowActions Class 
 */
@CoClass(guid="{85147550-4A7B-4B36-8FB5-144B5087A299}")
public class ConversationWindowActions extends Dispatch implements IConversationWindowActions {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public void AddOfficePowerPointToConversation(final String _PowerPointFilePath, final String _OriginalPowerPointUrl) throws ComException {
    assert(_PowerPointFilePath != null);
    assert(_OriginalPowerPointUrl != null);
    this._dispatchCall(1610743808,"AddOfficePowerPointToConversation", DISPATCH_METHOD,null,_PowerPointFilePath,_OriginalPowerPointUrl);
  }
  @DeclDISPID(1610743809)  public void AddOfficeOneNoteToConversation(final String _pageId) throws ComException {
    assert(_pageId != null);
    this._dispatchCall(1610743809,"AddOfficeOneNoteToConversation", DISPATCH_METHOD,null,_pageId);
  }
  @DeclDISPID(1610743810)  public Boolean CanInvoke(final ConversationWindowAction _action) throws ComException {
    assert(_action != null);
    final Object obj = this._dispatchCall(1610743810,"CanInvoke", DISPATCH_METHOD,null,_action.value);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  public ConversationWindowActions() throws ComException {
    super("{85147550-4A7B-4B36-8FB5-144B5087A299}", "{663C61F4-A9DA-4A6F-A606-F142F665DF61}");
  }
  protected ConversationWindowActions(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ConversationWindowActions" + super.toString() + "]";
  }
}
