/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * DiagramNodes.
 * 
 */
@CoInterface(guid="{000C036E-0000-0000-C000-000000000046}")
public interface DiagramNodes extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException;
  @DeclDISPID(0)  public DiagramNode Item(Object Index) throws ComException;
  @DeclDISPID(10)  public void SelectAll() throws ComException;
  @DeclDISPID(100)  public IDispatch getParent() throws ComException;
  @DeclDISPID(101)  public Integer getCount() throws ComException;
}
