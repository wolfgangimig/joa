/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * IMdcList.
 * 
 */
@CoInterface(guid="{8BD21D23-EC42-11CE-9E0D-00AA006002F3}")
public interface IMdcList extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(-501)  public void setBackColor(OLE_COLOR value) throws ComException;
  @DeclDISPID(-501)  public OLE_COLOR getBackColor() throws ComException;
  @DeclDISPID(-503)  public void setBorderColor(OLE_COLOR value) throws ComException;
  @DeclDISPID(-503)  public OLE_COLOR getBorderColor() throws ComException;
  @DeclDISPID(-504)  public void setBorderStyle(fmBorderStyle value) throws ComException;
  @DeclDISPID(-504)  public fmBorderStyle getBorderStyle() throws ComException;
  @DeclDISPID(501)  public void setBoundColumn(Object value) throws ComException;
  @DeclDISPID(501)  public Object getBoundColumn() throws ComException;
  @DeclDISPID(601)  public void setColumnCount(Integer value) throws ComException;
  @DeclDISPID(601)  public Integer getColumnCount() throws ComException;
  @DeclDISPID(602)  public void setColumnHeads(Boolean value) throws ComException;
  @DeclDISPID(602)  public Boolean getColumnHeads() throws ComException;
  @DeclDISPID(603)  public void setColumnWidths(String value) throws ComException;
  @DeclDISPID(603)  public String getColumnWidths() throws ComException;
  @DeclDISPID(-514)  public void setEnabled(Boolean value) throws ComException;
  @DeclDISPID(-514)  public Boolean getEnabled() throws ComException;
  @DeclDISPID(-512)  public void setFont(Font value) throws ComException;
  @DeclDISPID(-512)  public Font getFont() throws ComException;
  @DeclDISPID(-513)  public void setForeColor(OLE_COLOR value) throws ComException;
  @DeclDISPID(-513)  public OLE_COLOR getForeColor() throws ComException;
  @DeclDISPID(604)  public void setIntegralHeight(Boolean value) throws ComException;
  @DeclDISPID(604)  public Boolean getIntegralHeight() throws ComException;
  @DeclDISPID(-531)  public Integer getListCount() throws ComException;
  @DeclDISPID(-526)  public void setListIndex(Object value) throws ComException;
  @DeclDISPID(-526)  public Object getListIndex() throws ComException;
  @DeclDISPID(307)  public void setListStyle(fmListStyle value) throws ComException;
  @DeclDISPID(307)  public fmListStyle getListStyle() throws ComException;
  @DeclDISPID(10)  public void setLocked(Boolean value) throws ComException;
  @DeclDISPID(10)  public Boolean getLocked() throws ComException;
  @DeclDISPID(504)  public void setMatchEntry(fmMatchEntry value) throws ComException;
  @DeclDISPID(504)  public fmMatchEntry getMatchEntry() throws ComException;
  @DeclDISPID(-522)  public void setMouseIcon(com.wilutions.mslib.stdole.Picture value) throws ComException;
  @DeclDISPID(-522)  public com.wilutions.mslib.stdole.Picture getMouseIcon() throws ComException;
  @DeclDISPID(-521)  public void setMousePointer(fmMousePointer value) throws ComException;
  @DeclDISPID(-521)  public fmMousePointer getMousePointer() throws ComException;
  @DeclDISPID(-532)  public void setMultiSelect(fmMultiSelect value) throws ComException;
  @DeclDISPID(-532)  public fmMultiSelect getMultiSelect() throws ComException;
  @DeclDISPID(12)  public void setSpecialEffect(fmSpecialEffect value) throws ComException;
  @DeclDISPID(12)  public fmSpecialEffect getSpecialEffect() throws ComException;
  @DeclDISPID(-517)  public void setText(String value) throws ComException;
  @DeclDISPID(-517)  public String getText() throws ComException;
  @DeclDISPID(502)  public void setTextColumn(Object value) throws ComException;
  @DeclDISPID(502)  public Object getTextColumn() throws ComException;
  @DeclDISPID(611)  public void setTopIndex(Object value) throws ComException;
  @DeclDISPID(611)  public Object getTopIndex() throws ComException;
  @DeclDISPID(0)  public void setValue(Object value) throws ComException;
  @DeclDISPID(0)  public Object getValue() throws ComException;
  @DeclDISPID(-529)  public Object getColumn(Object pvargColumn, Object pvargIndex) throws ComException;
  @DeclDISPID(-529)  public void setColumn(Object pvargColumn, Object pvargIndex, Object value3) throws ComException;
  @DeclDISPID(-528)  public Object getList(Object pvargIndex, Object pvargColumn) throws ComException;
  @DeclDISPID(-528)  public void setList(Object pvargIndex, Object pvargColumn, Object value3) throws ComException;
  @DeclDISPID(-527)  public Boolean getSelected(Object pvargIndex) throws ComException;
  @DeclDISPID(-527)  public void setSelected(Object pvargIndex, Boolean value2) throws ComException;
  @DeclDISPID(-553)  public void AddItem(Object pvargItem, Object pvargIndex) throws ComException;
  @DeclDISPID(-554)  public void Clear() throws ComException;
  @DeclDISPID(-555)  public void RemoveItem(Object pvargIndex) throws ComException;
  @DeclDISPID(-542)  public void setIMEMode(fmIMEMode value) throws ComException;
  @DeclDISPID(-542)  public fmIMEMode getIMEMode() throws ComException;
  @DeclDISPID(10004)  public void setTextAlign(fmTextAlign value) throws ComException;
  @DeclDISPID(10004)  public fmTextAlign getTextAlign() throws ComException;
}
