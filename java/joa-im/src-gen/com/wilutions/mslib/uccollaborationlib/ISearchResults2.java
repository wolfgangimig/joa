/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ISearchResults2.
 * ISearchResults2 Interface 
 */
@CoInterface(guid="{7CD92461-CA4F-4BEB-A636-8BBCC192E60F}")
public interface ISearchResults2 extends IDispatch {
  @DeclDISPID(268435457)  public Object[] getFastResults() throws ComException;
  @DeclDISPID(268435458)  public void GetPartialResults(ByRef<ISearchResult[]> _results, ByRef<Boolean> insert, ByRef<Integer> index) throws ComException;
}
