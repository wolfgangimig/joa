/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{15565190-78E9-9EE2-370D-3A5F38B4311E}")
public class IIsContributingChangedEventDataImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IIsContributingChangedEventData {
  @DeclDISPID(1610743808)  public Boolean getIsContributing() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"IsContributing", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  public IIsContributingChangedEventDataImpl(String progId) throws ComException {
    super(progId, "{D5C1C8FB-DC8A-45A3-AAA3-53B89D43CDE4}");
  }
  protected IIsContributingChangedEventDataImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IIsContributingChangedEventDataImpl" + super.toString() + "]";
  }
}
