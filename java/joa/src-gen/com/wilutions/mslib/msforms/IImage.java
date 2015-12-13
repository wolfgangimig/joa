/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * IImage.
 * 
 */
@CoInterface(guid="{4C599243-6926-101B-9992-00000B65C6F9}")
public interface IImage extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(-514)  public void setEnabled(final Boolean value) throws ComException;
  @DeclDISPID(-514)  public Boolean getEnabled() throws ComException;
  @DeclDISPID(-521)  public void setMousePointer(final fmMousePointer value) throws ComException;
  @DeclDISPID(-521)  public fmMousePointer getMousePointer() throws ComException;
  @DeclDISPID(-500)  public void setAutoSize(final Boolean value) throws ComException;
  @DeclDISPID(-500)  public Boolean getAutoSize() throws ComException;
  @DeclDISPID(-501)  public void setBackColor(final OLE_COLOR value) throws ComException;
  @DeclDISPID(-501)  public OLE_COLOR getBackColor() throws ComException;
  @DeclDISPID(-502)  public void setBackStyle(final fmBackStyle value) throws ComException;
  @DeclDISPID(-502)  public fmBackStyle getBackStyle() throws ComException;
  @DeclDISPID(-503)  public void setBorderColor(final OLE_COLOR value) throws ComException;
  @DeclDISPID(-503)  public OLE_COLOR getBorderColor() throws ComException;
  @DeclDISPID(-504)  public void setBorderStyle(final fmBorderStyle value) throws ComException;
  @DeclDISPID(-504)  public fmBorderStyle getBorderStyle() throws ComException;
  @DeclDISPID(-523)  public void setPicture(final com.wilutions.mslib.stdole.Picture value) throws ComException;
  @DeclDISPID(-523)  public com.wilutions.mslib.stdole.Picture getPicture() throws ComException;
  @DeclDISPID(-522)  public void setMouseIcon(final com.wilutions.mslib.stdole.Picture value) throws ComException;
  @DeclDISPID(-522)  public com.wilutions.mslib.stdole.Picture getMouseIcon() throws ComException;
  @DeclDISPID(27)  public void setPictureSizeMode(final fmPictureSizeMode value) throws ComException;
  @DeclDISPID(27)  public fmPictureSizeMode getPictureSizeMode() throws ComException;
  @DeclDISPID(26)  public void setPictureAlignment(final fmPictureAlignment value) throws ComException;
  @DeclDISPID(26)  public fmPictureAlignment getPictureAlignment() throws ComException;
  @DeclDISPID(28)  public void setPictureTiling(final Boolean value) throws ComException;
  @DeclDISPID(28)  public Boolean getPictureTiling() throws ComException;
  @DeclDISPID(12)  public void setSpecialEffect(final fmSpecialEffect value) throws ComException;
  @DeclDISPID(12)  public fmSpecialEffect getSpecialEffect() throws ComException;
}
