/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * CustomTaskPaneEvents.
 * 
 */
@CoInterface(guid="{8A64A872-FC6B-4D4A-926E-3A3689562C1C}")
public interface CustomTaskPaneEvents extends IDispatch {
  @DeclDISPID(1)  public void onVisibleStateChange(_CustomTaskPane CustomTaskPaneInst) throws ComException;
  @DeclDISPID(2)  public void onDockPositionStateChange(_CustomTaskPane CustomTaskPaneInst) throws ComException;
}
