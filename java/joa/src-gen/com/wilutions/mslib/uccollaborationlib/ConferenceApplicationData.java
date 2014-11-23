/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ConferenceApplicationData.
 * ConferenceApplicationData Class 
 */
@CoClass(guid="{960390D4-C70D-43A1-B272-22E73BC4D4B6}")
public class ConferenceApplicationData extends Dispatch implements IConferenceApplicationData {
  @DeclDISPID(1610743808)  public IConferenceApplicationProperties getApplicationProperties(String _applicationId) throws ComException {
    assert(_applicationId != null);
    final Object obj = this._dispatchCall(1610743808,"ApplicationProperties", DISPATCH_PROPERTYGET,null,_applicationId);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IConferenceApplicationPropertiesImpl.class);
  }
  public ConferenceApplicationData() throws ComException {
    super("{960390D4-C70D-43A1-B272-22E73BC4D4B6}", "{BE6086A1-D436-4834-89EE-3CA4F8596A58}");
  }
  protected ConferenceApplicationData(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ConferenceApplicationData" + super.toString() + "]";
  }
}
