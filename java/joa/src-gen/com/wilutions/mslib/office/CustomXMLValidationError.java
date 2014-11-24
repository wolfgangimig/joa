/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * CustomXMLValidationError.
 * 
 */
@CoInterface(guid="{000CDB0E-0000-0000-C000-000000000046}")
public interface CustomXMLValidationError extends IDispatch {
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(1610809344)  public IDispatch getParent() throws ComException;
  @DeclDISPID(1610809345)  public String getName() throws ComException;
  @DeclDISPID(1610809346)  public CustomXMLNode getNode() throws ComException;
  @DeclDISPID(1610809347)  public String getText() throws ComException;
  @DeclDISPID(1610809348)  public MsoCustomXMLValidationErrorType getType() throws ComException;
  @DeclDISPID(1610809349)  public void Delete() throws ComException;
  @DeclDISPID(1610809350)  public Integer getErrorCode() throws ComException;
}
