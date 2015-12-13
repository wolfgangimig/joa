/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;
import com.wilutions.mslib.office.ICustomXMLPartEvents;

@SuppressWarnings("all")
public class Fire_ICustomXMLPartEvents {
  public final static void onNodeAfterInsert(final IDispatch __joa__disp, final com.wilutions.mslib.office.CustomXMLNode NewNode, final Boolean InUndoRedo) throws ComException {
    assert(__joa__disp != null);
    assert(NewNode != null);
    assert(InUndoRedo != null);
    __joa__disp._fireEvent(ICustomXMLPartEvents.class, (l)->l.onNodeAfterInsert(NewNode,InUndoRedo));
  }
  public final static void onNodeAfterDelete(final IDispatch __joa__disp, final com.wilutions.mslib.office.CustomXMLNode OldNode, final com.wilutions.mslib.office.CustomXMLNode OldParentNode, final com.wilutions.mslib.office.CustomXMLNode OldNextSibling, final Boolean InUndoRedo) throws ComException {
    assert(__joa__disp != null);
    assert(OldNode != null);
    assert(OldParentNode != null);
    assert(OldNextSibling != null);
    assert(InUndoRedo != null);
    __joa__disp._fireEvent(ICustomXMLPartEvents.class, (l)->l.onNodeAfterDelete(OldNode,OldParentNode,OldNextSibling,InUndoRedo));
  }
  public final static void onNodeAfterReplace(final IDispatch __joa__disp, final com.wilutions.mslib.office.CustomXMLNode OldNode, final com.wilutions.mslib.office.CustomXMLNode NewNode, final Boolean InUndoRedo) throws ComException {
    assert(__joa__disp != null);
    assert(OldNode != null);
    assert(NewNode != null);
    assert(InUndoRedo != null);
    __joa__disp._fireEvent(ICustomXMLPartEvents.class, (l)->l.onNodeAfterReplace(OldNode,NewNode,InUndoRedo));
  }
}
