/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * _Explorer.
 * 
 */
@CoInterface(guid="{00063003-0000-0000-C000-000000000046}")
public interface _Explorer extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(61440)  public _Application getApplication() throws ComException;
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException;
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException;
  @DeclDISPID(61441)  public IDispatch getParent() throws ComException;
  @DeclDISPID(8449)  public MAPIFolder getCurrentFolder() throws ComException;
  @DeclDISPID(8449)  public void setCurrentFolder(final MAPIFolder value) throws ComException;
  @DeclDISPID(8451)  public void Close() throws ComException;
  @DeclDISPID(8452)  public void Display() throws ComException;
  @DeclDISPID(8465)  public String getCaption() throws ComException;
  @DeclDISPID(8704)  public Object getCurrentView() throws ComException;
  @DeclDISPID(8704)  public void setCurrentView(final Object value) throws ComException;
  @DeclDISPID(8468)  public Integer getHeight() throws ComException;
  @DeclDISPID(8468)  public void setHeight(final Integer value) throws ComException;
  @DeclDISPID(8469)  public Integer getLeft() throws ComException;
  @DeclDISPID(8469)  public void setLeft(final Integer value) throws ComException;
  @DeclDISPID(8705)  public Panes getPanes() throws ComException;
  @DeclDISPID(8706)  public Selection getSelection() throws ComException;
  @DeclDISPID(8470)  public Integer getTop() throws ComException;
  @DeclDISPID(8470)  public void setTop(final Integer value) throws ComException;
  @DeclDISPID(8471)  public Integer getWidth() throws ComException;
  @DeclDISPID(8471)  public void setWidth(final Integer value) throws ComException;
  @DeclDISPID(8466)  public OlWindowState getWindowState() throws ComException;
  @DeclDISPID(8466)  public void setWindowState(final OlWindowState value) throws ComException;
  @DeclDISPID(8467)  public void Activate() throws ComException;
  @DeclDISPID(8707)  public Boolean IsPaneVisible(final OlPane Pane) throws ComException;
  @DeclDISPID(8708)  public void ShowPane(final OlPane Pane, final Boolean Visible) throws ComException;
  @DeclDISPID(64146)  public IDispatch getHTMLDocument() throws ComException;
  @DeclDISPID(64435)  public _NavigationPane getNavigationPane() throws ComException;
  @DeclDISPID(64461)  public void ClearSearch() throws ComException;
  @DeclDISPID(64101)  public void Search(final String Query, final OlSearchScope SearchScope) throws ComException;
  @DeclDISPID(64565)  public Boolean IsItemSelectableInView(final IDispatch Item) throws ComException;
  @DeclDISPID(64566)  public void AddToSelection(final IDispatch Item) throws ComException;
  @DeclDISPID(64567)  public void RemoveFromSelection(final IDispatch Item) throws ComException;
  @DeclDISPID(64568)  public void SelectAllItems() throws ComException;
  @DeclDISPID(64569)  public void ClearSelection() throws ComException;
  @DeclDISPID(64625)  public _AccountSelector getAccountSelector() throws ComException;
  @DeclDISPID(64632)  public _AttachmentSelection getAttachmentSelection() throws ComException;
  @DeclDISPID(64659)  public IDispatch getActiveInlineResponse() throws ComException;
  @DeclDISPID(64660)  public IDispatch getActiveInlineResponseWordEditor() throws ComException;
}
