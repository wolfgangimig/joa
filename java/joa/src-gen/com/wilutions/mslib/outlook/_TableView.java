/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * _TableView.
 * 
 */
@CoInterface(guid="{00063096-0000-0000-C000-000000000046}")
public interface _TableView extends IDispatch {
  @DeclDISPID(61440)  public _Application getApplication() throws ComException;
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException;
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException;
  @DeclDISPID(61441)  public IDispatch getParent() throws ComException;
  @DeclDISPID(407)  public void Apply() throws ComException;
  @DeclDISPID(61490)  public View Copy(String Name, OlViewSaveOption SaveOption) throws ComException;
  @DeclDISPID(61514)  public void Delete() throws ComException;
  @DeclDISPID(64068)  public void Reset() throws ComException;
  @DeclDISPID(61512)  public void Save() throws ComException;
  @DeclDISPID(64065)  public String getLanguage() throws ComException;
  @DeclDISPID(64065)  public void setLanguage(String value) throws ComException;
  @DeclDISPID(64064)  public Boolean getLockUserChanges() throws ComException;
  @DeclDISPID(64064)  public void setLockUserChanges(Boolean value) throws ComException;
  @DeclDISPID(0)  public String getName() throws ComException;
  @DeclDISPID(0)  public void setName(String value) throws ComException;
  @DeclDISPID(64063)  public OlViewSaveOption getSaveOption() throws ComException;
  @DeclDISPID(64062)  public Boolean getStandard() throws ComException;
  @DeclDISPID(404)  public OlViewType getViewType() throws ComException;
  @DeclDISPID(64060)  public String getXML() throws ComException;
  @DeclDISPID(64060)  public void setXML(String value) throws ComException;
  @DeclDISPID(64054)  public void GoToDate(java.util.Date Date) throws ComException;
  @DeclDISPID(409)  public String getFilter() throws ComException;
  @DeclDISPID(409)  public void setFilter(String value) throws ComException;
  @DeclDISPID(64341)  public ViewFields getViewFields() throws ComException;
  @DeclDISPID(64344)  public OrderFields getGroupByFields() throws ComException;
  @DeclDISPID(64346)  public OrderFields getSortFields() throws ComException;
  @DeclDISPID(64347)  public Integer getMaxLinesInMultiLineView() throws ComException;
  @DeclDISPID(64347)  public void setMaxLinesInMultiLineView(Integer value) throws ComException;
  @DeclDISPID(64345)  public Boolean getAutomaticGrouping() throws ComException;
  @DeclDISPID(64345)  public void setAutomaticGrouping(Boolean value) throws ComException;
  @DeclDISPID(64384)  public OlDefaultExpandCollapseSetting getDefaultExpandCollapseSetting() throws ComException;
  @DeclDISPID(64384)  public void setDefaultExpandCollapseSetting(OlDefaultExpandCollapseSetting value) throws ComException;
  @DeclDISPID(64348)  public Boolean getAutomaticColumnSizing() throws ComException;
  @DeclDISPID(64348)  public void setAutomaticColumnSizing(Boolean value) throws ComException;
  @DeclDISPID(64349)  public OlMultiLine getMultiLine() throws ComException;
  @DeclDISPID(64349)  public void setMultiLine(OlMultiLine value) throws ComException;
  @DeclDISPID(64350)  public Integer getMultiLineWidth() throws ComException;
  @DeclDISPID(64350)  public void setMultiLineWidth(Integer value) throws ComException;
  @DeclDISPID(64351)  public Boolean getAllowInCellEditing() throws ComException;
  @DeclDISPID(64351)  public void setAllowInCellEditing(Boolean value) throws ComException;
  @DeclDISPID(64352)  public Boolean getShowNewItemRow() throws ComException;
  @DeclDISPID(64352)  public void setShowNewItemRow(Boolean value) throws ComException;
  @DeclDISPID(64353)  public OlGridLineStyle getGridLineStyle() throws ComException;
  @DeclDISPID(64353)  public void setGridLineStyle(OlGridLineStyle value) throws ComException;
  @DeclDISPID(64354)  public Boolean getShowItemsInGroups() throws ComException;
  @DeclDISPID(64354)  public void setShowItemsInGroups(Boolean value) throws ComException;
  @DeclDISPID(64355)  public Boolean getShowReadingPane() throws ComException;
  @DeclDISPID(64355)  public void setShowReadingPane(Boolean value) throws ComException;
  @DeclDISPID(64356)  public Boolean getHideReadingPaneHeaderInfo() throws ComException;
  @DeclDISPID(64356)  public void setHideReadingPaneHeaderInfo(Boolean value) throws ComException;
  @DeclDISPID(64360)  public ViewFont getRowFont() throws ComException;
  @DeclDISPID(64359)  public ViewFont getColumnFont() throws ComException;
  @DeclDISPID(64361)  public ViewFont getAutoPreviewFont() throws ComException;
  @DeclDISPID(64376)  public OlAutoPreview getAutoPreview() throws ComException;
  @DeclDISPID(64376)  public void setAutoPreview(OlAutoPreview value) throws ComException;
  @DeclDISPID(64059)  public AutoFormatRules getAutoFormatRules() throws ComException;
  @DeclDISPID(64285)  public Table GetTable() throws ComException;
  @DeclDISPID(64640)  public Boolean getShowConversationByDate() throws ComException;
  @DeclDISPID(64640)  public void setShowConversationByDate(Boolean value) throws ComException;
  @DeclDISPID(64641)  public Boolean getShowFullConversations() throws ComException;
  @DeclDISPID(64641)  public void setShowFullConversations(Boolean value) throws ComException;
  @DeclDISPID(64643)  public Boolean getAlwaysExpandConversation() throws ComException;
  @DeclDISPID(64643)  public void setAlwaysExpandConversation(Boolean value) throws ComException;
  @DeclDISPID(64649)  public Boolean getShowConversationSendersAboveSubject() throws ComException;
  @DeclDISPID(64649)  public void setShowConversationSendersAboveSubject(Boolean value) throws ComException;
}
