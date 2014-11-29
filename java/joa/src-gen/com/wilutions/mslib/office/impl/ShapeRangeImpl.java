/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9A76-A463-DB41-5DAE-69E7A5F7FCBC}")
public class ShapeRangeImpl extends Dispatch implements com.wilutions.mslib.office.ShapeRange {
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
  @DeclDISPID(2)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(2,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(0)  public com.wilutions.mslib.office.Shape Item(final Object Index) throws ComException {
    assert(Index != null);
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_METHOD,null,Index);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.ShapeImpl.class);
  }
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException {
    final Object obj = this._dispatchCall(-4,"_NewEnum", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(10)  public void Align(final com.wilutions.mslib.office.MsoAlignCmd AlignCmd, final com.wilutions.mslib.office.MsoTriState RelativeTo) throws ComException {
    assert(AlignCmd != null);
    assert(RelativeTo != null);
    this._dispatchCall(10,"Align", DISPATCH_METHOD,null,AlignCmd.value,RelativeTo.value);
  }
  @DeclDISPID(11)  public void Apply() throws ComException {
    this._dispatchCall(11,"Apply", DISPATCH_METHOD,null);
  }
  @DeclDISPID(12)  public void Delete() throws ComException {
    this._dispatchCall(12,"Delete", DISPATCH_METHOD,null);
  }
  @DeclDISPID(13)  public void Distribute(final com.wilutions.mslib.office.MsoDistributeCmd DistributeCmd, final com.wilutions.mslib.office.MsoTriState RelativeTo) throws ComException {
    assert(DistributeCmd != null);
    assert(RelativeTo != null);
    this._dispatchCall(13,"Distribute", DISPATCH_METHOD,null,DistributeCmd.value,RelativeTo.value);
  }
  @DeclDISPID(14)  public com.wilutions.mslib.office.ShapeRange Duplicate() throws ComException {
    final Object obj = this._dispatchCall(14,"Duplicate", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.ShapeRangeImpl.class);
  }
  @DeclDISPID(15)  public void Flip(final com.wilutions.mslib.office.MsoFlipCmd FlipCmd) throws ComException {
    assert(FlipCmd != null);
    this._dispatchCall(15,"Flip", DISPATCH_METHOD,null,FlipCmd.value);
  }
  @DeclDISPID(16)  public void IncrementLeft(final Float Increment) throws ComException {
    assert(Increment != null);
    this._dispatchCall(16,"IncrementLeft", DISPATCH_METHOD,null,Increment);
  }
  @DeclDISPID(17)  public void IncrementRotation(final Float Increment) throws ComException {
    assert(Increment != null);
    this._dispatchCall(17,"IncrementRotation", DISPATCH_METHOD,null,Increment);
  }
  @DeclDISPID(18)  public void IncrementTop(final Float Increment) throws ComException {
    assert(Increment != null);
    this._dispatchCall(18,"IncrementTop", DISPATCH_METHOD,null,Increment);
  }
  @DeclDISPID(19)  public com.wilutions.mslib.office.Shape Group() throws ComException {
    final Object obj = this._dispatchCall(19,"Group", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.ShapeImpl.class);
  }
  @DeclDISPID(20)  public void PickUp() throws ComException {
    this._dispatchCall(20,"PickUp", DISPATCH_METHOD,null);
  }
  @DeclDISPID(21)  public com.wilutions.mslib.office.Shape Regroup() throws ComException {
    final Object obj = this._dispatchCall(21,"Regroup", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.ShapeImpl.class);
  }
  @DeclDISPID(22)  public void RerouteConnections() throws ComException {
    this._dispatchCall(22,"RerouteConnections", DISPATCH_METHOD,null);
  }
  @DeclDISPID(23)  public void ScaleHeight(final Float Factor, final com.wilutions.mslib.office.MsoTriState RelativeToOriginalSize, final com.wilutions.mslib.office.MsoScaleFrom fScale) throws ComException {
    assert(Factor != null);
    assert(RelativeToOriginalSize != null);
    assert(fScale != null);
    this._dispatchCall(23,"ScaleHeight", DISPATCH_METHOD,null,Factor,RelativeToOriginalSize.value,fScale.value);
  }
  @DeclDISPID(24)  public void ScaleWidth(final Float Factor, final com.wilutions.mslib.office.MsoTriState RelativeToOriginalSize, final com.wilutions.mslib.office.MsoScaleFrom fScale) throws ComException {
    assert(Factor != null);
    assert(RelativeToOriginalSize != null);
    assert(fScale != null);
    this._dispatchCall(24,"ScaleWidth", DISPATCH_METHOD,null,Factor,RelativeToOriginalSize.value,fScale.value);
  }
  @DeclDISPID(25)  public void Select(final Object Replace) throws ComException {
    assert(Replace != null);
    this._dispatchCall(25,"Select", DISPATCH_METHOD,null,Replace);
  }
  @DeclDISPID(26)  public void SetShapesDefaultProperties() throws ComException {
    this._dispatchCall(26,"SetShapesDefaultProperties", DISPATCH_METHOD,null);
  }
  @DeclDISPID(27)  public com.wilutions.mslib.office.ShapeRange Ungroup() throws ComException {
    final Object obj = this._dispatchCall(27,"Ungroup", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.ShapeRangeImpl.class);
  }
  @DeclDISPID(28)  public void ZOrder(final com.wilutions.mslib.office.MsoZOrderCmd ZOrderCmd) throws ComException {
    assert(ZOrderCmd != null);
    this._dispatchCall(28,"ZOrder", DISPATCH_METHOD,null,ZOrderCmd.value);
  }
  @DeclDISPID(100)  public com.wilutions.mslib.office.Adjustments getAdjustments() throws ComException {
    final Object obj = this._dispatchCall(100,"Adjustments", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.AdjustmentsImpl.class);
  }
  @DeclDISPID(101)  public com.wilutions.mslib.office.MsoAutoShapeType getAutoShapeType() throws ComException {
    final Object obj = this._dispatchCall(101,"AutoShapeType", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoAutoShapeType.valueOf((Integer)obj);
  }
  @DeclDISPID(101)  public void setAutoShapeType(final com.wilutions.mslib.office.MsoAutoShapeType value) throws ComException {
    assert(value != null);
    this._dispatchCall(101,"AutoShapeType", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(102)  public com.wilutions.mslib.office.MsoBlackWhiteMode getBlackWhiteMode() throws ComException {
    final Object obj = this._dispatchCall(102,"BlackWhiteMode", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoBlackWhiteMode.valueOf((Integer)obj);
  }
  @DeclDISPID(102)  public void setBlackWhiteMode(final com.wilutions.mslib.office.MsoBlackWhiteMode value) throws ComException {
    assert(value != null);
    this._dispatchCall(102,"BlackWhiteMode", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(103)  public com.wilutions.mslib.office.CalloutFormat getCallout() throws ComException {
    final Object obj = this._dispatchCall(103,"Callout", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.CalloutFormatImpl.class);
  }
  @DeclDISPID(104)  public Integer getConnectionSiteCount() throws ComException {
    final Object obj = this._dispatchCall(104,"ConnectionSiteCount", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(105)  public com.wilutions.mslib.office.MsoTriState getConnector() throws ComException {
    final Object obj = this._dispatchCall(105,"Connector", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoTriState.valueOf((Integer)obj);
  }
  @DeclDISPID(106)  public com.wilutions.mslib.office.ConnectorFormat getConnectorFormat() throws ComException {
    final Object obj = this._dispatchCall(106,"ConnectorFormat", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.ConnectorFormatImpl.class);
  }
  @DeclDISPID(107)  public com.wilutions.mslib.office.FillFormat getFill() throws ComException {
    final Object obj = this._dispatchCall(107,"Fill", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.FillFormatImpl.class);
  }
  @DeclDISPID(108)  public com.wilutions.mslib.office.GroupShapes getGroupItems() throws ComException {
    final Object obj = this._dispatchCall(108,"GroupItems", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.GroupShapesImpl.class);
  }
  @DeclDISPID(109)  public Float getHeight() throws ComException {
    final Object obj = this._dispatchCall(109,"Height", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(109)  public void setHeight(final Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(109,"Height", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(110)  public com.wilutions.mslib.office.MsoTriState getHorizontalFlip() throws ComException {
    final Object obj = this._dispatchCall(110,"HorizontalFlip", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoTriState.valueOf((Integer)obj);
  }
  @DeclDISPID(111)  public Float getLeft() throws ComException {
    final Object obj = this._dispatchCall(111,"Left", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(111)  public void setLeft(final Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(111,"Left", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(112)  public com.wilutions.mslib.office.LineFormat getLine() throws ComException {
    final Object obj = this._dispatchCall(112,"Line", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.LineFormatImpl.class);
  }
  @DeclDISPID(113)  public com.wilutions.mslib.office.MsoTriState getLockAspectRatio() throws ComException {
    final Object obj = this._dispatchCall(113,"LockAspectRatio", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoTriState.valueOf((Integer)obj);
  }
  @DeclDISPID(113)  public void setLockAspectRatio(final com.wilutions.mslib.office.MsoTriState value) throws ComException {
    assert(value != null);
    this._dispatchCall(113,"LockAspectRatio", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(115)  public String getName() throws ComException {
    final Object obj = this._dispatchCall(115,"Name", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(115)  public void setName(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(115,"Name", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(116)  public com.wilutions.mslib.office.ShapeNodes getNodes() throws ComException {
    final Object obj = this._dispatchCall(116,"Nodes", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.ShapeNodesImpl.class);
  }
  @DeclDISPID(117)  public Float getRotation() throws ComException {
    final Object obj = this._dispatchCall(117,"Rotation", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(117)  public void setRotation(final Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(117,"Rotation", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(118)  public com.wilutions.mslib.office.PictureFormat getPictureFormat() throws ComException {
    final Object obj = this._dispatchCall(118,"PictureFormat", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.PictureFormatImpl.class);
  }
  @DeclDISPID(119)  public com.wilutions.mslib.office.ShadowFormat getShadow() throws ComException {
    final Object obj = this._dispatchCall(119,"Shadow", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.ShadowFormatImpl.class);
  }
  @DeclDISPID(120)  public com.wilutions.mslib.office.TextEffectFormat getTextEffect() throws ComException {
    final Object obj = this._dispatchCall(120,"TextEffect", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.TextEffectFormatImpl.class);
  }
  @DeclDISPID(121)  public com.wilutions.mslib.office.TextFrame getTextFrame() throws ComException {
    final Object obj = this._dispatchCall(121,"TextFrame", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.TextFrameImpl.class);
  }
  @DeclDISPID(122)  public com.wilutions.mslib.office.ThreeDFormat getThreeD() throws ComException {
    final Object obj = this._dispatchCall(122,"ThreeD", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.ThreeDFormatImpl.class);
  }
  @DeclDISPID(123)  public Float getTop() throws ComException {
    final Object obj = this._dispatchCall(123,"Top", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(123)  public void setTop(final Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(123,"Top", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(124)  public com.wilutions.mslib.office.MsoShapeType getType() throws ComException {
    final Object obj = this._dispatchCall(124,"Type", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoShapeType.valueOf((Integer)obj);
  }
  @DeclDISPID(125)  public com.wilutions.mslib.office.MsoTriState getVerticalFlip() throws ComException {
    final Object obj = this._dispatchCall(125,"VerticalFlip", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoTriState.valueOf((Integer)obj);
  }
  @DeclDISPID(126)  public Object getVertices() throws ComException {
    final Object obj = this._dispatchCall(126,"Vertices", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(127)  public com.wilutions.mslib.office.MsoTriState getVisible() throws ComException {
    final Object obj = this._dispatchCall(127,"Visible", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoTriState.valueOf((Integer)obj);
  }
  @DeclDISPID(127)  public void setVisible(final com.wilutions.mslib.office.MsoTriState value) throws ComException {
    assert(value != null);
    this._dispatchCall(127,"Visible", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(128)  public Float getWidth() throws ComException {
    final Object obj = this._dispatchCall(128,"Width", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(128)  public void setWidth(final Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(128,"Width", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(129)  public Integer getZOrderPosition() throws ComException {
    final Object obj = this._dispatchCall(129,"ZOrderPosition", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(130)  public com.wilutions.mslib.office.Script getScript() throws ComException {
    final Object obj = this._dispatchCall(130,"Script", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.ScriptImpl.class);
  }
  @DeclDISPID(131)  public String getAlternativeText() throws ComException {
    final Object obj = this._dispatchCall(131,"AlternativeText", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(131)  public void setAlternativeText(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(131,"AlternativeText", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(136)  public com.wilutions.mslib.office.MsoTriState getChild() throws ComException {
    final Object obj = this._dispatchCall(136,"Child", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoTriState.valueOf((Integer)obj);
  }
  @DeclDISPID(137)  public com.wilutions.mslib.office.Shape getParentGroup() throws ComException {
    final Object obj = this._dispatchCall(137,"ParentGroup", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.ShapeImpl.class);
  }
  @DeclDISPID(139)  public Integer getId() throws ComException {
    final Object obj = this._dispatchCall(139,"Id", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(145)  public com.wilutions.mslib.office.TextFrame2 getTextFrame2() throws ComException {
    final Object obj = this._dispatchCall(145,"TextFrame2", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.TextFrame2Impl.class);
  }
  @DeclDISPID(146)  public void Cut() throws ComException {
    this._dispatchCall(146,"Cut", DISPATCH_METHOD,null);
  }
  @DeclDISPID(147)  public void Copy() throws ComException {
    this._dispatchCall(147,"Copy", DISPATCH_METHOD,null);
  }
  @DeclDISPID(148)  public com.wilutions.mslib.office.MsoTriState getHasChart() throws ComException {
    final Object obj = this._dispatchCall(148,"HasChart", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoTriState.valueOf((Integer)obj);
  }
  @DeclDISPID(149)  public com.wilutions.mslib.office.IMsoChart getChart() throws ComException {
    final Object obj = this._dispatchCall(149,"Chart", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.IMsoChartImpl.class);
  }
  @DeclDISPID(150)  public com.wilutions.mslib.office.MsoShapeStyleIndex getShapeStyle() throws ComException {
    final Object obj = this._dispatchCall(150,"ShapeStyle", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoShapeStyleIndex.valueOf((Integer)obj);
  }
  @DeclDISPID(150)  public void setShapeStyle(final com.wilutions.mslib.office.MsoShapeStyleIndex value) throws ComException {
    assert(value != null);
    this._dispatchCall(150,"ShapeStyle", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(151)  public com.wilutions.mslib.office.MsoBackgroundStyleIndex getBackgroundStyle() throws ComException {
    final Object obj = this._dispatchCall(151,"BackgroundStyle", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoBackgroundStyleIndex.valueOf((Integer)obj);
  }
  @DeclDISPID(151)  public void setBackgroundStyle(final com.wilutions.mslib.office.MsoBackgroundStyleIndex value) throws ComException {
    assert(value != null);
    this._dispatchCall(151,"BackgroundStyle", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(152)  public com.wilutions.mslib.office.SoftEdgeFormat getSoftEdge() throws ComException {
    final Object obj = this._dispatchCall(152,"SoftEdge", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.SoftEdgeFormatImpl.class);
  }
  @DeclDISPID(153)  public com.wilutions.mslib.office.GlowFormat getGlow() throws ComException {
    final Object obj = this._dispatchCall(153,"Glow", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.GlowFormatImpl.class);
  }
  @DeclDISPID(154)  public com.wilutions.mslib.office.ReflectionFormat getReflection() throws ComException {
    final Object obj = this._dispatchCall(154,"Reflection", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.ReflectionFormatImpl.class);
  }
  @DeclDISPID(155)  public String getTitle() throws ComException {
    final Object obj = this._dispatchCall(155,"Title", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(155)  public void setTitle(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(155,"Title", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(156)  public void MergeShapes(final com.wilutions.mslib.office.MsoMergeCmd MergeCmd, final com.wilutions.mslib.office.Shape PrimaryShape) throws ComException {
    assert(MergeCmd != null);
    this._dispatchCall(156,"MergeShapes", DISPATCH_METHOD,null,MergeCmd.value,(PrimaryShape!=null?PrimaryShape:Dispatch.NULL));
  }
  public ShapeRangeImpl(String progId) throws ComException {
    super(progId, "{000C031D-0000-0000-C000-000000000046}");
  }
  protected ShapeRangeImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ShapeRangeImpl" + super.toString() + "]";
  }
}
