/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{8CF0CC59-C936-929C-1120-55FB6095B008}")
public class IConversationHistoryItemAddedEventDataImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IConversationHistoryItemAddedEventData {
  @DeclDISPID(1610743808)  public Integer getItemIndex() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"ItemIndex", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  public IConversationHistoryItemAddedEventDataImpl(String progId) throws ComException {
    super(progId, "{4C675532-6D55-49DD-8C8E-3C1CC5624CF2}");
  }
  protected IConversationHistoryItemAddedEventDataImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IConversationHistoryItemAddedEventDataImpl" + super.toString() + "]";
  }
}
