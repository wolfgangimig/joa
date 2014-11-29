/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * ITabStrip.
 * 
 */
@CoInterface(guid="{04598FC2-866C-11CF-AB7C-00AA00C08FCF}")
public interface ITabStrip extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(-501)  public void setBackColor(final OLE_COLOR value) throws ComException;
  @DeclDISPID(-501)  public OLE_COLOR getBackColor() throws ComException;
  @DeclDISPID(-513)  public void setForeColor(final OLE_COLOR value) throws ComException;
  @DeclDISPID(-513)  public OLE_COLOR getForeColor() throws ComException;
  @DeclDISPID(-512)  public void setFont(final Font value) throws ComException;
  @DeclDISPID(-512)  public Font getFont() throws ComException;
  @DeclDISPID(-514)  public void setEnabled(final Boolean value) throws ComException;
  @DeclDISPID(-514)  public Boolean getEnabled() throws ComException;
  @DeclDISPID(-522)  public void setMouseIcon(final com.wilutions.mslib.stdole.Picture value) throws ComException;
  @DeclDISPID(-522)  public com.wilutions.mslib.stdole.Picture getMouseIcon() throws ComException;
  @DeclDISPID(-521)  public void setMousePointer(final fmMousePointer value) throws ComException;
  @DeclDISPID(-521)  public fmMousePointer getMousePointer() throws ComException;
  @DeclDISPID(514)  public void setMultiRow(final Boolean value) throws ComException;
  @DeclDISPID(514)  public Boolean getMultiRow() throws ComException;
  @DeclDISPID(513)  public void setStyle(final fmTabStyle value) throws ComException;
  @DeclDISPID(513)  public fmTabStyle getStyle() throws ComException;
  @DeclDISPID(512)  public void setTabOrientation(final fmTabOrientation value) throws ComException;
  @DeclDISPID(512)  public fmTabOrientation getTabOrientation() throws ComException;
  @DeclDISPID(1610743840)  public void _SetTabFixedWidth(final Integer TabFixedWidth) throws ComException;
  @DeclDISPID(1610743841)  public void _GetTabFixedWidth(final ByRef<Integer> TabFixedWidth) throws ComException;
  @DeclDISPID(1610743842)  public void _SetTabFixedHeight(final Integer TabFixedHeight) throws ComException;
  @DeclDISPID(1610743843)  public void _GetTabFixedHeight(final ByRef<Integer> TabFixedHeight) throws ComException;
  @DeclDISPID(1610743844)  public void _GetClientTop(final ByRef<Integer> ClientTop) throws ComException;
  @DeclDISPID(548)  public Float getClientTop() throws ComException;
  @DeclDISPID(1610743846)  public void _GetClientLeft(final ByRef<Integer> ClientLeft) throws ComException;
  @DeclDISPID(547)  public Float getClientLeft() throws ComException;
  @DeclDISPID(1610743848)  public void _GetClientWidth(final ByRef<Integer> ClientWidth) throws ComException;
  @DeclDISPID(549)  public Float getClientWidth() throws ComException;
  @DeclDISPID(1610743850)  public void _GetClientHeight(final ByRef<Integer> ClientHeight) throws ComException;
  @DeclDISPID(546)  public Float getClientHeight() throws ComException;
  @DeclDISPID(0)  public Tabs getTabs() throws ComException;
  @DeclDISPID(545)  public Tab getSelectedItem() throws ComException;
  @DeclDISPID(528)  public void setValue(final Integer value) throws ComException;
  @DeclDISPID(528)  public Integer getValue() throws ComException;
  @DeclDISPID(515)  public void setTabFixedWidth(final Float value) throws ComException;
  @DeclDISPID(515)  public Float getTabFixedWidth() throws ComException;
  @DeclDISPID(516)  public void setTabFixedHeight(final Float value) throws ComException;
  @DeclDISPID(516)  public Float getTabFixedHeight() throws ComException;
}
