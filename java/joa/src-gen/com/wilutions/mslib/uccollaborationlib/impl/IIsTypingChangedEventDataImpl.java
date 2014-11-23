/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{1B37C57E-B864-9137-1FE6-613FE49DD819}")
public class IIsTypingChangedEventDataImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IIsTypingChangedEventData {
  @DeclDISPID(1610743808)  public Boolean getIsTyping() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"IsTyping", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  public IIsTypingChangedEventDataImpl(String progId) throws ComException {
    super(progId, "{DBA05C15-1C07-4A76-8248-08D8416A24E3}");
  }
  protected IIsTypingChangedEventDataImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IIsTypingChangedEventDataImpl" + super.toString() + "]";
  }
}
