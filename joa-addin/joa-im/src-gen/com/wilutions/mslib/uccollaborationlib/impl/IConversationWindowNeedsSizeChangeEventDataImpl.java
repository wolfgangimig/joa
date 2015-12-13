/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{0AF57F98-9A0E-9E5A-3304-03FCDF5B042E}")
public class IConversationWindowNeedsSizeChangeEventDataImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IConversationWindowNeedsSizeChangeEventData {
  @DeclDISPID(1610743808)  public Integer getRecommendedWindowWidth() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"RecommendedWindowWidth", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610743809)  public Integer getRecommendedWindowHeight() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"RecommendedWindowHeight", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610743810)  public Integer getMinimumWindowWidth() throws ComException {
    final Object obj = this._dispatchCall(1610743810,"MinimumWindowWidth", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610743811)  public Integer getMinimumWindowHeight() throws ComException {
    final Object obj = this._dispatchCall(1610743811,"MinimumWindowHeight", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610743812)  public Integer getMaximumWindowWidth() throws ComException {
    final Object obj = this._dispatchCall(1610743812,"MaximumWindowWidth", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610743813)  public Integer getMaximumWindowHeight() throws ComException {
    final Object obj = this._dispatchCall(1610743813,"MaximumWindowHeight", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  public IConversationWindowNeedsSizeChangeEventDataImpl(String progId) throws ComException {
    super(progId, "{CA62E6F3-3E6D-451B-AEAA-6A1B7AACF8D4}");
  }
  protected IConversationWindowNeedsSizeChangeEventDataImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IConversationWindowNeedsSizeChangeEventDataImpl" + super.toString() + "]";
  }
}
