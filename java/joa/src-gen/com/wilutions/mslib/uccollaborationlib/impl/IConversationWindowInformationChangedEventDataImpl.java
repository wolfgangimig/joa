/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{3F94EB1F-E139-9575-287F-BDCA1D91054D}")
public class IConversationWindowInformationChangedEventDataImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IConversationWindowInformationChangedEventData {
  @DeclDISPID(1610743808)  public com.wilutions.mslib.uccollaborationlib.IConversationWindowInformationDictionary getChangedProperties() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"ChangedProperties", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IConversationWindowInformationDictionaryImpl.class);
  }
  public IConversationWindowInformationChangedEventDataImpl(String progId) throws ComException {
    super(progId, "{FF037274-455A-4E34-B5D1-D42DB866F9B7}");
  }
  protected IConversationWindowInformationChangedEventDataImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IConversationWindowInformationChangedEventDataImpl" + super.toString() + "]";
  }
}
