/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * Tabs.
 * 
 */
@CoInterface(guid="{944ACF93-A1E6-11CE-8104-00AA00611080}")
public interface Tabs extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(60)  public Integer getCount() throws ComException;
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException;
  @DeclDISPID(1610743810)  public Tab _GetItemByIndex(final Integer lIndex) throws ComException;
  @DeclDISPID(1610743811)  public Tab _GetItemByName(final String bstr) throws ComException;
  @DeclDISPID(0)  public IDispatch Item(final Object varg) throws ComException;
  @DeclDISPID(1610743813)  public Object Enum() throws ComException;
  @DeclDISPID(66)  public Tab Add(final Object bstrName, final Object bstrCaption, final Object lIndex) throws ComException;
  @DeclDISPID(1610743815)  public Tab _Add(final String bstrName, final String bstrCaption) throws ComException;
  @DeclDISPID(1610743816)  public Tab _Insert(final String bstrName, final String bstrCaption, final Integer lIndex) throws ComException;
  @DeclDISPID(67)  public void Remove(final Object varg) throws ComException;
  @DeclDISPID(62)  public void Clear() throws ComException;
}
