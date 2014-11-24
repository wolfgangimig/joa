/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{479FD973-DA17-94D3-3697-7517947FA4F4}")
public class IUtilitiesImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IUtilities {
  @DeclDISPID(1610743808)  public com.wilutions.mslib.uccollaborationlib.INamedPropertyList CreateNamedPropertyList() throws ComException {
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
  @DeclDISPID(1610743811)  public Boolean CanInvoke(com.wilutions.mslib.uccollaborationlib.UtilitiesAction _utilitiesAction, Object _actionContext) throws ComException {
    assert(_utilitiesAction != null);
    assert(_actionContext != null);
    final Object obj = this._dispatchCall(1610743811,"CanInvoke", DISPATCH_METHOD,null,_utilitiesAction.value,_actionContext);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743812)  public void ShowPropertiesDialog(Object _context) throws ComException {
    assert(_context != null);
    this._dispatchCall(1610743812,"ShowPropertiesDialog", DISPATCH_METHOD,null,_context);
  }
  @DeclDISPID(1610743813)  public com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation AddToExternalContacts(com.wilutions.mslib.uccollaborationlib.IContact _contactContext, Object _utilitiesCallback, Object _state) throws ComException {
    assert(_utilitiesCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743813,"AddToExternalContacts", DISPATCH_METHOD,null,(_contactContext!=null?_contactContext:Dispatch.NULL),_utilitiesCallback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743814)  public com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation FindPreviousConversations(Object _context, Object _utilitiesCallback, Object _state) throws ComException {
    assert(_context != null);
    assert(_utilitiesCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743814,"FindPreviousConversations", DISPATCH_METHOD,null,_context,_utilitiesCallback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743815)  public com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation ComposeEmail(Object _to, String _subject, Object _utilitiesCallback, Object _state) throws ComException {
    assert(_to != null);
    assert(_subject != null);
    assert(_utilitiesCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743815,"ComposeEmail", DISPATCH_METHOD,null,_to,_subject,_utilitiesCallback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743816)  public com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation ScheduleMeeting(Object _paticipants, String _subject, Object _utilitiesCallback, Object _state) throws ComException {
    assert(_paticipants != null);
    assert(_subject != null);
    assert(_utilitiesCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743816,"ScheduleMeeting", DISPATCH_METHOD,null,_paticipants,_subject,_utilitiesCallback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  public IUtilitiesImpl(String progId) throws ComException {
    super(progId, "{87084018-7E74-4F92-AB39-1CF03188580E}");
  }
  protected IUtilitiesImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IUtilitiesImpl" + super.toString() + "]";
  }
}
