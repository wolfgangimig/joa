/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IAudioDevice.
 * IAudioDevice Interface 
 */
@CoInterface(guid="{B0B0E8F8-32DA-4CB0-A124-D1E35891D53A}")
public interface IAudioDevice extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public String getName() throws ComException;
  @DeclDISPID(1610743809)  public Boolean getIsActive() throws ComException;
  @DeclDISPID(1610743810)  public String getId() throws ComException;
  @DeclDISPID(1610809344)  public DeviceType getType() throws ComException;
  @DeclDISPID(1610809345)  public Integer getPriority() throws ComException;
  @DeclDISPID(1610809346)  public Boolean getIsCertified() throws ComException;
}
