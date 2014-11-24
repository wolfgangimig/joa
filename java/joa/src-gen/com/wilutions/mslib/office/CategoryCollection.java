/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * CategoryCollection.
 * 
 */
@CoInterface(guid="{000C1734-0000-0000-C000-000000000046}")
public interface CategoryCollection extends IDispatch {
  @DeclDISPID(150)  public IDispatch getParent() throws ComException;
  @DeclDISPID(118)  public Integer getCount() throws ComException;
  @DeclDISPID(170)  public IMsoCategory Item(Object Index) throws ComException;
  @DeclDISPID(148)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(149)  public Integer getCreator() throws ComException;
  @DeclDISPID(0)  public IMsoCategory get_Default(Object Index) throws ComException;
}
