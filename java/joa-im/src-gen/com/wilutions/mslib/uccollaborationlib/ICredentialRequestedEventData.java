/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ICredentialRequestedEventData.
 * ICredentialRequestEventData Interface 
 */
@CoInterface(guid="{F0B791FA-434B-49F2-B84E-05619EBE6BEB}")
public interface ICredentialRequestedEventData extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public CredentialRequestedType getType() throws ComException;
  @DeclDISPID(1610743809)  public String getUserName() throws ComException;
  @DeclDISPID(1610743810)  public Boolean getCanSavePassword() throws ComException;
  @DeclDISPID(1610743811)  public Boolean getIsPasswordSaved() throws ComException;
  @DeclDISPID(1610743812)  public void Submit(String _domainAndUsername, String _password, Boolean _savePassword) throws ComException;
  @DeclDISPID(1610743813)  public void Cancel(Boolean _cancelForWholeSession) throws ComException;
  @DeclDISPID(1610743814)  public CredentialRequestResult getCredentialRequestResult() throws ComException;
}
