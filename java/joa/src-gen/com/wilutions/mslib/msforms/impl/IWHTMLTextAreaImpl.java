/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{9585484E-F8A5-CA8E-10C9-694DA54A32E7}")
public class IWHTMLTextAreaImpl extends Dispatch implements com.wilutions.mslib.msforms.IWHTMLTextArea {
  @DeclDISPID(-541)  public void setHTMLName(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(-541,"HTMLName", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(-541)  public String getHTMLName() throws ComException {
    final Object obj = this._dispatchCall(-541,"HTMLName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(0)  public void setValue(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(0,"Value", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(0)  public String getValue() throws ComException {
    final Object obj = this._dispatchCall(0,"Value", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(615)  public void setRows(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(615,"Rows", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(615)  public Integer getRows() throws ComException {
    final Object obj = this._dispatchCall(615,"Rows", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(616)  public void setColumns(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(616,"Columns", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(616)  public Integer getColumns() throws ComException {
    final Object obj = this._dispatchCall(616,"Columns", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(617)  public void setWordWrap(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(617,"WordWrap", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(617)  public String getWordWrap() throws ComException {
    final Object obj = this._dispatchCall(617,"WordWrap", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  public IWHTMLTextAreaImpl(String progId) throws ComException {
    super(progId);
  }
  protected IWHTMLTextAreaImpl(long ndisp) {
    super(ndisp);
  }
  public IWHTMLTextAreaImpl(Dispatch ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IWHTMLTextAreaImpl" + super.toString() + "]";
  }
}
