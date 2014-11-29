/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IModalityStateChangedEventData.
 * IModalityStateChangedEventData Interface 
 */
@CoInterface(guid="{478DDA59-64C0-4429-AC8A-F10A940B52CC}")
public interface IModalityStateChangedEventData extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public ModalityState getOldState() throws ComException;
  @DeclDISPID(1610743809)  public ModalityState getNewState() throws ComException;
  @DeclDISPID(1610743810)  public Integer getStatusCode() throws ComException;
  @DeclDISPID(1610743811)  public IModalityStateChangePropertyDictionary getProperties() throws ComException;
  @DeclDISPID(1610743812)  public Integer getExtendedStatusCode() throws ComException;
}
