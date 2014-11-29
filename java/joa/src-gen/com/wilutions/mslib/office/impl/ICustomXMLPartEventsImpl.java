/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B426D-A463-DB41-5DAE-69E7A5F7FCBC}")
public class ICustomXMLPartEventsImpl extends Dispatch implements com.wilutions.mslib.office.ICustomXMLPartEvents {
  @DeclDISPID(1)  public void onNodeAfterInsert(final com.wilutions.mslib.office.CustomXMLNode NewNode, final Boolean InUndoRedo) throws ComException {
    assert(InUndoRedo != null);
    this._dispatchCall(1,"NodeAfterInsert", DISPATCH_METHOD,null,(NewNode!=null?NewNode:Dispatch.NULL),InUndoRedo);
  }
  @DeclDISPID(2)  public void onNodeAfterDelete(final com.wilutions.mslib.office.CustomXMLNode OldNode, final com.wilutions.mslib.office.CustomXMLNode OldParentNode, final com.wilutions.mslib.office.CustomXMLNode OldNextSibling, final Boolean InUndoRedo) throws ComException {
    assert(InUndoRedo != null);
    this._dispatchCall(2,"NodeAfterDelete", DISPATCH_METHOD,null,(OldNode!=null?OldNode:Dispatch.NULL),(OldParentNode!=null?OldParentNode:Dispatch.NULL),(OldNextSibling!=null?OldNextSibling:Dispatch.NULL),InUndoRedo);
  }
  @DeclDISPID(3)  public void onNodeAfterReplace(final com.wilutions.mslib.office.CustomXMLNode OldNode, final com.wilutions.mslib.office.CustomXMLNode NewNode, final Boolean InUndoRedo) throws ComException {
    assert(InUndoRedo != null);
    this._dispatchCall(3,"NodeAfterReplace", DISPATCH_METHOD,null,(OldNode!=null?OldNode:Dispatch.NULL),(NewNode!=null?NewNode:Dispatch.NULL),InUndoRedo);
  }
  public ICustomXMLPartEventsImpl(String progId) throws ComException {
    super(progId, "{000CDB06-0000-0000-C000-000000000046}");
  }
  protected ICustomXMLPartEventsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ICustomXMLPartEventsImpl" + super.toString() + "]";
  }
}
