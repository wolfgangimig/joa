/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{FD7C4515-257C-9845-2079-147F62C5FE96}")
public class IHistoryInfoImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IHistoryInfo {
  @DeclDISPID(1610743808)  public com.wilutions.mslib.uccollaborationlib.HistoryInfoEntryType getType() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Type", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.HistoryInfoEntryType.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743809)  public String getUri() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"Uri", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743810)  public Integer getStatus() throws ComException {
    final Object obj = this._dispatchCall(1610743810,"Status", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610743811)  public com.wilutions.mslib.uccollaborationlib.IHistoryInfo[] getNestedHistory() throws ComException {
    final Object obj = this._dispatchCall(1610743811,"NestedHistory", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (com.wilutions.mslib.uccollaborationlib.IHistoryInfo[])obj;
  }
  public IHistoryInfoImpl(String progId) throws ComException {
    super(progId, "{3DEBDC7E-811F-4304-BDD7-7D98C732026C}");
  }
  protected IHistoryInfoImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IHistoryInfoImpl" + super.toString() + "]";
  }
}
