/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * ICommandBarButtonEvents.
 * 
 */
@CoInterface(guid="{55F88890-7708-11D1-ACEB-006008961DA5}")
public interface ICommandBarButtonEvents extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1)  public void onClick(final CommandBarButton Ctrl, final ByRef<Boolean> CancelDefault) throws ComException;
}
