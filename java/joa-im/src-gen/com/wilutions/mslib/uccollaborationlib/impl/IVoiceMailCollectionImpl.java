/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{36D35F7B-0525-9117-1E96-CF7BE030E015}")
public class IVoiceMailCollectionImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IVoiceMailCollection {
  @DeclDISPID(1610743808)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(0)  public com.wilutions.mslib.uccollaborationlib.IVoiceMail getItem(Integer _index) throws ComException {
    assert(_index != null);
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_PROPERTYGET,null,_index);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IVoiceMailImpl.class);
  }
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException {
    final Object obj = this._dispatchCall(-4,"_NewEnum", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  public IVoiceMailCollectionImpl(String progId) throws ComException {
    super(progId, "{F644C610-A146-4A56-8338-A69C45C71CEF}");
  }
  protected IVoiceMailCollectionImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IVoiceMailCollectionImpl" + super.toString() + "]";
  }
}
