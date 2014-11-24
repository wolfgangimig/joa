/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * DelegatorClient.
 * DelegatorClient Class 
 */
@CoClass(guid="{90099FB2-B732-4CB7-81DE-C35BCA5E15DC}")
public class DelegatorClient extends Dispatch implements IDelegatorClient {
  @DeclDISPID(1610743808)  public ClientType getType() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Type", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return ClientType.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743809)  public ClientState getState() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"State", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return ClientState.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743810)  public String getUri() throws ComException {
    final Object obj = this._dispatchCall(1610743810,"Uri", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743811)  public ISelf getSelf() throws ComException {
    final Object obj = this._dispatchCall(1610743811,"Self", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.ISelfImpl.class);
  }
  @DeclDISPID(1610743812)  public IContactManager getContactManager() throws ComException {
    final Object obj = this._dispatchCall(1610743812,"ContactManager", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IContactManagerImpl.class);
  }
  @DeclDISPID(1610743813)  public IConversationManager getConversationManager() throws ComException {
    final Object obj = this._dispatchCall(1610743813,"ConversationManager", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IConversationManagerImpl.class);
  }
  @DeclDISPID(1610743814)  public IConferenceScheduler getConferenceScheduler() throws ComException {
    final Object obj = this._dispatchCall(1610743814,"ConferenceScheduler", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IConferenceSchedulerImpl.class);
  }
  @DeclDISPID(1610809344)  public ILyncClient getLyncClient() throws ComException {
    final Object obj = this._dispatchCall(1610809344,"LyncClient", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.ILyncClientImpl.class);
  }
  public DelegatorClient() throws ComException {
    super("{90099FB2-B732-4CB7-81DE-C35BCA5E15DC}", "{80EDBF3A-812E-42B5-A67F-6CC6D9A19A6C}");
  }
  protected DelegatorClient(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[DelegatorClient" + super.toString() + "]";
  }
}
