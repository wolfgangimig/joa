/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9A49-A463-DB41-5DAE-69E7A5F7FCBC}")
public class AssistantImpl extends Dispatch implements com.wilutions.mslib.office.Assistant {
  @DeclDISPID(1610743808)  public Dispatch getApplication() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"Creator", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610809344)  public Dispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(1610809344,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(1610809345)  public void Move(Integer xLeft, Integer yTop) throws ComException {
    assert(xLeft != null);
    assert(yTop != null);
    this._dispatchCall(1610809345,"Move", DISPATCH_METHOD,null,xLeft,yTop);
  }
  @DeclDISPID(1610809346)  public void setTop(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610809346,"Top", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610809346)  public Integer getTop() throws ComException {
    final Object obj = this._dispatchCall(1610809346,"Top", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610809348)  public void setLeft(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610809348,"Left", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610809348)  public Integer getLeft() throws ComException {
    final Object obj = this._dispatchCall(1610809348,"Left", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610809350)  public void Help() throws ComException {
    this._dispatchCall(1610809350,"Help", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1610809351)  public Integer StartWizard(Boolean On, String Callback, Integer PrivateX, Object Animation, Object CustomTeaser, Object Top, Object Left, Object Bottom, Object Right) throws ComException {
    assert(On != null);
    assert(Callback != null);
    assert(PrivateX != null);
    assert(Animation != null);
    assert(CustomTeaser != null);
    assert(Top != null);
    assert(Left != null);
    assert(Bottom != null);
    assert(Right != null);
    final Object obj = this._dispatchCall(1610809351,"StartWizard", DISPATCH_METHOD,null,On,Callback,PrivateX,Animation,CustomTeaser,Top,Left,Bottom,Right);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610809352)  public void EndWizard(Integer WizardID, Boolean varfSuccess, Object Animation) throws ComException {
    assert(WizardID != null);
    assert(varfSuccess != null);
    assert(Animation != null);
    this._dispatchCall(1610809352,"EndWizard", DISPATCH_METHOD,null,WizardID,varfSuccess,Animation);
  }
  @DeclDISPID(1610809353)  public void ActivateWizard(Integer WizardID, com.wilutions.mslib.office.MsoWizardActType act, Object Animation) throws ComException {
    assert(WizardID != null);
    assert(act != null);
    assert(Animation != null);
    this._dispatchCall(1610809353,"ActivateWizard", DISPATCH_METHOD,null,WizardID,act.value,Animation);
  }
  @DeclDISPID(1610809354)  public void ResetTips() throws ComException {
    this._dispatchCall(1610809354,"ResetTips", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1610809355)  public com.wilutions.mslib.office.Balloon getNewBalloon() throws ComException {
    final Object obj = this._dispatchCall(1610809355,"NewBalloon", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.BalloonImpl.class);
  }
  @DeclDISPID(1610809356)  public com.wilutions.mslib.office.MsoBalloonErrorType getBalloonError() throws ComException {
    final Object obj = this._dispatchCall(1610809356,"BalloonError", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoBalloonErrorType.valueOf((Integer)obj);
  }
  @DeclDISPID(1610809357)  public Boolean getVisible() throws ComException {
    final Object obj = this._dispatchCall(1610809357,"Visible", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610809357)  public void setVisible(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610809357,"Visible", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610809359)  public com.wilutions.mslib.office.MsoAnimationType getAnimation() throws ComException {
    final Object obj = this._dispatchCall(1610809359,"Animation", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoAnimationType.valueOf((Integer)obj);
  }
  @DeclDISPID(1610809359)  public void setAnimation(com.wilutions.mslib.office.MsoAnimationType value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610809359,"Animation", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(1610809361)  public Boolean getReduced() throws ComException {
    final Object obj = this._dispatchCall(1610809361,"Reduced", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610809361)  public void setReduced(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610809361,"Reduced", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610809363)  public void setAssistWithHelp(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610809363,"AssistWithHelp", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610809363)  public Boolean getAssistWithHelp() throws ComException {
    final Object obj = this._dispatchCall(1610809363,"AssistWithHelp", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610809365)  public void setAssistWithWizards(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610809365,"AssistWithWizards", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610809365)  public Boolean getAssistWithWizards() throws ComException {
    final Object obj = this._dispatchCall(1610809365,"AssistWithWizards", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610809367)  public void setAssistWithAlerts(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610809367,"AssistWithAlerts", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610809367)  public Boolean getAssistWithAlerts() throws ComException {
    final Object obj = this._dispatchCall(1610809367,"AssistWithAlerts", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610809369)  public void setMoveWhenInTheWay(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610809369,"MoveWhenInTheWay", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610809369)  public Boolean getMoveWhenInTheWay() throws ComException {
    final Object obj = this._dispatchCall(1610809369,"MoveWhenInTheWay", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610809371)  public void setSounds(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610809371,"Sounds", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610809371)  public Boolean getSounds() throws ComException {
    final Object obj = this._dispatchCall(1610809371,"Sounds", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610809373)  public void setFeatureTips(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610809373,"FeatureTips", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610809373)  public Boolean getFeatureTips() throws ComException {
    final Object obj = this._dispatchCall(1610809373,"FeatureTips", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610809375)  public void setMouseTips(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610809375,"MouseTips", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610809375)  public Boolean getMouseTips() throws ComException {
    final Object obj = this._dispatchCall(1610809375,"MouseTips", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610809377)  public void setKeyboardShortcutTips(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610809377,"KeyboardShortcutTips", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610809377)  public Boolean getKeyboardShortcutTips() throws ComException {
    final Object obj = this._dispatchCall(1610809377,"KeyboardShortcutTips", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610809379)  public void setHighPriorityTips(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610809379,"HighPriorityTips", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610809379)  public Boolean getHighPriorityTips() throws ComException {
    final Object obj = this._dispatchCall(1610809379,"HighPriorityTips", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610809381)  public void setTipOfDay(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610809381,"TipOfDay", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610809381)  public Boolean getTipOfDay() throws ComException {
    final Object obj = this._dispatchCall(1610809381,"TipOfDay", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610809383)  public void setGuessHelp(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610809383,"GuessHelp", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610809383)  public Boolean getGuessHelp() throws ComException {
    final Object obj = this._dispatchCall(1610809383,"GuessHelp", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610809385)  public void setSearchWhenProgramming(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610809385,"SearchWhenProgramming", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610809385)  public Boolean getSearchWhenProgramming() throws ComException {
    final Object obj = this._dispatchCall(1610809385,"SearchWhenProgramming", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(0)  public String getItem() throws ComException {
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610809388)  public String getFileName() throws ComException {
    final Object obj = this._dispatchCall(1610809388,"FileName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610809388)  public void setFileName(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610809388,"FileName", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610809390)  public String getName() throws ComException {
    final Object obj = this._dispatchCall(1610809390,"Name", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610809391)  public Boolean getOn() throws ComException {
    final Object obj = this._dispatchCall(1610809391,"On", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610809391)  public void setOn(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610809391,"On", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610809393)  public Integer DoAlert(String bstrAlertTitle, String bstrAlertText, com.wilutions.mslib.office.MsoAlertButtonType alb, com.wilutions.mslib.office.MsoAlertIconType alc, com.wilutions.mslib.office.MsoAlertDefaultType ald, com.wilutions.mslib.office.MsoAlertCancelType alq, Boolean varfSysAlert) throws ComException {
    assert(bstrAlertTitle != null);
    assert(bstrAlertText != null);
    assert(alb != null);
    assert(alc != null);
    assert(ald != null);
    assert(alq != null);
    assert(varfSysAlert != null);
    final Object obj = this._dispatchCall(1610809393,"DoAlert", DISPATCH_METHOD,null,bstrAlertTitle,bstrAlertText,alb.value,alc.value,ald.value,alq.value,varfSysAlert);
    if (obj == null) return null;
    return (Integer)obj;
  }
  public AssistantImpl(String progId) throws ComException {
    super(progId);
  }
  protected AssistantImpl(long ndisp) {
    super(ndisp);
  }
  public AssistantImpl(Dispatch ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[AssistantImpl" + super.toString() + "]";
  }
}
