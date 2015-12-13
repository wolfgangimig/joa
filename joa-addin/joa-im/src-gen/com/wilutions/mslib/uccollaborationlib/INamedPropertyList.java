/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * INamedPropertyList.
 * INamedPropertyList Interface 
 */
@CoInterface(guid="{1A8A9402-E89F-40AE-88A8-B328391684B6}")
public interface INamedPropertyList extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public void Add(final String _propertyID, final Object _propertyValue) throws ComException;
  @DeclDISPID(1610743809)  public void Clear() throws ComException;
  @DeclDISPID(1610743810)  public void RemoveAt(final Integer _index) throws ComException;
  @DeclDISPID(1610743811)  public Integer getCount() throws ComException;
  @DeclDISPID(1610743812)  public String GetIDAt(final Integer _index) throws ComException;
  @DeclDISPID(1610743813)  public Object GetValueAt(final Integer _index) throws ComException;
  @DeclDISPID(1610743814)  public Boolean TryGetValue(final String _propertyID, final ByRef<Object> _propertyValue) throws ComException;
}
