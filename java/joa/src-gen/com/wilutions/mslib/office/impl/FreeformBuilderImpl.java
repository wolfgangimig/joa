/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9A7E-A463-DB41-5DAE-69E7A5F7FCBC}")
public class FreeformBuilderImpl extends Dispatch implements com.wilutions.mslib.office.FreeformBuilder {
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
  @DeclDISPID(10)  public void AddNodes(com.wilutions.mslib.office.MsoSegmentType SegmentType, com.wilutions.mslib.office.MsoEditingType EditingType, Float X1, Float Y1, Float X2, Float Y2, Float X3, Float Y3) throws ComException {
    assert(SegmentType != null);
    assert(EditingType != null);
    assert(X1 != null);
    assert(Y1 != null);
    assert(X2 != null);
    assert(Y2 != null);
    assert(X3 != null);
    assert(Y3 != null);
    this._dispatchCall(10,"AddNodes", DISPATCH_METHOD,null,SegmentType.value,EditingType.value,X1,Y1,X2,Y2,X3,Y3);
  }
  @DeclDISPID(11)  public com.wilutions.mslib.office.Shape ConvertToShape() throws ComException {
    final Object obj = this._dispatchCall(11,"ConvertToShape", DISPATCH_METHOD,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.ShapeImpl.class);
  }
  public FreeformBuilderImpl(String progId) throws ComException {
    super(progId, "{000C0315-0000-0000-C000-000000000046}");
  }
  protected FreeformBuilderImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[FreeformBuilderImpl" + super.toString() + "]";
  }
}
