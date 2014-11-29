/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IPhone.
 * IPhone Interface 
 */
@CoInterface(guid="{7693221D-7E9F-47D3-8782-6437CF3D4C0C}")
public interface IPhone extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public IContactEndpoint getEndpoint() throws ComException;
  @DeclDISPID(1610743809)  public Boolean getPublished() throws ComException;
  @DeclDISPID(1610743809)  public void setPublished(Boolean value) throws ComException;
}
