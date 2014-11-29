/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9A7E-A463-DB41-5DAE-69E7A5F7FCBC}")
public class FreeformBuilderImpl extends Dispatch implements com.wilutions.mslib.office.FreeformBuilder {
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
  @DeclDISPID(10)  public void AddNodes(final com.wilutions.mslib.office.MsoSegmentType SegmentType, final com.wilutions.mslib.office.MsoEditingType EditingType, final Float X1, final Float Y1, final Float X2, final Float Y2, final Float X3, final Float Y3) throws ComException {
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
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.ShapeImpl.class);
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
