/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{95358598-06D0-930F-2384-7DCFAAA7EE73}")
public class IVideoViewImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IVideoView {
  @DeclDISPID(1610743808)  public com.wilutions.mslib.uccollaborationlib.IVideoViewInformationDictionary getProperties() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Properties", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IVideoViewInformationDictionaryImpl.class);
  }
  @DeclDISPID(1610743809)  public void SetVideoViewMode(final com.wilutions.mslib.uccollaborationlib.VideoViewMode _mode) throws ComException {
    assert(_mode != null);
    this._dispatchCall(1610743809,"SetVideoViewMode", DISPATCH_METHOD,null,_mode.value);
  }
  @DeclDISPID(1610743810)  public void EnterFullScreen(final Integer[] _monitorIds) throws ComException {
    assert(_monitorIds != null);
    this._dispatchCall(1610743810,"EnterFullScreen", DISPATCH_METHOD,null,_monitorIds);
  }
  @DeclDISPID(1610743811)  public void LeaveFullScreen() throws ComException {
    this._dispatchCall(1610743811,"LeaveFullScreen", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1610743812)  public void DockVideo() throws ComException {
    this._dispatchCall(1610743812,"DockVideo", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1610743813)  public void UndockVideo() throws ComException {
    this._dispatchCall(1610743813,"UndockVideo", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1610743814)  public void ShowPano() throws ComException {
    this._dispatchCall(1610743814,"ShowPano", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1610743815)  public void HidePano() throws ComException {
    this._dispatchCall(1610743815,"HidePano", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1610743816)  public void ShowSelfVideo() throws ComException {
    this._dispatchCall(1610743816,"ShowSelfVideo", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1610743817)  public void HideSelfVideo() throws ComException {
    this._dispatchCall(1610743817,"HideSelfVideo", DISPATCH_METHOD,null);
  }
  public IVideoViewImpl(String progId) throws ComException {
    super(progId, "{55A21CF3-A2B3-484E-BE2A-14280F501289}");
  }
  protected IVideoViewImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IVideoViewImpl" + super.toString() + "]";
  }
}
