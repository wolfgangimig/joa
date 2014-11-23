/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{E8ABB9E2-1303-9624-0C37-188182E0B380}")
public class IGroupNameChangedEventDataImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IGroupNameChangedEventData {
  @DeclDISPID(1610743808)  public String getNewName() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"NewName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  public IGroupNameChangedEventDataImpl(String progId) throws ComException {
    super(progId, "{283C2089-B760-4D65-9199-716627174F7A}");
  }
  protected IGroupNameChangedEventDataImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IGroupNameChangedEventDataImpl" + super.toString() + "]";
  }
}
