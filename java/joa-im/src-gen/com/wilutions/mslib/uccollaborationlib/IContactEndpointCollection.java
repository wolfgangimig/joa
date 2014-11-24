/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IContactEndpointCollection.
 * IContactEndpointCollection Interface 
 */
@CoInterface(guid="{DAA5FDE3-A81C-4F23-80B6-C47B52C649BF}")
public interface IContactEndpointCollection extends IDispatch {
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException;
  @DeclDISPID(1610743809)  public void Add(IContactEndpoint _endpoint) throws ComException;
  @DeclDISPID(1610743810)  public void Clear() throws ComException;
  @DeclDISPID(1610743811)  public void RemoveAt(Integer _index) throws ComException;
  @DeclDISPID(1610743812)  public Integer getCount() throws ComException;
  @DeclDISPID(0)  public IContactEndpoint getItem(Integer _index) throws ComException;
  @DeclDISPID(0)  public void setItem(Integer _index, IContactEndpoint value2) throws ComException;
  @DeclDISPID(1610743815)  public void AddByUri(ContactEndpointType _endpointType, String _endpointUri) throws ComException;
  @DeclDISPID(1610743816)  public Integer IndexOf(IContactEndpoint _contactEndpoint) throws ComException;
}
