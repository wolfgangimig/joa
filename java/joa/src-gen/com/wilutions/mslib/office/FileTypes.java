/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * FileTypes.
 * 
 */
@CoInterface(guid="{000C036C-0000-0000-C000-000000000046}")
public interface FileTypes extends IDispatch {
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(0)  public MsoFileType getItem(Integer Index) throws ComException;
  @DeclDISPID(2)  public Integer getCount() throws ComException;
  @DeclDISPID(3)  public void Add(MsoFileType FileType) throws ComException;
  @DeclDISPID(4)  public void Remove(Integer Index) throws ComException;
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException;
}
