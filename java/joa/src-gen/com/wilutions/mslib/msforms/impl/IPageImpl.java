/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{9C78CF78-D55E-CA8F-1D67-694DA596EC7A}")
public class IPageImpl extends Dispatch implements com.wilutions.mslib.msforms.IPage {
  @DeclDISPID(0)  public com.wilutions.mslib.msforms.Controls getControls() throws ComException {
    final Object obj = this._dispatchCall(0,"Controls", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.msforms.impl.ControlsImpl.class);
  }
  @DeclDISPID(256)  public com.wilutions.mslib.msforms.Control getActiveControl() throws ComException {
    final Object obj = this._dispatchCall(256,"ActiveControl", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(com.wilutions.mslib.msforms.Control.class);
  }
  @DeclDISPID(257)  public Boolean getCanPaste() throws ComException {
    final Object obj = this._dispatchCall(257,"CanPaste", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(258)  public Boolean getCanRedo() throws ComException {
    final Object obj = this._dispatchCall(258,"CanRedo", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(259)  public Boolean getCanUndo() throws ComException {
    final Object obj = this._dispatchCall(259,"CanUndo", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(260)  public void setCycle(com.wilutions.mslib.msforms.fmCycle value) throws ComException {
    assert(value != null);
    this._dispatchCall(260,"Cycle", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(260)  public com.wilutions.mslib.msforms.fmCycle getCycle() throws ComException {
    final Object obj = this._dispatchCall(260,"Cycle", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.msforms.fmCycle.valueOf((Integer)obj);
  }
  @DeclDISPID(-518)  public void setCaption(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(-518,"Caption", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(-518)  public String getCaption() throws ComException {
    final Object obj = this._dispatchCall(-518,"Caption", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(-2147418043)  public void setControlTipText(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(-2147418043,"ControlTipText", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(-2147418043)  public String getControlTipText() throws ComException {
    final Object obj = this._dispatchCall(-2147418043,"ControlTipText", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(-514)  public void setEnabled(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(-514,"Enabled", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(-514)  public Boolean getEnabled() throws ComException {
    final Object obj = this._dispatchCall(-514,"Enabled", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(-2147356416)  public void setIndex(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(-2147356416,"Index", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(-2147356416)  public Integer getIndex() throws ComException {
    final Object obj = this._dispatchCall(-2147356416,"Index", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610743824)  public void _GetInsideHeight(ByRef<Integer> InsideHeight) throws ComException {
    assert(InsideHeight != null);
    this._dispatchCall(1610743824,"_GetInsideHeight", DISPATCH_METHOD,null,InsideHeight);
  }
  @DeclDISPID(262)  public Float getInsideHeight() throws ComException {
    final Object obj = this._dispatchCall(262,"InsideHeight", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(1610743826)  public void _GetInsideWidth(ByRef<Integer> InsideWidth) throws ComException {
    assert(InsideWidth != null);
    this._dispatchCall(1610743826,"_GetInsideWidth", DISPATCH_METHOD,null,InsideWidth);
  }
  @DeclDISPID(263)  public Float getInsideWidth() throws ComException {
    final Object obj = this._dispatchCall(263,"InsideWidth", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(264)  public void setKeepScrollBarsVisible(com.wilutions.mslib.msforms.fmScrollBars value) throws ComException {
    assert(value != null);
    this._dispatchCall(264,"KeepScrollBarsVisible", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(264)  public com.wilutions.mslib.msforms.fmScrollBars getKeepScrollBarsVisible() throws ComException {
    final Object obj = this._dispatchCall(264,"KeepScrollBarsVisible", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.msforms.fmScrollBars.valueOf((Integer)obj);
  }
  @DeclDISPID(-2147418112)  public void setName(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(-2147418112,"Name", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(-2147418112)  public String getName() throws ComException {
    final Object obj = this._dispatchCall(-2147418112,"Name", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(26)  public void setPictureAlignment(com.wilutions.mslib.msforms.fmPictureAlignment value) throws ComException {
    assert(value != null);
    this._dispatchCall(26,"PictureAlignment", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(26)  public com.wilutions.mslib.msforms.fmPictureAlignment getPictureAlignment() throws ComException {
    final Object obj = this._dispatchCall(26,"PictureAlignment", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.msforms.fmPictureAlignment.valueOf((Integer)obj);
  }
  @DeclDISPID(-523)  public void setPicture(com.wilutions.mslib.stdole.Picture value) throws ComException {
    this._dispatchCall(-523,"Picture", DISPATCH_PROPERTYPUT,(value!=null?value:Dispatch.NULL));
  }
  @DeclDISPID(-523)  public com.wilutions.mslib.stdole.Picture getPicture() throws ComException {
    final Object obj = this._dispatchCall(-523,"Picture", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.stdole.impl.PictureImpl.class);
  }
  @DeclDISPID(27)  public void setPictureSizeMode(com.wilutions.mslib.msforms.fmPictureSizeMode value) throws ComException {
    assert(value != null);
    this._dispatchCall(27,"PictureSizeMode", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(27)  public com.wilutions.mslib.msforms.fmPictureSizeMode getPictureSizeMode() throws ComException {
    final Object obj = this._dispatchCall(27,"PictureSizeMode", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.msforms.fmPictureSizeMode.valueOf((Integer)obj);
  }
  @DeclDISPID(28)  public void setPictureTiling(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(28,"PictureTiling", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(28)  public Boolean getPictureTiling() throws ComException {
    final Object obj = this._dispatchCall(28,"PictureTiling", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(265)  public void setScrollBars(com.wilutions.mslib.msforms.fmScrollBars value) throws ComException {
    assert(value != null);
    this._dispatchCall(265,"ScrollBars", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(265)  public com.wilutions.mslib.msforms.fmScrollBars getScrollBars() throws ComException {
    final Object obj = this._dispatchCall(265,"ScrollBars", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.msforms.fmScrollBars.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743843)  public void _SetScrollHeight(Integer ScrollHeight) throws ComException {
    assert(ScrollHeight != null);
    this._dispatchCall(1610743843,"_SetScrollHeight", DISPATCH_METHOD,null,ScrollHeight);
  }
  @DeclDISPID(1610743844)  public void _GetScrollHeight(ByRef<Integer> ScrollHeight) throws ComException {
    assert(ScrollHeight != null);
    this._dispatchCall(1610743844,"_GetScrollHeight", DISPATCH_METHOD,null,ScrollHeight);
  }
  @DeclDISPID(266)  public void setScrollHeight(Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(266,"ScrollHeight", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(266)  public Float getScrollHeight() throws ComException {
    final Object obj = this._dispatchCall(266,"ScrollHeight", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(1610743847)  public void _SetScrollLeft(Integer ScrollLeft) throws ComException {
    assert(ScrollLeft != null);
    this._dispatchCall(1610743847,"_SetScrollLeft", DISPATCH_METHOD,null,ScrollLeft);
  }
  @DeclDISPID(1610743848)  public void _GetScrollLeft(ByRef<Integer> ScrollLeft) throws ComException {
    assert(ScrollLeft != null);
    this._dispatchCall(1610743848,"_GetScrollLeft", DISPATCH_METHOD,null,ScrollLeft);
  }
  @DeclDISPID(267)  public void setScrollLeft(Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(267,"ScrollLeft", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(267)  public Float getScrollLeft() throws ComException {
    final Object obj = this._dispatchCall(267,"ScrollLeft", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(1610743851)  public void _SetScrollTop(Integer ScrollTop) throws ComException {
    assert(ScrollTop != null);
    this._dispatchCall(1610743851,"_SetScrollTop", DISPATCH_METHOD,null,ScrollTop);
  }
  @DeclDISPID(1610743852)  public void _GetScrollTop(ByRef<Integer> ScrollTop) throws ComException {
    assert(ScrollTop != null);
    this._dispatchCall(1610743852,"_GetScrollTop", DISPATCH_METHOD,null,ScrollTop);
  }
  @DeclDISPID(268)  public void setScrollTop(Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(268,"ScrollTop", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(268)  public Float getScrollTop() throws ComException {
    final Object obj = this._dispatchCall(268,"ScrollTop", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(1610743855)  public void _SetScrollWidth(Integer ScrollWidth) throws ComException {
    assert(ScrollWidth != null);
    this._dispatchCall(1610743855,"_SetScrollWidth", DISPATCH_METHOD,null,ScrollWidth);
  }
  @DeclDISPID(1610743856)  public void _GetScrollWidth(ByRef<Integer> ScrollWidth) throws ComException {
    assert(ScrollWidth != null);
    this._dispatchCall(1610743856,"_GetScrollWidth", DISPATCH_METHOD,null,ScrollWidth);
  }
  @DeclDISPID(269)  public void setScrollWidth(Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(269,"ScrollWidth", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(269)  public Float getScrollWidth() throws ComException {
    final Object obj = this._dispatchCall(269,"ScrollWidth", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(-2147418101)  public void setTag(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(-2147418101,"Tag", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(-2147418101)  public String getTag() throws ComException {
    final Object obj = this._dispatchCall(-2147418101,"Tag", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(-2147356415)  public void setTransitionEffect(com.wilutions.mslib.msforms.fmTransitionEffect value) throws ComException {
    assert(value != null);
    this._dispatchCall(-2147356415,"TransitionEffect", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(-2147356415)  public com.wilutions.mslib.msforms.fmTransitionEffect getTransitionEffect() throws ComException {
    final Object obj = this._dispatchCall(-2147356415,"TransitionEffect", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.msforms.fmTransitionEffect.valueOf((Integer)obj);
  }
  @DeclDISPID(-2147356414)  public void setTransitionPeriod(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(-2147356414,"TransitionPeriod", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(-2147356414)  public Integer getTransitionPeriod() throws ComException {
    final Object obj = this._dispatchCall(-2147356414,"TransitionPeriod", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(271)  public void setVerticalScrollBarSide(com.wilutions.mslib.msforms.fmVerticalScrollBarSide value) throws ComException {
    assert(value != null);
    this._dispatchCall(271,"VerticalScrollBarSide", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(271)  public com.wilutions.mslib.msforms.fmVerticalScrollBarSide getVerticalScrollBarSide() throws ComException {
    final Object obj = this._dispatchCall(271,"VerticalScrollBarSide", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.msforms.fmVerticalScrollBarSide.valueOf((Integer)obj);
  }
  @DeclDISPID(-2147418105)  public void setVisible(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(-2147418105,"Visible", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(-2147418105)  public Boolean getVisible() throws ComException {
    final Object obj = this._dispatchCall(-2147418105,"Visible", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(272)  public void setZoom(Short value) throws ComException {
    assert(value != null);
    this._dispatchCall(272,"Zoom", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(272)  public Short getZoom() throws ComException {
    final Object obj = this._dispatchCall(272,"Zoom", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Short)obj;
  }
  @DeclDISPID(1610743881)  public void _SetGridX(Integer GridX) throws ComException {
    assert(GridX != null);
    this._dispatchCall(1610743881,"_SetGridX", DISPATCH_METHOD,null,GridX);
  }
  @DeclDISPID(1610743882)  public void _GetGridX(ByRef<Integer> GridX) throws ComException {
    assert(GridX != null);
    this._dispatchCall(1610743882,"_GetGridX", DISPATCH_METHOD,null,GridX);
  }
  @DeclDISPID(1610743885)  public void _SetGridY(Integer GridY) throws ComException {
    assert(GridY != null);
    this._dispatchCall(1610743885,"_SetGridY", DISPATCH_METHOD,null,GridY);
  }
  @DeclDISPID(1610743886)  public void _GetGridY(ByRef<Integer> GridY) throws ComException {
    assert(GridY != null);
    this._dispatchCall(1610743886,"_GetGridY", DISPATCH_METHOD,null,GridY);
  }
  @DeclDISPID(512)  public void Copy() throws ComException {
    this._dispatchCall(512,"Copy", DISPATCH_METHOD,null);
  }
  @DeclDISPID(513)  public void Cut() throws ComException {
    this._dispatchCall(513,"Cut", DISPATCH_METHOD,null);
  }
  @DeclDISPID(514)  public void Paste() throws ComException {
    this._dispatchCall(514,"Paste", DISPATCH_METHOD,null);
  }
  @DeclDISPID(515)  public void RedoAction() throws ComException {
    this._dispatchCall(515,"RedoAction", DISPATCH_METHOD,null);
  }
  @DeclDISPID(516)  public void Repaint() throws ComException {
    this._dispatchCall(516,"Repaint", DISPATCH_METHOD,null);
  }
  @DeclDISPID(517)  public void Scroll(Object xAction, Object yAction) throws ComException {
    assert(xAction != null);
    assert(yAction != null);
    this._dispatchCall(517,"Scroll", DISPATCH_METHOD,null,xAction,yAction);
  }
  @DeclDISPID(518)  public void SetDefaultTabOrder() throws ComException {
    this._dispatchCall(518,"SetDefaultTabOrder", DISPATCH_METHOD,null);
  }
  @DeclDISPID(519)  public void UndoAction() throws ComException {
    this._dispatchCall(519,"UndoAction", DISPATCH_METHOD,null);
  }
  @DeclDISPID(-543)  public void setAccelerator(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(-543,"Accelerator", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(-543)  public String getAccelerator() throws ComException {
    final Object obj = this._dispatchCall(-543,"Accelerator", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(-2147418104)  public IDispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(-2147418104,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  public IPageImpl(String progId) throws ComException {
    super(progId, "{5CEF5613-713D-11CE-80C9-00AA00611080}");
  }
  protected IPageImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IPageImpl" + super.toString() + "]";
  }
}
