/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * Scripts.
 * 
 */
@CoInterface(guid="{000C0340-0000-0000-C000-000000000046}")
public interface Scripts extends IDispatch {
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(1610809344)  public IDispatch getParent() throws ComException;
  @DeclDISPID(1610809345)  public Integer getCount() throws ComException;
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException;
  @DeclDISPID(0)  public Script Item(Object Index) throws ComException;
  @DeclDISPID(1610809348)  public Script Add(IDispatch Anchor, MsoScriptLocation Location, MsoScriptLanguage Language, String Id, String Extended, String ScriptText) throws ComException;
  @DeclDISPID(1610809349)  public void Delete() throws ComException;
}
