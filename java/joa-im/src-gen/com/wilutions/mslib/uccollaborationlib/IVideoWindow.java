/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IVideoWindow.
 * IVideoWindow interface 
 */
@CoInterface(guid="{56A868B4-0AD4-11CE-B03A-0020AF0BA770}")
public interface IVideoWindow extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public void setCaption(final String value) throws ComException;
  @DeclDISPID(1610743808)  public String getCaption() throws ComException;
  @DeclDISPID(1610743810)  public void setWindowStyle(final Integer value) throws ComException;
  @DeclDISPID(1610743810)  public Integer getWindowStyle() throws ComException;
  @DeclDISPID(1610743812)  public void setWindowStyleEx(final Integer value) throws ComException;
  @DeclDISPID(1610743812)  public Integer getWindowStyleEx() throws ComException;
  @DeclDISPID(1610743814)  public void setAutoShow(final Integer value) throws ComException;
  @DeclDISPID(1610743814)  public Integer getAutoShow() throws ComException;
  @DeclDISPID(1610743816)  public void setWindowState(final Integer value) throws ComException;
  @DeclDISPID(1610743816)  public Integer getWindowState() throws ComException;
  @DeclDISPID(1610743818)  public void setBackgroundPalette(final Integer value) throws ComException;
  @DeclDISPID(1610743818)  public Integer getBackgroundPalette() throws ComException;
  @DeclDISPID(1610743820)  public void setVisible(final Integer value) throws ComException;
  @DeclDISPID(1610743820)  public Integer getVisible() throws ComException;
  @DeclDISPID(1610743822)  public void setLeft(final Integer value) throws ComException;
  @DeclDISPID(1610743822)  public Integer getLeft() throws ComException;
  @DeclDISPID(1610743824)  public void setWidth(final Integer value) throws ComException;
  @DeclDISPID(1610743824)  public Integer getWidth() throws ComException;
  @DeclDISPID(1610743826)  public void setTop(final Integer value) throws ComException;
  @DeclDISPID(1610743826)  public Integer getTop() throws ComException;
  @DeclDISPID(1610743828)  public void setHeight(final Integer value) throws ComException;
  @DeclDISPID(1610743828)  public Integer getHeight() throws ComException;
  @DeclDISPID(1610743830)  public void setOwner(final Integer value) throws ComException;
  @DeclDISPID(1610743830)  public Integer getOwner() throws ComException;
  @DeclDISPID(1610743832)  public void setMessageDrain(final Integer value) throws ComException;
  @DeclDISPID(1610743832)  public Integer getMessageDrain() throws ComException;
  @DeclDISPID(1610743834)  public Integer getBorderColor() throws ComException;
  @DeclDISPID(1610743834)  public void setBorderColor(final Integer value) throws ComException;
  @DeclDISPID(1610743836)  public Integer getFullScreenMode() throws ComException;
  @DeclDISPID(1610743836)  public void setFullScreenMode(final Integer value) throws ComException;
  @DeclDISPID(1610743838)  public void SetWindowForeground(final Integer Focus) throws ComException;
  @DeclDISPID(1610743839)  public void NotifyOwnerMessage(final Integer hwnd, final Integer uMsg, final Integer wParam, final Integer lParam) throws ComException;
  @DeclDISPID(1610743840)  public void SetWindowPosition(final Integer Left, final Integer Top, final Integer Width, final Integer Height) throws ComException;
  @DeclDISPID(1610743841)  public void GetWindowPosition(final ByRef<Integer> pLeft, final ByRef<Integer> pTop, final ByRef<Integer> pWidth, final ByRef<Integer> pHeight) throws ComException;
  @DeclDISPID(1610743842)  public void GetMinIdealImageSize(final ByRef<Integer> pWidth, final ByRef<Integer> pHeight) throws ComException;
  @DeclDISPID(1610743843)  public void GetMaxIdealImageSize(final ByRef<Integer> pWidth, final ByRef<Integer> pHeight) throws ComException;
  @DeclDISPID(1610743844)  public void GetRestorePosition(final ByRef<Integer> pLeft, final ByRef<Integer> pTop, final ByRef<Integer> pWidth, final ByRef<Integer> pHeight) throws ComException;
  @DeclDISPID(1610743845)  public void HideCursor(final Integer HideCursor) throws ComException;
  @DeclDISPID(1610743846)  public void IsCursorHidden(final ByRef<Integer> CursorHidden) throws ComException;
}
