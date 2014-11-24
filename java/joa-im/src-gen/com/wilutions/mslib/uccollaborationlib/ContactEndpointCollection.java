/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ContactEndpointCollection.
 * CallRoutingTargetList Class 
 */
@CoClass(guid="{4CD03696-F8BA-4068-AC3C-A611F8A4BF3E}")
public class ContactEndpointCollection extends Dispatch implements IContactEndpointCollection {
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException {
    final Object obj = this._dispatchCall(-4,"_NewEnum", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1610743809)  public void Add(IContactEndpoint _endpoint) throws ComException {
    this._dispatchCall(1610743809,"Add", DISPATCH_METHOD,null,(_endpoint!=null?_endpoint:Dispatch.NULL));
  }
  @DeclDISPID(1610743810)  public void Clear() throws ComException {
    this._dispatchCall(1610743810,"Clear", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1610743811)  public void RemoveAt(Integer _index) throws ComException {
    assert(_index != null);
    this._dispatchCall(1610743811,"RemoveAt", DISPATCH_METHOD,null,_index);
  }
  @DeclDISPID(1610743812)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(1610743812,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(0)  public IContactEndpoint getItem(Integer _index) throws ComException {
    assert(_index != null);
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_PROPERTYGET,null,_index);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IContactEndpointImpl.class);
  }
  @DeclDISPID(0)  public void setItem(Integer _index, IContactEndpoint value2) throws ComException {
    assert(_index != null);
    this._dispatchCall(0,"Item", DISPATCH_PROPERTYPUT,(value2!=null?value2:Dispatch.NULL),_index);
  }
  @DeclDISPID(1610743815)  public void AddByUri(ContactEndpointType _endpointType, String _endpointUri) throws ComException {
    assert(_endpointType != null);
    assert(_endpointUri != null);
    this._dispatchCall(1610743815,"AddByUri", DISPATCH_METHOD,null,_endpointType.value,_endpointUri);
  }
  @DeclDISPID(1610743816)  public Integer IndexOf(IContactEndpoint _contactEndpoint) throws ComException {
    final Object obj = this._dispatchCall(1610743816,"IndexOf", DISPATCH_METHOD,null,(_contactEndpoint!=null?_contactEndpoint:Dispatch.NULL));
    if (obj == null) return null;
    return (Integer)obj;
  }
  public ContactEndpointCollection() throws ComException {
    super("{4CD03696-F8BA-4068-AC3C-A611F8A4BF3E}", "{DAA5FDE3-A81C-4F23-80B6-C47B52C649BF}");
  }
  protected ContactEndpointCollection(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ContactEndpointCollection" + super.toString() + "]";
  }
}
