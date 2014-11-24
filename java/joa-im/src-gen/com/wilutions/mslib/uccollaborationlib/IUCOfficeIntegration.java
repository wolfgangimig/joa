/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IUCOfficeIntegration.
 * IUCOfficeIntegration Interface 
 */
@CoInterface(guid="{6A222195-F65E-467F-8F77-EB180BD85288}")
public interface IUCOfficeIntegration extends IDispatch {
  @DeclDISPID(1610743808)  public OIFeature GetSupportedFeatures(String _version) throws ComException;
  @DeclDISPID(1610743809)  public String GetAuthenticationInfo(String _version) throws ComException;
  @DeclDISPID(1610743810)  public Dispatch GetInterface(String _version, OIInterface _interface) throws ComException;
}
