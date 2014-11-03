/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * Conflicts.
 * 
 */
@CoInterface(guid="{000630C2-0000-0000-C000-000000000046}")
public interface Conflicts extends IDispatch {
  @DeclDISPID(61440)  public _Application getApplication() throws ComException;
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException;
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException;
  @DeclDISPID(61441)  public Dispatch getParent() throws ComException;
  @DeclDISPID(80)  public Integer getCount() throws ComException;
  @DeclDISPID(81)  public Conflict Item(Object Index) throws ComException;
  @DeclDISPID(86)  public Conflict GetFirst() throws ComException;
  @DeclDISPID(88)  public Conflict GetLast() throws ComException;
  @DeclDISPID(87)  public Conflict GetNext() throws ComException;
  @DeclDISPID(89)  public Conflict GetPrevious() throws ComException;
}
