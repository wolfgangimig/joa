/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * _UserForm.
 * 
 */
@CoInterface(guid="{04598FC8-866C-11CF-AB7C-00AA00C08FCF}")
public interface _UserForm extends IDispatch {
  @DeclDISPID(256)  public Control getActiveControl() throws ComException;
  @DeclDISPID(-501)  public void setBackColor(OLE_COLOR value) throws ComException;
  @DeclDISPID(-501)  public OLE_COLOR getBackColor() throws ComException;
  @DeclDISPID(-503)  public void setBorderColor(OLE_COLOR value) throws ComException;
  @DeclDISPID(-503)  public OLE_COLOR getBorderColor() throws ComException;
  @DeclDISPID(-504)  public void setBorderStyle(fmBorderStyle value) throws ComException;
  @DeclDISPID(-504)  public fmBorderStyle getBorderStyle() throws ComException;
  @DeclDISPID(257)  public Boolean getCanPaste() throws ComException;
  @DeclDISPID(258)  public Boolean getCanRedo() throws ComException;
  @DeclDISPID(259)  public Boolean getCanUndo() throws ComException;
  @DeclDISPID(-518)  public void setCaption(String value) throws ComException;
  @DeclDISPID(-518)  public String getCaption() throws ComException;
  @DeclDISPID(0)  public Controls getControls() throws ComException;
  @DeclDISPID(260)  public void setCycle(fmCycle value) throws ComException;
  @DeclDISPID(260)  public fmCycle getCycle() throws ComException;
  @DeclDISPID(-514)  public void setEnabled(Boolean value) throws ComException;
  @DeclDISPID(-514)  public Boolean getEnabled() throws ComException;
  @DeclDISPID(-512)  public void setFont(Font value) throws ComException;
  @DeclDISPID(-512)  public Font getFont() throws ComException;
  @DeclDISPID(-513)  public void setForeColor(OLE_COLOR value) throws ComException;
  @DeclDISPID(-513)  public OLE_COLOR getForeColor() throws ComException;
  @DeclDISPID(1610743830)  public void _GetInsideHeight(ByRef<Integer> InsideHeight) throws ComException;
  @DeclDISPID(262)  public Float getInsideHeight() throws ComException;
  @DeclDISPID(1610743832)  public void _GetInsideWidth(ByRef<Integer> InsideWidth) throws ComException;
  @DeclDISPID(263)  public Float getInsideWidth() throws ComException;
  @DeclDISPID(264)  public void setKeepScrollBarsVisible(fmScrollBars value) throws ComException;
  @DeclDISPID(264)  public fmScrollBars getKeepScrollBarsVisible() throws ComException;
  @DeclDISPID(-522)  public void setMouseIcon(com.wilutions.mslib.stdole.Picture value) throws ComException;
  @DeclDISPID(-522)  public com.wilutions.mslib.stdole.Picture getMouseIcon() throws ComException;
  @DeclDISPID(-521)  public void setMousePointer(fmMousePointer value) throws ComException;
  @DeclDISPID(-521)  public fmMousePointer getMousePointer() throws ComException;
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
  @DeclDISPID(1610743852)  public void _SetScrollHeight(Integer ScrollHeight) throws ComException;
  @DeclDISPID(1610743853)  public void _GetScrollHeight(ByRef<Integer> ScrollHeight) throws ComException;
  @DeclDISPID(266)  public void setScrollHeight(Float value) throws ComException;
  @DeclDISPID(266)  public Float getScrollHeight() throws ComException;
  @DeclDISPID(1610743856)  public void _SetScrollLeft(Integer ScrollLeft) throws ComException;
  @DeclDISPID(1610743857)  public void _GetScrollLeft(ByRef<Integer> ScrollLeft) throws ComException;
  @DeclDISPID(267)  public void setScrollLeft(Float value) throws ComException;
  @DeclDISPID(267)  public Float getScrollLeft() throws ComException;
  @DeclDISPID(1610743860)  public void _SetScrollTop(Integer ScrollTop) throws ComException;
  @DeclDISPID(1610743861)  public void _GetScrollTop(ByRef<Integer> ScrollTop) throws ComException;
  @DeclDISPID(268)  public void setScrollTop(Float value) throws ComException;
  @DeclDISPID(268)  public Float getScrollTop() throws ComException;
  @DeclDISPID(1610743864)  public void _SetScrollWidth(Integer ScrollWidth) throws ComException;
  @DeclDISPID(1610743865)  public void _GetScrollWidth(ByRef<Integer> ScrollWidth) throws ComException;
  @DeclDISPID(269)  public void setScrollWidth(Float value) throws ComException;
  @DeclDISPID(269)  public Float getScrollWidth() throws ComException;
  @DeclDISPID(12)  public void setSpecialEffect(fmSpecialEffect value) throws ComException;
  @DeclDISPID(12)  public fmSpecialEffect getSpecialEffect() throws ComException;
  @DeclDISPID(271)  public void setVerticalScrollBarSide(fmVerticalScrollBarSide value) throws ComException;
  @DeclDISPID(271)  public fmVerticalScrollBarSide getVerticalScrollBarSide() throws ComException;
  @DeclDISPID(272)  public void setZoom(Short value) throws ComException;
  @DeclDISPID(272)  public Short getZoom() throws ComException;
  @DeclDISPID(512)  public void Copy() throws ComException;
  @DeclDISPID(513)  public void Cut() throws ComException;
  @DeclDISPID(514)  public void Paste() throws ComException;
  @DeclDISPID(515)  public void RedoAction() throws ComException;
  @DeclDISPID(516)  public void Repaint() throws ComException;
  @DeclDISPID(517)  public void Scroll(Object xAction, Object yAction) throws ComException;
  @DeclDISPID(518)  public void SetDefaultTabOrder() throws ComException;
  @DeclDISPID(519)  public void UndoAction() throws ComException;
  @DeclDISPID(1610743893)  public void _SetGridX(Integer GridX) throws ComException;
  @DeclDISPID(1610743894)  public void _GetGridX(ByRef<Integer> GridX) throws ComException;
  @DeclDISPID(1610743897)  public void _SetGridY(Integer GridY) throws ComException;
  @DeclDISPID(1610743898)  public void _GetGridY(ByRef<Integer> GridY) throws ComException;
  @DeclDISPID(395)  public void setDrawBuffer(Integer value) throws ComException;
  @DeclDISPID(395)  public Integer getDrawBuffer() throws ComException;
}
