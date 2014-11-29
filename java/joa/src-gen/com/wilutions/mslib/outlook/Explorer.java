/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * Explorer.
 * 
 */
@CoClass(guid="{00063050-0000-0000-C000-000000000046}")
public class Explorer extends Dispatch implements _Explorer {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(61440)  public _Application getApplication() throws ComException {
    final Object obj = this._dispatchCall(61440,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl._ApplicationImpl.class);
  }
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException {
    final Object obj = this._dispatchCall(61450,"Class", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return OlObjectClass.valueOf((Integer)obj);
  }
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException {
    final Object obj = this._dispatchCall(61451,"Session", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl._NameSpaceImpl.class);
  }
  @DeclDISPID(61441)  public IDispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(61441,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(8449)  public MAPIFolder getCurrentFolder() throws ComException {
    final Object obj = this._dispatchCall(8449,"CurrentFolder", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl.MAPIFolderImpl.class);
  }
  @DeclDISPID(8449)  public void setCurrentFolder(final MAPIFolder value) throws ComException {
    this._dispatchCall(8449,"CurrentFolder", DISPATCH_PROPERTYPUTREF,(value!=null?value:Dispatch.NULL));
  }
  @DeclDISPID(8451)  public void Close() throws ComException {
    this._dispatchCall(8451,"Close", DISPATCH_METHOD,null);
  }
  @DeclDISPID(8452)  public void Display() throws ComException {
    this._dispatchCall(8452,"Display", DISPATCH_METHOD,null);
  }
  @DeclDISPID(8465)  public String getCaption() throws ComException {
    final Object obj = this._dispatchCall(8465,"Caption", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(8704)  public Object getCurrentView() throws ComException {
    final Object obj = this._dispatchCall(8704,"CurrentView", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(8704)  public void setCurrentView(final Object value) throws ComException {
    assert(value != null);
    this._dispatchCall(8704,"CurrentView", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(8468)  public Integer getHeight() throws ComException {
    final Object obj = this._dispatchCall(8468,"Height", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(8468)  public void setHeight(final Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(8468,"Height", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(8469)  public Integer getLeft() throws ComException {
    final Object obj = this._dispatchCall(8469,"Left", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(8469)  public void setLeft(final Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(8469,"Left", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(8705)  public Panes getPanes() throws ComException {
    final Object obj = this._dispatchCall(8705,"Panes", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl.PanesImpl.class);
  }
  @DeclDISPID(8706)  public Selection getSelection() throws ComException {
    final Object obj = this._dispatchCall(8706,"Selection", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl.SelectionImpl.class);
  }
  @DeclDISPID(8470)  public Integer getTop() throws ComException {
    final Object obj = this._dispatchCall(8470,"Top", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(8470)  public void setTop(final Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(8470,"Top", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(8471)  public Integer getWidth() throws ComException {
    final Object obj = this._dispatchCall(8471,"Width", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(8471)  public void setWidth(final Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(8471,"Width", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(8466)  public OlWindowState getWindowState() throws ComException {
    final Object obj = this._dispatchCall(8466,"WindowState", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return OlWindowState.valueOf((Integer)obj);
  }
  @DeclDISPID(8466)  public void setWindowState(final OlWindowState value) throws ComException {
    assert(value != null);
    this._dispatchCall(8466,"WindowState", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(8467)  public void Activate() throws ComException {
    this._dispatchCall(8467,"Activate", DISPATCH_METHOD,null);
  }
  @DeclDISPID(8707)  public Boolean IsPaneVisible(final OlPane Pane) throws ComException {
    assert(Pane != null);
    final Object obj = this._dispatchCall(8707,"IsPaneVisible", DISPATCH_METHOD,null,Pane.value);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(8708)  public void ShowPane(final OlPane Pane, final Boolean Visible) throws ComException {
    assert(Pane != null);
    assert(Visible != null);
    this._dispatchCall(8708,"ShowPane", DISPATCH_METHOD,null,Pane.value,Visible);
  }
  @DeclDISPID(64146)  public IDispatch getHTMLDocument() throws ComException {
    final Object obj = this._dispatchCall(64146,"HTMLDocument", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(64435)  public _NavigationPane getNavigationPane() throws ComException {
    final Object obj = this._dispatchCall(64435,"NavigationPane", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl._NavigationPaneImpl.class);
  }
  @DeclDISPID(64461)  public void ClearSearch() throws ComException {
    this._dispatchCall(64461,"ClearSearch", DISPATCH_METHOD,null);
  }
  @DeclDISPID(64101)  public void Search(final String Query, final OlSearchScope SearchScope) throws ComException {
    assert(Query != null);
    assert(SearchScope != null);
    this._dispatchCall(64101,"Search", DISPATCH_METHOD,null,Query,SearchScope.value);
  }
  @DeclDISPID(64565)  public Boolean IsItemSelectableInView(final IDispatch Item) throws ComException {
    final Object obj = this._dispatchCall(64565,"IsItemSelectableInView", DISPATCH_METHOD,null,(Item!=null?Item:Dispatch.NULL));
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(64566)  public void AddToSelection(final IDispatch Item) throws ComException {
    this._dispatchCall(64566,"AddToSelection", DISPATCH_METHOD,null,(Item!=null?Item:Dispatch.NULL));
  }
  @DeclDISPID(64567)  public void RemoveFromSelection(final IDispatch Item) throws ComException {
    this._dispatchCall(64567,"RemoveFromSelection", DISPATCH_METHOD,null,(Item!=null?Item:Dispatch.NULL));
  }
  @DeclDISPID(64568)  public void SelectAllItems() throws ComException {
    this._dispatchCall(64568,"SelectAllItems", DISPATCH_METHOD,null);
  }
  @DeclDISPID(64569)  public void ClearSelection() throws ComException {
    this._dispatchCall(64569,"ClearSelection", DISPATCH_METHOD,null);
  }
  @DeclDISPID(64625)  public _AccountSelector getAccountSelector() throws ComException {
    final Object obj = this._dispatchCall(64625,"AccountSelector", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl._AccountSelectorImpl.class);
  }
  @DeclDISPID(64632)  public _AttachmentSelection getAttachmentSelection() throws ComException {
    final Object obj = this._dispatchCall(64632,"AttachmentSelection", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl._AttachmentSelectionImpl.class);
  }
  @DeclDISPID(64659)  public IDispatch getActiveInlineResponse() throws ComException {
    final Object obj = this._dispatchCall(64659,"ActiveInlineResponse", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(64660)  public IDispatch getActiveInlineResponseWordEditor() throws ComException {
    final Object obj = this._dispatchCall(64660,"ActiveInlineResponseWordEditor", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  public Explorer() throws ComException {
    super("{00063050-0000-0000-C000-000000000046}", "{00063003-0000-0000-C000-000000000046}");
  }
  protected Explorer(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[Explorer" + super.toString() + "]";
  }
}
