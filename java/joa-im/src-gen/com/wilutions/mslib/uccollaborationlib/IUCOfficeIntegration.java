/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IUCOfficeIntegration.
 * IUCOfficeIntegration Interface 
 */
@CoInterface(guid="{6A222195-F65E-467F-8F77-EB180BD85288}")
public interface IUCOfficeIntegration extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public OIFeature GetSupportedFeatures(final String _version) throws ComException;
  @DeclDISPID(1610743809)  public String GetAuthenticationInfo(final String _version) throws ComException;
  @DeclDISPID(1610743810)  public IDispatch GetInterface(final String _version, final OIInterface _interface) throws ComException;
}
