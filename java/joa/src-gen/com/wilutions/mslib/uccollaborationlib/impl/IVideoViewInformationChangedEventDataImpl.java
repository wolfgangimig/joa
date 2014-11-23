/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C8F897F6-0075-9BB8-1AD2-982F88365A57}")
public class IVideoViewInformationChangedEventDataImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IVideoViewInformationChangedEventData {
  @DeclDISPID(1610743808)  public com.wilutions.mslib.uccollaborationlib.VideoViewInformationType getType() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Type", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.VideoViewInformationType.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743809)  public Object getValue() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"Value", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  public IVideoViewInformationChangedEventDataImpl(String progId) throws ComException {
    super(progId, "{086F0E9D-A416-40F9-877C-F1C82DC1A6AD}");
  }
  protected IVideoViewInformationChangedEventDataImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IVideoViewInformationChangedEventDataImpl" + super.toString() + "]";
  }
}
