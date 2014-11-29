/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IVideoView.
 * IVideoView Interface 
 */
@CoInterface(guid="{55A21CF3-A2B3-484E-BE2A-14280F501289}")
public interface IVideoView extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public IVideoViewInformationDictionary getProperties() throws ComException;
  @DeclDISPID(1610743809)  public void SetVideoViewMode(final VideoViewMode _mode) throws ComException;
  @DeclDISPID(1610743810)  public void EnterFullScreen(final Integer[] _monitorIds) throws ComException;
  @DeclDISPID(1610743811)  public void LeaveFullScreen() throws ComException;
  @DeclDISPID(1610743812)  public void DockVideo() throws ComException;
  @DeclDISPID(1610743813)  public void UndockVideo() throws ComException;
  @DeclDISPID(1610743814)  public void ShowPano() throws ComException;
  @DeclDISPID(1610743815)  public void HidePano() throws ComException;
  @DeclDISPID(1610743816)  public void ShowSelfVideo() throws ComException;
  @DeclDISPID(1610743817)  public void HideSelfVideo() throws ComException;
}
