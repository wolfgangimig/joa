/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * SeriesCollection.
 * 
 */
@CoInterface(guid="{000C170A-0000-0000-C000-000000000046}")
public interface SeriesCollection extends IDispatch {
  @DeclDISPID(150)  public IDispatch getParent() throws ComException;
  @DeclDISPID(181)  public IMsoSeries Add(Object Source, XlRowCol Rowcol, Object SeriesLabels, Object CategoryLabels, Object Replace) throws ComException;
  @DeclDISPID(118)  public Integer getCount() throws ComException;
  @DeclDISPID(227)  public Object Extend(Object Source, Object Rowcol, Object CategoryLabels) throws ComException;
  @DeclDISPID(170)  public IMsoSeries Item(Object Index) throws ComException;
  @DeclDISPID(-4)  public Object _NewEnum() throws ComException;
  @DeclDISPID(211)  public Object Paste(XlRowCol Rowcol, Object SeriesLabels, Object CategoryLabels, Object Replace, Object NewSeries) throws ComException;
  @DeclDISPID(1117)  public IMsoSeries NewSeries() throws ComException;
  @DeclDISPID(148)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(149)  public Integer getCreator() throws ComException;
  @DeclDISPID(0)  public IMsoSeries get_Default(Object Index) throws ComException;
}
