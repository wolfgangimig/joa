/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{D82D8AAC-022D-9840-27FF-B8581636352F}")
public class IVoiceMailBatchEventDataImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IVoiceMailBatchEventData {
  @DeclDISPID(1610743808)  public com.wilutions.mslib.uccollaborationlib.IVoiceMailCollection getVoiceMails() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"VoiceMails", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IVoiceMailCollectionImpl.class);
  }
  public IVoiceMailBatchEventDataImpl(String progId) throws ComException {
    super(progId, "{18BA13C7-A64E-4301-BA51-D1BFB3C1C9D5}");
  }
  protected IVoiceMailBatchEventDataImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IVoiceMailBatchEventDataImpl" + super.toString() + "]";
  }
}
