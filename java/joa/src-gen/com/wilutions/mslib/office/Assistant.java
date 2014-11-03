/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * Assistant.
 * 
 */
@CoInterface(guid="{000C0322-0000-0000-C000-000000000046}")
public interface Assistant extends IDispatch {
  @DeclDISPID(1610743808)  public Dispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(1610809344)  public Dispatch getParent() throws ComException;
  @DeclDISPID(1610809345)  public void Move(Integer xLeft, Integer yTop) throws ComException;
  @DeclDISPID(1610809346)  public void setTop(Integer value) throws ComException;
  @DeclDISPID(1610809346)  public Integer getTop() throws ComException;
  @DeclDISPID(1610809348)  public void setLeft(Integer value) throws ComException;
  @DeclDISPID(1610809348)  public Integer getLeft() throws ComException;
  @DeclDISPID(1610809350)  public void Help() throws ComException;
  @DeclDISPID(1610809351)  public Integer StartWizard(Boolean On, String Callback, Integer PrivateX, Object Animation, Object CustomTeaser, Object Top, Object Left, Object Bottom, Object Right) throws ComException;
  @DeclDISPID(1610809352)  public void EndWizard(Integer WizardID, Boolean varfSuccess, Object Animation) throws ComException;
  @DeclDISPID(1610809353)  public void ActivateWizard(Integer WizardID, MsoWizardActType act, Object Animation) throws ComException;
  @DeclDISPID(1610809354)  public void ResetTips() throws ComException;
  @DeclDISPID(1610809355)  public Balloon getNewBalloon() throws ComException;
  @DeclDISPID(1610809356)  public MsoBalloonErrorType getBalloonError() throws ComException;
  @DeclDISPID(1610809357)  public Boolean getVisible() throws ComException;
  @DeclDISPID(1610809357)  public void setVisible(Boolean value) throws ComException;
  @DeclDISPID(1610809359)  public MsoAnimationType getAnimation() throws ComException;
  @DeclDISPID(1610809359)  public void setAnimation(MsoAnimationType value) throws ComException;
  @DeclDISPID(1610809361)  public Boolean getReduced() throws ComException;
  @DeclDISPID(1610809361)  public void setReduced(Boolean value) throws ComException;
  @DeclDISPID(1610809363)  public void setAssistWithHelp(Boolean value) throws ComException;
  @DeclDISPID(1610809363)  public Boolean getAssistWithHelp() throws ComException;
  @DeclDISPID(1610809365)  public void setAssistWithWizards(Boolean value) throws ComException;
  @DeclDISPID(1610809365)  public Boolean getAssistWithWizards() throws ComException;
  @DeclDISPID(1610809367)  public void setAssistWithAlerts(Boolean value) throws ComException;
  @DeclDISPID(1610809367)  public Boolean getAssistWithAlerts() throws ComException;
  @DeclDISPID(1610809369)  public void setMoveWhenInTheWay(Boolean value) throws ComException;
  @DeclDISPID(1610809369)  public Boolean getMoveWhenInTheWay() throws ComException;
  @DeclDISPID(1610809371)  public void setSounds(Boolean value) throws ComException;
  @DeclDISPID(1610809371)  public Boolean getSounds() throws ComException;
  @DeclDISPID(1610809373)  public void setFeatureTips(Boolean value) throws ComException;
  @DeclDISPID(1610809373)  public Boolean getFeatureTips() throws ComException;
  @DeclDISPID(1610809375)  public void setMouseTips(Boolean value) throws ComException;
  @DeclDISPID(1610809375)  public Boolean getMouseTips() throws ComException;
  @DeclDISPID(1610809377)  public void setKeyboardShortcutTips(Boolean value) throws ComException;
  @DeclDISPID(1610809377)  public Boolean getKeyboardShortcutTips() throws ComException;
  @DeclDISPID(1610809379)  public void setHighPriorityTips(Boolean value) throws ComException;
  @DeclDISPID(1610809379)  public Boolean getHighPriorityTips() throws ComException;
  @DeclDISPID(1610809381)  public void setTipOfDay(Boolean value) throws ComException;
  @DeclDISPID(1610809381)  public Boolean getTipOfDay() throws ComException;
  @DeclDISPID(1610809383)  public void setGuessHelp(Boolean value) throws ComException;
  @DeclDISPID(1610809383)  public Boolean getGuessHelp() throws ComException;
  @DeclDISPID(1610809385)  public void setSearchWhenProgramming(Boolean value) throws ComException;
  @DeclDISPID(1610809385)  public Boolean getSearchWhenProgramming() throws ComException;
  @DeclDISPID(0)  public String getItem() throws ComException;
  @DeclDISPID(1610809388)  public String getFileName() throws ComException;
  @DeclDISPID(1610809388)  public void setFileName(String value) throws ComException;
  @DeclDISPID(1610809390)  public String getName() throws ComException;
  @DeclDISPID(1610809391)  public Boolean getOn() throws ComException;
  @DeclDISPID(1610809391)  public void setOn(Boolean value) throws ComException;
  @DeclDISPID(1610809393)  public Integer DoAlert(String bstrAlertTitle, String bstrAlertText, MsoAlertButtonType alb, MsoAlertIconType alc, MsoAlertDefaultType ald, MsoAlertCancelType alq, Boolean varfSysAlert) throws ComException;
}
