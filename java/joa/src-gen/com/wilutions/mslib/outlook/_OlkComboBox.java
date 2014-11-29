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
  @DeclDISPID(-500)  public void setAutoSize(Boolean value) throws ComException;
  @DeclDISPID(217)  public Boolean getAutoTab() throws ComException;
  @DeclDISPID(217)  public void setAutoTab(Boolean value) throws ComException;
  @DeclDISPID(218)  public Boolean getAutoWordSelect() throws ComException;
  @DeclDISPID(218)  public void setAutoWordSelect(Boolean value) throws ComException;
  @DeclDISPID(-501)  public com.wilutions.mslib.stdole.OLE_COLOR getBackColor() throws ComException;
  @DeclDISPID(-501)  public void setBackColor(com.wilutions.mslib.stdole.OLE_COLOR value) throws ComException;
  @DeclDISPID(-504)  public OlBorderStyle getBorderStyle() throws ComException;
  @DeclDISPID(-504)  public void setBorderStyle(OlBorderStyle value) throws ComException;
  @DeclDISPID(225)  public OlDragBehavior getDragBehavior() throws ComException;
  @DeclDISPID(225)  public void setDragBehavior(OlDragBehavior value) throws ComException;
  @DeclDISPID(-514)  public Boolean getEnabled() throws ComException;
  @DeclDISPID(-514)  public void setEnabled(Boolean value) throws ComException;
  @DeclDISPID(224)  public OlEnterFieldBehavior getEnterFieldBehavior() throws ComException;
  @DeclDISPID(224)  public void setEnterFieldBehavior(OlEnterFieldBehavior value) throws ComException;
  @DeclDISPID(-512)  public com.wilutions.mslib.stdole.Font getFont() throws ComException;
  @DeclDISPID(-513)  public com.wilutions.mslib.stdole.OLE_COLOR getForeColor() throws ComException;
  @DeclDISPID(-513)  public void setForeColor(com.wilutions.mslib.stdole.OLE_COLOR value) throws ComException;
  @DeclDISPID(207)  public Boolean getHideSelection() throws ComException;
  @DeclDISPID(207)  public void setHideSelection(Boolean value) throws ComException;
  @DeclDISPID(10)  public Boolean getLocked() throws ComException;
  @DeclDISPID(10)  public void setLocked(Boolean value) throws ComException;
  @DeclDISPID(-533)  public Integer getMaxLength() throws ComException;
  @DeclDISPID(-533)  public void setMaxLength(Integer value) throws ComException;
  @DeclDISPID(-522)  public com.wilutions.mslib.stdole.Picture getMouseIcon() throws ComException;
  @DeclDISPID(-522)  public void setMouseIcon(com.wilutions.mslib.stdole.Picture value) throws ComException;
  @DeclDISPID(-521)  public OlMousePointer getMousePointer() throws ComException;
  @DeclDISPID(-521)  public void setMousePointer(OlMousePointer value) throws ComException;
  @DeclDISPID(220)  public Boolean getSelectionMargin() throws ComException;
  @DeclDISPID(220)  public void setSelectionMargin(Boolean value) throws ComException;
  @DeclDISPID(308)  public OlComboBoxStyle getStyle() throws ComException;
  @DeclDISPID(308)  public void setStyle(OlComboBoxStyle value) throws ComException;
  @DeclDISPID(-517)  public String getText() throws ComException;
  @DeclDISPID(-517)  public void setText(String value) throws ComException;
  @DeclDISPID(10004)  public OlTextAlign getTextAlign() throws ComException;
  @DeclDISPID(10004)  public void setTextAlign(OlTextAlign value) throws ComException;
  @DeclDISPID(611)  public Integer getTopIndex() throws ComException;
  @DeclDISPID(611)  public void setTopIndex(Integer value) throws ComException;
  @DeclDISPID(0)  public Object getValue() throws ComException;
  @DeclDISPID(0)  public void setValue(Object value) throws ComException;
  @DeclDISPID(-526)  public Integer getListIndex() throws ComException;
  @DeclDISPID(-526)  public void setListIndex(Integer value) throws ComException;
  @DeclDISPID(-531)  public Integer getListCount() throws ComException;
  @DeclDISPID(-547)  public Integer getSelStart() throws ComException;
  @DeclDISPID(-547)  public void setSelStart(Integer value) throws ComException;
  @DeclDISPID(-548)  public Integer getSelLength() throws ComException;
  @DeclDISPID(-548)  public void setSelLength(Integer value) throws ComException;
  @DeclDISPID(-546)  public String getSelText() throws ComException;
  @DeclDISPID(8457)  public String GetItem(Integer Index) throws ComException;
  @DeclDISPID(64478)  public void SetItem(Integer Index, String Item) throws ComException;
  @DeclDISPID(21)  public void Cut() throws ComException;
  @DeclDISPID(22)  public void Copy() throws ComException;
  @DeclDISPID(24)  public void Paste() throws ComException;
  @DeclDISPID(-554)  public void Clear() throws ComException;
  @DeclDISPID(-553)  public void AddItem(String ItemText, Object Index) throws ComException;
  @DeclDISPID(-555)  public void RemoveItem(Integer Index) throws ComException;
  @DeclDISPID(1001)  public void DropDown() throws ComException;
}
