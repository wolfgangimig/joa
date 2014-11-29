/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OutlookBarGroup.
 * 
 */
@CoInterface(guid="{00063073-0000-0000-C000-000000000046}")
public interface OutlookBarGroup extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(61440)  public _Application getApplication() throws ComException;
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException;
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException;
  @DeclDISPID(61441)  public IDispatch getParent() throws ComException;
  @DeclDISPID(0)  public String getName() throws ComException;
  @DeclDISPID(0)  public void setName(String value) throws ComException;
  @DeclDISPID(8450)  public _OutlookBarShortcuts getShortcuts() throws ComException;
  @DeclDISPID(8451)  public OlOutlookBarViewType getViewType() throws ComException;
  @DeclDISPID(8451)  public void setViewType(OlOutlookBarViewType value) throws ComException;
}
