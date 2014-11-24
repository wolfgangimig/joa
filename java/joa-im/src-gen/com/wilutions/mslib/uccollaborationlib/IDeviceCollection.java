/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IDeviceCollection.
 * IDeviceCollection Interface 
 */
@CoInterface(guid="{1F8EBE6F-7993-42CE-980A-A2F03793BE71}")
public interface IDeviceCollection extends IDispatch {
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCount() throws ComException;
  @DeclDISPID(0)  public IDevice getItem(Integer _index) throws ComException;
  @DeclDISPID(1610743811)  public Integer IndexOf(IDevice _device) throws ComException;
}
