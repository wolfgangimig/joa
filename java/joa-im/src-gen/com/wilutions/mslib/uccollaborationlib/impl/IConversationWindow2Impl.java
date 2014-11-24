/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C24ACD74-6C00-99D4-0F05-CD288C0224BB}")
public class IConversationWindow2Impl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IConversationWindow2 {
  @DeclDISPID(268435457)  public com.wilutions.mslib.uccollaborationlib.ConversationWindowState getState() throws ComException {
    final Object obj = this._dispatchCall(268435457,"State", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.ConversationWindowState.valueOf((Integer)obj);
  }
  @DeclDISPID(268435458)  public com.wilutions.mslib.uccollaborationlib.IConversationWindowInformationDictionary getProperties() throws ComException {
    final Object obj = this._dispatchCall(268435458,"Properties", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IConversationWindowInformationDictionaryImpl.class);
  }
  @DeclDISPID(268435459)  public com.wilutions.mslib.uccollaborationlib.IConversationWindowActions GetConversationWindowActions() throws ComException {
    final Object obj = this._dispatchCall(268435459,"GetConversationWindowActions", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IConversationWindowActionsImpl.class);
  }
  @DeclDISPID(268435460)  public void SetPreferredAnnotationTool(com.wilutions.mslib.uccollaborationlib.AnnotationTool _annotationTool, Integer _annotationColor) throws ComException {
    assert(_annotationTool != null);
    assert(_annotationColor != null);
    this._dispatchCall(268435460,"SetPreferredAnnotationTool", DISPATCH_METHOD,null,_annotationTool.value,_annotationColor);
  }
  @DeclDISPID(268435462)  public void ShowFullScreen(Integer _monitorId) throws ComException {
    assert(_monitorId != null);
    this._dispatchCall(268435462,"ShowFullScreen", DISPATCH_METHOD,null,_monitorId);
  }
  @DeclDISPID(268435463)  public void ExitFullScreen() throws ComException {
    this._dispatchCall(268435463,"ExitFullScreen", DISPATCH_METHOD,null);
  }
  @DeclDISPID(268435464)  public void ShowContent() throws ComException {
    this._dispatchCall(268435464,"ShowContent", DISPATCH_METHOD,null);
  }
  @DeclDISPID(268435465)  public void HideContent() throws ComException {
    this._dispatchCall(268435465,"HideContent", DISPATCH_METHOD,null);
  }
  @DeclDISPID(268435466)  public com.wilutions.mslib.uccollaborationlib.IVideoView getVideoView() throws ComException {
    final Object obj = this._dispatchCall(268435466,"VideoView", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IVideoViewImpl.class);
  }
  @DeclDISPID(268435467)  public Boolean CanInvoke(com.wilutions.mslib.uccollaborationlib.ConversationWindowAction _action) throws ComException {
    assert(_action != null);
    final Object obj = this._dispatchCall(268435467,"CanInvoke", DISPATCH_METHOD,null,_action.value);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  public IConversationWindow2Impl(String progId) throws ComException {
    super(progId, "{02DD541F-C863-4295-92AB-A4CF29F5D841}");
  }
  protected IConversationWindow2Impl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IConversationWindow2Impl" + super.toString() + "]";
  }
}
