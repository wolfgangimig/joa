/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9AD6-A463-DB41-5DAE-69E7A5F7FCBC}")
public class GlowFormatImpl extends Dispatch implements com.wilutions.mslib.office.GlowFormat {
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"Creator", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1)  public Float getRadius() throws ComException {
    final Object obj = this._dispatchCall(1,"Radius", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(1)  public void setRadius(final Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(1,"Radius", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(2)  public com.wilutions.mslib.office.ColorFormat getColor() throws ComException {
    final Object obj = this._dispatchCall(2,"Color", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.ColorFormatImpl.class);
  }
  @DeclDISPID(3)  public Float getTransparency() throws ComException {
    final Object obj = this._dispatchCall(3,"Transparency", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(3)  public void setTransparency(final Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(3,"Transparency", DISPATCH_PROPERTYPUT,value);
  }
  public GlowFormatImpl(String progId) throws ComException {
    super(progId, "{000C03BD-0000-0000-C000-000000000046}");
  }
  protected GlowFormatImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[GlowFormatImpl" + super.toString() + "]";
  }
}
