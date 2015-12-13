/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.joactrllib;
import com.wilutions.com.*;

/**
 * IJoaBridgeDialog.
 * 
 */
@CoInterface(guid="{092F3085-8620-4218-A38D-7F223DA710D9}")
public interface IJoaBridgeDialog extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(11)  public void ShowModal(final Object owner) throws ComException;
  @DeclDISPID(10)  public void Close() throws ComException;
  @DeclDISPID(1)  public Long getHWND() throws ComException;
  @DeclDISPID(1)  public void setHWND(final Long value) throws ComException;
  @DeclDISPID(2)  public String getTitle() throws ComException;
  @DeclDISPID(2)  public void setTitle(final String value) throws ComException;
  @DeclDISPID(12)  public Integer getX() throws ComException;
  @DeclDISPID(12)  public void setX(final Integer value) throws ComException;
  @DeclDISPID(13)  public Integer getY() throws ComException;
  @DeclDISPID(13)  public void setY(final Integer value) throws ComException;
  @DeclDISPID(14)  public Integer getWidth() throws ComException;
  @DeclDISPID(14)  public void setWidth(final Integer value) throws ComException;
  @DeclDISPID(15)  public Integer getHeight() throws ComException;
  @DeclDISPID(15)  public void setHeight(final Integer value) throws ComException;
  @DeclDISPID(16)  public Boolean getMinimizeBox() throws ComException;
  @DeclDISPID(16)  public void setMinimizeBox(final Boolean value) throws ComException;
  @DeclDISPID(17)  public Boolean getMaximizeBox() throws ComException;
  @DeclDISPID(17)  public void setMaximizeBox(final Boolean value) throws ComException;
  @DeclDISPID(18)  public Boolean getCenterOnOwner() throws ComException;
  @DeclDISPID(18)  public void setCenterOnOwner(final Boolean value) throws ComException;
  @DeclDISPID(19)  public Boolean getResizable() throws ComException;
  @DeclDISPID(19)  public void setResizable(final Boolean value) throws ComException;
  @DeclDISPID(20)  public Integer getMinHeight() throws ComException;
  @DeclDISPID(20)  public void setMinHeight(final Integer value) throws ComException;
  @DeclDISPID(21)  public Integer getMaxHeight() throws ComException;
  @DeclDISPID(21)  public void setMaxHeight(final Integer value) throws ComException;
  @DeclDISPID(22)  public Integer getMinWidth() throws ComException;
  @DeclDISPID(22)  public void setMinWidth(final Integer value) throws ComException;
  @DeclDISPID(23)  public Integer getMaxWidth() throws ComException;
  @DeclDISPID(23)  public void setMaxWidth(final Integer value) throws ComException;
  @DeclDISPID(24)  public void SetFocusOnFirstChildWindow() throws ComException;
  @DeclDISPID(25)  public void ShowModal2(final Long hwndOwner) throws ComException;
  @DeclDISPID(26)  public void ShowModal3(final IDispatch dispOwner) throws ComException;
}
