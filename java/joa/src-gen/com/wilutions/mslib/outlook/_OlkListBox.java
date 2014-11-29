/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * _OlkListBox.
 * 
 */
@CoInterface(guid="{000672DF-0000-0000-C000-000000000046}")
public interface _OlkListBox extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(-504)  public OlBorderStyle getBorderStyle() throws ComException;
  @DeclDISPID(-504)  public void setBorderStyle(final OlBorderStyle value) throws ComException;
  @DeclDISPID(-501)  public com.wilutions.mslib.stdole.OLE_COLOR getBackColor() throws ComException;
  @DeclDISPID(-501)  public void setBackColor(final com.wilutions.mslib.stdole.OLE_COLOR value) throws ComException;
  @DeclDISPID(-514)  public Boolean getEnabled() throws ComException;
  @DeclDISPID(-514)  public void setEnabled(final Boolean value) throws ComException;
  @DeclDISPID(-512)  public com.wilutions.mslib.stdole.Font getFont() throws ComException;
  @DeclDISPID(-513)  public com.wilutions.mslib.stdole.OLE_COLOR getForeColor() throws ComException;
  @DeclDISPID(-513)  public void setForeColor(final com.wilutions.mslib.stdole.OLE_COLOR value) throws ComException;
  @DeclDISPID(10)  public Boolean getLocked() throws ComException;
  @DeclDISPID(10)  public void setLocked(final Boolean value) throws ComException;
  @DeclDISPID(504)  public OlMatchEntry getMatchEntry() throws ComException;
  @DeclDISPID(504)  public void setMatchEntry(final OlMatchEntry value) throws ComException;
  @DeclDISPID(-522)  public com.wilutions.mslib.stdole.Picture getMouseIcon() throws ComException;
  @DeclDISPID(-522)  public void setMouseIcon(final com.wilutions.mslib.stdole.Picture value) throws ComException;
  @DeclDISPID(-521)  public OlMousePointer getMousePointer() throws ComException;
  @DeclDISPID(-521)  public void setMousePointer(final OlMousePointer value) throws ComException;
  @DeclDISPID(-532)  public OlMultiSelect getMultiSelect() throws ComException;
  @DeclDISPID(-532)  public void setMultiSelect(final OlMultiSelect value) throws ComException;
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
  @DeclDISPID(8457)  public String GetItem(final Integer Index) throws ComException;
  @DeclDISPID(64478)  public void SetItem(final Integer Index, final String Item) throws ComException;
  @DeclDISPID(64479)  public Boolean GetSelected(final Integer Index) throws ComException;
  @DeclDISPID(64480)  public void SetSelected(final Integer Index, final Boolean Selected) throws ComException;
  @DeclDISPID(22)  public void Copy() throws ComException;
  @DeclDISPID(-554)  public void Clear() throws ComException;
  @DeclDISPID(-553)  public void AddItem(final String ItemText, final Object Index) throws ComException;
  @DeclDISPID(-555)  public void RemoveItem(final Integer Index) throws ComException;
}
