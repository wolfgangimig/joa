/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IVideoDevice.
 * IVideoDevice Interface 
 */
@CoInterface(guid="{DA7CF784-67DF-429C-82FB-9AFD99F6CCCB}")
public interface IVideoDevice extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public String getName() throws ComException;
  @DeclDISPID(1610743809)  public Boolean getIsActive() throws ComException;
  @DeclDISPID(1610743810)  public String getId() throws ComException;
}
