/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ConversationContextList.
 * ConversationContextList class defines a list of ConversationContext objects. 
 */
@CoClass(guid="{931A066A-AF82-4278-9084-4F8B517F9105}")
public class ConversationContextList extends Dispatch implements IConversationContextList {
  @DeclDISPID(1610743808)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(0)  public IConversationContext getItem(Integer _index) throws ComException {
    assert(_index != null);
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_PROPERTYGET,null,_index);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IConversationContextImpl.class);
  }
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException {
    final Object obj = this._dispatchCall(-4,"_NewEnum", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1610809344)  public void Add(IConversationContext _context) throws ComException {
    this._dispatchCall(1610809344,"Add", DISPATCH_METHOD,null,(_context!=null?_context:Dispatch.NULL));
  }
  @DeclDISPID(1610809345)  public void Remove(IConversationContext _context) throws ComException {
    this._dispatchCall(1610809345,"Remove", DISPATCH_METHOD,null,(_context!=null?_context:Dispatch.NULL));
  }
  @DeclDISPID(1610809346)  public IConversationContext CreateContext(String _id, ConversationContextType _contextType, Boolean _doMakeActive) throws ComException {
    assert(_id != null);
    assert(_contextType != null);
    assert(_doMakeActive != null);
    final Object obj = this._dispatchCall(1610809346,"CreateContext", DISPATCH_METHOD,null,_id,_contextType.value,_doMakeActive);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IConversationContextImpl.class);
  }
  @DeclDISPID(1610809347)  public void ModifyActiveContext(String _contextId, String _contextData, ConversationContextUpdateOptions _contextUpdateOptions) throws ComException {
    assert(_contextId != null);
    assert(_contextData != null);
    assert(_contextUpdateOptions != null);
    this._dispatchCall(1610809347,"ModifyActiveContext", DISPATCH_METHOD,null,_contextId,_contextData,_contextUpdateOptions.value);
  }
  public ConversationContextList() throws ComException {
    super("{931A066A-AF82-4278-9084-4F8B517F9105}", "{855AD949-E2EB-473D-AAF2-9800008EA303}");
  }
  protected ConversationContextList(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ConversationContextList" + super.toString() + "]";
  }
}
