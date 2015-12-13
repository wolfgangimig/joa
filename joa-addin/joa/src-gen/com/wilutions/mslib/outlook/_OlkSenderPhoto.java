/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * _OlkSenderPhoto.
 * 
 */
@CoInterface(guid="{00067355-0000-0000-C000-000000000046}")
public interface _OlkSenderPhoto extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(-514)  public Boolean getEnabled() throws ComException;
  @DeclDISPID(-514)  public void setEnabled(final Boolean value) throws ComException;
  @DeclDISPID(-522)  public com.wilutions.mslib.stdole.Picture getMouseIcon() throws ComException;
  @DeclDISPID(-522)  public void setMouseIcon(final com.wilutions.mslib.stdole.Picture value) throws ComException;
  @DeclDISPID(-521)  public OlMousePointer getMousePointer() throws ComException;
  @DeclDISPID(-521)  public void setMousePointer(final OlMousePointer value) throws ComException;
  @DeclDISPID(64485)  public Integer getPreferredWidth() throws ComException;
  @DeclDISPID(64486)  public Integer getPreferredHeight() throws ComException;
}
