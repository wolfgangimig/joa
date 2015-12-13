/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{BC4EBD0A-6E2C-90AA-3B98-E25B64651AF5}")
public class ISearchResults2Impl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.ISearchResults2 {
  @DeclDISPID(268435457)  public Object[] getFastResults() throws ComException {
    final Object obj = this._dispatchCall(268435457,"FastResults", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object[])obj;
  }
  @DeclDISPID(268435458)  public void GetPartialResults(final ByRef<com.wilutions.mslib.uccollaborationlib.ISearchResult[]> _results, final ByRef<Boolean> insert, final ByRef<Integer> index) throws ComException {
    assert(_results != null);
    assert(insert != null);
    assert(index != null);
    this._dispatchCall(268435458,"GetPartialResults", DISPATCH_METHOD,null,_results,insert,index);
  }
  public ISearchResults2Impl(String progId) throws ComException {
    super(progId, "{7CD92461-CA4F-4BEB-A636-8BBCC192E60F}");
  }
  protected ISearchResults2Impl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ISearchResults2Impl" + super.toString() + "]";
  }
}
