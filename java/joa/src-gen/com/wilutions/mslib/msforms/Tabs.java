/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * Tabs.
 * 
 */
@CoInterface(guid="{944ACF93-A1E6-11CE-8104-00AA00611080}")
public interface Tabs extends IDispatch {
  @DeclDISPID(60)  public Integer getCount() throws ComException;
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException;
  @DeclDISPID(1610743810)  public Tab _GetItemByIndex(Integer lIndex) throws ComException;
  @DeclDISPID(1610743811)  public Tab _GetItemByName(String bstr) throws ComException;
  @DeclDISPID(0)  public IDispatch Item(Object varg) throws ComException;
  @DeclDISPID(1610743813)  public Object Enum() throws ComException;
  @DeclDISPID(66)  public Tab Add(Object bstrName, Object bstrCaption, Object lIndex) throws ComException;
  @DeclDISPID(1610743815)  public Tab _Add(String bstrName, String bstrCaption) throws ComException;
  @DeclDISPID(1610743816)  public Tab _Insert(String bstrName, String bstrCaption, Integer lIndex) throws ComException;
  @DeclDISPID(67)  public void Remove(Object varg) throws ComException;
  @DeclDISPID(62)  public void Clear() throws ComException;
}
