/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{3D957E1E-6FFE-97A2-0FED-78BB24120DE6}")
public class IParticipantCollectionImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IParticipantCollection {
  @DeclDISPID(1610743808)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(0)  public com.wilutions.mslib.uccollaborationlib.IParticipant getItem(Integer _index) throws ComException {
    assert(_index != null);
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_PROPERTYGET,null,_index);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IParticipantImpl.class);
  }
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException {
    final Object obj = this._dispatchCall(-4,"_NewEnum", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1610743811)  public Integer IndexOf(com.wilutions.mslib.uccollaborationlib.IParticipant _participant) throws ComException {
    final Object obj = this._dispatchCall(1610743811,"IndexOf", DISPATCH_METHOD,null,(_participant!=null?_participant:Dispatch.NULL));
    if (obj == null) return null;
    return (Integer)obj;
  }
  public IParticipantCollectionImpl(String progId) throws ComException {
    super(progId, "{FD02E775-CB9D-4CE3-9243-115C81E5F11C}");
  }
  protected IParticipantCollectionImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IParticipantCollectionImpl" + super.toString() + "]";
  }
}
