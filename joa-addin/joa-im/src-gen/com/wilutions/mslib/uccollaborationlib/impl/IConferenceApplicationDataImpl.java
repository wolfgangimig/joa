/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{7EF71FCA-7055-9375-1440-55435DAE96A2}")
public class IConferenceApplicationDataImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IConferenceApplicationData {
  @DeclDISPID(1610743808)  public com.wilutions.mslib.uccollaborationlib.IConferenceApplicationProperties getApplicationProperties(final String _applicationId) throws ComException {
    assert(_applicationId != null);
    final Object obj = this._dispatchCall(1610743808,"ApplicationProperties", DISPATCH_PROPERTYGET,null,_applicationId);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IConferenceApplicationPropertiesImpl.class);
  }
  public IConferenceApplicationDataImpl(String progId) throws ComException {
    super(progId, "{BE6086A1-D436-4834-89EE-3CA4F8596A58}");
  }
  protected IConferenceApplicationDataImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IConferenceApplicationDataImpl" + super.toString() + "]";
  }
}
