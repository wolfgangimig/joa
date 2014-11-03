/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * DiagramNodeChildren.
 * 
 */
@CoInterface(guid="{000C036F-0000-0000-C000-000000000046}")
public interface DiagramNodeChildren extends IDispatch {
  @DeclDISPID(1610743808)  public Dispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException;
  @DeclDISPID(0)  public DiagramNode Item(Object Index) throws ComException;
  @DeclDISPID(10)  public DiagramNode AddNode(Object Index, MsoDiagramNodeType NodeType) throws ComException;
  @DeclDISPID(11)  public void SelectAll() throws ComException;
  @DeclDISPID(100)  public Dispatch getParent() throws ComException;
  @DeclDISPID(101)  public Integer getCount() throws ComException;
  @DeclDISPID(103)  public DiagramNode getFirstChild() throws ComException;
  @DeclDISPID(104)  public DiagramNode getLastChild() throws ComException;
}
