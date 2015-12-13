/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * _OlkOptionButton.
 * 
 */
@CoInterface(guid="{000672DC-0000-0000-C000-000000000046}")
public interface _OlkOptionButton extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(-543)  public String getAccelerator() throws ComException;
  @DeclDISPID(-543)  public void setAccelerator(final String value) throws ComException;
  @DeclDISPID(710)  public OlAlignment getAlignment() throws ComException;
  @DeclDISPID(710)  public void setAlignment(final OlAlignment value) throws ComException;
  @DeclDISPID(-501)  public com.wilutions.mslib.stdole.OLE_COLOR getBackColor() throws ComException;
  @DeclDISPID(-501)  public void setBackColor(final com.wilutions.mslib.stdole.OLE_COLOR value) throws ComException;
  @DeclDISPID(-502)  public OlBackStyle getBackStyle() throws ComException;
  @DeclDISPID(-502)  public void setBackStyle(final OlBackStyle value) throws ComException;
  @DeclDISPID(-518)  public String getCaption() throws ComException;
  @DeclDISPID(-518)  public void setCaption(final String value) throws ComException;
  @DeclDISPID(-514)  public Boolean getEnabled() throws ComException;
  @DeclDISPID(-514)  public void setEnabled(final Boolean value) throws ComException;
  @DeclDISPID(-512)  public com.wilutions.mslib.stdole.Font getFont() throws ComException;
  @DeclDISPID(-513)  public com.wilutions.mslib.stdole.OLE_COLOR getForeColor() throws ComException;
  @DeclDISPID(-513)  public void setForeColor(final com.wilutions.mslib.stdole.OLE_COLOR value) throws ComException;
  @DeclDISPID(-541)  public String getGroupName() throws ComException;
  @DeclDISPID(-541)  public void setGroupName(final String value) throws ComException;
  @DeclDISPID(-522)  public com.wilutions.mslib.stdole.Picture getMouseIcon() throws ComException;
  @DeclDISPID(-522)  public void setMouseIcon(final com.wilutions.mslib.stdole.Picture value) throws ComException;
  @DeclDISPID(-521)  public OlMousePointer getMousePointer() throws ComException;
  @DeclDISPID(-521)  public void setMousePointer(final OlMousePointer value) throws ComException;
  @DeclDISPID(0)  public Object getValue() throws ComException;
  @DeclDISPID(0)  public void setValue(final Object value) throws ComException;
  @DeclDISPID(-536)  public Boolean getWordWrap() throws ComException;
  @DeclDISPID(-536)  public void setWordWrap(final Boolean value) throws ComException;
}
