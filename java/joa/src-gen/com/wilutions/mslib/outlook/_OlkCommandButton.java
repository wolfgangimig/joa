/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * _OlkCommandButton.
 * 
 */
@CoInterface(guid="{000672DB-0000-0000-C000-000000000046}")
public interface _OlkCommandButton extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(-543)  public String getAccelerator() throws ComException;
  @DeclDISPID(-543)  public void setAccelerator(String value) throws ComException;
  @DeclDISPID(-500)  public Boolean getAutoSize() throws ComException;
  @DeclDISPID(-500)  public void setAutoSize(Boolean value) throws ComException;
  @DeclDISPID(-518)  public String getCaption() throws ComException;
  @DeclDISPID(-518)  public void setCaption(String value) throws ComException;
  @DeclDISPID(-514)  public Boolean getEnabled() throws ComException;
  @DeclDISPID(-514)  public void setEnabled(Boolean value) throws ComException;
  @DeclDISPID(-512)  public com.wilutions.mslib.stdole.Font getFont() throws ComException;
  @DeclDISPID(-522)  public com.wilutions.mslib.stdole.Picture getMouseIcon() throws ComException;
  @DeclDISPID(-522)  public void setMouseIcon(com.wilutions.mslib.stdole.Picture value) throws ComException;
  @DeclDISPID(-521)  public OlMousePointer getMousePointer() throws ComException;
  @DeclDISPID(-521)  public void setMousePointer(OlMousePointer value) throws ComException;
  @DeclDISPID(-536)  public Boolean getWordWrap() throws ComException;
  @DeclDISPID(-536)  public void setWordWrap(Boolean value) throws ComException;
  @DeclDISPID(10004)  public OlTextAlign getTextAlign() throws ComException;
  @DeclDISPID(10004)  public void setTextAlign(OlTextAlign value) throws ComException;
  @DeclDISPID(-523)  public com.wilutions.mslib.stdole.Picture getPicture() throws ComException;
  @DeclDISPID(-523)  public void setPicture(com.wilutions.mslib.stdole.Picture value) throws ComException;
  @DeclDISPID(26)  public OlPictureAlignment getPictureAlignment() throws ComException;
  @DeclDISPID(26)  public void setPictureAlignment(OlPictureAlignment value) throws ComException;
  @DeclDISPID(64544)  public Boolean getDisplayDropArrow() throws ComException;
  @DeclDISPID(64544)  public void setDisplayDropArrow(Boolean value) throws ComException;
}
