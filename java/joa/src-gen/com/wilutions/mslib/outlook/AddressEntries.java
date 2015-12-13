/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * AddressEntries.
 * 
 */
@CoInterface(guid="{0006304A-0000-0000-C000-000000000046}")
public interface AddressEntries extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(61440)  public _Application getApplication() throws ComException;
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException;
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException;
  @DeclDISPID(61441)  public IDispatch getParent() throws ComException;
  @DeclDISPID(80)  public Integer getCount() throws ComException;
  @DeclDISPID(81)  public AddressEntry Item(final Object Index) throws ComException;
  @DeclDISPID(95)  public AddressEntry Add(final String Type, final Object Name, final Object Address) throws ComException;
  @DeclDISPID(86)  public AddressEntry GetFirst() throws ComException;
  @DeclDISPID(88)  public AddressEntry GetLast() throws ComException;
  @DeclDISPID(87)  public AddressEntry GetNext() throws ComException;
  @DeclDISPID(89)  public AddressEntry GetPrevious() throws ComException;
  @DeclDISPID(97)  public void Sort(final Object Property, final Object Order) throws ComException;
}
