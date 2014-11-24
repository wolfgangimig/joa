/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IConversationWindow2.
 * IConversationWindow2 Interface 
 */
@CoInterface(guid="{02DD541F-C863-4295-92AB-A4CF29F5D841}")
public interface IConversationWindow2 extends IDispatch {
  @DeclDISPID(268435457)  public ConversationWindowState getState() throws ComException;
  @DeclDISPID(268435458)  public IConversationWindowInformationDictionary getProperties() throws ComException;
  @DeclDISPID(268435459)  public IConversationWindowActions GetConversationWindowActions() throws ComException;
  @DeclDISPID(268435460)  public void SetPreferredAnnotationTool(AnnotationTool _annotationTool, Integer _annotationColor) throws ComException;
  @DeclDISPID(268435462)  public void ShowFullScreen(Integer _monitorId) throws ComException;
  @DeclDISPID(268435463)  public void ExitFullScreen() throws ComException;
  @DeclDISPID(268435464)  public void ShowContent() throws ComException;
  @DeclDISPID(268435465)  public void HideContent() throws ComException;
  @DeclDISPID(268435466)  public IVideoView getVideoView() throws ComException;
  @DeclDISPID(268435467)  public Boolean CanInvoke(ConversationWindowAction _action) throws ComException;
}
