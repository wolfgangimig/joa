/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C995105D-6943-98AE-0561-3F95CF2A46CE}")
public class IUCOfficeIntegrationHelperImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IUCOfficeIntegrationHelper {
  @DeclDISPID(1610678272)  public com.wilutions.mslib.uccollaborationlib.ILyncClient GetCommunicatorClient() throws ComException {
    final Object obj = this._dispatchCall(1610678272,"GetCommunicatorClient", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (com.wilutions.mslib.uccollaborationlib.ILyncClient)obj;
  }
  @DeclDISPID(1610678273)  public com.wilutions.mslib.uccollaborationlib.IAutomation GetUIAutomation() throws ComException {
    final Object obj = this._dispatchCall(1610678273,"GetUIAutomation", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (com.wilutions.mslib.uccollaborationlib.IAutomation)obj;
  }
  @DeclDISPID(1610678274)  public IDispatch GetInteropHelper() throws ComException {
    final Object obj = this._dispatchCall(1610678274,"GetInteropHelper", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(1610678275)  public String GetAuthenticationInfo() throws ComException {
    final Object obj = this._dispatchCall(1610678275,"GetAuthenticationInfo", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610678276)  public void Cleanup() throws ComException {
    this._dispatchCall(1610678276,"Cleanup", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1610678277)  public void Notify(final com.wilutions.mslib.uccollaborationlib.OIHelperAction Action, final HRESULT hrRes) throws ComException {
    assert(Action != null);
    assert(hrRes != null);
    this._dispatchCall(1610678277,"Notify", DISPATCH_METHOD,null,Action.value,hrRes);
  }
  public IUCOfficeIntegrationHelperImpl(String progId) throws ComException {
    super(progId, "{09028936-CD20-43EF-98CF-56726ADDBA34}");
  }
  protected IUCOfficeIntegrationHelperImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IUCOfficeIntegrationHelperImpl" + super.toString() + "]";
  }
}
