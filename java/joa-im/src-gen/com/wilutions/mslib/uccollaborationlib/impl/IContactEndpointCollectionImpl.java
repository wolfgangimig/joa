/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{1A326488-0C7F-9462-1D18-AD9CF731B545}")
public class IContactEndpointCollectionImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IContactEndpointCollection {
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException {
    final Object obj = this._dispatchCall(-4,"_NewEnum", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1610743809)  public void Add(final com.wilutions.mslib.uccollaborationlib.IContactEndpoint _endpoint) throws ComException {
    this._dispatchCall(1610743809,"Add", DISPATCH_METHOD,null,(_endpoint!=null?_endpoint:Dispatch.NULL));
  }
  @DeclDISPID(1610743810)  public void Clear() throws ComException {
    this._dispatchCall(1610743810,"Clear", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1610743811)  public void RemoveAt(final Integer _index) throws ComException {
    assert(_index != null);
    this._dispatchCall(1610743811,"RemoveAt", DISPATCH_METHOD,null,_index);
  }
  @DeclDISPID(1610743812)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(1610743812,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(0)  public com.wilutions.mslib.uccollaborationlib.IContactEndpoint getItem(final Integer _index) throws ComException {
    assert(_index != null);
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_PROPERTYGET,null,_index);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IContactEndpointImpl.class);
  }
  @DeclDISPID(0)  public void setItem(final Integer _index, final com.wilutions.mslib.uccollaborationlib.IContactEndpoint value2) throws ComException {
    assert(_index != null);
    this._dispatchCall(0,"Item", DISPATCH_PROPERTYPUT,(value2!=null?value2:Dispatch.NULL),_index);
  }
  @DeclDISPID(1610743815)  public void AddByUri(final com.wilutions.mslib.uccollaborationlib.ContactEndpointType _endpointType, final String _endpointUri) throws ComException {
    assert(_endpointType != null);
    assert(_endpointUri != null);
    this._dispatchCall(1610743815,"AddByUri", DISPATCH_METHOD,null,_endpointType.value,_endpointUri);
  }
  @DeclDISPID(1610743816)  public Integer IndexOf(final com.wilutions.mslib.uccollaborationlib.IContactEndpoint _contactEndpoint) throws ComException {
    final Object obj = this._dispatchCall(1610743816,"IndexOf", DISPATCH_METHOD,null,(_contactEndpoint!=null?_contactEndpoint:Dispatch.NULL));
    if (obj == null) return null;
    return (Integer)obj;
  }
  public IContactEndpointCollectionImpl(String progId) throws ComException {
    super(progId, "{DAA5FDE3-A81C-4F23-80B6-C47B52C649BF}");
  }
  protected IContactEndpointCollectionImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IContactEndpointCollectionImpl" + super.toString() + "]";
  }
}
