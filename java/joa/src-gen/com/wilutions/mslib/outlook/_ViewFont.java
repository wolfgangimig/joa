/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * _ViewFont.
 * 
 */
@CoInterface(guid="{0006309D-0000-0000-C000-000000000046}")
public interface _ViewFont extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(61440)  public _Application getApplication() throws ComException;
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException;
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException;
  @DeclDISPID(61441)  public IDispatch getParent() throws ComException;
  @DeclDISPID(64385)  public Boolean getBold() throws ComException;
  @DeclDISPID(64385)  public void setBold(final Boolean value) throws ComException;
  @DeclDISPID(64387)  public Boolean getItalic() throws ComException;
  @DeclDISPID(64387)  public void setItalic(final Boolean value) throws ComException;
  @DeclDISPID(64388)  public String getName() throws ComException;
  @DeclDISPID(64388)  public void setName(final String value) throws ComException;
  @DeclDISPID(64389)  public Integer getSize() throws ComException;
  @DeclDISPID(64389)  public void setSize(final Integer value) throws ComException;
  @DeclDISPID(64390)  public Boolean getStrikethrough() throws ComException;
  @DeclDISPID(64390)  public void setStrikethrough(final Boolean value) throws ComException;
  @DeclDISPID(64391)  public Boolean getUnderline() throws ComException;
  @DeclDISPID(64391)  public void setUnderline(final Boolean value) throws ComException;
  @DeclDISPID(64395)  public OlColor getColor() throws ComException;
  @DeclDISPID(64395)  public void setColor(final OlColor value) throws ComException;
  @DeclDISPID(64638)  public OlCategoryColor getExtendedColor() throws ComException;
  @DeclDISPID(64638)  public void setExtendedColor(final OlCategoryColor value) throws ComException;
}
