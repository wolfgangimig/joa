/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * OfficeTheme.
 * 
 */
@CoInterface(guid="{000C03A0-0000-0000-C000-000000000046}")
public interface OfficeTheme extends IDispatch {
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(1)  public IDispatch getParent() throws ComException;
  @DeclDISPID(2)  public ThemeColorScheme getThemeColorScheme() throws ComException;
  @DeclDISPID(3)  public ThemeFontScheme getThemeFontScheme() throws ComException;
  @DeclDISPID(4)  public ThemeEffectScheme getThemeEffectScheme() throws ComException;
}
