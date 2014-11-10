/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9AD4-A463-DB41-5DAE-69E7A5F7FCBC}")
public class GradientStopImpl extends Dispatch implements com.wilutions.mslib.office.GradientStop {
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
  @DeclDISPID(1)  public com.wilutions.mslib.office.ColorFormat getColor() throws ComException {
    final Object obj = this._dispatchCall(1,"Color", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.ColorFormatImpl.class);
  }
  @DeclDISPID(2)  public Float getPosition() throws ComException {
    final Object obj = this._dispatchCall(2,"Position", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(2)  public void setPosition(Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(2,"Position", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(3)  public Float getTransparency() throws ComException {
    final Object obj = this._dispatchCall(3,"Transparency", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(3)  public void setTransparency(Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(3,"Transparency", DISPATCH_PROPERTYPUT,value);
  }
  public GradientStopImpl(String progId) throws ComException {
    super(progId);
  }
  protected GradientStopImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[GradientStopImpl" + super.toString() + "]";
  }
}
