/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * _NavigationFolder.
 * 
 */
@CoInterface(guid="{000630F2-0000-0000-C000-000000000046}")
public interface _NavigationFolder extends IDispatch {
  @DeclDISPID(61440)  public _Application getApplication() throws ComException;
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException;
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException;
  @DeclDISPID(61441)  public IDispatch getParent() throws ComException;
  @DeclDISPID(64452)  public MAPIFolder getFolder() throws ComException;
  @DeclDISPID(64453)  public Boolean getIsSelected() throws ComException;
  @DeclDISPID(64453)  public void setIsSelected(Boolean value) throws ComException;
  @DeclDISPID(64454)  public Boolean getIsSideBySide() throws ComException;
  @DeclDISPID(64454)  public void setIsSideBySide(Boolean value) throws ComException;
  @DeclDISPID(64455)  public Integer getPosition() throws ComException;
  @DeclDISPID(64455)  public void setPosition(Integer value) throws ComException;
  @DeclDISPID(64456)  public Boolean getIsRemovable() throws ComException;
  @DeclDISPID(8450)  public String getDisplayName() throws ComException;
}
