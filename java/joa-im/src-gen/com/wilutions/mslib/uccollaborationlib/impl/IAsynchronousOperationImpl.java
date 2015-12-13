/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{37790C00-0370-9392-3241-63CF5680BC49}")
public class IAsynchronousOperationImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation {
  @DeclDISPID(1610743808)  public Object getAsyncState() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"AsyncState", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1610743809)  public Integer getStatusCode() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"StatusCode", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610743810)  public Boolean getIsCompleted() throws ComException {
    final Object obj = this._dispatchCall(1610743810,"IsCompleted", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743811)  public Boolean getIsSucceeded() throws ComException {
    final Object obj = this._dispatchCall(1610743811,"IsSucceeded", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743812)  public Boolean getIsCancelable() throws ComException {
    final Object obj = this._dispatchCall(1610743812,"IsCancelable", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743813)  public Integer getDiagnosticCode() throws ComException {
    final Object obj = this._dispatchCall(1610743813,"DiagnosticCode", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610743814)  public void CancelOperation() throws ComException {
    this._dispatchCall(1610743814,"CancelOperation", DISPATCH_METHOD,null);
  }
  public IAsynchronousOperationImpl(String progId) throws ComException {
    super(progId, "{F7EE956B-A713-48D3-AFEF-0A28F37740B3}");
  }
  protected IAsynchronousOperationImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IAsynchronousOperationImpl" + super.toString() + "]";
  }
}
