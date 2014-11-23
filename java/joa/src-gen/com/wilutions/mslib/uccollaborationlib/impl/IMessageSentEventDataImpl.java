/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{50CCEB16-59EC-9DAD-1DA8-A7C3FA9FC914}")
public class IMessageSentEventDataImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IMessageSentEventData {
  @DeclDISPID(1610743808)  public String getText() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Text", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743809)  public com.wilutions.mslib.uccollaborationlib.INamedPropertyList getFormats() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"Formats", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.INamedPropertyListImpl.class);
  }
  public IMessageSentEventDataImpl(String progId) throws ComException {
    super(progId, "{905B727D-FD8F-46EC-8006-CE245F6835EE}");
  }
  protected IMessageSentEventDataImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IMessageSentEventDataImpl" + super.toString() + "]";
  }
}
