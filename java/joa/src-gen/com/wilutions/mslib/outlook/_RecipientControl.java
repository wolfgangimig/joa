/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * _RecipientControl.
 * 
 */
@CoClass(guid="{0006F023-0000-0000-C000-000000000046}")
public class _RecipientControl extends Dispatch implements _DRecipientControl {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(-514)  public Byte getEnabled() throws ComException {
    final Object obj = this._dispatchCall(-514,"Enabled", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Byte)obj;
  }
  @DeclDISPID(-514)  public void setEnabled(Byte value) throws ComException {
    assert(value != null);
    this._dispatchCall(-514,"Enabled", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(-501)  public Integer getBackColor() throws ComException {
    final Object obj = this._dispatchCall(-501,"BackColor", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(-501)  public void setBackColor(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(-501,"BackColor", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(-513)  public Integer getForeColor() throws ComException {
    final Object obj = this._dispatchCall(-513,"ForeColor", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(-513)  public void setForeColor(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(-513,"ForeColor", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(-2147356664)  public Byte getReadOnly() throws ComException {
    final Object obj = this._dispatchCall(-2147356664,"ReadOnly", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Byte)obj;
  }
  @DeclDISPID(-2147356664)  public void setReadOnly(Byte value) throws ComException {
    assert(value != null);
    this._dispatchCall(-2147356664,"ReadOnly", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(-512)  public IDispatch getFont() throws ComException {
    final Object obj = this._dispatchCall(-512,"Font", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(-512)  public void setFont(IDispatch value) throws ComException {
    this._dispatchCall(-512,"Font", DISPATCH_PROPERTYPUT,(value!=null?value:Dispatch.NULL));
  }
  @DeclDISPID(12)  public Integer getSpecialEffect() throws ComException {
    final Object obj = this._dispatchCall(12,"SpecialEffect", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(12)  public void setSpecialEffect(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(12,"SpecialEffect", DISPATCH_PROPERTYPUT,value);
  }
  public _RecipientControl() throws ComException {
    super("{0006F023-0000-0000-C000-000000000046}", "{0006F025-0000-0000-C000-000000000046}");
  }
  protected _RecipientControl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_RecipientControl" + super.toString() + "]";
  }
}
