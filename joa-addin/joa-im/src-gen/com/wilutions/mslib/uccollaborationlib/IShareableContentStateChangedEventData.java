/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IShareableContentStateChangedEventData.
 * IShareableContentStateChangedEventData Interface 
 */
@CoInterface(guid="{94093301-8854-408E-8138-C7C3D2DACA1F}")
public interface IShareableContentStateChangedEventData extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public ShareableContentState getOldState() throws ComException;
  @DeclDISPID(1610743809)  public ShareableContentState getNewState() throws ComException;
}
