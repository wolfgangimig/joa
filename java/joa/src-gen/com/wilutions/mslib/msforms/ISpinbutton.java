/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * ISpinbutton.
 * 
 */
@CoInterface(guid="{79176FB3-B7F2-11CE-97EF-00AA006D2776}")
public interface ISpinbutton extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(-501)  public void setBackColor(OLE_COLOR value) throws ComException;
  @DeclDISPID(-501)  public OLE_COLOR getBackColor() throws ComException;
  @DeclDISPID(-513)  public void setForeColor(OLE_COLOR value) throws ComException;
  @DeclDISPID(-513)  public OLE_COLOR getForeColor() throws ComException;
  @DeclDISPID(-514)  public void setEnabled(Boolean value) throws ComException;
  @DeclDISPID(-514)  public Boolean getEnabled() throws ComException;
  @DeclDISPID(-521)  public void setMousePointer(fmMousePointer value) throws ComException;
  @DeclDISPID(-521)  public fmMousePointer getMousePointer() throws ComException;
  @DeclDISPID(0)  public void setValue(Integer value) throws ComException;
  @DeclDISPID(0)  public Integer getValue() throws ComException;
  @DeclDISPID(100)  public void setMin(Integer value) throws ComException;
  @DeclDISPID(100)  public Integer getMin() throws ComException;
  @DeclDISPID(101)  public void setMax(Integer value) throws ComException;
  @DeclDISPID(101)  public Integer getMax() throws ComException;
  @DeclDISPID(102)  public void setSmallChange(Integer value) throws ComException;
  @DeclDISPID(102)  public Integer getSmallChange() throws ComException;
  @DeclDISPID(105)  public void setOrientation(fmOrientation value) throws ComException;
  @DeclDISPID(105)  public fmOrientation getOrientation() throws ComException;
  @DeclDISPID(-522)  public void setMouseIcon(com.wilutions.mslib.stdole.Picture value) throws ComException;
  @DeclDISPID(-522)  public com.wilutions.mslib.stdole.Picture getMouseIcon() throws ComException;
  @DeclDISPID(106)  public void setDelay(Integer value) throws ComException;
  @DeclDISPID(106)  public Integer getDelay() throws ComException;
}
