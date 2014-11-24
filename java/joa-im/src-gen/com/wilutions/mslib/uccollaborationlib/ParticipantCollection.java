/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ParticipantCollection.
 * ParticipantCollection defines a collection of Participant objects. 
 */
@CoClass(guid="{BEE2A581-7F14-4C61-89A6-47430EC138EA}")
public class ParticipantCollection extends Dispatch implements IParticipantCollection {
  @DeclDISPID(1610743808)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(0)  public IParticipant getItem(Integer _index) throws ComException {
    assert(_index != null);
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_PROPERTYGET,null,_index);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IParticipantImpl.class);
  }
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException {
    final Object obj = this._dispatchCall(-4,"_NewEnum", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1610743811)  public Integer IndexOf(IParticipant _participant) throws ComException {
    final Object obj = this._dispatchCall(1610743811,"IndexOf", DISPATCH_METHOD,null,(_participant!=null?_participant:Dispatch.NULL));
    if (obj == null) return null;
    return (Integer)obj;
  }
  public ParticipantCollection() throws ComException {
    super("{BEE2A581-7F14-4C61-89A6-47430EC138EA}", "{FD02E775-CB9D-4CE3-9243-115C81E5F11C}");
  }
  protected ParticipantCollection(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ParticipantCollection" + super.toString() + "]";
  }
}
