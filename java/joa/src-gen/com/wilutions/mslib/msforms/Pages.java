/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * Pages.
 * 
 */
@CoInterface(guid="{92E11A03-7358-11CE-80CB-00AA00611080}")
public interface Pages extends IDispatch {
  @DeclDISPID(60)  public Integer getCount() throws ComException;
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException;
  @DeclDISPID(0)  public IDispatch Item(Object varg) throws ComException;
  @DeclDISPID(1610743811)  public Object Enum() throws ComException;
  @DeclDISPID(66)  public Page Add(Object bstrName, Object bstrCaption, Object lIndex) throws ComException;
  @DeclDISPID(1610743813)  public Page _AddCtrl(Integer clsid, String bstrName, String bstrCaption) throws ComException;
  @DeclDISPID(1610743814)  public Page _InsertCtrl(Integer clsid, String bstrName, String bstrCaption, Integer lIndex) throws ComException;
  @DeclDISPID(1610743815)  public Control _GetItemByIndex(Integer lIndex) throws ComException;
  @DeclDISPID(1610743816)  public Control _GetItemByName(String pstrName) throws ComException;
  @DeclDISPID(67)  public void Remove(Object varg) throws ComException;
  @DeclDISPID(62)  public void Clear() throws ComException;
}
