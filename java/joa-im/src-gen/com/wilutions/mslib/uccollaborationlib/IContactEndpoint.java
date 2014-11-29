/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IContactEndpoint.
 * IContactEndpoint Interface 
 */
@CoInterface(guid="{1FF0E6F1-2FE4-4E29-A123-557AF0DB6927}")
public interface IContactEndpoint extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public ContactEndpointType getType() throws ComException;
  @DeclDISPID(1610743809)  public String getDisplayName() throws ComException;
  @DeclDISPID(1610743810)  public String getUri() throws ComException;
  @DeclDISPID(1610743811)  public Boolean CanStart(ModalityTypes _modalityTypes) throws ComException;
}
