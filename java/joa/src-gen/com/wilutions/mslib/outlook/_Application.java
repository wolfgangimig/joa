/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * _Application.
 * 
 */
@CoInterface(guid="{00063001-0000-0000-C000-000000000046}")
public interface _Application extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(61440)  public _Application getApplication() throws ComException;
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException;
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException;
  @DeclDISPID(61441)  public IDispatch getParent() throws ComException;
  @DeclDISPID(12289)  public String getName() throws ComException;
  @DeclDISPID(278)  public String getVersion() throws ComException;
  @DeclDISPID(273)  public _Explorer ActiveExplorer() throws ComException;
  @DeclDISPID(274)  public _Inspector ActiveInspector() throws ComException;
  @DeclDISPID(266)  public IDispatch CreateItem(final OlItemType ItemType) throws ComException;
  @DeclDISPID(267)  public IDispatch CreateItemFromTemplate(final String TemplatePath, final Object InFolder) throws ComException;
  @DeclDISPID(277)  public IDispatch CreateObject(final String ObjectName) throws ComException;
  @DeclDISPID(272)  public _NameSpace GetNamespace(final String Type) throws ComException;
  @DeclDISPID(275)  public void Quit() throws ComException;
  @DeclDISPID(280)  public com.wilutions.mslib.office.COMAddIns getCOMAddIns() throws ComException;
  @DeclDISPID(281)  public _Explorers getExplorers() throws ComException;
  @DeclDISPID(282)  public _Inspectors getInspectors() throws ComException;
  @DeclDISPID(283)  public com.wilutions.mslib.office.LanguageSettings getLanguageSettings() throws ComException;
  @DeclDISPID(284)  public String getProductCode() throws ComException;
  @DeclDISPID(287)  public IDispatch ActiveWindow() throws ComException;
  @DeclDISPID(64098)  public IDispatch CopyFile(final String FilePath, final String DestFolderPath) throws ComException;
  @DeclDISPID(64101)  public Search AdvancedSearch(final String Scope, final Object Filter, final Object SearchSubFolders, final Object Tag) throws ComException;
  @DeclDISPID(64108)  public Boolean IsSearchSynchronous(final String LookInFolders) throws ComException;
  @DeclDISPID(64153)  public _Reminders getReminders() throws ComException;
  @DeclDISPID(64214)  public String getDefaultProfileName() throws ComException;
  @DeclDISPID(64499)  public Boolean getIsTrusted() throws ComException;
  @DeclDISPID(64470)  public IDispatch GetObjectReference(final IDispatch Item, final OlReferenceType ReferenceType) throws ComException;
  @DeclDISPID(64520)  public com.wilutions.mslib.office.IAssistance getAssistance() throws ComException;
  @DeclDISPID(64553)  public TimeZones getTimeZones() throws ComException;
  @DeclDISPID(64613)  public com.wilutions.mslib.office.PickerDialog getPickerDialog() throws ComException;
  @DeclDISPID(64639)  public void RefreshFormRegionDefinition(final String RegionName) throws ComException;
}
