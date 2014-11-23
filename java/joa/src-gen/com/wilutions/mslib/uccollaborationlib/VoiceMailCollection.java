/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * VoiceMailCollection.
 * VoiceMailCollection Class 
 */
@CoClass(guid="{E5FBEB06-F18E-4351-B197-67CD6AA22C01}")
public class VoiceMailCollection extends Dispatch implements IVoiceMailCollection {
  @DeclDISPID(1610743808)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(0)  public IVoiceMail getItem(Integer _index) throws ComException {
    assert(_index != null);
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_PROPERTYGET,null,_index);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IVoiceMailImpl.class);
  }
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException {
    final Object obj = this._dispatchCall(-4,"_NewEnum", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  public VoiceMailCollection() throws ComException {
    super("{E5FBEB06-F18E-4351-B197-67CD6AA22C01}", "{F644C610-A146-4A56-8338-A69C45C71CEF}");
  }
  protected VoiceMailCollection(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[VoiceMailCollection" + super.toString() + "]";
  }
}
