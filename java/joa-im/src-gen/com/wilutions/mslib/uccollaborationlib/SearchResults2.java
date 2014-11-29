/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * SearchResults2.
 * Represents all results of a search. 
 */
@CoClass(guid="{24290B3E-7DC8-485B-85A1-956BCD8D2C5C}")
public class SearchResults2 extends Dispatch implements ISearchResults2 {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(268435457)  public Object[] getFastResults() throws ComException {
    final Object obj = this._dispatchCall(268435457,"FastResults", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object[])obj;
  }
  @DeclDISPID(268435458)  public void GetPartialResults(final ByRef<ISearchResult[]> _results, final ByRef<Boolean> insert, final ByRef<Integer> index) throws ComException {
    assert(_results != null);
    assert(insert != null);
    assert(index != null);
    this._dispatchCall(268435458,"GetPartialResults", DISPATCH_METHOD,null,_results,insert,index);
  }
  public SearchResults2() throws ComException {
    super("{24290B3E-7DC8-485B-85A1-956BCD8D2C5C}", "{7CD92461-CA4F-4BEB-A636-8BBCC192E60F}");
  }
  protected SearchResults2(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[SearchResults2" + super.toString() + "]";
  }
}
