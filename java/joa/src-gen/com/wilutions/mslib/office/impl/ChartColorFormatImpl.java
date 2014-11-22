/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B8E76-A463-DB41-5DAE-69E7A5F7FCBC}")
public class ChartColorFormatImpl extends Dispatch implements com.wilutions.mslib.office.ChartColorFormat {
  @DeclDISPID(150)  public Dispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(150,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(1646)  public Integer getSchemeColor() throws ComException {
    final Object obj = this._dispatchCall(1646,"SchemeColor", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1646)  public void setSchemeColor(Integer RHS) throws ComException {
    assert(RHS != null);
    this._dispatchCall(1646,"SchemeColor", DISPATCH_PROPERTYPUT,RHS);
  }
  @DeclDISPID(1055)  public Integer getRGB() throws ComException {
    final Object obj = this._dispatchCall(1055,"RGB", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1055)  public void setRGB(Integer RHS) throws ComException {
    assert(RHS != null);
    this._dispatchCall(1055,"RGB", DISPATCH_PROPERTYPUT,RHS);
  }
  @DeclDISPID(0)  public Integer get_Default() throws ComException {
    final Object obj = this._dispatchCall(0,"_Default", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(108)  public Integer getType() throws ComException {
    final Object obj = this._dispatchCall(108,"Type", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
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
  public ChartColorFormatImpl(String progId) throws ComException {
    super(progId, "{000C171D-0000-0000-C000-000000000046}");
  }
  protected ChartColorFormatImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ChartColorFormatImpl" + super.toString() + "]";
  }
}
