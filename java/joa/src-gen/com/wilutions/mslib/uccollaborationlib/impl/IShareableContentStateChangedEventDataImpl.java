/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{549EAA6A-2C37-9BCF-1C96-AE24772D36E5}")
public class IShareableContentStateChangedEventDataImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IShareableContentStateChangedEventData {
  @DeclDISPID(1610743808)  public com.wilutions.mslib.uccollaborationlib.ShareableContentState getOldState() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"OldState", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.ShareableContentState.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743809)  public com.wilutions.mslib.uccollaborationlib.ShareableContentState getNewState() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"NewState", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.ShareableContentState.valueOf((Integer)obj);
  }
  public IShareableContentStateChangedEventDataImpl(String progId) throws ComException {
    super(progId, "{94093301-8854-408E-8138-C7C3D2DACA1F}");
  }
  protected IShareableContentStateChangedEventDataImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IShareableContentStateChangedEventDataImpl" + super.toString() + "]";
  }
}
