/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{4A6821A5-F067-99C1-210D-8B039D799189}")
public class IDescriptionChangedEventDataImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IDescriptionChangedEventData {
  @DeclDISPID(1610743808)  public String getDescription() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Description", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  public IDescriptionChangedEventDataImpl(String progId) throws ComException {
    super(progId, "{8AFFB8CE-5404-4280-BCA3-E2E4388E6D73}");
  }
  protected IDescriptionChangedEventDataImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IDescriptionChangedEventDataImpl" + super.toString() + "]";
  }
}
