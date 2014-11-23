/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{34B4EB06-AAF8-9014-08C7-8E7FC0D6F393}")
public class IScheduledConferenceCollectionImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IScheduledConferenceCollection {
  @DeclDISPID(1610743808)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(0)  public com.wilutions.mslib.uccollaborationlib.IScheduledConference getItem(Integer _index) throws ComException {
    assert(_index != null);
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_PROPERTYGET,null,_index);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IScheduledConferenceImpl.class);
  }
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException {
    final Object obj = this._dispatchCall(-4,"_NewEnum", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  public IScheduledConferenceCollectionImpl(String progId) throws ComException {
    super(progId, "{F423726D-0E9B-4B55-9569-E79865210F69}");
  }
  protected IScheduledConferenceCollectionImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IScheduledConferenceCollectionImpl" + super.toString() + "]";
  }
}
