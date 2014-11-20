/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.CoInterface;
import com.wilutions.com.ComException;
import com.wilutions.com.DeclDISPID;
import com.wilutions.com.Dispatch;
import com.wilutions.com.IDispatch;

/**
 * COMAddIn.
 * 
 */
@CoInterface(guid="{000C033A-0000-0000-C000-000000000046}")
public interface COMAddIn extends IDispatch {
  @DeclDISPID(1610743808)  public Dispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(0)  public String getDescription() throws ComException;
  @DeclDISPID(0)  public void setDescription(String value) throws ComException;
  @DeclDISPID(3)  public String getProgId() throws ComException;
  @DeclDISPID(4)  public String getGuid() throws ComException;
  @DeclDISPID(6)  public Boolean getConnect() throws ComException;
  @DeclDISPID(6)  public void setConnect(Boolean value) throws ComException;
  @DeclDISPID(7)  public Dispatch getObject() throws ComException;
  @DeclDISPID(7)  public void setObject(Object value) throws ComException;
  @DeclDISPID(8)  public Dispatch getParent() throws ComException;
}
