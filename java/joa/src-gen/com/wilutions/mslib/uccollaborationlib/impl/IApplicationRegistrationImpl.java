/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{6AD6771E-5DA6-99B6-10B9-7475734DB168}")
public class IApplicationRegistrationImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IApplicationRegistration {
  @DeclDISPID(1610743808)  public void AddRegistration() throws ComException {
    this._dispatchCall(1610743808,"AddRegistration", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1610743809)  public void RemoveRegistration() throws ComException {
    this._dispatchCall(1610743809,"RemoveRegistration", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1610743810)  public void SetExtensibilityWindowProperties(String _intrnalUrl, String _externalUrl, com.wilutions.mslib.uccollaborationlib.ConversationWindowExtensionSize _windowSize) throws ComException {
    assert(_intrnalUrl != null);
    assert(_externalUrl != null);
    assert(_windowSize != null);
    this._dispatchCall(1610743810,"SetExtensibilityWindowProperties", DISPATCH_METHOD,null,_intrnalUrl,_externalUrl,_windowSize.value);
  }
  public IApplicationRegistrationImpl(String progId) throws ComException {
    super(progId, "{AA41EE75-F9C5-42F7-8D17-1D92D6BA4D92}");
  }
  protected IApplicationRegistrationImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IApplicationRegistrationImpl" + super.toString() + "]";
  }
}
