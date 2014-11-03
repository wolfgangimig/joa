/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * IMdcText.
 * 
 */
@CoInterface(guid="{8BD21D13-EC42-11CE-9E0D-00AA006002F3}")
public interface IMdcText extends IDispatch {
  @DeclDISPID(-500)  public void setAutoSize(Boolean value) throws ComException;
  @DeclDISPID(-500)  public Boolean getAutoSize() throws ComException;
  @DeclDISPID(217)  public void setAutoTab(Boolean value) throws ComException;
  @DeclDISPID(217)  public Boolean getAutoTab() throws ComException;
  @DeclDISPID(218)  public void setAutoWordSelect(Boolean value) throws ComException;
  @DeclDISPID(218)  public Boolean getAutoWordSelect() throws ComException;
  @DeclDISPID(-501)  public void setBackColor(OLE_COLOR value) throws ComException;
  @DeclDISPID(-501)  public OLE_COLOR getBackColor() throws ComException;
  @DeclDISPID(-502)  public void setBackStyle(fmBackStyle value) throws ComException;
  @DeclDISPID(-502)  public fmBackStyle getBackStyle() throws ComException;
  @DeclDISPID(-503)  public void setBorderColor(OLE_COLOR value) throws ComException;
  @DeclDISPID(-503)  public OLE_COLOR getBorderColor() throws ComException;
  @DeclDISPID(-504)  public void setBorderStyle(fmBorderStyle value) throws ComException;
  @DeclDISPID(-504)  public fmBorderStyle getBorderStyle() throws ComException;
  @DeclDISPID(25)  public Boolean getCanPaste() throws ComException;
  @DeclDISPID(212)  public void setCurLine(Integer value) throws ComException;
  @DeclDISPID(212)  public Integer getCurLine() throws ComException;
  @DeclDISPID(210)  public Integer getCurTargetX() throws ComException;
  @DeclDISPID(208)  public void setCurX(Integer value) throws ComException;
  @DeclDISPID(208)  public Integer getCurX() throws ComException;
  @DeclDISPID(-544)  public void setEnterKeyBehavior(Boolean value) throws ComException;
  @DeclDISPID(-544)  public Boolean getEnterKeyBehavior() throws ComException;
  @DeclDISPID(-514)  public void setEnabled(Boolean value) throws ComException;
  @DeclDISPID(-514)  public Boolean getEnabled() throws ComException;
  @DeclDISPID(-512)  public void setFont(Font value) throws ComException;
  @DeclDISPID(-512)  public Font getFont() throws ComException;
  @DeclDISPID(-513)  public void setForeColor(OLE_COLOR value) throws ComException;
  @DeclDISPID(-513)  public OLE_COLOR getForeColor() throws ComException;
  @DeclDISPID(207)  public void setHideSelection(Boolean value) throws ComException;
  @DeclDISPID(207)  public Boolean getHideSelection() throws ComException;
  @DeclDISPID(604)  public void setIntegralHeight(Boolean value) throws ComException;
  @DeclDISPID(604)  public Boolean getIntegralHeight() throws ComException;
  @DeclDISPID(214)  public Integer getLineCount() throws ComException;
  @DeclDISPID(10)  public void setLocked(Boolean value) throws ComException;
  @DeclDISPID(10)  public Boolean getLocked() throws ComException;
  @DeclDISPID(-533)  public void setMaxLength(Integer value) throws ComException;
  @DeclDISPID(-533)  public Integer getMaxLength() throws ComException;
  @DeclDISPID(-522)  public void setMouseIcon(com.wilutions.mslib.stdole.Picture value) throws ComException;
  @DeclDISPID(-522)  public com.wilutions.mslib.stdole.Picture getMouseIcon() throws ComException;
  @DeclDISPID(-521)  public void setMousePointer(fmMousePointer value) throws ComException;
  @DeclDISPID(-521)  public fmMousePointer getMousePointer() throws ComException;
  @DeclDISPID(-537)  public void setMultiLine(Boolean value) throws ComException;
  @DeclDISPID(-537)  public Boolean getMultiLine() throws ComException;
  @DeclDISPID(-534)  public void setPasswordChar(String value) throws ComException;
  @DeclDISPID(-534)  public String getPasswordChar() throws ComException;
  @DeclDISPID(-535)  public void setScrollBars(fmScrollBars value) throws ComException;
  @DeclDISPID(-535)  public fmScrollBars getScrollBars() throws ComException;
  @DeclDISPID(220)  public void setSelectionMargin(Boolean value) throws ComException;
  @DeclDISPID(220)  public Boolean getSelectionMargin() throws ComException;
  @DeclDISPID(-548)  public void setSelLength(Integer value) throws ComException;
  @DeclDISPID(-548)  public Integer getSelLength() throws ComException;
  @DeclDISPID(-547)  public void setSelStart(Integer value) throws ComException;
  @DeclDISPID(-547)  public Integer getSelStart() throws ComException;
  @DeclDISPID(-546)  public void setSelText(String value) throws ComException;
  @DeclDISPID(-546)  public String getSelText() throws ComException;
  @DeclDISPID(12)  public void setSpecialEffect(fmSpecialEffect value) throws ComException;
  @DeclDISPID(12)  public fmSpecialEffect getSpecialEffect() throws ComException;
  @DeclDISPID(-545)  public void setTabKeyBehavior(Boolean value) throws ComException;
  @DeclDISPID(-545)  public Boolean getTabKeyBehavior() throws ComException;
  @DeclDISPID(-517)  public void setText(String value) throws ComException;
  @DeclDISPID(-517)  public String getText() throws ComException;
  @DeclDISPID(10004)  public void setTextAlign(fmTextAlign value) throws ComException;
  @DeclDISPID(10004)  public fmTextAlign getTextAlign() throws ComException;
  @DeclDISPID(216)  public Integer getTextLength() throws ComException;
  @DeclDISPID(0)  public void setValue(Object value) throws ComException;
  @DeclDISPID(0)  public Object getValue() throws ComException;
  @DeclDISPID(-536)  public void setWordWrap(Boolean value) throws ComException;
  @DeclDISPID(-536)  public Boolean getWordWrap() throws ComException;
  @DeclDISPID(22)  public void Copy() throws ComException;
  @DeclDISPID(21)  public void Cut() throws ComException;
  @DeclDISPID(24)  public void Paste() throws ComException;
  @DeclDISPID(-542)  public void setIMEMode(fmIMEMode value) throws ComException;
  @DeclDISPID(-542)  public fmIMEMode getIMEMode() throws ComException;
  @DeclDISPID(224)  public void setEnterFieldBehavior(fmEnterFieldBehavior value) throws ComException;
  @DeclDISPID(224)  public fmEnterFieldBehavior getEnterFieldBehavior() throws ComException;
  @DeclDISPID(225)  public void setDragBehavior(fmDragBehavior value) throws ComException;
  @DeclDISPID(225)  public fmDragBehavior getDragBehavior() throws ComException;
}
