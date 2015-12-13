/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{26F3F147-6FC6-973D-3BF5-F537E305B047}")
public class ISignInDelayedEventDataImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.ISignInDelayedEventData {
  @DeclDISPID(1610743808)  public Integer getEstimatedStartDelay() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"EstimatedStartDelay", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610743809)  public Integer getStatusCode() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"StatusCode", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  public ISignInDelayedEventDataImpl(String progId) throws ComException {
    super(progId, "{E664682C-CBA5-4C7C-A65B-9CD046F24CBD}");
  }
  protected ISignInDelayedEventDataImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ISignInDelayedEventDataImpl" + super.toString() + "]";
  }
}
