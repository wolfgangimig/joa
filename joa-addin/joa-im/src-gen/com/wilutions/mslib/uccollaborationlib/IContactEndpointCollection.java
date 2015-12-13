/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IContactEndpointCollection.
 * IContactEndpointCollection Interface 
 */
@CoInterface(guid="{DAA5FDE3-A81C-4F23-80B6-C47B52C649BF}")
public interface IContactEndpointCollection extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException;
  @DeclDISPID(1610743809)  public void Add(final IContactEndpoint _endpoint) throws ComException;
  @DeclDISPID(1610743810)  public void Clear() throws ComException;
  @DeclDISPID(1610743811)  public void RemoveAt(final Integer _index) throws ComException;
  @DeclDISPID(1610743812)  public Integer getCount() throws ComException;
  @DeclDISPID(0)  public IContactEndpoint getItem(final Integer _index) throws ComException;
  @DeclDISPID(0)  public void setItem(final Integer _index, final IContactEndpoint value2) throws ComException;
  @DeclDISPID(1610743815)  public void AddByUri(final ContactEndpointType _endpointType, final String _endpointUri) throws ComException;
  @DeclDISPID(1610743816)  public Integer IndexOf(final IContactEndpoint _contactEndpoint) throws ComException;
}
