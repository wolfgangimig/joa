/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B8E62-A463-DB41-5DAE-69E7A5F7FCBC}")
public class IMsoChartImpl extends Dispatch implements com.wilutions.mslib.office.IMsoChart {
  @DeclDISPID(150)  public IDispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(150,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(1610743809)  public void setHasTitle(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743809,"HasTitle", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743809)  public Boolean getHasTitle() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"HasTitle", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743811)  public com.wilutions.mslib.office.IMsoChartTitle getChartTitle() throws ComException {
    final Object obj = this._dispatchCall(1610743811,"ChartTitle", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.IMsoChartTitleImpl.class);
  }
  @DeclDISPID(1610743812)  public Integer getDepthPercent() throws ComException {
    final Object obj = this._dispatchCall(1610743812,"DepthPercent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610743812)  public void setDepthPercent(final Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743812,"DepthPercent", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743814)  public Integer getElevation() throws ComException {
    final Object obj = this._dispatchCall(1610743814,"Elevation", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610743814)  public void setElevation(final Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743814,"Elevation", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743816)  public Integer getGapDepth() throws ComException {
    final Object obj = this._dispatchCall(1610743816,"GapDepth", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610743816)  public void setGapDepth(final Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743816,"GapDepth", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743818)  public Integer getHeightPercent() throws ComException {
    final Object obj = this._dispatchCall(1610743818,"HeightPercent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610743818)  public void setHeightPercent(final Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743818,"HeightPercent", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743820)  public Integer getPerspective() throws ComException {
    final Object obj = this._dispatchCall(1610743820,"Perspective", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610743820)  public void setPerspective(final Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743820,"Perspective", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743822)  public Object getRightAngleAxes() throws ComException {
    final Object obj = this._dispatchCall(1610743822,"RightAngleAxes", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1610743822)  public void setRightAngleAxes(final Object value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743822,"RightAngleAxes", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743824)  public Object getRotation() throws ComException {
    final Object obj = this._dispatchCall(1610743824,"Rotation", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1610743824)  public void setRotation(final Object value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743824,"Rotation", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743826)  public void setDisplayBlanksAs(final com.wilutions.mslib.office.XlDisplayBlanksAs value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743826,"DisplayBlanksAs", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(1610743826)  public com.wilutions.mslib.office.XlDisplayBlanksAs getDisplayBlanksAs() throws ComException {
    final Object obj = this._dispatchCall(1610743826,"DisplayBlanksAs", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.XlDisplayBlanksAs.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743828)  public void setProtectData(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743828,"ProtectData", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743828)  public Boolean getProtectData() throws ComException {
    final Object obj = this._dispatchCall(1610743828,"ProtectData", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743830)  public void setProtectFormatting(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743830,"ProtectFormatting", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743830)  public Boolean getProtectFormatting() throws ComException {
    final Object obj = this._dispatchCall(1610743830,"ProtectFormatting", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743832)  public void setProtectGoalSeek(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743832,"ProtectGoalSeek", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743832)  public Boolean getProtectGoalSeek() throws ComException {
    final Object obj = this._dispatchCall(1610743832,"ProtectGoalSeek", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743834)  public void setProtectSelection(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743834,"ProtectSelection", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743834)  public Boolean getProtectSelection() throws ComException {
    final Object obj = this._dispatchCall(1610743834,"ProtectSelection", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743836)  public void setProtectChartObjects(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743836,"ProtectChartObjects", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743836)  public Boolean getProtectChartObjects() throws ComException {
    final Object obj = this._dispatchCall(1610743836,"ProtectChartObjects", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743838)  public void UnProtect(final Object Password) throws ComException {
    assert(Password != null);
    this._dispatchCall(1610743838,"UnProtect", DISPATCH_METHOD,null,Password);
  }
  @DeclDISPID(1610743839)  public void Protect(final Object Password, final Object DrawingObjects, final Object Contents, final Object Scenarios, final Object UserInterfaceOnly) throws ComException {
    assert(Password != null);
    assert(DrawingObjects != null);
    assert(Contents != null);
    assert(Scenarios != null);
    assert(UserInterfaceOnly != null);
    this._dispatchCall(1610743839,"Protect", DISPATCH_METHOD,null,Password,DrawingObjects,Contents,Scenarios,UserInterfaceOnly);
  }
  @DeclDISPID(8)  public IDispatch getChartGroups(final Object pvarIndex, final Object varIgallery) throws ComException {
    assert(pvarIndex != null);
    assert(varIgallery != null);
    final Object obj = this._dispatchCall(8,"ChartGroups", DISPATCH_PROPERTYGET,null,pvarIndex,varIgallery);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(68)  public IDispatch SeriesCollection(final Object Index) throws ComException {
    assert(Index != null);
    final Object obj = this._dispatchCall(68,"SeriesCollection", DISPATCH_METHOD,null,Index);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(1922)  public void ApplyDataLabels(final com.wilutions.mslib.office.XlDataLabelsType Type, final Object IMsoLegendKey, final Object AutoText, final Object HasLeaderLines, final Object ShowSeriesName, final Object ShowCategoryName, final Object ShowValue, final Object ShowPercentage, final Object ShowBubbleSize, final Object Separator) throws ComException {
    assert(Type != null);
    assert(IMsoLegendKey != null);
    assert(AutoText != null);
    assert(HasLeaderLines != null);
    assert(ShowSeriesName != null);
    assert(ShowCategoryName != null);
    assert(ShowValue != null);
    assert(ShowPercentage != null);
    assert(ShowBubbleSize != null);
    assert(Separator != null);
    this._dispatchCall(1922,"ApplyDataLabels", DISPATCH_METHOD,null,Type.value,IMsoLegendKey,AutoText,HasLeaderLines,ShowSeriesName,ShowCategoryName,ShowValue,ShowPercentage,ShowBubbleSize,Separator);
  }
  @DeclDISPID(1400)  public com.wilutions.mslib.office.XlChartType getChartType() throws ComException {
    final Object obj = this._dispatchCall(1400,"ChartType", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.XlChartType.valueOf((Integer)obj);
  }
  @DeclDISPID(1400)  public void setChartType(final com.wilutions.mslib.office.XlChartType value) throws ComException {
    assert(value != null);
    this._dispatchCall(1400,"ChartType", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(1396)  public Boolean getHasDataTable() throws ComException {
    final Object obj = this._dispatchCall(1396,"HasDataTable", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1396)  public void setHasDataTable(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1396,"HasDataTable", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1401)  public void ApplyCustomType(final com.wilutions.mslib.office.XlChartType ChartType, final Object TypeName) throws ComException {
    assert(ChartType != null);
    assert(TypeName != null);
    this._dispatchCall(1401,"ApplyCustomType", DISPATCH_METHOD,null,ChartType.value,TypeName);
  }
  @DeclDISPID(1409)  public void GetChartElement(final Integer x, final Integer y, final ByRef<Integer> ElementID, final ByRef<Integer> Arg1, final ByRef<Integer> Arg2) throws ComException {
    assert(x != null);
    assert(y != null);
    assert(ElementID != null);
    assert(Arg1 != null);
    assert(Arg2 != null);
    this._dispatchCall(1409,"GetChartElement", DISPATCH_METHOD,null,x,y,ElementID,Arg1,Arg2);
  }
  @DeclDISPID(1413)  public void SetSourceData(final String Source, final Object PlotBy) throws ComException {
    assert(Source != null);
    assert(PlotBy != null);
    this._dispatchCall(1413,"SetSourceData", DISPATCH_METHOD,null,Source,PlotBy);
  }
  @DeclDISPID(202)  public com.wilutions.mslib.office.XlRowCol getPlotBy() throws ComException {
    final Object obj = this._dispatchCall(202,"PlotBy", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.XlRowCol.valueOf((Integer)obj);
  }
  @DeclDISPID(202)  public void setPlotBy(final com.wilutions.mslib.office.XlRowCol value) throws ComException {
    assert(value != null);
    this._dispatchCall(202,"PlotBy", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(53)  public Boolean getHasLegend() throws ComException {
    final Object obj = this._dispatchCall(53,"HasLegend", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(53)  public void setHasLegend(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(53,"HasLegend", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(84)  public com.wilutions.mslib.office.IMsoLegend getLegend() throws ComException {
    final Object obj = this._dispatchCall(84,"Legend", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.IMsoLegendImpl.class);
  }
  @DeclDISPID(1610743861)  public IDispatch Axes(final Object Type, final com.wilutions.mslib.office.XlAxisGroup AxisGroup) throws ComException {
    assert(Type != null);
    assert(AxisGroup != null);
    final Object obj = this._dispatchCall(1610743861,"Axes", DISPATCH_METHOD,null,Type,AxisGroup.value);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(1610743862)  public void setHasAxis(final Object axisType, final Object AxisGroup, final Object value3) throws ComException {
    assert(value3 != null);
    assert(axisType != null);
    assert(AxisGroup != null);
    this._dispatchCall(1610743862,"HasAxis", DISPATCH_PROPERTYPUT,value3,axisType,AxisGroup);
  }
  @DeclDISPID(1610743862)  public Object getHasAxis(final Object axisType, final Object AxisGroup) throws ComException {
    assert(axisType != null);
    assert(AxisGroup != null);
    final Object obj = this._dispatchCall(1610743862,"HasAxis", DISPATCH_PROPERTYGET,null,axisType,AxisGroup);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1610743864)  public com.wilutions.mslib.office.IMsoWalls getWalls(final Boolean fBackWall) throws ComException {
    assert(fBackWall != null);
    final Object obj = this._dispatchCall(1610743864,"Walls", DISPATCH_PROPERTYGET,null,fBackWall);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.IMsoWallsImpl.class);
  }
  @DeclDISPID(1610743865)  public com.wilutions.mslib.office.IMsoFloor getFloor() throws ComException {
    final Object obj = this._dispatchCall(1610743865,"Floor", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.IMsoFloorImpl.class);
  }
  @DeclDISPID(1610743866)  public com.wilutions.mslib.office.IMsoPlotArea getPlotArea() throws ComException {
    final Object obj = this._dispatchCall(1610743866,"PlotArea", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.IMsoPlotAreaImpl.class);
  }
  @DeclDISPID(92)  public Boolean getPlotVisibleOnly() throws ComException {
    final Object obj = this._dispatchCall(92,"PlotVisibleOnly", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(92)  public void setPlotVisibleOnly(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(92,"PlotVisibleOnly", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743869)  public com.wilutions.mslib.office.IMsoChartArea getChartArea() throws ComException {
    final Object obj = this._dispatchCall(1610743869,"ChartArea", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.IMsoChartAreaImpl.class);
  }
  @DeclDISPID(1610743870)  public void AutoFormat(final Integer rGallery, final Object varFormat) throws ComException {
    assert(rGallery != null);
    assert(varFormat != null);
    this._dispatchCall(1610743870,"AutoFormat", DISPATCH_METHOD,null,rGallery,varFormat);
  }
  @DeclDISPID(1610743871)  public Boolean getAutoScaling() throws ComException {
    final Object obj = this._dispatchCall(1610743871,"AutoScaling", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743871)  public void setAutoScaling(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743871,"AutoScaling", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743873)  public void SetBackgroundPicture(final String bstr) throws ComException {
    assert(bstr != null);
    this._dispatchCall(1610743873,"SetBackgroundPicture", DISPATCH_METHOD,null,bstr);
  }
  @DeclDISPID(1610743874)  public void ChartWizard(final Object varSource, final Object varGallery, final Object varFormat, final Object varPlotBy, final Object varCategoryLabels, final Object varSeriesLabels, final Object varHasLegend, final Object varTitle, final Object varCategoryTitle, final Object varValueTitle, final Object varExtraTitle) throws ComException {
    assert(varSource != null);
    assert(varGallery != null);
    assert(varFormat != null);
    assert(varPlotBy != null);
    assert(varCategoryLabels != null);
    assert(varSeriesLabels != null);
    assert(varHasLegend != null);
    assert(varTitle != null);
    assert(varCategoryTitle != null);
    assert(varValueTitle != null);
    assert(varExtraTitle != null);
    this._dispatchCall(1610743874,"ChartWizard", DISPATCH_METHOD,null,varSource,varGallery,varFormat,varPlotBy,varCategoryLabels,varSeriesLabels,varHasLegend,varTitle,varCategoryTitle,varValueTitle,varExtraTitle);
  }
  @DeclDISPID(1610743875)  public void CopyPicture(final Integer Appearance, final Integer Format, final Integer Size) throws ComException {
    assert(Appearance != null);
    assert(Format != null);
    assert(Size != null);
    this._dispatchCall(1610743875,"CopyPicture", DISPATCH_METHOD,null,Appearance,Format,Size);
  }
  @DeclDISPID(1610743876)  public com.wilutions.mslib.office.IMsoDataTable getDataTable() throws ComException {
    final Object obj = this._dispatchCall(1610743876,"DataTable", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.IMsoDataTableImpl.class);
  }
  @DeclDISPID(1610743877)  public Object Evaluate(final Object varName, final Integer LocaleID, final ByRef<Integer> ObjType) throws ComException {
    assert(varName != null);
    assert(LocaleID != null);
    assert(ObjType != null);
    final Object obj = this._dispatchCall(1610743877,"Evaluate", DISPATCH_METHOD,null,varName,LocaleID,ObjType);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1610743878)  public Object _Evaluate(final Object varName, final Integer LocaleID) throws ComException {
    assert(varName != null);
    assert(LocaleID != null);
    final Object obj = this._dispatchCall(1610743878,"_Evaluate", DISPATCH_METHOD,null,varName,LocaleID);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1610743879)  public void Paste(final Object varType) throws ComException {
    assert(varType != null);
    this._dispatchCall(1610743879,"Paste", DISPATCH_METHOD,null,varType);
  }
  @DeclDISPID(1610743880)  public com.wilutions.mslib.office.XlBarShape getBarShape() throws ComException {
    final Object obj = this._dispatchCall(1610743880,"BarShape", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.XlBarShape.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743880)  public void setBarShape(final com.wilutions.mslib.office.XlBarShape value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743880,"BarShape", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(1610743882)  public Boolean Export(final String bstr, final Object varFilterName, final Object varInteractive) throws ComException {
    assert(bstr != null);
    assert(varFilterName != null);
    assert(varInteractive != null);
    final Object obj = this._dispatchCall(1610743882,"Export", DISPATCH_METHOD,null,bstr,varFilterName,varInteractive);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743883)  public void SetDefaultChart(final Object varName) throws ComException {
    assert(varName != null);
    this._dispatchCall(1610743883,"SetDefaultChart", DISPATCH_METHOD,null,varName);
  }
  @DeclDISPID(1610743884)  public void ApplyChartTemplate(final String bstrFileName) throws ComException {
    assert(bstrFileName != null);
    this._dispatchCall(1610743884,"ApplyChartTemplate", DISPATCH_METHOD,null,bstrFileName);
  }
  @DeclDISPID(1610743885)  public void SaveChartTemplate(final String bstrFileName) throws ComException {
    assert(bstrFileName != null);
    this._dispatchCall(1610743885,"SaveChartTemplate", DISPATCH_METHOD,null,bstrFileName);
  }
  @DeclDISPID(2377)  public com.wilutions.mslib.office.IMsoWalls getSideWall() throws ComException {
    final Object obj = this._dispatchCall(2377,"SideWall", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.IMsoWallsImpl.class);
  }
  @DeclDISPID(2378)  public com.wilutions.mslib.office.IMsoWalls getBackWall() throws ComException {
    final Object obj = this._dispatchCall(2378,"BackWall", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.IMsoWallsImpl.class);
  }
  @DeclDISPID(2465)  public Object getChartStyle() throws ComException {
    final Object obj = this._dispatchCall(2465,"ChartStyle", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(2465)  public void setChartStyle(final Object value) throws ComException {
    assert(value != null);
    this._dispatchCall(2465,"ChartStyle", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(2466)  public void ClearToMatchStyle() throws ComException {
    this._dispatchCall(2466,"ClearToMatchStyle", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1814)  public IDispatch getPivotLayout() throws ComException {
    final Object obj = this._dispatchCall(1814,"PivotLayout", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(1610743894)  public void RefreshPivotTable() throws ComException {
    this._dispatchCall(1610743894,"RefreshPivotTable", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1610743895)  public void setShowDataLabelsOverMaximum(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743895,"ShowDataLabelsOverMaximum", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743895)  public Boolean getShowDataLabelsOverMaximum() throws ComException {
    final Object obj = this._dispatchCall(1610743895,"ShowDataLabelsOverMaximum", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(2468)  public void ApplyLayout(final Integer Layout, final Object varChartType) throws ComException {
    assert(Layout != null);
    assert(varChartType != null);
    this._dispatchCall(2468,"ApplyLayout", DISPATCH_METHOD,null,Layout,varChartType);
  }
  @DeclDISPID(1610743898)  public IDispatch getSelection() throws ComException {
    final Object obj = this._dispatchCall(1610743898,"Selection", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(1610743899)  public void Refresh() throws ComException {
    this._dispatchCall(1610743899,"Refresh", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1610743900)  public void SetElement(final com.wilutions.mslib.office.MsoChartElementType RHS) throws ComException {
    assert(RHS != null);
    this._dispatchCall(1610743900,"SetElement", DISPATCH_METHOD,null,RHS.value);
  }
  @DeclDISPID(1610743901)  public com.wilutions.mslib.office.IMsoChartData getChartData() throws ComException {
    final Object obj = this._dispatchCall(1610743901,"ChartData", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.IMsoChartDataImpl.class);
  }
  @DeclDISPID(1610743902)  public com.wilutions.mslib.office.IMsoChartFormat getFormat() throws ComException {
    final Object obj = this._dispatchCall(1610743902,"Format", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.IMsoChartFormatImpl.class);
  }
  @DeclDISPID(1610743903)  public com.wilutions.mslib.office.Shapes getShapes() throws ComException {
    final Object obj = this._dispatchCall(1610743903,"Shapes", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.ShapesImpl.class);
  }
  @DeclDISPID(148)  public IDispatch getApplication() throws ComException {
    final Object obj = this._dispatchCall(148,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(149)  public Integer getCreator() throws ComException {
    final Object obj = this._dispatchCall(149,"Creator", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(117)  public Object Delete() throws ComException {
    final Object obj = this._dispatchCall(117,"Delete", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(551)  public Object Copy() throws ComException {
    final Object obj = this._dispatchCall(551,"Copy", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(235)  public Object Select(final Object Replace) throws ComException {
    assert(Replace != null);
    final Object obj = this._dispatchCall(235,"Select", DISPATCH_METHOD,null,Replace);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1610743923)  public Boolean getShowReportFilterFieldButtons() throws ComException {
    final Object obj = this._dispatchCall(1610743923,"ShowReportFilterFieldButtons", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743923)  public void setShowReportFilterFieldButtons(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743923,"ShowReportFilterFieldButtons", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743925)  public Boolean getShowLegendFieldButtons() throws ComException {
    final Object obj = this._dispatchCall(1610743925,"ShowLegendFieldButtons", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743925)  public void setShowLegendFieldButtons(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743925,"ShowLegendFieldButtons", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743927)  public Boolean getShowAxisFieldButtons() throws ComException {
    final Object obj = this._dispatchCall(1610743927,"ShowAxisFieldButtons", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743927)  public void setShowAxisFieldButtons(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743927,"ShowAxisFieldButtons", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743929)  public Boolean getShowValueFieldButtons() throws ComException {
    final Object obj = this._dispatchCall(1610743929,"ShowValueFieldButtons", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743929)  public void setShowValueFieldButtons(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743929,"ShowValueFieldButtons", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743931)  public Boolean getShowAllFieldButtons() throws ComException {
    final Object obj = this._dispatchCall(1610743931,"ShowAllFieldButtons", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743931)  public void setShowAllFieldButtons(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743931,"ShowAllFieldButtons", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743933)  public void setProtectChartSheetFormatting(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743933,"ProtectChartSheetFormatting", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(236)  public IDispatch FullSeriesCollection(final Object Index) throws ComException {
    assert(Index != null);
    final Object obj = this._dispatchCall(236,"FullSeriesCollection", DISPATCH_METHOD,null,Index);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(237)  public void setCategoryLabelLevel(final com.wilutions.mslib.office.XlCategoryLabelLevel value) throws ComException {
    assert(value != null);
    this._dispatchCall(237,"CategoryLabelLevel", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(237)  public com.wilutions.mslib.office.XlCategoryLabelLevel getCategoryLabelLevel() throws ComException {
    final Object obj = this._dispatchCall(237,"CategoryLabelLevel", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.XlCategoryLabelLevel.valueOf((Integer)obj);
  }
  @DeclDISPID(238)  public void setSeriesNameLevel(final com.wilutions.mslib.office.XlSeriesNameLevel value) throws ComException {
    assert(value != null);
    this._dispatchCall(238,"SeriesNameLevel", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(238)  public com.wilutions.mslib.office.XlSeriesNameLevel getSeriesNameLevel() throws ComException {
    final Object obj = this._dispatchCall(238,"SeriesNameLevel", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.XlSeriesNameLevel.valueOf((Integer)obj);
  }
  @DeclDISPID(2467)  public Object getChartColor() throws ComException {
    final Object obj = this._dispatchCall(2467,"ChartColor", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(2467)  public void setChartColor(final Object value) throws ComException {
    assert(value != null);
    this._dispatchCall(2467,"ChartColor", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(2469)  public void ClearToMatchColorStyle() throws ComException {
    this._dispatchCall(2469,"ClearToMatchColorStyle", DISPATCH_METHOD,null);
  }
  public IMsoChartImpl(String progId) throws ComException {
    super(progId, "{000C1709-0000-0000-C000-000000000046}");
  }
  protected IMsoChartImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IMsoChartImpl" + super.toString() + "]";
  }
}
