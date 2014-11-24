/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ISearchProviderStateChangedEventData.
 * ISearchProviderStateChangedEventData Interface 
 */
@CoInterface(guid="{995F992C-9DEF-47B9-BF11-81813C0C0E28}")
public interface ISearchProviderStateChangedEventData extends IDispatch {
  @DeclDISPID(1610743808)  public SearchProviders getProvider() throws ComException;
  @DeclDISPID(1610743809)  public SearchProviderStatusType getNewStatus() throws ComException;
}
