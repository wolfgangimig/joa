/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{30200891-E728-92B3-25E0-6C863B499711}")
public class ICredentialRequestedEventDataImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.ICredentialRequestedEventData {
  @DeclDISPID(1610743808)  public com.wilutions.mslib.uccollaborationlib.CredentialRequestedType getType() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Type", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.CredentialRequestedType.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743809)  public String getUserName() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"UserName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743810)  public Boolean getCanSavePassword() throws ComException {
    final Object obj = this._dispatchCall(1610743810,"CanSavePassword", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743811)  public Boolean getIsPasswordSaved() throws ComException {
    final Object obj = this._dispatchCall(1610743811,"IsPasswordSaved", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743812)  public void Submit(String _domainAndUsername, String _password, Boolean _savePassword) throws ComException {
    assert(_domainAndUsername != null);
    assert(_password != null);
    assert(_savePassword != null);
    this._dispatchCall(1610743812,"Submit", DISPATCH_METHOD,null,_domainAndUsername,_password,_savePassword);
  }
  @DeclDISPID(1610743813)  public void Cancel(Boolean _cancelForWholeSession) throws ComException {
    assert(_cancelForWholeSession != null);
    this._dispatchCall(1610743813,"Cancel", DISPATCH_METHOD,null,_cancelForWholeSession);
  }
  @DeclDISPID(1610743814)  public com.wilutions.mslib.uccollaborationlib.CredentialRequestResult getCredentialRequestResult() throws ComException {
    final Object obj = this._dispatchCall(1610743814,"CredentialRequestResult", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.CredentialRequestResult.valueOf((Integer)obj);
  }
  public ICredentialRequestedEventDataImpl(String progId) throws ComException {
    super(progId, "{F0B791FA-434B-49F2-B84E-05619EBE6BEB}");
  }
  protected ICredentialRequestedEventDataImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ICredentialRequestedEventDataImpl" + super.toString() + "]";
  }
}
