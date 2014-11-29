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
  @DeclDISPID(1610743808)  public void setCaption(String value) throws ComException;
  @DeclDISPID(1610743808)  public String getCaption() throws ComException;
  @DeclDISPID(1610743810)  public void setWindowStyle(Integer value) throws ComException;
  @DeclDISPID(1610743810)  public Integer getWindowStyle() throws ComException;
  @DeclDISPID(1610743812)  public void setWindowStyleEx(Integer value) throws ComException;
  @DeclDISPID(1610743812)  public Integer getWindowStyleEx() throws ComException;
  @DeclDISPID(1610743814)  public void setAutoShow(Integer value) throws ComException;
  @DeclDISPID(1610743814)  public Integer getAutoShow() throws ComException;
  @DeclDISPID(1610743816)  public void setWindowState(Integer value) throws ComException;
  @DeclDISPID(1610743816)  public Integer getWindowState() throws ComException;
  @DeclDISPID(1610743818)  public void setBackgroundPalette(Integer value) throws ComException;
  @DeclDISPID(1610743818)  public Integer getBackgroundPalette() throws ComException;
  @DeclDISPID(1610743820)  public void setVisible(Integer value) throws ComException;
  @DeclDISPID(1610743820)  public Integer getVisible() throws ComException;
  @DeclDISPID(1610743822)  public void setLeft(Integer value) throws ComException;
  @DeclDISPID(1610743822)  public Integer getLeft() throws ComException;
  @DeclDISPID(1610743824)  public void setWidth(Integer value) throws ComException;
  @DeclDISPID(1610743824)  public Integer getWidth() throws ComException;
  @DeclDISPID(1610743826)  public void setTop(Integer value) throws ComException;
  @DeclDISPID(1610743826)  public Integer getTop() throws ComException;
  @DeclDISPID(1610743828)  public void setHeight(Integer value) throws ComException;
  @DeclDISPID(1610743828)  public Integer getHeight() throws ComException;
  @DeclDISPID(1610743830)  public void setOwner(Integer value) throws ComException;
  @DeclDISPID(1610743830)  public Integer getOwner() throws ComException;
  @DeclDISPID(1610743832)  public void setMessageDrain(Integer value) throws ComException;
  @DeclDISPID(1610743832)  public Integer getMessageDrain() throws ComException;
  @DeclDISPID(1610743834)  public Integer getBorderColor() throws ComException;
  @DeclDISPID(1610743834)  public void setBorderColor(Integer value) throws ComException;
  @DeclDISPID(1610743836)  public Integer getFullScreenMode() throws ComException;
  @DeclDISPID(1610743836)  public void setFullScreenMode(Integer value) throws ComException;
  @DeclDISPID(1610743838)  public void SetWindowForeground(Integer Focus) throws ComException;
  @DeclDISPID(1610743839)  public void NotifyOwnerMessage(Integer hwnd, Integer uMsg, Integer wParam, Integer lParam) throws ComException;
  @DeclDISPID(1610743840)  public void SetWindowPosition(Integer Left, Integer Top, Integer Width, Integer Height) throws ComException;
  @DeclDISPID(1610743841)  public void GetWindowPosition(ByRef<Integer> pLeft, ByRef<Integer> pTop, ByRef<Integer> pWidth, ByRef<Integer> pHeight) throws ComException;
  @DeclDISPID(1610743842)  public void GetMinIdealImageSize(ByRef<Integer> pWidth, ByRef<Integer> pHeight) throws ComException;
  @DeclDISPID(1610743843)  public void GetMaxIdealImageSize(ByRef<Integer> pWidth, ByRef<Integer> pHeight) throws ComException;
  @DeclDISPID(1610743844)  public void GetRestorePosition(ByRef<Integer> pLeft, ByRef<Integer> pTop, ByRef<Integer> pWidth, ByRef<Integer> pHeight) throws ComException;
  @DeclDISPID(1610743845)  public void HideCursor(Integer HideCursor) throws ComException;
  @DeclDISPID(1610743846)  public void IsCursorHidden(ByRef<Integer> CursorHidden) throws ComException;
}
