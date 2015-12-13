/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * ODSOFilters.
 * 
 */
@CoInterface(guid="{000C1534-0000-0000-C000-000000000046}")
public interface ODSOFilters extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(1)  public Integer getCount() throws ComException;
  @DeclDISPID(2)  public IDispatch getParent() throws ComException;
  @DeclDISPID(1610809346)  public IDispatch Item(final Integer Index) throws ComException;
  @DeclDISPID(1610809347)  public void Add(final String Column, final MsoFilterComparison Comparison, final MsoFilterConjunction Conjunction, final String bstrCompareTo, final Boolean DeferUpdate) throws ComException;
  @DeclDISPID(1610809348)  public void Delete(final Integer Index, final Boolean DeferUpdate) throws ComException;
}
