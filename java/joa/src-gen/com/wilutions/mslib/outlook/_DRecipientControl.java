/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * _DRecipientControl.
 * 
 */
@CoInterface(guid="{0006F025-0000-0000-C000-000000000046}")
public interface _DRecipientControl extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(-514)  public Byte getEnabled() throws ComException;
  @DeclDISPID(-514)  public void setEnabled(final Byte value) throws ComException;
  @DeclDISPID(-501)  public Integer getBackColor() throws ComException;
  @DeclDISPID(-501)  public void setBackColor(final Integer value) throws ComException;
  @DeclDISPID(-513)  public Integer getForeColor() throws ComException;
  @DeclDISPID(-513)  public void setForeColor(final Integer value) throws ComException;
  @DeclDISPID(-2147356664)  public Byte getReadOnly() throws ComException;
  @DeclDISPID(-2147356664)  public void setReadOnly(final Byte value) throws ComException;
  @DeclDISPID(-512)  public IDispatch getFont() throws ComException;
  @DeclDISPID(-512)  public void setFont(final IDispatch value) throws ComException;
  @DeclDISPID(12)  public Integer getSpecialEffect() throws ComException;
  @DeclDISPID(12)  public void setSpecialEffect(final Integer value) throws ComException;
}
