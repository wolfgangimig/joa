/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{948F7BC0-4FF9-9D18-2972-4139C6CCD775}")
public class IMutedChangedEventDataImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IMutedChangedEventData {
  @DeclDISPID(1610743808)  public Boolean getIsMuted() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"IsMuted", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  public IMutedChangedEventDataImpl(String progId) throws ComException {
    super(progId, "{5418E2AB-EB9A-4659-B4DC-28DE633B2B8F}");
  }
  protected IMutedChangedEventDataImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IMutedChangedEventDataImpl" + super.toString() + "]";
  }
}
