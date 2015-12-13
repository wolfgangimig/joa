/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{A84D1FF2-C80D-98D1-202C-1978542BEBF8}")
public class IRoomUserImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IRoomUser {
  @DeclDISPID(1610743808)  public String getUri() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Uri", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743809)  public Boolean getCanSendMessage() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"CanSendMessage", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  public IRoomUserImpl(String progId) throws ComException {
    super(progId, "{68DA8699-6C6E-4390-BD82-709FF1DC1702}");
  }
  protected IRoomUserImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IRoomUserImpl" + super.toString() + "]";
  }
}
