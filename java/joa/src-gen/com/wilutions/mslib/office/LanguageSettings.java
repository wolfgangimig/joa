/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * LanguageSettings.
 * 
 */
@CoInterface(guid="{000C0353-0000-0000-C000-000000000046}")
public interface LanguageSettings extends IDispatch {
  @DeclDISPID(1610743808)  public Dispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(1)  public Integer getLanguageID(MsoAppLanguageID Id) throws ComException;
  @DeclDISPID(2)  public Boolean getLanguagePreferredForEditing(MsoLanguageID lid) throws ComException;
  @DeclDISPID(3)  public Dispatch getParent() throws ComException;
}
