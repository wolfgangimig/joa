/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * IMsoChartFormat.
 * 
 */
@CoInterface(guid="{000C1730-0000-0000-C000-000000000046}")
public interface IMsoChartFormat extends IDispatch {
  @DeclDISPID(1610743808)  public FillFormat getFill() throws ComException;
  @DeclDISPID(1610743809)  public GlowFormat getGlow() throws ComException;
  @DeclDISPID(1610743810)  public LineFormat getLine() throws ComException;
  @DeclDISPID(1610743811)  public IDispatch getParent() throws ComException;
  @DeclDISPID(1610743812)  public PictureFormat getPictureFormat() throws ComException;
  @DeclDISPID(1610743813)  public ShadowFormat getShadow() throws ComException;
  @DeclDISPID(1610743814)  public SoftEdgeFormat getSoftEdge() throws ComException;
  @DeclDISPID(1610743815)  public TextFrame2 getTextFrame2() throws ComException;
  @DeclDISPID(1610743816)  public ThreeDFormat getThreeD() throws ComException;
  @DeclDISPID(148)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(149)  public Integer getCreator() throws ComException;
  @DeclDISPID(200)  public Adjustments getAdjustments() throws ComException;
  @DeclDISPID(201)  public MsoAutoShapeType getAutoShapeType() throws ComException;
  @DeclDISPID(201)  public void setAutoShapeType(MsoAutoShapeType value) throws ComException;
}
