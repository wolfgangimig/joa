/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * SmartArtLayout.
 * 
 */
@CoInterface(guid="{000C03CA-0000-0000-C000-000000000046}")
public interface SmartArtLayout extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(1)  public IDispatch getParent() throws ComException;
  @DeclDISPID(2)  public String getId() throws ComException;
  @DeclDISPID(3)  public String getName() throws ComException;
  @DeclDISPID(4)  public String getDescription() throws ComException;
  @DeclDISPID(5)  public String getCategory() throws ComException;
}
