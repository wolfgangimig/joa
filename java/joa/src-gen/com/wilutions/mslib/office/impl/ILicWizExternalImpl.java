/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{8C3BFA43-1DD3-CA92-10F7-69B7A1747819}")
public class ILicWizExternalImpl extends Dispatch implements com.wilutions.mslib.office.ILicWizExternal {
  @DeclDISPID(1)  public void PrintHtmlDocument(final Object punkHtmlDoc) throws ComException {
    assert(punkHtmlDoc != null);
    this._dispatchCall(1,"PrintHtmlDocument", DISPATCH_METHOD,null,punkHtmlDoc);
  }
  @DeclDISPID(2)  public void InvokeDateTimeApplet() throws ComException {
    this._dispatchCall(2,"InvokeDateTimeApplet", DISPATCH_METHOD,null);
  }
  @DeclDISPID(3)  public String FormatDate(final java.util.Date date, final String pFormat) throws ComException {
    assert(date != null);
    assert(pFormat != null);
    final Object obj = this._dispatchCall(3,"FormatDate", DISPATCH_METHOD,null,date,pFormat);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(4)  public void ShowHelp(final Object pvarId) throws ComException {
    assert(pvarId != null);
    this._dispatchCall(4,"ShowHelp", DISPATCH_METHOD,null,pvarId);
  }
  @DeclDISPID(5)  public void Terminate() throws ComException {
    this._dispatchCall(5,"Terminate", DISPATCH_METHOD,null);
  }
  @DeclDISPID(6)  public void DisableVORWReminder(final Integer BPC) throws ComException {
    assert(BPC != null);
    this._dispatchCall(6,"DisableVORWReminder", DISPATCH_METHOD,null,BPC);
  }
  @DeclDISPID(7)  public String SaveReceipt(final String bstrReceipt) throws ComException {
    assert(bstrReceipt != null);
    final Object obj = this._dispatchCall(7,"SaveReceipt", DISPATCH_METHOD,null,bstrReceipt);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(8)  public void OpenInDefaultBrowser(final String bstrUrl) throws ComException {
    assert(bstrUrl != null);
    this._dispatchCall(8,"OpenInDefaultBrowser", DISPATCH_METHOD,null,bstrUrl);
  }
  @DeclDISPID(9)  public Integer MsoAlert(final String bstrText, final String bstrButtons, final String bstrIcon) throws ComException {
    assert(bstrText != null);
    assert(bstrButtons != null);
    assert(bstrIcon != null);
    final Object obj = this._dispatchCall(9,"MsoAlert", DISPATCH_METHOD,null,bstrText,bstrButtons,bstrIcon);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(10)  public Integer DepositPidKey(final String bstrKey, final Integer fMORW) throws ComException {
    assert(bstrKey != null);
    assert(fMORW != null);
    final Object obj = this._dispatchCall(10,"DepositPidKey", DISPATCH_METHOD,null,bstrKey,fMORW);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(11)  public void WriteLog(final String bstrMessage) throws ComException {
    assert(bstrMessage != null);
    this._dispatchCall(11,"WriteLog", DISPATCH_METHOD,null,bstrMessage);
  }
  @DeclDISPID(12)  public void ResignDpc(final String bstrProductCode) throws ComException {
    assert(bstrProductCode != null);
    this._dispatchCall(12,"ResignDpc", DISPATCH_METHOD,null,bstrProductCode);
  }
  @DeclDISPID(13)  public void ResetPID() throws ComException {
    this._dispatchCall(13,"ResetPID", DISPATCH_METHOD,null);
  }
  @DeclDISPID(14)  public void SetDialogSize(final Integer dx, final Integer dy) throws ComException {
    assert(dx != null);
    assert(dy != null);
    this._dispatchCall(14,"SetDialogSize", DISPATCH_METHOD,null,dx,dy);
  }
  @DeclDISPID(15)  public Integer VerifyClock(final Integer lMode) throws ComException {
    assert(lMode != null);
    final Object obj = this._dispatchCall(15,"VerifyClock", DISPATCH_METHOD,null,lMode);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(16)  public void SortSelectOptions(final IDispatch pdispSelect) throws ComException {
    this._dispatchCall(16,"SortSelectOptions", DISPATCH_METHOD,null,Dispatch.param(pdispSelect));
  }
  @DeclDISPID(17)  public void InternetDisconnect() throws ComException {
    this._dispatchCall(17,"InternetDisconnect", DISPATCH_METHOD,null);
  }
  @DeclDISPID(18)  public Integer GetConnectedState() throws ComException {
    final Object obj = this._dispatchCall(18,"GetConnectedState", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(20)  public Integer getContext() throws ComException {
    final Object obj = this._dispatchCall(20,"Context", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(21)  public IDispatch getValidator() throws ComException {
    final Object obj = this._dispatchCall(21,"Validator", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(22)  public IDispatch getLicAgent() throws ComException {
    final Object obj = this._dispatchCall(22,"LicAgent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(23)  public String getCountryInfo() throws ComException {
    final Object obj = this._dispatchCall(23,"CountryInfo", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(24)  public void setWizardVisible(final Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(24,"WizardVisible", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(25)  public void setWizardTitle(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(25,"WizardTitle", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(26)  public Integer getAnimationEnabled() throws ComException {
    final Object obj = this._dispatchCall(26,"AnimationEnabled", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(27)  public void setCurrentHelpId(final Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(27,"CurrentHelpId", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(28)  public String getOfficeOnTheWebUrl() throws ComException {
    final Object obj = this._dispatchCall(28,"OfficeOnTheWebUrl", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  public ILicWizExternalImpl(String progId) throws ComException {
    super(progId, "{4CAC6328-B9B0-11D3-8D59-0050048384E3}");
  }
  protected ILicWizExternalImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ILicWizExternalImpl" + super.toString() + "]";
  }
}
