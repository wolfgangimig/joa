/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * IMsoContactCard.
 * 
 */
@CoInterface(guid="{000C03F0-0000-0000-C000-000000000046}")
public interface IMsoContactCard extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(1)  public String getAddress() throws ComException;
  @DeclDISPID(2)  public MsoContactCardAddressType getAddressType() throws ComException;
  @DeclDISPID(3)  public MsoContactCardType getCardType() throws ComException;
  @DeclDISPID(4)  public IDispatch getParent() throws ComException;
}
