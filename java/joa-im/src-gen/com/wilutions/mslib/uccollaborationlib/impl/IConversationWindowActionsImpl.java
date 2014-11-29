/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{A6ABF89F-0DB9-912E-3BA8-98A55392239B}")
public class IConversationWindowActionsImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IConversationWindowActions {
  @DeclDISPID(1610743808)  public void AddOfficePowerPointToConversation(final String _PowerPointFilePath, final String _OriginalPowerPointUrl) throws ComException {
    assert(_PowerPointFilePath != null);
    assert(_OriginalPowerPointUrl != null);
    this._dispatchCall(1610743808,"AddOfficePowerPointToConversation", DISPATCH_METHOD,null,_PowerPointFilePath,_OriginalPowerPointUrl);
  }
  @DeclDISPID(1610743809)  public void AddOfficeOneNoteToConversation(final String _pageId) throws ComException {
    assert(_pageId != null);
    this._dispatchCall(1610743809,"AddOfficeOneNoteToConversation", DISPATCH_METHOD,null,_pageId);
  }
  @DeclDISPID(1610743810)  public Boolean CanInvoke(final com.wilutions.mslib.uccollaborationlib.ConversationWindowAction _action) throws ComException {
    assert(_action != null);
    final Object obj = this._dispatchCall(1610743810,"CanInvoke", DISPATCH_METHOD,null,_action.value);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  public IConversationWindowActionsImpl(String progId) throws ComException {
    super(progId, "{663C61F4-A9DA-4A6F-A606-F142F665DF61}");
  }
  protected IConversationWindowActionsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IConversationWindowActionsImpl" + super.toString() + "]";
  }
}
