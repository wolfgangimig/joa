/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9ABA-A463-DB41-5DAE-69E7A5F7FCBC}")
public class PictureEffectImpl extends Dispatch implements com.wilutions.mslib.office.PictureEffect {
  @DeclDISPID(1610743808)  public Dispatch getApplication() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"Creator", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(0)  public com.wilutions.mslib.office.MsoPictureEffectType getType() throws ComException {
    final Object obj = this._dispatchCall(0,"Type", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoPictureEffectType.valueOf((Integer)obj);
  }
  @DeclDISPID(1)  public void setPosition(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(1,"Position", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1)  public Integer getPosition() throws ComException {
    final Object obj = this._dispatchCall(1,"Position", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(2)  public void Delete() throws ComException {
    this._dispatchCall(2,"Delete", DISPATCH_METHOD,null);
  }
  @DeclDISPID(3)  public com.wilutions.mslib.office.EffectParameters getEffectParameters() throws ComException {
    final Object obj = this._dispatchCall(3,"EffectParameters", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.EffectParametersImpl.class);
  }
  @DeclDISPID(4)  public void setVisible(com.wilutions.mslib.office.MsoTriState value) throws ComException {
    assert(value != null);
    this._dispatchCall(4,"Visible", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(4)  public com.wilutions.mslib.office.MsoTriState getVisible() throws ComException {
    final Object obj = this._dispatchCall(4,"Visible", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoTriState.valueOf((Integer)obj);
  }
  public PictureEffectImpl(String progId) throws ComException {
    super(progId, "{000C03D1-0000-0000-C000-000000000046}");
  }
  protected PictureEffectImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[PictureEffectImpl" + super.toString() + "]";
  }
}
