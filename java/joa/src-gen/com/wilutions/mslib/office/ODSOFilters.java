/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * ODSOFilters.
 * 
 */
@CoInterface(guid="{000C1534-0000-0000-C000-000000000046}")
public interface ODSOFilters extends IDispatch {
  @DeclDISPID(1610743808)  public Dispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(1)  public Integer getCount() throws ComException;
  @DeclDISPID(2)  public Dispatch getParent() throws ComException;
  @DeclDISPID(1610809346)  public Dispatch Item(Integer Index) throws ComException;
  @DeclDISPID(1610809347)  public void Add(String Column, MsoFilterComparison Comparison, MsoFilterConjunction Conjunction, String bstrCompareTo, Boolean DeferUpdate) throws ComException;
  @DeclDISPID(1610809348)  public void Delete(Integer Index, Boolean DeferUpdate) throws ComException;
}
