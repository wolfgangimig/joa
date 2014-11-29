/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * IPage.
 * 
 */
@CoInterface(guid="{5CEF5613-713D-11CE-80C9-00AA00611080}")
public interface IPage extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(0)  public Controls getControls() throws ComException;
  @DeclDISPID(256)  public Control getActiveControl() throws ComException;
  @DeclDISPID(257)  public Boolean getCanPaste() throws ComException;
  @DeclDISPID(258)  public Boolean getCanRedo() throws ComException;
  @DeclDISPID(259)  public Boolean getCanUndo() throws ComException;
  @DeclDISPID(260)  public void setCycle(fmCycle value) throws ComException;
  @DeclDISPID(260)  public fmCycle getCycle() throws ComException;
  @DeclDISPID(-518)  public void setCaption(String value) throws ComException;
  @DeclDISPID(-518)  public String getCaption() throws ComException;
  @DeclDISPID(-2147418043)  public void setControlTipText(String value) throws ComException;
  @DeclDISPID(-2147418043)  public String getControlTipText() throws ComException;
  @DeclDISPID(-514)  public void setEnabled(Boolean value) throws ComException;
  @DeclDISPID(-514)  public Boolean getEnabled() throws ComException;
  @DeclDISPID(-2147356416)  public void setIndex(Integer value) throws ComException;
  @DeclDISPID(-2147356416)  public Integer getIndex() throws ComException;
  @DeclDISPID(1610743824)  public void _GetInsideHeight(ByRef<Integer> InsideHeight) throws ComException;
  @DeclDISPID(262)  public Float getInsideHeight() throws ComException;
  @DeclDISPID(1610743826)  public void _GetInsideWidth(ByRef<Integer> InsideWidth) throws ComException;
  @DeclDISPID(263)  public Float getInsideWidth() throws ComException;
  @DeclDISPID(264)  public void setKeepScrollBarsVisible(fmScrollBars value) throws ComException;
  @DeclDISPID(264)  public fmScrollBars getKeepScrollBarsVisible() throws ComException;
  @DeclDISPID(-2147418112)  public void setName(String value) throws ComException;
  @DeclDISPID(-2147418112)  public String getName() throws ComException;
  @DeclDISPID(26)  public void setPictureAlignment(fmPictureAlignment value) throws ComException;
  @DeclDISPID(26)  public fmPictureAlignment getPictureAlignment() throws ComException;
  @DeclDISPID(-523)  public void setPicture(com.wilutions.mslib.stdole.Picture value) throws ComException;
  @DeclDISPID(-523)  public com.wilutions.mslib.stdole.Picture getPicture() throws ComException;
  @DeclDISPID(27)  public void setPictureSizeMode(fmPictureSizeMode value) throws ComException;
  @DeclDISPID(27)  public fmPictureSizeMode getPictureSizeMode() throws ComException;
  @DeclDISPID(28)  public void setPictureTiling(Boolean value) throws ComException;
  @DeclDISPID(28)  public Boolean getPictureTiling() throws ComException;
  @DeclDISPID(265)  public void setScrollBars(fmScrollBars value) throws ComException;
  @DeclDISPID(265)  public fmScrollBars getScrollBars() throws ComException;
  @DeclDISPID(1610743843)  public void _SetScrollHeight(Integer ScrollHeight) throws ComException;
  @DeclDISPID(1610743844)  public void _GetScrollHeight(ByRef<Integer> ScrollHeight) throws ComException;
  @DeclDISPID(266)  public void setScrollHeight(Float value) throws ComException;
  @DeclDISPID(266)  public Float getScrollHeight() throws ComException;
  @DeclDISPID(1610743847)  public void _SetScrollLeft(Integer ScrollLeft) throws ComException;
  @DeclDISPID(1610743848)  public void _GetScrollLeft(ByRef<Integer> ScrollLeft) throws ComException;
  @DeclDISPID(267)  public void setScrollLeft(Float value) throws ComException;
  @DeclDISPID(267)  public Float getScrollLeft() throws ComException;
  @DeclDISPID(1610743851)  public void _SetScrollTop(Integer ScrollTop) throws ComException;
  @DeclDISPID(1610743852)  public void _GetScrollTop(ByRef<Integer> ScrollTop) throws ComException;
  @DeclDISPID(268)  public void setScrollTop(Float value) throws ComException;
  @DeclDISPID(268)  public Float getScrollTop() throws ComException;
  @DeclDISPID(1610743855)  public void _SetScrollWidth(Integer ScrollWidth) throws ComException;
  @DeclDISPID(1610743856)  public void _GetScrollWidth(ByRef<Integer> ScrollWidth) throws ComException;
  @DeclDISPID(269)  public void setScrollWidth(Float value) throws ComException;
  @DeclDISPID(269)  public Float getScrollWidth() throws ComException;
  @DeclDISPID(-2147418101)  public void setTag(String value) throws ComException;
  @DeclDISPID(-2147418101)  public String getTag() throws ComException;
  @DeclDISPID(-2147356415)  public void setTransitionEffect(fmTransitionEffect value) throws ComException;
  @DeclDISPID(-2147356415)  public fmTransitionEffect getTransitionEffect() throws ComException;
  @DeclDISPID(-2147356414)  public void setTransitionPeriod(Integer value) throws ComException;
  @DeclDISPID(-2147356414)  public Integer getTransitionPeriod() throws ComException;
  @DeclDISPID(271)  public void setVerticalScrollBarSide(fmVerticalScrollBarSide value) throws ComException;
  @DeclDISPID(271)  public fmVerticalScrollBarSide getVerticalScrollBarSide() throws ComException;
  @DeclDISPID(-2147418105)  public void setVisible(Boolean value) throws ComException;
  @DeclDISPID(-2147418105)  public Boolean getVisible() throws ComException;
  @DeclDISPID(272)  public void setZoom(Short value) throws ComException;
  @DeclDISPID(272)  public Short getZoom() throws ComException;
  @DeclDISPID(1610743881)  public void _SetGridX(Integer GridX) throws ComException;
  @DeclDISPID(1610743882)  public void _GetGridX(ByRef<Integer> GridX) throws ComException;
  @DeclDISPID(1610743885)  public void _SetGridY(Integer GridY) throws ComException;
  @DeclDISPID(1610743886)  public void _GetGridY(ByRef<Integer> GridY) throws ComException;
  @DeclDISPID(512)  public void Copy() throws ComException;
  @DeclDISPID(513)  public void Cut() throws ComException;
  @DeclDISPID(514)  public void Paste() throws ComException;
  @DeclDISPID(515)  public void RedoAction() throws ComException;
  @DeclDISPID(516)  public void Repaint() throws ComException;
  @DeclDISPID(517)  public void Scroll(Object xAction, Object yAction) throws ComException;
  @DeclDISPID(518)  public void SetDefaultTabOrder() throws ComException;
  @DeclDISPID(519)  public void UndoAction() throws ComException;
  @DeclDISPID(-543)  public void setAccelerator(String value) throws ComException;
  @DeclDISPID(-543)  public String getAccelerator() throws ComException;
  @DeclDISPID(-2147418104)  public IDispatch getParent() throws ComException;
}
