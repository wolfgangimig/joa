/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{F71B4E0C-BF07-914F-34EF-E6B523683525}")
public class ISearchResultImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.ISearchResult {
  @DeclDISPID(1610743808)  public Dispatch getResult() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Result", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(1610743809)  public String getHitHighlightSummary() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"HitHighlightSummary", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  public ISearchResultImpl(String progId) throws ComException {
    super(progId, "{378CD767-1B64-4A0E-A941-8F52869FC9DF}");
  }
  protected ISearchResultImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ISearchResultImpl" + super.toString() + "]";
  }
}
