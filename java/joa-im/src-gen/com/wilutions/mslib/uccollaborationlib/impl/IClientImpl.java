/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{2E08A71F-0802-9DDF-1D78-8BCC511903A6}")
public class IClientImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IClient {
  @DeclDISPID(1610743808)  public com.wilutions.mslib.uccollaborationlib.ClientType getType() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Type", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.ClientType.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743809)  public com.wilutions.mslib.uccollaborationlib.ClientState getState() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"State", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.ClientState.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743810)  public String getUri() throws ComException {
    final Object obj = this._dispatchCall(1610743810,"Uri", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743811)  public com.wilutions.mslib.uccollaborationlib.ISelf getSelf() throws ComException {
    final Object obj = this._dispatchCall(1610743811,"Self", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.ISelfImpl.class);
  }
  @DeclDISPID(1610743812)  public com.wilutions.mslib.uccollaborationlib.IContactManager getContactManager() throws ComException {
    final Object obj = this._dispatchCall(1610743812,"ContactManager", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IContactManagerImpl.class);
  }
  @DeclDISPID(1610743813)  public com.wilutions.mslib.uccollaborationlib.IConversationManager getConversationManager() throws ComException {
    final Object obj = this._dispatchCall(1610743813,"ConversationManager", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IConversationManagerImpl.class);
  }
  @DeclDISPID(1610743814)  public com.wilutions.mslib.uccollaborationlib.IConferenceScheduler getConferenceScheduler() throws ComException {
    final Object obj = this._dispatchCall(1610743814,"ConferenceScheduler", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IConferenceSchedulerImpl.class);
  }
  public IClientImpl(String progId) throws ComException {
    super(progId, "{EE9F3E74-AC61-469E-80D6-E22BF4EEFF5C}");
  }
  protected IClientImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IClientImpl" + super.toString() + "]";
  }
}
