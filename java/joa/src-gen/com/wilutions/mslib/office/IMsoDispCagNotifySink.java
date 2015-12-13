/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * IMsoDispCagNotifySink.
 * 
 */
@CoInterface(guid="{000C0359-0000-0000-C000-000000000046}")
public interface IMsoDispCagNotifySink extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1)  public void InsertClip(final Object pClipMoniker, final Object pItemMoniker) throws ComException;
  @DeclDISPID(2)  public void WindowIsClosing() throws ComException;
}
