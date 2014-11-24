/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * SmartArtNode.
 * 
 */
@CoInterface(guid="{000C03C8-0000-0000-C000-000000000046}")
public interface SmartArtNode extends IDispatch {
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(1)  public IDispatch getParent() throws ComException;
  @DeclDISPID(2)  public SmartArtNode AddNode(MsoSmartArtNodePosition Position, MsoSmartArtNodeType Type) throws ComException;
  @DeclDISPID(3)  public void Delete() throws ComException;
  @DeclDISPID(4)  public void Promote() throws ComException;
  @DeclDISPID(5)  public void Demote() throws ComException;
  @DeclDISPID(6)  public MsoOrgChartLayoutType getOrgChartLayout() throws ComException;
  @DeclDISPID(6)  public void setOrgChartLayout(MsoOrgChartLayoutType value) throws ComException;
  @DeclDISPID(7)  public ShapeRange getShapes() throws ComException;
  @DeclDISPID(8)  public TextFrame2 getTextFrame2() throws ComException;
  @DeclDISPID(9)  public void Larger() throws ComException;
  @DeclDISPID(10)  public void Smaller() throws ComException;
  @DeclDISPID(11)  public Integer getLevel() throws ComException;
  @DeclDISPID(12)  public MsoTriState getHidden() throws ComException;
  @DeclDISPID(13)  public SmartArtNodes getNodes() throws ComException;
  @DeclDISPID(14)  public SmartArtNode getParentNode() throws ComException;
  @DeclDISPID(15)  public MsoSmartArtNodeType getType() throws ComException;
  @DeclDISPID(16)  public void ReorderUp() throws ComException;
  @DeclDISPID(17)  public void ReorderDown() throws ComException;
}
