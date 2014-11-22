/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9A19-A463-DB41-5DAE-69E7A5F7FCBC}")
public class IMsoEServicesDialogImpl extends Dispatch implements com.wilutions.mslib.office.IMsoEServicesDialog {
  @DeclDISPID(1610743808)  public void Close(Boolean ApplyWebComponentChanges) throws ComException {
    assert(ApplyWebComponentChanges != null);
    this._dispatchCall(1610743808,"Close", DISPATCH_METHOD,null,ApplyWebComponentChanges);
  }
  @DeclDISPID(1610743809)  public void AddTrustedDomain(String Domain) throws ComException {
    assert(Domain != null);
    this._dispatchCall(1610743809,"AddTrustedDomain", DISPATCH_METHOD,null,Domain);
  }
  @DeclDISPID(1610743810)  public String getApplicationName() throws ComException {
    final Object obj = this._dispatchCall(1610743810,"ApplicationName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743811)  public Dispatch getApplication() throws ComException {
    final Object obj = this._dispatchCall(1610743811,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(1610743812)  public Dispatch getWebComponent() throws ComException {
    final Object obj = this._dispatchCall(1610743812,"WebComponent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(1610743813)  public Dispatch getClipArt() throws ComException {
    final Object obj = this._dispatchCall(1610743813,"ClipArt", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  public IMsoEServicesDialogImpl(String progId) throws ComException {
    super(progId, "{000C0372-0000-0000-C000-000000000046}");
  }
  protected IMsoEServicesDialogImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IMsoEServicesDialogImpl" + super.toString() + "]";
  }
}
