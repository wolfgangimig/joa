/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * IMsoEnvelopeVB.
 * 
 */
@CoInterface(guid="{000672AC-0000-0000-C000-000000000046}")
public interface IMsoEnvelopeVB extends IDispatch {
  @DeclDISPID(1)  public String getIntroduction() throws ComException;
  @DeclDISPID(1)  public void setIntroduction(String value) throws ComException;
  @DeclDISPID(2)  public Dispatch getItem() throws ComException;
  @DeclDISPID(3)  public Dispatch getParent() throws ComException;
  @DeclDISPID(4)  public Dispatch getCommandBars() throws ComException;
}
