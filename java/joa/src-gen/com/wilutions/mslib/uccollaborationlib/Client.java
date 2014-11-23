/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * Client.
 * Client Class which contains the contact and group manager, conversations manager and 
 * conference scheduler. 
 */
@CoClass(guid="{3F927576-996E-4A91-9CF9-D9FA46D2AAF5}")
public class Client extends Dispatch implements IClient {
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
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.ISelfImpl.class);
  }
  @DeclDISPID(1610743812)  public IContactManager getContactManager() throws ComException {
    final Object obj = this._dispatchCall(1610743812,"ContactManager", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IContactManagerImpl.class);
  }
  @DeclDISPID(1610743813)  public IConversationManager getConversationManager() throws ComException {
    final Object obj = this._dispatchCall(1610743813,"ConversationManager", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IConversationManagerImpl.class);
  }
  @DeclDISPID(1610743814)  public IConferenceScheduler getConferenceScheduler() throws ComException {
    final Object obj = this._dispatchCall(1610743814,"ConferenceScheduler", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IConferenceSchedulerImpl.class);
  }
  public Client() throws ComException {
    super("{3F927576-996E-4A91-9CF9-D9FA46D2AAF5}", "{EE9F3E74-AC61-469E-80D6-E22BF4EEFF5C}");
  }
  protected Client(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[Client" + super.toString() + "]";
  }
}
