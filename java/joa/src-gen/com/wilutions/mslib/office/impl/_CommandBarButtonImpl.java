/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9A65-A463-DB41-5DAE-69E7A5F7FCBC}")
public class _CommandBarButtonImpl extends Dispatch implements com.wilutions.mslib.office._CommandBarButton {
  @DeclDISPID(1610809344)  public Dispatch getApplication() throws ComException {
    final Object obj = this._dispatchCall(1610809344,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(1610809345)  public Integer getCreator() throws ComException {
    final Object obj = this._dispatchCall(1610809345,"Creator", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610874880)  public Boolean getBeginGroup() throws ComException {
    final Object obj = this._dispatchCall(1610874880,"BeginGroup", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610874880)  public void setBeginGroup(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610874880,"BeginGroup", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610874882)  public Boolean getBuiltIn() throws ComException {
    final Object obj = this._dispatchCall(1610874882,"BuiltIn", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610874883)  public String getCaption() throws ComException {
    final Object obj = this._dispatchCall(1610874883,"Caption", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610874883)  public void setCaption(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610874883,"Caption", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610874886)  public com.wilutions.mslib.office.CommandBarControl Copy(Object Bar, Object Before) throws ComException {
    assert(Bar != null);
    assert(Before != null);
    final Object obj = this._dispatchCall(1610874886,"Copy", DISPATCH_METHOD,null,Bar,Before);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.CommandBarControlImpl.class);
  }
  @DeclDISPID(1610874887)  public void Delete(Object Temporary) throws ComException {
    assert(Temporary != null);
    this._dispatchCall(1610874887,"Delete", DISPATCH_METHOD,null,Temporary);
  }
  @DeclDISPID(1610874888)  public String getDescriptionText() throws ComException {
    final Object obj = this._dispatchCall(1610874888,"DescriptionText", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610874888)  public void setDescriptionText(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610874888,"DescriptionText", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610874890)  public Boolean getEnabled() throws ComException {
    final Object obj = this._dispatchCall(1610874890,"Enabled", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610874890)  public void setEnabled(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610874890,"Enabled", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610874892)  public void Execute() throws ComException {
    this._dispatchCall(1610874892,"Execute", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1610874893)  public Integer getHeight() throws ComException {
    final Object obj = this._dispatchCall(1610874893,"Height", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610874893)  public void setHeight(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610874893,"Height", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610874895)  public Integer getHelpContextId() throws ComException {
    final Object obj = this._dispatchCall(1610874895,"HelpContextId", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610874895)  public void setHelpContextId(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610874895,"HelpContextId", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610874897)  public String getHelpFile() throws ComException {
    final Object obj = this._dispatchCall(1610874897,"HelpFile", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610874897)  public void setHelpFile(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610874897,"HelpFile", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610874899)  public Integer getId() throws ComException {
    final Object obj = this._dispatchCall(1610874899,"Id", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610874900)  public Integer getIndex() throws ComException {
    final Object obj = this._dispatchCall(1610874900,"Index", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610874902)  public com.wilutions.mslib.office.CommandBarControl Move(Object Bar, Object Before) throws ComException {
    assert(Bar != null);
    assert(Before != null);
    final Object obj = this._dispatchCall(1610874902,"Move", DISPATCH_METHOD,null,Bar,Before);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.CommandBarControlImpl.class);
  }
  @DeclDISPID(1610874903)  public Integer getLeft() throws ComException {
    final Object obj = this._dispatchCall(1610874903,"Left", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610874904)  public com.wilutions.mslib.office.MsoControlOLEUsage getOLEUsage() throws ComException {
    final Object obj = this._dispatchCall(1610874904,"OLEUsage", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoControlOLEUsage.valueOf((Integer)obj);
  }
  @DeclDISPID(1610874904)  public void setOLEUsage(com.wilutions.mslib.office.MsoControlOLEUsage value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610874904,"OLEUsage", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(1610874906)  public String getOnAction() throws ComException {
    final Object obj = this._dispatchCall(1610874906,"OnAction", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610874906)  public void setOnAction(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610874906,"OnAction", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610874908)  public com.wilutions.mslib.office.CommandBar getParent() throws ComException {
    final Object obj = this._dispatchCall(1610874908,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.CommandBarImpl.class);
  }
  @DeclDISPID(1610874909)  public String getParameter() throws ComException {
    final Object obj = this._dispatchCall(1610874909,"Parameter", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610874909)  public void setParameter(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610874909,"Parameter", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610874911)  public Integer getPriority() throws ComException {
    final Object obj = this._dispatchCall(1610874911,"Priority", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610874911)  public void setPriority(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610874911,"Priority", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610874913)  public void Reset() throws ComException {
    this._dispatchCall(1610874913,"Reset", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1610874914)  public void SetFocus() throws ComException {
    this._dispatchCall(1610874914,"SetFocus", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1610874915)  public String getTag() throws ComException {
    final Object obj = this._dispatchCall(1610874915,"Tag", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610874915)  public void setTag(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610874915,"Tag", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610874917)  public String getTooltipText() throws ComException {
    final Object obj = this._dispatchCall(1610874917,"TooltipText", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610874917)  public void setTooltipText(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610874917,"TooltipText", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610874919)  public Integer getTop() throws ComException {
    final Object obj = this._dispatchCall(1610874919,"Top", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610874920)  public com.wilutions.mslib.office.MsoControlType getType() throws ComException {
    final Object obj = this._dispatchCall(1610874920,"Type", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoControlType.valueOf((Integer)obj);
  }
  @DeclDISPID(1610874921)  public Boolean getVisible() throws ComException {
    final Object obj = this._dispatchCall(1610874921,"Visible", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610874921)  public void setVisible(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610874921,"Visible", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610874923)  public Integer getWidth() throws ComException {
    final Object obj = this._dispatchCall(1610874923,"Width", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610874923)  public void setWidth(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610874923,"Width", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610874925)  public Boolean getIsPriorityDropped() throws ComException {
    final Object obj = this._dispatchCall(1610874925,"IsPriorityDropped", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610940416)  public Boolean getBuiltInFace() throws ComException {
    final Object obj = this._dispatchCall(1610940416,"BuiltInFace", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610940416)  public void setBuiltInFace(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610940416,"BuiltInFace", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610940418)  public void CopyFace() throws ComException {
    this._dispatchCall(1610940418,"CopyFace", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1610940419)  public Integer getFaceId() throws ComException {
    final Object obj = this._dispatchCall(1610940419,"FaceId", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610940419)  public void setFaceId(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610940419,"FaceId", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610940421)  public void PasteFace() throws ComException {
    this._dispatchCall(1610940421,"PasteFace", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1610940422)  public String getShortcutText() throws ComException {
    final Object obj = this._dispatchCall(1610940422,"ShortcutText", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610940422)  public void setShortcutText(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610940422,"ShortcutText", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610940424)  public com.wilutions.mslib.office.MsoButtonState getState() throws ComException {
    final Object obj = this._dispatchCall(1610940424,"State", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoButtonState.valueOf((Integer)obj);
  }
  @DeclDISPID(1610940424)  public void setState(com.wilutions.mslib.office.MsoButtonState value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610940424,"State", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(1610940426)  public com.wilutions.mslib.office.MsoButtonStyle getStyle() throws ComException {
    final Object obj = this._dispatchCall(1610940426,"Style", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoButtonStyle.valueOf((Integer)obj);
  }
  @DeclDISPID(1610940426)  public void setStyle(com.wilutions.mslib.office.MsoButtonStyle value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610940426,"Style", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(1610940428)  public com.wilutions.mslib.office.MsoCommandBarButtonHyperlinkType getHyperlinkType() throws ComException {
    final Object obj = this._dispatchCall(1610940428,"HyperlinkType", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoCommandBarButtonHyperlinkType.valueOf((Integer)obj);
  }
  @DeclDISPID(1610940428)  public void setHyperlinkType(com.wilutions.mslib.office.MsoCommandBarButtonHyperlinkType value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610940428,"HyperlinkType", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(1610940430)  public com.wilutions.mslib.stdole.IPictureDisp getPicture() throws ComException {
    final Object obj = this._dispatchCall(1610940430,"Picture", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.stdole.impl.IPictureDispImpl.class);
  }
  @DeclDISPID(1610940430)  public void setPicture(com.wilutions.mslib.stdole.IPictureDisp value) throws ComException {
    this._dispatchCall(1610940430,"Picture", DISPATCH_PROPERTYPUT,(value!=null?value:Dispatch.NULL));
  }
  @DeclDISPID(1610940432)  public com.wilutions.mslib.stdole.IPictureDisp getMask() throws ComException {
    final Object obj = this._dispatchCall(1610940432,"Mask", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.stdole.impl.IPictureDispImpl.class);
  }
  @DeclDISPID(1610940432)  public void setMask(com.wilutions.mslib.stdole.IPictureDisp value) throws ComException {
    this._dispatchCall(1610940432,"Mask", DISPATCH_PROPERTYPUT,(value!=null?value:Dispatch.NULL));
  }
  public _CommandBarButtonImpl(String progId) throws ComException {
    super(progId, "{000C030E-0000-0000-C000-000000000046}");
  }
  protected _CommandBarButtonImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_CommandBarButtonImpl" + super.toString() + "]";
  }
}
