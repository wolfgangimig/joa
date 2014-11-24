/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * Controls.
 * 
 */
@CoInterface(guid="{04598FC7-866C-11CF-AB7C-00AA00C08FCF}")
public interface Controls extends IDispatch {
  @DeclDISPID(60)  public Integer getCount() throws ComException;
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException;
  @DeclDISPID(0)  public IDispatch Item(Object varg) throws ComException;
  @DeclDISPID(62)  public void Clear() throws ComException;
  @DeclDISPID(1610743812)  public void _Move(Integer cx, Integer cy) throws ComException;
  @DeclDISPID(1610743814)  public Control _AddByClass(Integer clsid) throws ComException;
  @DeclDISPID(1610743820)  public Object Enum() throws ComException;
  @DeclDISPID(1610743821)  public Control _GetItemByIndex(Integer lIndex) throws ComException;
  @DeclDISPID(1610743822)  public Control _GetItemByName(String pstr) throws ComException;
  @DeclDISPID(1610743823)  public Control _GetItemByID(Integer ID) throws ComException;
  @DeclDISPID(1610743824)  public void SendBackward() throws ComException;
  @DeclDISPID(1610743825)  public void SendToBack() throws ComException;
  @DeclDISPID(63)  public void Move(Float cx, Float cy) throws ComException;
  @DeclDISPID(66)  public Control Add(String bstrProgID, Object Name, Object Visible) throws ComException;
  @DeclDISPID(67)  public void Remove(Object varg) throws ComException;
}
