/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{12285EBC-022C-93AE-223E-AA2043732466}")
public class IDistributionGroupExpansionStateChangedEventDataImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IDistributionGroupExpansionStateChangedEventData {
  @DeclDISPID(1610743808)  public Boolean getIsExpanded() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"IsExpanded", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  public IDistributionGroupExpansionStateChangedEventDataImpl(String progId) throws ComException {
    super(progId, "{D2BFC7D7-A64F-48EF-BF90-C3C7E684D89C}");
  }
  protected IDistributionGroupExpansionStateChangedEventDataImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IDistributionGroupExpansionStateChangedEventDataImpl" + super.toString() + "]";
  }
}
