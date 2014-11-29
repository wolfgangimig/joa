/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * HistoryInfo.
 * HistoryInfo Class 
 */
@CoClass(guid="{14A62AE0-9D65-49F2-8331-EF85BFF91244}")
public class HistoryInfo extends Dispatch implements IHistoryInfo {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public HistoryInfoEntryType getType() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Type", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return HistoryInfoEntryType.valueOf((Integer)obj);
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
  @DeclDISPID(1610743811)  public IHistoryInfo[] getNestedHistory() throws ComException {
    final Object obj = this._dispatchCall(1610743811,"NestedHistory", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IHistoryInfo[])obj;
  }
  public HistoryInfo() throws ComException {
    super("{14A62AE0-9D65-49F2-8331-EF85BFF91244}", "{3DEBDC7E-811F-4304-BDD7-7D98C732026C}");
  }
  protected HistoryInfo(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[HistoryInfo" + super.toString() + "]";
  }
}
