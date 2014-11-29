/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ConversationWindow2.
 * ConversationWindow2 Class 
 */
@CoClass(guid="{B58839E6-EB13-402D-BB2C-83EBAE14E6AA}")
public class ConversationWindow2 extends Dispatch implements IConversationWindow2 {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(268435457)  public ConversationWindowState getState() throws ComException {
    final Object obj = this._dispatchCall(268435457,"State", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return ConversationWindowState.valueOf((Integer)obj);
  }
  @DeclDISPID(268435458)  public IConversationWindowInformationDictionary getProperties() throws ComException {
    final Object obj = this._dispatchCall(268435458,"Properties", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IConversationWindowInformationDictionaryImpl.class);
  }
  @DeclDISPID(268435459)  public IConversationWindowActions GetConversationWindowActions() throws ComException {
    final Object obj = this._dispatchCall(268435459,"GetConversationWindowActions", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IConversationWindowActionsImpl.class);
  }
  @DeclDISPID(268435460)  public void SetPreferredAnnotationTool(AnnotationTool _annotationTool, Integer _annotationColor) throws ComException {
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
  @DeclDISPID(268435466)  public IVideoView getVideoView() throws ComException {
    final Object obj = this._dispatchCall(268435466,"VideoView", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IVideoViewImpl.class);
  }
  @DeclDISPID(268435467)  public Boolean CanInvoke(ConversationWindowAction _action) throws ComException {
    assert(_action != null);
    final Object obj = this._dispatchCall(268435467,"CanInvoke", DISPATCH_METHOD,null,_action.value);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  public ConversationWindow2() throws ComException {
    super("{B58839E6-EB13-402D-BB2C-83EBAE14E6AA}", "{02DD541F-C863-4295-92AB-A4CF29F5D841}");
  }
  protected ConversationWindow2(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ConversationWindow2" + super.toString() + "]";
  }
}
