/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9A73-A463-DB41-5DAE-69E7A5F7FCBC}")
public class ShapeNodeImpl extends Dispatch implements com.wilutions.mslib.office.ShapeNode {
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
  @DeclDISPID(1)  public Dispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(1,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(100)  public com.wilutions.mslib.office.MsoEditingType getEditingType() throws ComException {
    final Object obj = this._dispatchCall(100,"EditingType", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoEditingType.valueOf((Integer)obj);
  }
  @DeclDISPID(101)  public Object getPoints() throws ComException {
    final Object obj = this._dispatchCall(101,"Points", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(102)  public com.wilutions.mslib.office.MsoSegmentType getSegmentType() throws ComException {
    final Object obj = this._dispatchCall(102,"SegmentType", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoSegmentType.valueOf((Integer)obj);
  }
  public ShapeNodeImpl(String progId) throws ComException {
    super(progId, "{000C0318-0000-0000-C000-000000000046}");
  }
  protected ShapeNodeImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ShapeNodeImpl" + super.toString() + "]";
  }
}
