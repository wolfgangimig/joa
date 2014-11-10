/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B8E5B-A463-DB41-5DAE-69E7A5F7FCBC}")
public class IMsoChartFormatImpl extends Dispatch implements com.wilutions.mslib.office.IMsoChartFormat {
  @DeclDISPID(1610743808)  public com.wilutions.mslib.office.FillFormat getFill() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Fill", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.FillFormatImpl.class);
  }
  @DeclDISPID(1610743809)  public com.wilutions.mslib.office.GlowFormat getGlow() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"Glow", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.GlowFormatImpl.class);
  }
  @DeclDISPID(1610743810)  public com.wilutions.mslib.office.LineFormat getLine() throws ComException {
    final Object obj = this._dispatchCall(1610743810,"Line", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.LineFormatImpl.class);
  }
  @DeclDISPID(1610743811)  public Dispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(1610743811,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(1610743812)  public com.wilutions.mslib.office.PictureFormat getPictureFormat() throws ComException {
    final Object obj = this._dispatchCall(1610743812,"PictureFormat", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.PictureFormatImpl.class);
  }
  @DeclDISPID(1610743813)  public com.wilutions.mslib.office.ShadowFormat getShadow() throws ComException {
    final Object obj = this._dispatchCall(1610743813,"Shadow", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.ShadowFormatImpl.class);
  }
  @DeclDISPID(1610743814)  public com.wilutions.mslib.office.SoftEdgeFormat getSoftEdge() throws ComException {
    final Object obj = this._dispatchCall(1610743814,"SoftEdge", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.SoftEdgeFormatImpl.class);
  }
  @DeclDISPID(1610743815)  public com.wilutions.mslib.office.TextFrame2 getTextFrame2() throws ComException {
    final Object obj = this._dispatchCall(1610743815,"TextFrame2", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.TextFrame2Impl.class);
  }
  @DeclDISPID(1610743816)  public com.wilutions.mslib.office.ThreeDFormat getThreeD() throws ComException {
    final Object obj = this._dispatchCall(1610743816,"ThreeD", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.ThreeDFormatImpl.class);
  }
  @DeclDISPID(148)  public Dispatch getApplication() throws ComException {
    final Object obj = this._dispatchCall(148,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(149)  public Integer getCreator() throws ComException {
    final Object obj = this._dispatchCall(149,"Creator", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(200)  public com.wilutions.mslib.office.Adjustments getAdjustments() throws ComException {
    final Object obj = this._dispatchCall(200,"Adjustments", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.AdjustmentsImpl.class);
  }
  @DeclDISPID(201)  public com.wilutions.mslib.office.MsoAutoShapeType getAutoShapeType() throws ComException {
    final Object obj = this._dispatchCall(201,"AutoShapeType", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoAutoShapeType.valueOf((Integer)obj);
  }
  @DeclDISPID(201)  public void setAutoShapeType(com.wilutions.mslib.office.MsoAutoShapeType value) throws ComException {
    assert(value != null);
    this._dispatchCall(201,"AutoShapeType", DISPATCH_PROPERTYPUT,value.value);
  }
  public IMsoChartFormatImpl(String progId) throws ComException {
    super(progId);
  }
  protected IMsoChartFormatImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IMsoChartFormatImpl" + super.toString() + "]";
  }
}
