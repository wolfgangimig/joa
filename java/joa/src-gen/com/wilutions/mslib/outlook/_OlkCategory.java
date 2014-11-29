/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * _OlkCategory.
 * 
 */
@CoInterface(guid="{000672F4-0000-0000-C000-000000000046}")
public interface _OlkCategory extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(-500)  public Boolean getAutoSize() throws ComException;
  @DeclDISPID(-500)  public void setAutoSize(final Boolean value) throws ComException;
  @DeclDISPID(-501)  public com.wilutions.mslib.stdole.OLE_COLOR getBackColor() throws ComException;
  @DeclDISPID(-501)  public void setBackColor(final com.wilutions.mslib.stdole.OLE_COLOR value) throws ComException;
  @DeclDISPID(-502)  public OlBackStyle getBackStyle() throws ComException;
  @DeclDISPID(-502)  public void setBackStyle(final OlBackStyle value) throws ComException;
  @DeclDISPID(-514)  public Boolean getEnabled() throws ComException;
  @DeclDISPID(-514)  public void setEnabled(final Boolean value) throws ComException;
  @DeclDISPID(-513)  public com.wilutions.mslib.stdole.OLE_COLOR getForeColor() throws ComException;
  @DeclDISPID(-513)  public void setForeColor(final com.wilutions.mslib.stdole.OLE_COLOR value) throws ComException;
  @DeclDISPID(-522)  public com.wilutions.mslib.stdole.Picture getMouseIcon() throws ComException;
  @DeclDISPID(-522)  public void setMouseIcon(final com.wilutions.mslib.stdole.Picture value) throws ComException;
  @DeclDISPID(-521)  public OlMousePointer getMousePointer() throws ComException;
  @DeclDISPID(-521)  public void setMousePointer(final OlMousePointer value) throws ComException;
}
