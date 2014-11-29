/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IAsynchronousOperation.
 * IAsynchronousOperation Interface 
 */
@CoInterface(guid="{F7EE956B-A713-48D3-AFEF-0A28F37740B3}")
public interface IAsynchronousOperation extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public Object getAsyncState() throws ComException;
  @DeclDISPID(1610743809)  public Integer getStatusCode() throws ComException;
  @DeclDISPID(1610743810)  public Boolean getIsCompleted() throws ComException;
  @DeclDISPID(1610743811)  public Boolean getIsSucceeded() throws ComException;
  @DeclDISPID(1610743812)  public Boolean getIsCancelable() throws ComException;
  @DeclDISPID(1610743813)  public Integer getDiagnosticCode() throws ComException;
  @DeclDISPID(1610743814)  public void CancelOperation() throws ComException;
}
