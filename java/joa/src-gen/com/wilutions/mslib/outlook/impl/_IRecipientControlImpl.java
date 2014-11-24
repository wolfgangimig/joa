/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{18E9E77D-CCF4-CA8F-3B6E-694DA5977350}")
public class _IRecipientControlImpl extends Dispatch implements com.wilutions.mslib.outlook._IRecipientControl {
  @DeclDISPID(-514)  public Byte getEnabled() throws ComException {
    final Object obj = this._dispatchCall(-514,"Enabled", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Byte)obj;
  }
  @DeclDISPID(-514)  public void setEnabled(Byte Enabled) throws ComException {
    assert(Enabled != null);
    this._dispatchCall(-514,"Enabled", DISPATCH_PROPERTYPUT,Enabled);
  }
  @DeclDISPID(-501)  public Integer getBackColor() throws ComException {
    final Object obj = this._dispatchCall(-501,"BackColor", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(-501)  public void setBackColor(Integer BackColor) throws ComException {
    assert(BackColor != null);
    this._dispatchCall(-501,"BackColor", DISPATCH_PROPERTYPUT,BackColor);
  }
  @DeclDISPID(-513)  public Integer getForeColor() throws ComException {
    final Object obj = this._dispatchCall(-513,"ForeColor", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(-513)  public void setForeColor(Integer ForeColor) throws ComException {
    assert(ForeColor != null);
    this._dispatchCall(-513,"ForeColor", DISPATCH_PROPERTYPUT,ForeColor);
  }
  @DeclDISPID(-2147356664)  public Byte getReadOnly() throws ComException {
    final Object obj = this._dispatchCall(-2147356664,"ReadOnly", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Byte)obj;
  }
  @DeclDISPID(-2147356664)  public void setReadOnly(Byte ReadOnly) throws ComException {
    assert(ReadOnly != null);
    this._dispatchCall(-2147356664,"ReadOnly", DISPATCH_PROPERTYPUT,ReadOnly);
  }
  @DeclDISPID(-512)  public IDispatch getFont() throws ComException {
    final Object obj = this._dispatchCall(-512,"Font", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(-512)  public void setFont(IDispatch Font) throws ComException {
    this._dispatchCall(-512,"Font", DISPATCH_PROPERTYPUT,(Font!=null?Font:Dispatch.NULL));
  }
  @DeclDISPID(12)  public Integer getSpecialEffect() throws ComException {
    final Object obj = this._dispatchCall(12,"SpecialEffect", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(12)  public void setSpecialEffect(Integer Effect) throws ComException {
    assert(Effect != null);
    this._dispatchCall(12,"SpecialEffect", DISPATCH_PROPERTYPUT,Effect);
  }
  public _IRecipientControlImpl(String progId) throws ComException {
    super(progId, "{D87E7E16-6897-11CE-A6C0-00AA00608FAA}");
  }
  protected _IRecipientControlImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_IRecipientControlImpl" + super.toString() + "]";
  }
}
