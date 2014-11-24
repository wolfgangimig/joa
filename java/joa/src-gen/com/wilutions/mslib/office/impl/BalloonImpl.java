/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9A4F-A463-DB41-5DAE-69E7A5F7FCBC}")
public class BalloonImpl extends Dispatch implements com.wilutions.mslib.office.Balloon {
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
  @DeclDISPID(1610809345)  public IDispatch getCheckboxes() throws ComException {
    final Object obj = this._dispatchCall(1610809345,"Checkboxes", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(1610809346)  public IDispatch getLabels() throws ComException {
    final Object obj = this._dispatchCall(1610809346,"Labels", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(1610809347)  public void setBalloonType(com.wilutions.mslib.office.MsoBalloonType value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610809347,"BalloonType", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(1610809347)  public com.wilutions.mslib.office.MsoBalloonType getBalloonType() throws ComException {
    final Object obj = this._dispatchCall(1610809347,"BalloonType", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoBalloonType.valueOf((Integer)obj);
  }
  @DeclDISPID(1610809349)  public void setIcon(com.wilutions.mslib.office.MsoIconType value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610809349,"Icon", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(1610809349)  public com.wilutions.mslib.office.MsoIconType getIcon() throws ComException {
    final Object obj = this._dispatchCall(1610809349,"Icon", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoIconType.valueOf((Integer)obj);
  }
  @DeclDISPID(1610809351)  public void setHeading(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610809351,"Heading", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610809351)  public String getHeading() throws ComException {
    final Object obj = this._dispatchCall(1610809351,"Heading", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610809353)  public void setText(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610809353,"Text", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610809353)  public String getText() throws ComException {
    final Object obj = this._dispatchCall(1610809353,"Text", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610809355)  public void setMode(com.wilutions.mslib.office.MsoModeType value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610809355,"Mode", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(1610809355)  public com.wilutions.mslib.office.MsoModeType getMode() throws ComException {
    final Object obj = this._dispatchCall(1610809355,"Mode", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoModeType.valueOf((Integer)obj);
  }
  @DeclDISPID(1610809357)  public void setAnimation(com.wilutions.mslib.office.MsoAnimationType value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610809357,"Animation", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(1610809357)  public com.wilutions.mslib.office.MsoAnimationType getAnimation() throws ComException {
    final Object obj = this._dispatchCall(1610809357,"Animation", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoAnimationType.valueOf((Integer)obj);
  }
  @DeclDISPID(1610809359)  public void setButton(com.wilutions.mslib.office.MsoButtonSetType value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610809359,"Button", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(1610809359)  public com.wilutions.mslib.office.MsoButtonSetType getButton() throws ComException {
    final Object obj = this._dispatchCall(1610809359,"Button", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoButtonSetType.valueOf((Integer)obj);
  }
  @DeclDISPID(1610809361)  public void setCallback(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610809361,"Callback", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610809361)  public String getCallback() throws ComException {
    final Object obj = this._dispatchCall(1610809361,"Callback", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610809363)  public void setPrivate(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610809363,"Private", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610809363)  public Integer getPrivate() throws ComException {
    final Object obj = this._dispatchCall(1610809363,"Private", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610809365)  public void SetAvoidRectangle(Integer Left, Integer Top, Integer Right, Integer Bottom) throws ComException {
    assert(Left != null);
    assert(Top != null);
    assert(Right != null);
    assert(Bottom != null);
    this._dispatchCall(1610809365,"SetAvoidRectangle", DISPATCH_METHOD,null,Left,Top,Right,Bottom);
  }
  @DeclDISPID(1610809366)  public String getName() throws ComException {
    final Object obj = this._dispatchCall(1610809366,"Name", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610809367)  public com.wilutions.mslib.office.MsoBalloonButtonType Show() throws ComException {
    final Object obj = this._dispatchCall(1610809367,"Show", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoBalloonButtonType.valueOf((Integer)obj);
  }
  @DeclDISPID(1610809368)  public void Close() throws ComException {
    this._dispatchCall(1610809368,"Close", DISPATCH_METHOD,null);
  }
  public BalloonImpl(String progId) throws ComException {
    super(progId, "{000C0324-0000-0000-C000-000000000046}");
  }
  protected BalloonImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[BalloonImpl" + super.toString() + "]";
  }
}
