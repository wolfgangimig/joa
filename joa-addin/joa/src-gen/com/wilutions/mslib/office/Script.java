/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * Script.
 * 
 */
@CoInterface(guid="{000C0341-0000-0000-C000-000000000046}")
public interface Script extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(1610809344)  public IDispatch getParent() throws ComException;
  @DeclDISPID(1610809345)  public String getExtended() throws ComException;
  @DeclDISPID(1610809345)  public void setExtended(final String value) throws ComException;
  @DeclDISPID(1610809347)  public String getId() throws ComException;
  @DeclDISPID(1610809347)  public void setId(final String value) throws ComException;
  @DeclDISPID(1610809349)  public MsoScriptLanguage getLanguage() throws ComException;
  @DeclDISPID(1610809349)  public void setLanguage(final MsoScriptLanguage value) throws ComException;
  @DeclDISPID(1610809351)  public MsoScriptLocation getLocation() throws ComException;
  @DeclDISPID(1610809352)  public void Delete() throws ComException;
  @DeclDISPID(1610809353)  public IDispatch getShape() throws ComException;
  @DeclDISPID(0)  public String getScriptText() throws ComException;
  @DeclDISPID(0)  public void setScriptText(final String value) throws ComException;
}
