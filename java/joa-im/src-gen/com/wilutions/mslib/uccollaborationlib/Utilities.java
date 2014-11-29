/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * Utilities.
 * Utilities Class 
 */
@CoClass(guid="{B5B1FF8F-3F61-4EA5-A339-D94FDFAF15E1}")
public class Utilities extends Dispatch implements IUtilities {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public INamedPropertyList CreateNamedPropertyList() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"CreateNamedPropertyList", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.INamedPropertyListImpl.class);
  }
  @DeclDISPID(1610743809)  public Boolean getIsDefaultProvider() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"IsDefaultProvider", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743810)  public void SetAsDefaultProvider() throws ComException {
    this._dispatchCall(1610743810,"SetAsDefaultProvider", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1610743811)  public Boolean CanInvoke(final UtilitiesAction _utilitiesAction, final Object _actionContext) throws ComException {
    assert(_utilitiesAction != null);
    assert(_actionContext != null);
    final Object obj = this._dispatchCall(1610743811,"CanInvoke", DISPATCH_METHOD,null,_utilitiesAction.value,_actionContext);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743812)  public void ShowPropertiesDialog(final Object _context) throws ComException {
    assert(_context != null);
    this._dispatchCall(1610743812,"ShowPropertiesDialog", DISPATCH_METHOD,null,_context);
  }
  @DeclDISPID(1610743813)  public IAsynchronousOperation AddToExternalContacts(final IContact _contactContext, final Object _utilitiesCallback, final Object _state) throws ComException {
    assert(_utilitiesCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743813,"AddToExternalContacts", DISPATCH_METHOD,null,(_contactContext!=null?_contactContext:Dispatch.NULL),_utilitiesCallback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743814)  public IAsynchronousOperation FindPreviousConversations(final Object _context, final Object _utilitiesCallback, final Object _state) throws ComException {
    assert(_context != null);
    assert(_utilitiesCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743814,"FindPreviousConversations", DISPATCH_METHOD,null,_context,_utilitiesCallback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743815)  public IAsynchronousOperation ComposeEmail(final Object _to, final String _subject, final Object _utilitiesCallback, final Object _state) throws ComException {
    assert(_to != null);
    assert(_subject != null);
    assert(_utilitiesCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743815,"ComposeEmail", DISPATCH_METHOD,null,_to,_subject,_utilitiesCallback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743816)  public IAsynchronousOperation ScheduleMeeting(final Object _paticipants, final String _subject, final Object _utilitiesCallback, final Object _state) throws ComException {
    assert(_paticipants != null);
    assert(_subject != null);
    assert(_utilitiesCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743816,"ScheduleMeeting", DISPATCH_METHOD,null,_paticipants,_subject,_utilitiesCallback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  public Utilities() throws ComException {
    super("{B5B1FF8F-3F61-4EA5-A339-D94FDFAF15E1}", "{87084018-7E74-4F92-AB39-1CF03188580E}");
  }
  protected Utilities(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[Utilities" + super.toString() + "]";
  }
}
