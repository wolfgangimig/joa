/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * ICustomXMLPartEvents.
 * 
 */
@CoInterface(guid="{000CDB06-0000-0000-C000-000000000046}")
public interface ICustomXMLPartEvents extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1)  public void onNodeAfterInsert(final CustomXMLNode NewNode, final Boolean InUndoRedo) throws ComException;
  @DeclDISPID(2)  public void onNodeAfterDelete(final CustomXMLNode OldNode, final CustomXMLNode OldParentNode, final CustomXMLNode OldNextSibling, final Boolean InUndoRedo) throws ComException;
  @DeclDISPID(3)  public void onNodeAfterReplace(final CustomXMLNode OldNode, final CustomXMLNode NewNode, final Boolean InUndoRedo) throws ComException;
}
