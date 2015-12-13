/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * SeriesCollection.
 * 
 */
@CoInterface(guid="{000C170A-0000-0000-C000-000000000046}")
public interface SeriesCollection extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(150)  public IDispatch getParent() throws ComException;
  @DeclDISPID(181)  public IMsoSeries Add(final Object Source, final XlRowCol Rowcol, final Object SeriesLabels, final Object CategoryLabels, final Object Replace) throws ComException;
  @DeclDISPID(118)  public Integer getCount() throws ComException;
  @DeclDISPID(227)  public Object Extend(final Object Source, final Object Rowcol, final Object CategoryLabels) throws ComException;
  @DeclDISPID(170)  public IMsoSeries Item(final Object Index) throws ComException;
  @DeclDISPID(-4)  public Object _NewEnum() throws ComException;
  @DeclDISPID(211)  public Object Paste(final XlRowCol Rowcol, final Object SeriesLabels, final Object CategoryLabels, final Object Replace, final Object NewSeries) throws ComException;
  @DeclDISPID(1117)  public IMsoSeries NewSeries() throws ComException;
  @DeclDISPID(148)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(149)  public Integer getCreator() throws ComException;
  @DeclDISPID(0)  public IMsoSeries get_Default(final Object Index) throws ComException;
}
