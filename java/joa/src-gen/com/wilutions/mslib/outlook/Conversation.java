/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * Conversation.
 * 
 */
@CoClass(guid="{00061101-0000-0000-C000-000000000046}")
public class Conversation extends Dispatch implements _Conversation {
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
  @DeclDISPID(64591)  public Table GetTable() throws ComException {
    final Object obj = this._dispatchCall(64591,"GetTable", DISPATCH_METHOD,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(Table.class);
  }
  @DeclDISPID(64592)  public SimpleItems GetChildren(IDispatch Item) throws ComException {
    final Object obj = this._dispatchCall(64592,"GetChildren", DISPATCH_METHOD,null,(Item!=null?Item:Dispatch.NULL));
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(SimpleItems.class);
  }
  @DeclDISPID(64594)  public IDispatch GetParent(IDispatch Item) throws ComException {
    final Object obj = this._dispatchCall(64594,"GetParent", DISPATCH_METHOD,null,(Item!=null?Item:Dispatch.NULL));
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(64595)  public SimpleItems GetRootItems() throws ComException {
    final Object obj = this._dispatchCall(64595,"GetRootItems", DISPATCH_METHOD,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(SimpleItems.class);
  }
  @DeclDISPID(64602)  public String GetAlwaysAssignCategories(_Store Store) throws ComException {
    final Object obj = this._dispatchCall(64602,"GetAlwaysAssignCategories", DISPATCH_METHOD,null,(Store!=null?Store:Dispatch.NULL));
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(64603)  public OlAlwaysDeleteConversation GetAlwaysDelete(_Store Store) throws ComException {
    final Object obj = this._dispatchCall(64603,"GetAlwaysDelete", DISPATCH_METHOD,null,(Store!=null?Store:Dispatch.NULL));
    if (obj == null) return null;
    return OlAlwaysDeleteConversation.valueOf((Integer)obj);
  }
  @DeclDISPID(64604)  public MAPIFolder GetAlwaysMoveToFolder(_Store Store) throws ComException {
    final Object obj = this._dispatchCall(64604,"GetAlwaysMoveToFolder", DISPATCH_METHOD,null,(Store!=null?Store:Dispatch.NULL));
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl.MAPIFolderImpl.class);
  }
  @DeclDISPID(64605)  public void MarkAsRead() throws ComException {
    this._dispatchCall(64605,"MarkAsRead", DISPATCH_METHOD,null);
  }
  @DeclDISPID(64606)  public void MarkAsUnread() throws ComException {
    this._dispatchCall(64606,"MarkAsUnread", DISPATCH_METHOD,null);
  }
  @DeclDISPID(64607)  public void SetAlwaysAssignCategories(String Categories, _Store Store) throws ComException {
    assert(Categories != null);
    this._dispatchCall(64607,"SetAlwaysAssignCategories", DISPATCH_METHOD,null,Categories,(Store!=null?Store:Dispatch.NULL));
  }
  @DeclDISPID(64608)  public void SetAlwaysDelete(OlAlwaysDeleteConversation AlwaysDelete, _Store Store) throws ComException {
    assert(AlwaysDelete != null);
    this._dispatchCall(64608,"SetAlwaysDelete", DISPATCH_METHOD,null,AlwaysDelete.value,(Store!=null?Store:Dispatch.NULL));
  }
  @DeclDISPID(64609)  public void SetAlwaysMoveToFolder(MAPIFolder MoveToFolder, _Store Store) throws ComException {
    this._dispatchCall(64609,"SetAlwaysMoveToFolder", DISPATCH_METHOD,null,(MoveToFolder!=null?MoveToFolder:Dispatch.NULL),(Store!=null?Store:Dispatch.NULL));
  }
  @DeclDISPID(64610)  public void ClearAlwaysAssignCategories(_Store Store) throws ComException {
    this._dispatchCall(64610,"ClearAlwaysAssignCategories", DISPATCH_METHOD,null,(Store!=null?Store:Dispatch.NULL));
  }
  @DeclDISPID(64611)  public void StopAlwaysDelete(_Store Store) throws ComException {
    this._dispatchCall(64611,"StopAlwaysDelete", DISPATCH_METHOD,null,(Store!=null?Store:Dispatch.NULL));
  }
  @DeclDISPID(64612)  public void StopAlwaysMoveToFolder(_Store Store) throws ComException {
    this._dispatchCall(64612,"StopAlwaysMoveToFolder", DISPATCH_METHOD,null,(Store!=null?Store:Dispatch.NULL));
  }
  @DeclDISPID(64629)  public String getConversationID() throws ComException {
    final Object obj = this._dispatchCall(64629,"ConversationID", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  public Conversation() throws ComException {
    super("{00061101-0000-0000-C000-000000000046}", "{00063101-0000-0000-C000-000000000046}");
  }
  protected Conversation(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[Conversation" + super.toString() + "]";
  }
}
