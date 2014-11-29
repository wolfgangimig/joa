/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * ThemeColorScheme.
 * 
 */
@CoInterface(guid="{000C03A2-0000-0000-C000-000000000046}")
public interface ThemeColorScheme extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(1)  public IDispatch getParent() throws ComException;
  @DeclDISPID(2)  public Integer getCount() throws ComException;
  @DeclDISPID(0)  public ThemeColor Colors(MsoThemeColorSchemeIndex Index) throws ComException;
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException;
  @DeclDISPID(3)  public void Load(String FileName) throws ComException;
  @DeclDISPID(4)  public void Save(String FileName) throws ComException;
  @DeclDISPID(5)  public MsoRGBType GetCustomColor(String Name) throws ComException;
}
