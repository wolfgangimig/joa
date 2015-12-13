/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{490C1D01-2CE4-9E97-255B-E34DAE0A0BD8}")
public class IActiveContentChangedEventDataImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IActiveContentChangedEventData {
  @DeclDISPID(1610743808)  public com.wilutions.mslib.uccollaborationlib.IShareableContent getActiveContent() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"ActiveContent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IShareableContentImpl.class);
  }
  public IActiveContentChangedEventDataImpl(String progId) throws ComException {
    super(progId, "{899B846A-8887-45D6-B8F5-8AAA0BFDF722}");
  }
  protected IActiveContentChangedEventDataImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IActiveContentChangedEventDataImpl" + super.toString() + "]";
  }
}
