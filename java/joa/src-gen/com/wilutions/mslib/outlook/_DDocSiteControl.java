/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * _DDocSiteControl.
 * 
 */
@CoInterface(guid="{0006F026-0000-0000-C000-000000000046}")
public interface _DDocSiteControl extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(-2147356664)  public Byte getReadOnly() throws ComException;
  @DeclDISPID(-2147356664)  public void setReadOnly(final Byte value) throws ComException;
  @DeclDISPID(64483)  public Byte getSuppressAttachments() throws ComException;
  @DeclDISPID(64483)  public void setSuppressAttachments(final Byte value) throws ComException;
}
