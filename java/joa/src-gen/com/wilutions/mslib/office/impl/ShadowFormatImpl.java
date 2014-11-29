/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9A70-A463-DB41-5DAE-69E7A5F7FCBC}")
public class ShadowFormatImpl extends Dispatch implements com.wilutions.mslib.office.ShadowFormat {
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
  @DeclDISPID(1)  public IDispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(1,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(10)  public void IncrementOffsetX(final Float Increment) throws ComException {
    assert(Increment != null);
    this._dispatchCall(10,"IncrementOffsetX", DISPATCH_METHOD,null,Increment);
  }
  @DeclDISPID(11)  public void IncrementOffsetY(final Float Increment) throws ComException {
    assert(Increment != null);
    this._dispatchCall(11,"IncrementOffsetY", DISPATCH_METHOD,null,Increment);
  }
  @DeclDISPID(100)  public com.wilutions.mslib.office.ColorFormat getForeColor() throws ComException {
    final Object obj = this._dispatchCall(100,"ForeColor", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.ColorFormatImpl.class);
  }
  @DeclDISPID(100)  public void setForeColor(final com.wilutions.mslib.office.ColorFormat value) throws ComException {
    this._dispatchCall(100,"ForeColor", DISPATCH_PROPERTYPUT,(value!=null?value:Dispatch.NULL));
  }
  @DeclDISPID(101)  public com.wilutions.mslib.office.MsoTriState getObscured() throws ComException {
    final Object obj = this._dispatchCall(101,"Obscured", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoTriState.valueOf((Integer)obj);
  }
  @DeclDISPID(101)  public void setObscured(final com.wilutions.mslib.office.MsoTriState value) throws ComException {
    assert(value != null);
    this._dispatchCall(101,"Obscured", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(102)  public Float getOffsetX() throws ComException {
    final Object obj = this._dispatchCall(102,"OffsetX", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(102)  public void setOffsetX(final Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(102,"OffsetX", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(103)  public Float getOffsetY() throws ComException {
    final Object obj = this._dispatchCall(103,"OffsetY", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(103)  public void setOffsetY(final Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(103,"OffsetY", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(104)  public Float getTransparency() throws ComException {
    final Object obj = this._dispatchCall(104,"Transparency", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(104)  public void setTransparency(final Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(104,"Transparency", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(105)  public com.wilutions.mslib.office.MsoShadowType getType() throws ComException {
    final Object obj = this._dispatchCall(105,"Type", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoShadowType.valueOf((Integer)obj);
  }
  @DeclDISPID(105)  public void setType(final com.wilutions.mslib.office.MsoShadowType value) throws ComException {
    assert(value != null);
    this._dispatchCall(105,"Type", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(106)  public com.wilutions.mslib.office.MsoTriState getVisible() throws ComException {
    final Object obj = this._dispatchCall(106,"Visible", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoTriState.valueOf((Integer)obj);
  }
  @DeclDISPID(106)  public void setVisible(final com.wilutions.mslib.office.MsoTriState value) throws ComException {
    assert(value != null);
    this._dispatchCall(106,"Visible", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(107)  public com.wilutions.mslib.office.MsoShadowStyle getStyle() throws ComException {
    final Object obj = this._dispatchCall(107,"Style", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoShadowStyle.valueOf((Integer)obj);
  }
  @DeclDISPID(107)  public void setStyle(final com.wilutions.mslib.office.MsoShadowStyle value) throws ComException {
    assert(value != null);
    this._dispatchCall(107,"Style", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(108)  public Float getBlur() throws ComException {
    final Object obj = this._dispatchCall(108,"Blur", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(108)  public void setBlur(final Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(108,"Blur", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(109)  public Float getSize() throws ComException {
    final Object obj = this._dispatchCall(109,"Size", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(109)  public void setSize(final Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(109,"Size", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(110)  public com.wilutions.mslib.office.MsoTriState getRotateWithShape() throws ComException {
    final Object obj = this._dispatchCall(110,"RotateWithShape", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoTriState.valueOf((Integer)obj);
  }
  @DeclDISPID(110)  public void setRotateWithShape(final com.wilutions.mslib.office.MsoTriState value) throws ComException {
    assert(value != null);
    this._dispatchCall(110,"RotateWithShape", DISPATCH_PROPERTYPUT,value.value);
  }
  public ShadowFormatImpl(String progId) throws ComException {
    super(progId, "{000C031B-0000-0000-C000-000000000046}");
  }
  protected ShadowFormatImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ShadowFormatImpl" + super.toString() + "]";
  }
}
