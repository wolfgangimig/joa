/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * AttachmentSelection.
 * 
 */
@CoClass(guid="{000610F9-0000-0000-C000-000000000046}")
public class AttachmentSelection extends Dispatch implements _AttachmentSelection {
  @DeclDISPID(61440)  public _Application getApplication() throws ComException {
    final Object obj = this._dispatchCall(61440,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.impl._ApplicationImpl.class);
  }
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException {
    final Object obj = this._dispatchCall(61450,"Class", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return OlObjectClass.valueOf((Integer)obj);
  }
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException {
    final Object obj = this._dispatchCall(61451,"Session", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.impl._NameSpaceImpl.class);
  }
  @DeclDISPID(61441)  public Dispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(61441,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(80)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(80,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(81)  public Attachment Item(Object Index) throws ComException {
    assert(Index != null);
    final Object obj = this._dispatchCall(81,"Item", DISPATCH_METHOD,null,Index);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.impl.AttachmentImpl.class);
  }
  @DeclDISPID(33288)  public OlSelectionLocation getLocation() throws ComException {
    final Object obj = this._dispatchCall(33288,"Location", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return OlSelectionLocation.valueOf((Integer)obj);
  }
  @DeclDISPID(8706)  public Selection GetSelection(OlSelectionContents SelectionContents) throws ComException {
    assert(SelectionContents != null);
    final Object obj = this._dispatchCall(8706,"GetSelection", DISPATCH_METHOD,null,SelectionContents.value);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.impl.SelectionImpl.class);
  }
  public AttachmentSelection() throws ComException {
    super("{000610F9-0000-0000-C000-000000000046}");
  }
  protected AttachmentSelection(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[AttachmentSelection" + super.toString() + "]";
  }
}
