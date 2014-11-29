/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * ILicWizExternal.
 * 
 */
@CoInterface(guid="{4CAC6328-B9B0-11D3-8D59-0050048384E3}")
public interface ILicWizExternal extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1)  public void PrintHtmlDocument(final Object punkHtmlDoc) throws ComException;
  @DeclDISPID(2)  public void InvokeDateTimeApplet() throws ComException;
  @DeclDISPID(3)  public String FormatDate(final java.util.Date date, final String pFormat) throws ComException;
  @DeclDISPID(4)  public void ShowHelp(final Object pvarId) throws ComException;
  @DeclDISPID(5)  public void Terminate() throws ComException;
  @DeclDISPID(6)  public void DisableVORWReminder(final Integer BPC) throws ComException;
  @DeclDISPID(7)  public String SaveReceipt(final String bstrReceipt) throws ComException;
  @DeclDISPID(8)  public void OpenInDefaultBrowser(final String bstrUrl) throws ComException;
  @DeclDISPID(9)  public Integer MsoAlert(final String bstrText, final String bstrButtons, final String bstrIcon) throws ComException;
  @DeclDISPID(10)  public Integer DepositPidKey(final String bstrKey, final Integer fMORW) throws ComException;
  @DeclDISPID(11)  public void WriteLog(final String bstrMessage) throws ComException;
  @DeclDISPID(12)  public void ResignDpc(final String bstrProductCode) throws ComException;
  @DeclDISPID(13)  public void ResetPID() throws ComException;
  @DeclDISPID(14)  public void SetDialogSize(final Integer dx, final Integer dy) throws ComException;
  @DeclDISPID(15)  public Integer VerifyClock(final Integer lMode) throws ComException;
  @DeclDISPID(16)  public void SortSelectOptions(final IDispatch pdispSelect) throws ComException;
  @DeclDISPID(17)  public void InternetDisconnect() throws ComException;
  @DeclDISPID(18)  public Integer GetConnectedState() throws ComException;
  @DeclDISPID(20)  public Integer getContext() throws ComException;
  @DeclDISPID(21)  public IDispatch getValidator() throws ComException;
  @DeclDISPID(22)  public IDispatch getLicAgent() throws ComException;
  @DeclDISPID(23)  public String getCountryInfo() throws ComException;
  @DeclDISPID(24)  public void setWizardVisible(final Integer value) throws ComException;
  @DeclDISPID(25)  public void setWizardTitle(final String value) throws ComException;
  @DeclDISPID(26)  public Integer getAnimationEnabled() throws ComException;
  @DeclDISPID(27)  public void setCurrentHelpId(final Integer value) throws ComException;
  @DeclDISPID(28)  public String getOfficeOnTheWebUrl() throws ComException;
}
