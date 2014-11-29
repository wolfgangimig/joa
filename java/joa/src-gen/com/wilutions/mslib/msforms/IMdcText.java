/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * IMdcText.
 * 
 */
@CoInterface(guid="{8BD21D13-EC42-11CE-9E0D-00AA006002F3}")
public interface IMdcText extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(-500)  public void setAutoSize(final Boolean value) throws ComException;
  @DeclDISPID(-500)  public Boolean getAutoSize() throws ComException;
  @DeclDISPID(217)  public void setAutoTab(final Boolean value) throws ComException;
  @DeclDISPID(217)  public Boolean getAutoTab() throws ComException;
  @DeclDISPID(218)  public void setAutoWordSelect(final Boolean value) throws ComException;
  @DeclDISPID(218)  public Boolean getAutoWordSelect() throws ComException;
  @DeclDISPID(-501)  public void setBackColor(final OLE_COLOR value) throws ComException;
  @DeclDISPID(-501)  public OLE_COLOR getBackColor() throws ComException;
  @DeclDISPID(-502)  public void setBackStyle(final fmBackStyle value) throws ComException;
  @DeclDISPID(-502)  public fmBackStyle getBackStyle() throws ComException;
  @DeclDISPID(-503)  public void setBorderColor(final OLE_COLOR value) throws ComException;
  @DeclDISPID(-503)  public OLE_COLOR getBorderColor() throws ComException;
  @DeclDISPID(-504)  public void setBorderStyle(final fmBorderStyle value) throws ComException;
  @DeclDISPID(-504)  public fmBorderStyle getBorderStyle() throws ComException;
  @DeclDISPID(25)  public Boolean getCanPaste() throws ComException;
  @DeclDISPID(212)  public void setCurLine(final Integer value) throws ComException;
  @DeclDISPID(212)  public Integer getCurLine() throws ComException;
  @DeclDISPID(210)  public Integer getCurTargetX() throws ComException;
  @DeclDISPID(208)  public void setCurX(final Integer value) throws ComException;
  @DeclDISPID(208)  public Integer getCurX() throws ComException;
  @DeclDISPID(-544)  public void setEnterKeyBehavior(final Boolean value) throws ComException;
  @DeclDISPID(-544)  public Boolean getEnterKeyBehavior() throws ComException;
  @DeclDISPID(-514)  public void setEnabled(final Boolean value) throws ComException;
  @DeclDISPID(-514)  public Boolean getEnabled() throws ComException;
  @DeclDISPID(-512)  public void setFont(final Font value) throws ComException;
  @DeclDISPID(-512)  public Font getFont() throws ComException;
  @DeclDISPID(-513)  public void setForeColor(final OLE_COLOR value) throws ComException;
  @DeclDISPID(-513)  public OLE_COLOR getForeColor() throws ComException;
  @DeclDISPID(207)  public void setHideSelection(final Boolean value) throws ComException;
  @DeclDISPID(207)  public Boolean getHideSelection() throws ComException;
  @DeclDISPID(604)  public void setIntegralHeight(final Boolean value) throws ComException;
  @DeclDISPID(604)  public Boolean getIntegralHeight() throws ComException;
  @DeclDISPID(214)  public Integer getLineCount() throws ComException;
  @DeclDISPID(10)  public void setLocked(final Boolean value) throws ComException;
  @DeclDISPID(10)  public Boolean getLocked() throws ComException;
  @DeclDISPID(-533)  public void setMaxLength(final Integer value) throws ComException;
  @DeclDISPID(-533)  public Integer getMaxLength() throws ComException;
  @DeclDISPID(-522)  public void setMouseIcon(final com.wilutions.mslib.stdole.Picture value) throws ComException;
  @DeclDISPID(-522)  public com.wilutions.mslib.stdole.Picture getMouseIcon() throws ComException;
  @DeclDISPID(-521)  public void setMousePointer(final fmMousePointer value) throws ComException;
  @DeclDISPID(-521)  public fmMousePointer getMousePointer() throws ComException;
  @DeclDISPID(-537)  public void setMultiLine(final Boolean value) throws ComException;
  @DeclDISPID(-537)  public Boolean getMultiLine() throws ComException;
  @DeclDISPID(-534)  public void setPasswordChar(final String value) throws ComException;
  @DeclDISPID(-534)  public String getPasswordChar() throws ComException;
  @DeclDISPID(-535)  public void setScrollBars(final fmScrollBars value) throws ComException;
  @DeclDISPID(-535)  public fmScrollBars getScrollBars() throws ComException;
  @DeclDISPID(220)  public void setSelectionMargin(final Boolean value) throws ComException;
  @DeclDISPID(220)  public Boolean getSelectionMargin() throws ComException;
  @DeclDISPID(-548)  public void setSelLength(final Integer value) throws ComException;
  @DeclDISPID(-548)  public Integer getSelLength() throws ComException;
  @DeclDISPID(-547)  public void setSelStart(final Integer value) throws ComException;
  @DeclDISPID(-547)  public Integer getSelStart() throws ComException;
  @DeclDISPID(-546)  public void setSelText(final String value) throws ComException;
  @DeclDISPID(-546)  public String getSelText() throws ComException;
  @DeclDISPID(12)  public void setSpecialEffect(final fmSpecialEffect value) throws ComException;
  @DeclDISPID(12)  public fmSpecialEffect getSpecialEffect() throws ComException;
  @DeclDISPID(-545)  public void setTabKeyBehavior(final Boolean value) throws ComException;
  @DeclDISPID(-545)  public Boolean getTabKeyBehavior() throws ComException;
  @DeclDISPID(-517)  public void setText(final String value) throws ComException;
  @DeclDISPID(-517)  public String getText() throws ComException;
  @DeclDISPID(10004)  public void setTextAlign(final fmTextAlign value) throws ComException;
  @DeclDISPID(10004)  public fmTextAlign getTextAlign() throws ComException;
  @DeclDISPID(216)  public Integer getTextLength() throws ComException;
  @DeclDISPID(0)  public void setValue(final Object value) throws ComException;
  @DeclDISPID(0)  public Object getValue() throws ComException;
  @DeclDISPID(-536)  public void setWordWrap(final Boolean value) throws ComException;
  @DeclDISPID(-536)  public Boolean getWordWrap() throws ComException;
  @DeclDISPID(22)  public void Copy() throws ComException;
  @DeclDISPID(21)  public void Cut() throws ComException;
  @DeclDISPID(24)  public void Paste() throws ComException;
  @DeclDISPID(-542)  public void setIMEMode(final fmIMEMode value) throws ComException;
  @DeclDISPID(-542)  public fmIMEMode getIMEMode() throws ComException;
  @DeclDISPID(224)  public void setEnterFieldBehavior(final fmEnterFieldBehavior value) throws ComException;
  @DeclDISPID(224)  public fmEnterFieldBehavior getEnterFieldBehavior() throws ComException;
  @DeclDISPID(225)  public void setDragBehavior(final fmDragBehavior value) throws ComException;
  @DeclDISPID(225)  public fmDragBehavior getDragBehavior() throws ComException;
}
