/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * IMsoCharacters.
 * 
 */
@CoInterface(guid="{000C1731-0000-0000-C000-000000000046}")
public interface IMsoCharacters extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(150)  public IDispatch getParent() throws ComException;
  @DeclDISPID(139)  public String getCaption() throws ComException;
  @DeclDISPID(139)  public void setCaption(final String value) throws ComException;
  @DeclDISPID(118)  public Integer getCount() throws ComException;
  @DeclDISPID(117)  public Object Delete() throws ComException;
  @DeclDISPID(146)  public ChartFont getFont() throws ComException;
  @DeclDISPID(252)  public Object Insert(final String bstr) throws ComException;
  @DeclDISPID(138)  public String getText() throws ComException;
  @DeclDISPID(138)  public void setText(final String value) throws ComException;
  @DeclDISPID(1522)  public String getPhoneticCharacters() throws ComException;
  @DeclDISPID(1522)  public void setPhoneticCharacters(final String value) throws ComException;
  @DeclDISPID(148)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(149)  public Integer getCreator() throws ComException;
}
