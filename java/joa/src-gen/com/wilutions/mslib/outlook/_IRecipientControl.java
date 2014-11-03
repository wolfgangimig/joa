/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * _IRecipientControl.
 * 
 */
@CoInterface(guid="{D87E7E16-6897-11CE-A6C0-00AA00608FAA}")
public interface _IRecipientControl extends IDispatch {
  @DeclDISPID(-514)  public Byte getEnabled() throws ComException;
  @DeclDISPID(-514)  public void setEnabled(Byte Enabled) throws ComException;
  @DeclDISPID(-501)  public Integer getBackColor() throws ComException;
  @DeclDISPID(-501)  public void setBackColor(Integer BackColor) throws ComException;
  @DeclDISPID(-513)  public Integer getForeColor() throws ComException;
  @DeclDISPID(-513)  public void setForeColor(Integer ForeColor) throws ComException;
  @DeclDISPID(-2147356664)  public Byte getReadOnly() throws ComException;
  @DeclDISPID(-2147356664)  public void setReadOnly(Byte ReadOnly) throws ComException;
  @DeclDISPID(-512)  public Dispatch getFont() throws ComException;
  @DeclDISPID(-512)  public void setFont(Dispatch Font) throws ComException;
  @DeclDISPID(12)  public Integer getSpecialEffect() throws ComException;
  @DeclDISPID(12)  public void setSpecialEffect(Integer Effect) throws ComException;
}
