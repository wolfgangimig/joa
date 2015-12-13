/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * _Category.
 * 
 */
@CoInterface(guid="{000630E3-0000-0000-C000-000000000046}")
public interface _Category extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(61440)  public _Application getApplication() throws ComException;
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException;
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException;
  @DeclDISPID(61441)  public IDispatch getParent() throws ComException;
  @DeclDISPID(8450)  public String getName() throws ComException;
  @DeclDISPID(8450)  public void setName(final String value) throws ComException;
  @DeclDISPID(64419)  public OlCategoryColor getColor() throws ComException;
  @DeclDISPID(64419)  public void setColor(final OlCategoryColor value) throws ComException;
  @DeclDISPID(64420)  public OlCategoryShortcutKey getShortcutKey() throws ComException;
  @DeclDISPID(64420)  public void setShortcutKey(final OlCategoryShortcutKey value) throws ComException;
  @DeclDISPID(64464)  public String getCategoryID() throws ComException;
  @DeclDISPID(64539)  public com.wilutions.mslib.stdole.OLE_COLOR getCategoryBorderColor() throws ComException;
  @DeclDISPID(64540)  public com.wilutions.mslib.stdole.OLE_COLOR getCategoryGradientTopColor() throws ComException;
  @DeclDISPID(64541)  public com.wilutions.mslib.stdole.OLE_COLOR getCategoryGradientBottomColor() throws ComException;
}
