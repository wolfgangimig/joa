/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * CustomTaskPaneEvents.
 * 
 */
@CoInterface(guid="{8A64A872-FC6B-4D4A-926E-3A3689562C1C}")
public interface CustomTaskPaneEvents extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1)  public void onVisibleStateChange(final _CustomTaskPane CustomTaskPaneInst) throws ComException;
  @DeclDISPID(2)  public void onDockPositionStateChange(final _CustomTaskPane CustomTaskPaneInst) throws ComException;
}
