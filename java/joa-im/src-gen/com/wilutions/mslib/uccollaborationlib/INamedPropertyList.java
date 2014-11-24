/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * INamedPropertyList.
 * INamedPropertyList Interface 
 */
@CoInterface(guid="{1A8A9402-E89F-40AE-88A8-B328391684B6}")
public interface INamedPropertyList extends IDispatch {
  @DeclDISPID(1610743808)  public void Add(String _propertyID, Object _propertyValue) throws ComException;
  @DeclDISPID(1610743809)  public void Clear() throws ComException;
  @DeclDISPID(1610743810)  public void RemoveAt(Integer _index) throws ComException;
  @DeclDISPID(1610743811)  public Integer getCount() throws ComException;
  @DeclDISPID(1610743812)  public String GetIDAt(Integer _index) throws ComException;
  @DeclDISPID(1610743813)  public Object GetValueAt(Integer _index) throws ComException;
  @DeclDISPID(1610743814)  public Boolean TryGetValue(String _propertyID, ByRef<Object> _propertyValue) throws ComException;
}
