/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IUCOfficeIntegrationHelper.
 * IUCOfficeIntegrationHelper Interface 
 */
@CoInterface(guid="{09028936-CD20-43EF-98CF-56726ADDBA34}")
public interface IUCOfficeIntegrationHelper extends IDispatch {
  @DeclDISPID(1610678272)  public ILyncClient GetCommunicatorClient() throws ComException;
  @DeclDISPID(1610678273)  public IAutomation GetUIAutomation() throws ComException;
  @DeclDISPID(1610678274)  public IDispatch GetInteropHelper() throws ComException;
  @DeclDISPID(1610678275)  public String GetAuthenticationInfo() throws ComException;
  @DeclDISPID(1610678276)  public void Cleanup() throws ComException;
  @DeclDISPID(1610678277)  public void Notify(OIHelperAction Action, HRESULT hrRes) throws ComException;
}
