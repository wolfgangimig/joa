/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{BC69EEA6-D77E-93F3-1F1F-8544E4BA9E19}")
public class IConversationPropertyChangedEventDataImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IConversationPropertyChangedEventData {
  @DeclDISPID(1610743808)  public com.wilutions.mslib.uccollaborationlib.ConversationProperty getProperty() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Property", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.ConversationProperty.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743809)  public Object getValue() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"Value", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  public IConversationPropertyChangedEventDataImpl(String progId) throws ComException {
    super(progId, "{7CFE77CD-731D-48B2-82B1-ECA3414D62E3}");
  }
  protected IConversationPropertyChangedEventDataImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IConversationPropertyChangedEventDataImpl" + super.toString() + "]";
  }
}
