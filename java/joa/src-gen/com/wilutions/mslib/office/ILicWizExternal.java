/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * ILicWizExternal.
 * 
 */
@CoInterface(guid="{4CAC6328-B9B0-11D3-8D59-0050048384E3}")
public interface ILicWizExternal extends IDispatch {
  @DeclDISPID(1)  public void PrintHtmlDocument(Object punkHtmlDoc) throws ComException;
  @DeclDISPID(2)  public void InvokeDateTimeApplet() throws ComException;
  @DeclDISPID(3)  public String FormatDate(java.util.Date date, String pFormat) throws ComException;
  @DeclDISPID(4)  public void ShowHelp(Object pvarId) throws ComException;
  @DeclDISPID(5)  public void Terminate() throws ComException;
  @DeclDISPID(6)  public void DisableVORWReminder(Integer BPC) throws ComException;
  @DeclDISPID(7)  public String SaveReceipt(String bstrReceipt) throws ComException;
  @DeclDISPID(8)  public void OpenInDefaultBrowser(String bstrUrl) throws ComException;
  @DeclDISPID(9)  public Integer MsoAlert(String bstrText, String bstrButtons, String bstrIcon) throws ComException;
  @DeclDISPID(10)  public Integer DepositPidKey(String bstrKey, Integer fMORW) throws ComException;
  @DeclDISPID(11)  public void WriteLog(String bstrMessage) throws ComException;
  @DeclDISPID(12)  public void ResignDpc(String bstrProductCode) throws ComException;
  @DeclDISPID(13)  public void ResetPID() throws ComException;
  @DeclDISPID(14)  public void SetDialogSize(Integer dx, Integer dy) throws ComException;
  @DeclDISPID(15)  public Integer VerifyClock(Integer lMode) throws ComException;
  @DeclDISPID(16)  public void SortSelectOptions(Dispatch pdispSelect) throws ComException;
  @DeclDISPID(17)  public void InternetDisconnect() throws ComException;
  @DeclDISPID(18)  public Integer GetConnectedState() throws ComException;
  @DeclDISPID(20)  public Integer getContext() throws ComException;
  @DeclDISPID(21)  public Dispatch getValidator() throws ComException;
  @DeclDISPID(22)  public Dispatch getLicAgent() throws ComException;
  @DeclDISPID(23)  public String getCountryInfo() throws ComException;
  @DeclDISPID(24)  public void setWizardVisible(Integer value) throws ComException;
  @DeclDISPID(25)  public void setWizardTitle(String value) throws ComException;
  @DeclDISPID(26)  public Integer getAnimationEnabled() throws ComException;
  @DeclDISPID(27)  public void setCurrentHelpId(Integer value) throws ComException;
  @DeclDISPID(28)  public String getOfficeOnTheWebUrl() throws ComException;
}
