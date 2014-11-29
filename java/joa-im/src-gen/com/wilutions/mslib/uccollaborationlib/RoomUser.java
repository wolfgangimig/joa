/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * RoomUser.
 * Roomuser class defines a room user in room. 
 */
@CoClass(guid="{AD75A6FB-14E3-4830-ADF1-C7067D6550A7}")
public class RoomUser extends Dispatch implements IRoomUser {
  static boolean __typelib__loaded = __TypeLib.load();
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
  public RoomUser() throws ComException {
    super("{AD75A6FB-14E3-4830-ADF1-C7067D6550A7}", "{68DA8699-6C6E-4390-BD82-709FF1DC1702}");
  }
  protected RoomUser(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[RoomUser" + super.toString() + "]";
  }
}
