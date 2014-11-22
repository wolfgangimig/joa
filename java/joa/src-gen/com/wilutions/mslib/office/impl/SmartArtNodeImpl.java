/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9AA3-A463-DB41-5DAE-69E7A5F7FCBC}")
public class SmartArtNodeImpl extends Dispatch implements com.wilutions.mslib.office.SmartArtNode {
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
  @DeclDISPID(2)  public com.wilutions.mslib.office.SmartArtNode AddNode(com.wilutions.mslib.office.MsoSmartArtNodePosition Position, com.wilutions.mslib.office.MsoSmartArtNodeType Type) throws ComException {
    assert(Position != null);
    assert(Type != null);
    final Object obj = this._dispatchCall(2,"AddNode", DISPATCH_METHOD,null,Position.value,Type.value);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.SmartArtNodeImpl.class);
  }
  @DeclDISPID(3)  public void Delete() throws ComException {
    this._dispatchCall(3,"Delete", DISPATCH_METHOD,null);
  }
  @DeclDISPID(4)  public void Promote() throws ComException {
    this._dispatchCall(4,"Promote", DISPATCH_METHOD,null);
  }
  @DeclDISPID(5)  public void Demote() throws ComException {
    this._dispatchCall(5,"Demote", DISPATCH_METHOD,null);
  }
  @DeclDISPID(6)  public com.wilutions.mslib.office.MsoOrgChartLayoutType getOrgChartLayout() throws ComException {
    final Object obj = this._dispatchCall(6,"OrgChartLayout", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoOrgChartLayoutType.valueOf((Integer)obj);
  }
  @DeclDISPID(6)  public void setOrgChartLayout(com.wilutions.mslib.office.MsoOrgChartLayoutType value) throws ComException {
    assert(value != null);
    this._dispatchCall(6,"OrgChartLayout", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(7)  public com.wilutions.mslib.office.ShapeRange getShapes() throws ComException {
    final Object obj = this._dispatchCall(7,"Shapes", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.ShapeRangeImpl.class);
  }
  @DeclDISPID(8)  public com.wilutions.mslib.office.TextFrame2 getTextFrame2() throws ComException {
    final Object obj = this._dispatchCall(8,"TextFrame2", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.TextFrame2Impl.class);
  }
  @DeclDISPID(9)  public void Larger() throws ComException {
    this._dispatchCall(9,"Larger", DISPATCH_METHOD,null);
  }
  @DeclDISPID(10)  public void Smaller() throws ComException {
    this._dispatchCall(10,"Smaller", DISPATCH_METHOD,null);
  }
  @DeclDISPID(11)  public Integer getLevel() throws ComException {
    final Object obj = this._dispatchCall(11,"Level", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(12)  public com.wilutions.mslib.office.MsoTriState getHidden() throws ComException {
    final Object obj = this._dispatchCall(12,"Hidden", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoTriState.valueOf((Integer)obj);
  }
  @DeclDISPID(13)  public com.wilutions.mslib.office.SmartArtNodes getNodes() throws ComException {
    final Object obj = this._dispatchCall(13,"Nodes", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.SmartArtNodesImpl.class);
  }
  @DeclDISPID(14)  public com.wilutions.mslib.office.SmartArtNode getParentNode() throws ComException {
    final Object obj = this._dispatchCall(14,"ParentNode", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.SmartArtNodeImpl.class);
  }
  @DeclDISPID(15)  public com.wilutions.mslib.office.MsoSmartArtNodeType getType() throws ComException {
    final Object obj = this._dispatchCall(15,"Type", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoSmartArtNodeType.valueOf((Integer)obj);
  }
  @DeclDISPID(16)  public void ReorderUp() throws ComException {
    this._dispatchCall(16,"ReorderUp", DISPATCH_METHOD,null);
  }
  @DeclDISPID(17)  public void ReorderDown() throws ComException {
    this._dispatchCall(17,"ReorderDown", DISPATCH_METHOD,null);
  }
  public SmartArtNodeImpl(String progId) throws ComException {
    super(progId, "{000C03C8-0000-0000-C000-000000000046}");
  }
  protected SmartArtNodeImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[SmartArtNodeImpl" + super.toString() + "]";
  }
}
