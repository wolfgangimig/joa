/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{D7F4CC08-8BC6-9DEC-12E9-56E85CAF1018}")
public class IContentCollectionChangedEventDataImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IContentCollectionChangedEventData {
  @DeclDISPID(1610743808)  public com.wilutions.mslib.uccollaborationlib.IShareableContent getItem() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Item", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IShareableContentImpl.class);
  }
  public IContentCollectionChangedEventDataImpl(String progId) throws ComException {
    super(progId, "{17635563-2FA5-46AD-8F47-3F0FF958ECE2}");
  }
  protected IContentCollectionChangedEventDataImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IContentCollectionChangedEventDataImpl" + super.toString() + "]";
  }
}
