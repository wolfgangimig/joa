/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ConversationCollection.
 * ConversationCollection class defines a collection of conversations. 
 */
@CoClass(guid="{373B822D-C7EE-4763-93A7-86BB2EA7E031}")
public class ConversationCollection extends Dispatch implements IConversationCollection {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(0)  public IConversation getItem(final Integer _index) throws ComException {
    assert(_index != null);
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_PROPERTYGET,null,_index);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IConversationImpl.class);
  }
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException {
    final Object obj = this._dispatchCall(-4,"_NewEnum", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1610743811)  public Integer IndexOf(final IConversation _conversation) throws ComException {
    final Object obj = this._dispatchCall(1610743811,"IndexOf", DISPATCH_METHOD,null,(_conversation!=null?_conversation:Dispatch.NULL));
    if (obj == null) return null;
    return (Integer)obj;
  }
  public ConversationCollection() throws ComException {
    super("{373B822D-C7EE-4763-93A7-86BB2EA7E031}", "{A4E1D1E4-7839-473B-95FA-5D33DDC0D2DD}");
  }
  protected ConversationCollection(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ConversationCollection" + super.toString() + "]";
  }
}
