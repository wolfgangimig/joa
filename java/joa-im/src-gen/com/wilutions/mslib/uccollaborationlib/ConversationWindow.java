/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ConversationWindow.
 * ConversationWindow Class 
 */
@CoClass(guid="{440F28E7-13B4-4E6A-8483-65AD69B83070}")
public class ConversationWindow extends Dispatch implements IConversationWindow {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public IConversation getConversation() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Conversation", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IConversationImpl.class);
  }
  @DeclDISPID(1610743809)  public Integer getLeft() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"Left", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610743810)  public Integer getTop() throws ComException {
    final Object obj = this._dispatchCall(1610743810,"Top", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610743811)  public Integer getWidth() throws ComException {
    final Object obj = this._dispatchCall(1610743811,"Width", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610743812)  public Integer getHeight() throws ComException {
    final Object obj = this._dispatchCall(1610743812,"Height", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610743813)  public void Move(final Integer _left, final Integer _top) throws ComException {
    assert(_left != null);
    assert(_top != null);
    this._dispatchCall(1610743813,"Move", DISPATCH_METHOD,null,_left,_top);
  }
  @DeclDISPID(1610743814)  public void Resize(final Integer _width, final Integer _height) throws ComException {
    assert(_width != null);
    assert(_height != null);
    this._dispatchCall(1610743814,"Resize", DISPATCH_METHOD,null,_width,_height);
  }
  @DeclDISPID(1610743815)  public void MoveAndResize(final Integer _left, final Integer _top, final Integer _width, final Integer _height) throws ComException {
    assert(_left != null);
    assert(_top != null);
    assert(_width != null);
    assert(_height != null);
    this._dispatchCall(1610743815,"MoveAndResize", DISPATCH_METHOD,null,_left,_top,_width,_height);
  }
  @DeclDISPID(1610743816)  public void Close() throws ComException {
    this._dispatchCall(1610743816,"Close", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1610743817)  public void Dock(final Integer _parentHWND) throws ComException {
    assert(_parentHWND != null);
    this._dispatchCall(1610743817,"Dock", DISPATCH_METHOD,null,_parentHWND);
  }
  @DeclDISPID(1610743818)  public void Undock() throws ComException {
    this._dispatchCall(1610743818,"Undock", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1610743819)  public Boolean getIsDocked() throws ComException {
    final Object obj = this._dispatchCall(1610743819,"IsDocked", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743820)  public Boolean getIsFullScreen() throws ComException {
    final Object obj = this._dispatchCall(1610743820,"IsFullScreen", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743821)  public Integer getHandle() throws ComException {
    final Object obj = this._dispatchCall(1610743821,"Handle", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610743822)  public Integer getParentWindow() throws ComException {
    final Object obj = this._dispatchCall(1610743822,"ParentWindow", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610743823)  public IAsynchronousOperation OpenExtensibilityWindow(final String _applicationId, final Object _callback, final Object _state) throws ComException {
    assert(_applicationId != null);
    assert(_callback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743823,"OpenExtensibilityWindow", DISPATCH_METHOD,null,_applicationId,_callback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743824)  public void CloseExtensibilityWindow(final String _applicationId) throws ComException {
    assert(_applicationId != null);
    this._dispatchCall(1610743824,"CloseExtensibilityWindow", DISPATCH_METHOD,null,_applicationId);
  }
  @DeclDISPID(1610743825)  public void FlashExtensibilityWindow(final String _applicationId, final Boolean _flash) throws ComException {
    assert(_applicationId != null);
    assert(_flash != null);
    this._dispatchCall(1610743825,"FlashExtensibilityWindow", DISPATCH_METHOD,null,_applicationId,_flash);
  }
  public ConversationWindow() throws ComException {
    super("{440F28E7-13B4-4E6A-8483-65AD69B83070}", "{B1F5BCD8-69A6-4FC3-9EF0-9BD4AD999061}");
  }
  protected ConversationWindow(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ConversationWindow" + super.toString() + "]";
  }
}
