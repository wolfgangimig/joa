/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * Controls.
 * 
 */
@CoInterface(guid="{04598FC7-866C-11CF-AB7C-00AA00C08FCF}")
public interface Controls extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(60)  public Integer getCount() throws ComException;
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException;
  @DeclDISPID(0)  public IDispatch Item(final Object varg) throws ComException;
  @DeclDISPID(62)  public void Clear() throws ComException;
  @DeclDISPID(1610743812)  public void _Move(final Integer cx, final Integer cy) throws ComException;
  @DeclDISPID(1610743814)  public Control _AddByClass(final Integer clsid) throws ComException;
  @DeclDISPID(1610743820)  public Object Enum() throws ComException;
  @DeclDISPID(1610743821)  public Control _GetItemByIndex(final Integer lIndex) throws ComException;
  @DeclDISPID(1610743822)  public Control _GetItemByName(final String pstr) throws ComException;
  @DeclDISPID(1610743823)  public Control _GetItemByID(final Integer ID) throws ComException;
  @DeclDISPID(1610743824)  public void SendBackward() throws ComException;
  @DeclDISPID(1610743825)  public void SendToBack() throws ComException;
  @DeclDISPID(63)  public void Move(final Float cx, final Float cy) throws ComException;
  @DeclDISPID(66)  public Control Add(final String bstrProgID, final Object Name, final Object Visible) throws ComException;
  @DeclDISPID(67)  public void Remove(final Object varg) throws ComException;
}
