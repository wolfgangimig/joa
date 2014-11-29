/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ApplicationRegistration.
 * ApplicationRegistration Class which registers or unregisters an application for the 
 * contextual conversation. This class object can be created by using the method 
 * CreateApplicationRegistration from the UCClinet object. 
 */
@CoClass(guid="{B7A53E76-8630-4A93-9771-940012A1371B}")
public class ApplicationRegistration extends Dispatch implements IApplicationRegistration {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public void AddRegistration() throws ComException {
    this._dispatchCall(1610743808,"AddRegistration", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1610743809)  public void RemoveRegistration() throws ComException {
    this._dispatchCall(1610743809,"RemoveRegistration", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1610743810)  public void SetExtensibilityWindowProperties(String _intrnalUrl, String _externalUrl, ConversationWindowExtensionSize _windowSize) throws ComException {
    assert(_intrnalUrl != null);
    assert(_externalUrl != null);
    assert(_windowSize != null);
    this._dispatchCall(1610743810,"SetExtensibilityWindowProperties", DISPATCH_METHOD,null,_intrnalUrl,_externalUrl,_windowSize.value);
  }
  public ApplicationRegistration() throws ComException {
    super("{B7A53E76-8630-4A93-9771-940012A1371B}", "{AA41EE75-F9C5-42F7-8D17-1D92D6BA4D92}");
  }
  protected ApplicationRegistration(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ApplicationRegistration" + super.toString() + "]";
  }
}
