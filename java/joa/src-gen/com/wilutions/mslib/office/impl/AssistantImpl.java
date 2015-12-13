/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9A49-A463-DB41-5DAE-69E7A5F7FCBC}")
public class AssistantImpl extends Dispatch implements com.wilutions.mslib.office.Assistant {
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"Creator", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610809344)  public IDispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(1610809344,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(1610809345)  public void Move(final Integer xLeft, final Integer yTop) throws ComException {
    assert(xLeft != null);
    assert(yTop != null);
    this._dispatchCall(1610809345,"Move", DISPATCH_METHOD,null,xLeft,yTop);
  }
  @DeclDISPID(1610809346)  public void setTop(final Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610809346,"Top", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610809346)  public Integer getTop() throws ComException {
    final Object obj = this._dispatchCall(1610809346,"Top", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610809348)  public void setLeft(final Integer value) throws ComException {
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
  @DeclDISPID(1610809351)  public Integer StartWizard(final Boolean On, final String Callback, final Integer PrivateX, final Object Animation, final Object CustomTeaser, final Object Top, final Object Left, final Object Bottom, final Object Right) throws ComException {
    assert(On != null);
    assert(Callback != null);
    assert(PrivateX != null);
    assert(Animation != null);
    assert(CustomTeaser != null);
    assert(Top != null);
    assert(Left != null);
    assert(Bottom != null);
    assert(Right != null);
    final Object obj = this._dispatchCall(1610809351,"StartWizard", DISPATCH_METHOD,null,On,Callback,PrivateX,Variant.param(Animation),Variant.param(CustomTeaser),Variant.param(Top),Variant.param(Left),Variant.param(Bottom),Variant.param(Right));
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610809352)  public void EndWizard(final Integer WizardID, final Boolean varfSuccess, final Object Animation) throws ComException {
    assert(WizardID != null);
    assert(varfSuccess != null);
    assert(Animation != null);
    this._dispatchCall(1610809352,"EndWizard", DISPATCH_METHOD,null,WizardID,varfSuccess,Variant.param(Animation));
  }
  @DeclDISPID(1610809353)  public void ActivateWizard(final Integer WizardID, final com.wilutions.mslib.office.MsoWizardActType act, final Object Animation) throws ComException {
    assert(WizardID != null);
    assert(act != null);
    assert(Animation != null);
    this._dispatchCall(1610809353,"ActivateWizard", DISPATCH_METHOD,null,WizardID,act.value,Variant.param(Animation));
  }
  @DeclDISPID(1610809354)  public void ResetTips() throws ComException {
    this._dispatchCall(1610809354,"ResetTips", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1610809355)  public com.wilutions.mslib.office.Balloon getNewBalloon() throws ComException {
    final Object obj = this._dispatchCall(1610809355,"NewBalloon", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.BalloonImpl.class);
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
  @DeclDISPID(1610809357)  public void setVisible(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610809357,"Visible", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610809359)  public com.wilutions.mslib.office.MsoAnimationType getAnimation() throws ComException {
    final Object obj = this._dispatchCall(1610809359,"Animation", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoAnimationType.valueOf((Integer)obj);
  }
  @DeclDISPID(1610809359)  public void setAnimation(final com.wilutions.mslib.office.MsoAnimationType value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610809359,"Animation", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(1610809361)  public Boolean getReduced() throws ComException {
    final Object obj = this._dispatchCall(1610809361,"Reduced", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610809361)  public void setReduced(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610809361,"Reduced", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610809363)  public void setAssistWithHelp(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610809363,"AssistWithHelp", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610809363)  public Boolean getAssistWithHelp() throws ComException {
    final Object obj = this._dispatchCall(1610809363,"AssistWithHelp", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610809365)  public void setAssistWithWizards(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610809365,"AssistWithWizards", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610809365)  public Boolean getAssistWithWizards() throws ComException {
    final Object obj = this._dispatchCall(1610809365,"AssistWithWizards", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610809367)  public void setAssistWithAlerts(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610809367,"AssistWithAlerts", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610809367)  public Boolean getAssistWithAlerts() throws ComException {
    final Object obj = this._dispatchCall(1610809367,"AssistWithAlerts", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610809369)  public void setMoveWhenInTheWay(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610809369,"MoveWhenInTheWay", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610809369)  public Boolean getMoveWhenInTheWay() throws ComException {
    final Object obj = this._dispatchCall(1610809369,"MoveWhenInTheWay", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610809371)  public void setSounds(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610809371,"Sounds", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610809371)  public Boolean getSounds() throws ComException {
    final Object obj = this._dispatchCall(1610809371,"Sounds", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610809373)  public void setFeatureTips(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610809373,"FeatureTips", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610809373)  public Boolean getFeatureTips() throws ComException {
    final Object obj = this._dispatchCall(1610809373,"FeatureTips", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610809375)  public void setMouseTips(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610809375,"MouseTips", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610809375)  public Boolean getMouseTips() throws ComException {
    final Object obj = this._dispatchCall(1610809375,"MouseTips", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610809377)  public void setKeyboardShortcutTips(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610809377,"KeyboardShortcutTips", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610809377)  public Boolean getKeyboardShortcutTips() throws ComException {
    final Object obj = this._dispatchCall(1610809377,"KeyboardShortcutTips", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610809379)  public void setHighPriorityTips(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610809379,"HighPriorityTips", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610809379)  public Boolean getHighPriorityTips() throws ComException {
    final Object obj = this._dispatchCall(1610809379,"HighPriorityTips", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610809381)  public void setTipOfDay(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610809381,"TipOfDay", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610809381)  public Boolean getTipOfDay() throws ComException {
    final Object obj = this._dispatchCall(1610809381,"TipOfDay", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610809383)  public void setGuessHelp(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610809383,"GuessHelp", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610809383)  public Boolean getGuessHelp() throws ComException {
    final Object obj = this._dispatchCall(1610809383,"GuessHelp", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610809385)  public void setSearchWhenProgramming(final Boolean value) throws ComException {
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
  @DeclDISPID(1610809388)  public void setFileName(final String value) throws ComException {
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
  @DeclDISPID(1610809391)  public void setOn(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610809391,"On", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610809393)  public Integer DoAlert(final String bstrAlertTitle, final String bstrAlertText, final com.wilutions.mslib.office.MsoAlertButtonType alb, final com.wilutions.mslib.office.MsoAlertIconType alc, final com.wilutions.mslib.office.MsoAlertDefaultType ald, final com.wilutions.mslib.office.MsoAlertCancelType alq, final Boolean varfSysAlert) throws ComException {
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
    super(progId, "{000C0322-0000-0000-C000-000000000046}");
  }
  protected AssistantImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[AssistantImpl" + super.toString() + "]";
  }
}
