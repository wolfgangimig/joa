/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * _OlkComboBox.
 * 
 */
@CoInterface(guid="{000672DE-0000-0000-C000-000000000046}")
public interface _OlkComboBox extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(-500)  public Boolean getAutoSize() throws ComException;
  @DeclDISPID(-500)  public void setAutoSize(final Boolean value) throws ComException;
  @DeclDISPID(217)  public Boolean getAutoTab() throws ComException;
  @DeclDISPID(217)  public void setAutoTab(final Boolean value) throws ComException;
  @DeclDISPID(218)  public Boolean getAutoWordSelect() throws ComException;
  @DeclDISPID(218)  public void setAutoWordSelect(final Boolean value) throws ComException;
  @DeclDISPID(-501)  public com.wilutions.mslib.stdole.OLE_COLOR getBackColor() throws ComException;
  @DeclDISPID(-501)  public void setBackColor(final com.wilutions.mslib.stdole.OLE_COLOR value) throws ComException;
  @DeclDISPID(-504)  public OlBorderStyle getBorderStyle() throws ComException;
  @DeclDISPID(-504)  public void setBorderStyle(final OlBorderStyle value) throws ComException;
  @DeclDISPID(225)  public OlDragBehavior getDragBehavior() throws ComException;
  @DeclDISPID(225)  public void setDragBehavior(final OlDragBehavior value) throws ComException;
  @DeclDISPID(-514)  public Boolean getEnabled() throws ComException;
  @DeclDISPID(-514)  public void setEnabled(final Boolean value) throws ComException;
  @DeclDISPID(224)  public OlEnterFieldBehavior getEnterFieldBehavior() throws ComException;
  @DeclDISPID(224)  public void setEnterFieldBehavior(final OlEnterFieldBehavior value) throws ComException;
  @DeclDISPID(-512)  public com.wilutions.mslib.stdole.Font getFont() throws ComException;
  @DeclDISPID(-513)  public com.wilutions.mslib.stdole.OLE_COLOR getForeColor() throws ComException;
  @DeclDISPID(-513)  public void setForeColor(final com.wilutions.mslib.stdole.OLE_COLOR value) throws ComException;
  @DeclDISPID(207)  public Boolean getHideSelection() throws ComException;
  @DeclDISPID(207)  public void setHideSelection(final Boolean value) throws ComException;
  @DeclDISPID(10)  public Boolean getLocked() throws ComException;
  @DeclDISPID(10)  public void setLocked(final Boolean value) throws ComException;
  @DeclDISPID(-533)  public Integer getMaxLength() throws ComException;
  @DeclDISPID(-533)  public void setMaxLength(final Integer value) throws ComException;
  @DeclDISPID(-522)  public com.wilutions.mslib.stdole.Picture getMouseIcon() throws ComException;
  @DeclDISPID(-522)  public void setMouseIcon(final com.wilutions.mslib.stdole.Picture value) throws ComException;
  @DeclDISPID(-521)  public OlMousePointer getMousePointer() throws ComException;
  @DeclDISPID(-521)  public void setMousePointer(final OlMousePointer value) throws ComException;
  @DeclDISPID(220)  public Boolean getSelectionMargin() throws ComException;
  @DeclDISPID(220)  public void setSelectionMargin(final Boolean value) throws ComException;
  @DeclDISPID(308)  public OlComboBoxStyle getStyle() throws ComException;
  @DeclDISPID(308)  public void setStyle(final OlComboBoxStyle value) throws ComException;
  @DeclDISPID(-517)  public String getText() throws ComException;
  @DeclDISPID(-517)  public void setText(final String value) throws ComException;
  @DeclDISPID(10004)  public OlTextAlign getTextAlign() throws ComException;
  @DeclDISPID(10004)  public void setTextAlign(final OlTextAlign value) throws ComException;
  @DeclDISPID(611)  public Integer getTopIndex() throws ComException;
  @DeclDISPID(611)  public void setTopIndex(final Integer value) throws ComException;
  @DeclDISPID(0)  public Object getValue() throws ComException;
  @DeclDISPID(0)  public void setValue(final Object value) throws ComException;
  @DeclDISPID(-526)  public Integer getListIndex() throws ComException;
  @DeclDISPID(-526)  public void setListIndex(final Integer value) throws ComException;
  @DeclDISPID(-531)  public Integer getListCount() throws ComException;
  @DeclDISPID(-547)  public Integer getSelStart() throws ComException;
  @DeclDISPID(-547)  public void setSelStart(final Integer value) throws ComException;
  @DeclDISPID(-548)  public Integer getSelLength() throws ComException;
  @DeclDISPID(-548)  public void setSelLength(final Integer value) throws ComException;
  @DeclDISPID(-546)  public String getSelText() throws ComException;
  @DeclDISPID(8457)  public String GetItem(final Integer Index) throws ComException;
  @DeclDISPID(64478)  public void SetItem(final Integer Index, final String Item) throws ComException;
  @DeclDISPID(21)  public void Cut() throws ComException;
  @DeclDISPID(22)  public void Copy() throws ComException;
  @DeclDISPID(24)  public void Paste() throws ComException;
  @DeclDISPID(-554)  public void Clear() throws ComException;
  @DeclDISPID(-553)  public void AddItem(final String ItemText, final Object Index) throws ComException;
  @DeclDISPID(-555)  public void RemoveItem(final Integer Index) throws ComException;
  @DeclDISPID(1001)  public void DropDown() throws ComException;
}
