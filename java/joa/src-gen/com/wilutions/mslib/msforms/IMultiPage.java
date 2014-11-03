/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * IMultiPage.
 * 
 */
@CoInterface(guid="{04598FC9-866C-11CF-AB7C-00AA00C08FCF}")
public interface IMultiPage extends IDispatch {
  @DeclDISPID(-501)  public void setBackColor(OLE_COLOR value) throws ComException;
  @DeclDISPID(-501)  public OLE_COLOR getBackColor() throws ComException;
  @DeclDISPID(-513)  public void setForeColor(OLE_COLOR value) throws ComException;
  @DeclDISPID(-513)  public OLE_COLOR getForeColor() throws ComException;
  @DeclDISPID(-512)  public void setFont(Font value) throws ComException;
  @DeclDISPID(-512)  public Font getFont() throws ComException;
  @DeclDISPID(514)  public void setMultiRow(Boolean value) throws ComException;
  @DeclDISPID(514)  public Boolean getMultiRow() throws ComException;
  @DeclDISPID(513)  public void setStyle(fmTabStyle value) throws ComException;
  @DeclDISPID(513)  public fmTabStyle getStyle() throws ComException;
  @DeclDISPID(512)  public void setTabOrientation(fmTabOrientation value) throws ComException;
  @DeclDISPID(512)  public fmTabOrientation getTabOrientation() throws ComException;
  @DeclDISPID(1610743833)  public void _SetTabFixedWidth(Integer Width) throws ComException;
  @DeclDISPID(1610743834)  public void _GetTabFixedWidth(ByRef<Integer> Width) throws ComException;
  @DeclDISPID(1610743835)  public void _SetTabFixedHeight(Integer Height) throws ComException;
  @DeclDISPID(1610743836)  public void _GetTabFixedHeight(ByRef<Integer> Height) throws ComException;
  @DeclDISPID(-514)  public void setEnabled(Boolean value) throws ComException;
  @DeclDISPID(-514)  public Boolean getEnabled() throws ComException;
  @DeclDISPID(545)  public Page getSelectedItem() throws ComException;
  @DeclDISPID(0)  public Pages getPages() throws ComException;
  @DeclDISPID(528)  public void setValue(Integer value) throws ComException;
  @DeclDISPID(528)  public Integer getValue() throws ComException;
  @DeclDISPID(515)  public void setTabFixedWidth(Float value) throws ComException;
  @DeclDISPID(515)  public Float getTabFixedWidth() throws ComException;
  @DeclDISPID(516)  public void setTabFixedHeight(Float value) throws ComException;
  @DeclDISPID(516)  public Float getTabFixedHeight() throws ComException;
}
