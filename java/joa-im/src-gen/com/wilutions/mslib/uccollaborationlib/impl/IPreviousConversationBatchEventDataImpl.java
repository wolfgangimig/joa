/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{2B460E5E-A8D6-91B2-13AB-D9F3A90E29BF}")
public class IPreviousConversationBatchEventDataImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IPreviousConversationBatchEventData {
  @DeclDISPID(1610743808)  public com.wilutions.mslib.uccollaborationlib.IPreviousConversationCollection getItems() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Items", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IPreviousConversationCollectionImpl.class);
  }
  public IPreviousConversationBatchEventDataImpl(String progId) throws ComException {
    super(progId, "{EBD19735-0CB5-4AF3-8E05-B0140CF9D545}");
  }
  protected IPreviousConversationBatchEventDataImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IPreviousConversationBatchEventDataImpl" + super.toString() + "]";
  }
}
