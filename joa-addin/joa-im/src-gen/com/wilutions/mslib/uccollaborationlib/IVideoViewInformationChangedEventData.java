/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IVideoViewInformationChangedEventData.
 * IVideoViewInformationChangedEventData Interface 
 */
@CoInterface(guid="{086F0E9D-A416-40F9-877C-F1C82DC1A6AD}")
public interface IVideoViewInformationChangedEventData extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public VideoViewInformationType getType() throws ComException;
  @DeclDISPID(1610743809)  public Object getValue() throws ComException;
}
