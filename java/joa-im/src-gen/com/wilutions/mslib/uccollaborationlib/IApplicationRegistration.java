/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IApplicationRegistration.
 * IApplicationRegistration Interface 
 */
@CoInterface(guid="{AA41EE75-F9C5-42F7-8D17-1D92D6BA4D92}")
public interface IApplicationRegistration extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public void AddRegistration() throws ComException;
  @DeclDISPID(1610743809)  public void RemoveRegistration() throws ComException;
  @DeclDISPID(1610743810)  public void SetExtensibilityWindowProperties(String _intrnalUrl, String _externalUrl, ConversationWindowExtensionSize _windowSize) throws ComException;
}
