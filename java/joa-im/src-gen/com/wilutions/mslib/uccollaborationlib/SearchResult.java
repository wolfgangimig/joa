/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * SearchResult.
 * Represents a single result of a search that returns one or more results. 
 */
@CoClass(guid="{FACAB35B-EFE6-4228-82DB-5AAABC2DB239}")
public class SearchResult extends Dispatch implements ISearchResult {
  @DeclDISPID(1610743808)  public IDispatch getResult() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Result", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(1610743809)  public String getHitHighlightSummary() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"HitHighlightSummary", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  public SearchResult() throws ComException {
    super("{FACAB35B-EFE6-4228-82DB-5AAABC2DB239}", "{378CD767-1B64-4A0E-A941-8F52869FC9DF}");
  }
  protected SearchResult(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[SearchResult" + super.toString() + "]";
  }
}
