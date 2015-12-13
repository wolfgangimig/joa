/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{2FCB998F-D181-9678-2EF6-673E6EE30F31}")
public class IConversationContextCollectionEventDataImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IConversationContextCollectionEventData {
  @DeclDISPID(1610743808)  public com.wilutions.mslib.uccollaborationlib.IConversationContext getContext() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Context", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IConversationContextImpl.class);
  }
  public IConversationContextCollectionEventDataImpl(String progId) throws ComException {
    super(progId, "{EF5C00E4-75E2-4D39-B358-0ED9CB14F3CB}");
  }
  protected IConversationContextCollectionEventDataImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IConversationContextCollectionEventDataImpl" + super.toString() + "]";
  }
}
