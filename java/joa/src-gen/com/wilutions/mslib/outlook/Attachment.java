/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * Attachment.
 * 
 */
@CoInterface(guid="{00063007-0000-0000-C000-000000000046}")
public interface Attachment extends IDispatch {
  @DeclDISPID(61440)  public _Application getApplication() throws ComException;
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException;
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException;
  @DeclDISPID(113)  public IDispatch getParent() throws ComException;
  @DeclDISPID(12289)  public String getDisplayName() throws ComException;
  @DeclDISPID(12289)  public void setDisplayName(String value) throws ComException;
  @DeclDISPID(14084)  public String getFileName() throws ComException;
  @DeclDISPID(91)  public Integer getIndex() throws ComException;
  @DeclDISPID(14088)  public String getPathName() throws ComException;
  @DeclDISPID(114)  public Integer getPosition() throws ComException;
  @DeclDISPID(114)  public void setPosition(Integer value) throws ComException;
  @DeclDISPID(14085)  public OlAttachmentType getType() throws ComException;
  @DeclDISPID(105)  public void Delete() throws ComException;
  @DeclDISPID(104)  public void SaveAsFile(String Path) throws ComException;
  @DeclDISPID(64253)  public PropertyAccessor getPropertyAccessor() throws ComException;
  @DeclDISPID(64489)  public Integer getSize() throws ComException;
  @DeclDISPID(64536)  public OlAttachmentBlockLevel getBlockLevel() throws ComException;
  @DeclDISPID(64634)  public String GetTemporaryFilePath() throws ComException;
}
