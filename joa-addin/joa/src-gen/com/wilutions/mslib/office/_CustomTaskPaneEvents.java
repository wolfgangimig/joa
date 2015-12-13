/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * _CustomTaskPaneEvents.
 * 
 */
@CoInterface(guid="{000C033C-0000-0000-C000-000000000046}")
public interface _CustomTaskPaneEvents extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1)  public void onVisibleStateChange(final _CustomTaskPane CustomTaskPaneInst) throws ComException;
  @DeclDISPID(2)  public void onDockPositionStateChange(final _CustomTaskPane CustomTaskPaneInst) throws ComException;
}
