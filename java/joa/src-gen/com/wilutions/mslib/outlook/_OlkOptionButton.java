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
  @DeclDISPID(-543)  public void setAccelerator(String value) throws ComException;
  @DeclDISPID(710)  public OlAlignment getAlignment() throws ComException;
  @DeclDISPID(710)  public void setAlignment(OlAlignment value) throws ComException;
  @DeclDISPID(-501)  public com.wilutions.mslib.stdole.OLE_COLOR getBackColor() throws ComException;
  @DeclDISPID(-501)  public void setBackColor(com.wilutions.mslib.stdole.OLE_COLOR value) throws ComException;
  @DeclDISPID(-502)  public OlBackStyle getBackStyle() throws ComException;
  @DeclDISPID(-502)  public void setBackStyle(OlBackStyle value) throws ComException;
  @DeclDISPID(-518)  public String getCaption() throws ComException;
  @DeclDISPID(-518)  public void setCaption(String value) throws ComException;
  @DeclDISPID(-514)  public Boolean getEnabled() throws ComException;
  @DeclDISPID(-514)  public void setEnabled(Boolean value) throws ComException;
  @DeclDISPID(-512)  public com.wilutions.mslib.stdole.Font getFont() throws ComException;
  @DeclDISPID(-513)  public com.wilutions.mslib.stdole.OLE_COLOR getForeColor() throws ComException;
  @DeclDISPID(-513)  public void setForeColor(com.wilutions.mslib.stdole.OLE_COLOR value) throws ComException;
  @DeclDISPID(-541)  public String getGroupName() throws ComException;
  @DeclDISPID(-541)  public void setGroupName(String value) throws ComException;
  @DeclDISPID(-522)  public com.wilutions.mslib.stdole.Picture getMouseIcon() throws ComException;
  @DeclDISPID(-522)  public void setMouseIcon(com.wilutions.mslib.stdole.Picture value) throws ComException;
  @DeclDISPID(-521)  public OlMousePointer getMousePointer() throws ComException;
  @DeclDISPID(-521)  public void setMousePointer(OlMousePointer value) throws ComException;
  @DeclDISPID(0)  public Object getValue() throws ComException;
  @DeclDISPID(0)  public void setValue(Object value) throws ComException;
  @DeclDISPID(-536)  public Boolean getWordWrap() throws ComException;
  @DeclDISPID(-536)  public void setWordWrap(Boolean value) throws ComException;
}
