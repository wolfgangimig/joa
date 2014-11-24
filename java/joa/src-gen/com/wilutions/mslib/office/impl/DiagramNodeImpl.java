/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9A1B-A463-DB41-5DAE-69E7A5F7FCBC}")
public class DiagramNodeImpl extends Dispatch implements com.wilutions.mslib.office.DiagramNode {
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
  @DeclDISPID(10)  public com.wilutions.mslib.office.DiagramNode AddNode(com.wilutions.mslib.office.MsoRelativeNodePosition Pos, com.wilutions.mslib.office.MsoDiagramNodeType NodeType) throws ComException {
    assert(Pos != null);
    assert(NodeType != null);
    final Object obj = this._dispatchCall(10,"AddNode", DISPATCH_METHOD,null,Pos.value,NodeType.value);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.DiagramNodeImpl.class);
  }
  @DeclDISPID(11)  public void Delete() throws ComException {
    this._dispatchCall(11,"Delete", DISPATCH_METHOD,null);
  }
  @DeclDISPID(12)  public void MoveNode(com.wilutions.mslib.office.DiagramNode TargetNode, com.wilutions.mslib.office.MsoRelativeNodePosition Pos) throws ComException {
    assert(Pos != null);
    this._dispatchCall(12,"MoveNode", DISPATCH_METHOD,null,(TargetNode!=null?TargetNode:Dispatch.NULL),Pos.value);
  }
  @DeclDISPID(13)  public void ReplaceNode(com.wilutions.mslib.office.DiagramNode TargetNode) throws ComException {
    this._dispatchCall(13,"ReplaceNode", DISPATCH_METHOD,null,(TargetNode!=null?TargetNode:Dispatch.NULL));
  }
  @DeclDISPID(14)  public void SwapNode(com.wilutions.mslib.office.DiagramNode TargetNode, Boolean SwapChildren) throws ComException {
    assert(SwapChildren != null);
    this._dispatchCall(14,"SwapNode", DISPATCH_METHOD,null,(TargetNode!=null?TargetNode:Dispatch.NULL),SwapChildren);
  }
  @DeclDISPID(15)  public com.wilutions.mslib.office.DiagramNode CloneNode(Boolean CopyChildren, com.wilutions.mslib.office.DiagramNode TargetNode, com.wilutions.mslib.office.MsoRelativeNodePosition Pos) throws ComException {
    assert(CopyChildren != null);
    assert(Pos != null);
    final Object obj = this._dispatchCall(15,"CloneNode", DISPATCH_METHOD,null,CopyChildren,(TargetNode!=null?TargetNode:Dispatch.NULL),Pos.value);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.DiagramNodeImpl.class);
  }
  @DeclDISPID(16)  public void TransferChildren(com.wilutions.mslib.office.DiagramNode ReceivingNode) throws ComException {
    this._dispatchCall(16,"TransferChildren", DISPATCH_METHOD,null,(ReceivingNode!=null?ReceivingNode:Dispatch.NULL));
  }
  @DeclDISPID(17)  public com.wilutions.mslib.office.DiagramNode NextNode() throws ComException {
    final Object obj = this._dispatchCall(17,"NextNode", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.DiagramNodeImpl.class);
  }
  @DeclDISPID(18)  public com.wilutions.mslib.office.DiagramNode PrevNode() throws ComException {
    final Object obj = this._dispatchCall(18,"PrevNode", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.DiagramNodeImpl.class);
  }
  @DeclDISPID(100)  public IDispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(100,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(101)  public com.wilutions.mslib.office.DiagramNodeChildren getChildren() throws ComException {
    final Object obj = this._dispatchCall(101,"Children", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.DiagramNodeChildrenImpl.class);
  }
  @DeclDISPID(102)  public com.wilutions.mslib.office.Shape getShape() throws ComException {
    final Object obj = this._dispatchCall(102,"Shape", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.ShapeImpl.class);
  }
  @DeclDISPID(103)  public com.wilutions.mslib.office.DiagramNode getRoot() throws ComException {
    final Object obj = this._dispatchCall(103,"Root", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.DiagramNodeImpl.class);
  }
  @DeclDISPID(104)  public com.wilutions.mslib.office.IMsoDiagram getDiagram() throws ComException {
    final Object obj = this._dispatchCall(104,"Diagram", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.IMsoDiagramImpl.class);
  }
  @DeclDISPID(105)  public com.wilutions.mslib.office.MsoOrgChartLayoutType getLayout() throws ComException {
    final Object obj = this._dispatchCall(105,"Layout", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoOrgChartLayoutType.valueOf((Integer)obj);
  }
  @DeclDISPID(105)  public void setLayout(com.wilutions.mslib.office.MsoOrgChartLayoutType value) throws ComException {
    assert(value != null);
    this._dispatchCall(105,"Layout", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(106)  public com.wilutions.mslib.office.Shape getTextShape() throws ComException {
    final Object obj = this._dispatchCall(106,"TextShape", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.ShapeImpl.class);
  }
  public DiagramNodeImpl(String progId) throws ComException {
    super(progId, "{000C0370-0000-0000-C000-000000000046}");
  }
  protected DiagramNodeImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[DiagramNodeImpl" + super.toString() + "]";
  }
}
