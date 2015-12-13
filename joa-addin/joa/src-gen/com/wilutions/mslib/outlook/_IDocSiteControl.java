/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * _IDocSiteControl.
 * 
 */
@CoInterface(guid="{43507DD0-811D-11CE-B565-00AA00608FAA}")
public interface _IDocSiteControl extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(-2147356664)  public Byte getReadOnly() throws ComException;
  @DeclDISPID(-2147356664)  public void setReadOnly(final Byte ReadOnly) throws ComException;
  @DeclDISPID(64483)  public Byte getSuppressAttachments() throws ComException;
  @DeclDISPID(64483)  public void setSuppressAttachments(final Byte SuppressAttachments) throws ComException;
}
