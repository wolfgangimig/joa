/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * DocumentProperties.
 * 
 */
@CoInterface(guid="{2DF8D04D-5BFA-101B-BDE5-00AA0044DE52}")
public interface DocumentProperties extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1)  public IDispatch getParent() throws ComException;
  @DeclDISPID(0)  public DocumentProperty getItem(Object Index, Integer lcid) throws ComException;
  @DeclDISPID(4)  public Integer getCount() throws ComException;
  @DeclDISPID(5)  public DocumentProperty Add(String Name, Boolean LinkToContent, Object Type, Object Value, Object LinkSource, Integer lcid) throws ComException;
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException;
  @DeclDISPID(1610743813)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743814)  public Integer getCreator() throws ComException;
}
