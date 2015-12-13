/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * IMsoDiagram.
 * 
 */
@CoInterface(guid="{000C036D-0000-0000-C000-000000000046}")
public interface IMsoDiagram extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(100)  public IDispatch getParent() throws ComException;
  @DeclDISPID(101)  public DiagramNodes getNodes() throws ComException;
  @DeclDISPID(102)  public MsoDiagramType getType() throws ComException;
  @DeclDISPID(103)  public MsoTriState getAutoLayout() throws ComException;
  @DeclDISPID(103)  public void setAutoLayout(final MsoTriState value) throws ComException;
  @DeclDISPID(104)  public MsoTriState getReverse() throws ComException;
  @DeclDISPID(104)  public void setReverse(final MsoTriState value) throws ComException;
  @DeclDISPID(105)  public MsoTriState getAutoFormat() throws ComException;
  @DeclDISPID(105)  public void setAutoFormat(final MsoTriState value) throws ComException;
  @DeclDISPID(10)  public void Convert(final MsoDiagramType Type) throws ComException;
  @DeclDISPID(11)  public void FitText() throws ComException;
}
