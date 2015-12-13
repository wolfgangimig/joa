/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * DiagramNode.
 * 
 */
@CoInterface(guid="{000C0370-0000-0000-C000-000000000046}")
public interface DiagramNode extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(10)  public DiagramNode AddNode(final MsoRelativeNodePosition Pos, final MsoDiagramNodeType NodeType) throws ComException;
  @DeclDISPID(11)  public void Delete() throws ComException;
  @DeclDISPID(12)  public void MoveNode(final DiagramNode TargetNode, final MsoRelativeNodePosition Pos) throws ComException;
  @DeclDISPID(13)  public void ReplaceNode(final DiagramNode TargetNode) throws ComException;
  @DeclDISPID(14)  public void SwapNode(final DiagramNode TargetNode, final Boolean SwapChildren) throws ComException;
  @DeclDISPID(15)  public DiagramNode CloneNode(final Boolean CopyChildren, final DiagramNode TargetNode, final MsoRelativeNodePosition Pos) throws ComException;
  @DeclDISPID(16)  public void TransferChildren(final DiagramNode ReceivingNode) throws ComException;
  @DeclDISPID(17)  public DiagramNode NextNode() throws ComException;
  @DeclDISPID(18)  public DiagramNode PrevNode() throws ComException;
  @DeclDISPID(100)  public IDispatch getParent() throws ComException;
  @DeclDISPID(101)  public DiagramNodeChildren getChildren() throws ComException;
  @DeclDISPID(102)  public Shape getShape() throws ComException;
  @DeclDISPID(103)  public DiagramNode getRoot() throws ComException;
  @DeclDISPID(104)  public IMsoDiagram getDiagram() throws ComException;
  @DeclDISPID(105)  public MsoOrgChartLayoutType getLayout() throws ComException;
  @DeclDISPID(105)  public void setLayout(final MsoOrgChartLayoutType value) throws ComException;
  @DeclDISPID(106)  public Shape getTextShape() throws ComException;
}
