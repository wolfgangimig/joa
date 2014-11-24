/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9A06-A463-DB41-5DAE-69E7A5F7FCBC}")
public class IMsoDiagramImpl extends Dispatch implements com.wilutions.mslib.office.IMsoDiagram {
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
  @DeclDISPID(100)  public IDispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(100,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(101)  public com.wilutions.mslib.office.DiagramNodes getNodes() throws ComException {
    final Object obj = this._dispatchCall(101,"Nodes", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.DiagramNodesImpl.class);
  }
  @DeclDISPID(102)  public com.wilutions.mslib.office.MsoDiagramType getType() throws ComException {
    final Object obj = this._dispatchCall(102,"Type", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoDiagramType.valueOf((Integer)obj);
  }
  @DeclDISPID(103)  public com.wilutions.mslib.office.MsoTriState getAutoLayout() throws ComException {
    final Object obj = this._dispatchCall(103,"AutoLayout", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoTriState.valueOf((Integer)obj);
  }
  @DeclDISPID(103)  public void setAutoLayout(com.wilutions.mslib.office.MsoTriState value) throws ComException {
    assert(value != null);
    this._dispatchCall(103,"AutoLayout", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(104)  public com.wilutions.mslib.office.MsoTriState getReverse() throws ComException {
    final Object obj = this._dispatchCall(104,"Reverse", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoTriState.valueOf((Integer)obj);
  }
  @DeclDISPID(104)  public void setReverse(com.wilutions.mslib.office.MsoTriState value) throws ComException {
    assert(value != null);
    this._dispatchCall(104,"Reverse", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(105)  public com.wilutions.mslib.office.MsoTriState getAutoFormat() throws ComException {
    final Object obj = this._dispatchCall(105,"AutoFormat", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoTriState.valueOf((Integer)obj);
  }
  @DeclDISPID(105)  public void setAutoFormat(com.wilutions.mslib.office.MsoTriState value) throws ComException {
    assert(value != null);
    this._dispatchCall(105,"AutoFormat", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(10)  public void Convert(com.wilutions.mslib.office.MsoDiagramType Type) throws ComException {
    assert(Type != null);
    this._dispatchCall(10,"Convert", DISPATCH_METHOD,null,Type.value);
  }
  @DeclDISPID(11)  public void FitText() throws ComException {
    this._dispatchCall(11,"FitText", DISPATCH_METHOD,null);
  }
  public IMsoDiagramImpl(String progId) throws ComException {
    super(progId, "{000C036D-0000-0000-C000-000000000046}");
  }
  protected IMsoDiagramImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IMsoDiagramImpl" + super.toString() + "]";
  }
}
