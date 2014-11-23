/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{6BBA830C-8F5E-9564-2FB2-6A131A333E44}")
public class IConversationManagerEventDataImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IConversationManagerEventData {
  @DeclDISPID(1610743808)  public com.wilutions.mslib.uccollaborationlib.IConversation getConversation() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Conversation", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IConversationImpl.class);
  }
  public IConversationManagerEventDataImpl(String progId) throws ComException {
    super(progId, "{AB2D1A67-2B3D-4E25-B21C-03F4BFC4C2BE}");
  }
  protected IConversationManagerEventDataImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IConversationManagerEventDataImpl" + super.toString() + "]";
  }
}
