/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * IMsoEServicesDialog.
 * 
 */
@CoInterface(guid="{000C0372-0000-0000-C000-000000000046}")
public interface IMsoEServicesDialog extends IDispatch {
  @DeclDISPID(1610743808)  public void Close(Boolean ApplyWebComponentChanges) throws ComException;
  @DeclDISPID(1610743809)  public void AddTrustedDomain(String Domain) throws ComException;
  @DeclDISPID(1610743810)  public String getApplicationName() throws ComException;
  @DeclDISPID(1610743811)  public Dispatch getApplication() throws ComException;
  @DeclDISPID(1610743812)  public Dispatch getWebComponent() throws ComException;
  @DeclDISPID(1610743813)  public Dispatch getClipArt() throws ComException;
}
