/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * SearchScope.
 * 
 */
@CoInterface(guid="{000C0367-0000-0000-C000-000000000046}")
public interface SearchScope extends IDispatch {
  @DeclDISPID(1610743808)  public Dispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(0)  public MsoSearchIn getType() throws ComException;
  @DeclDISPID(1)  public ScopeFolder getScopeFolder() throws ComException;
}
