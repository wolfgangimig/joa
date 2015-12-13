/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * HTMLTextArea.
 * 
 */
@CoClass(guid="{5512D124-5CC6-11CF-8D67-00AA00BDCE1D}")
public class HTMLTextArea extends Dispatch implements IWHTMLTextArea {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(-541)  public void setHTMLName(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(-541,"HTMLName", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(-541)  public String getHTMLName() throws ComException {
    final Object obj = this._dispatchCall(-541,"HTMLName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(0)  public void setValue(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(0,"Value", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(0)  public String getValue() throws ComException {
    final Object obj = this._dispatchCall(0,"Value", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(615)  public void setRows(final Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(615,"Rows", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(615)  public Integer getRows() throws ComException {
    final Object obj = this._dispatchCall(615,"Rows", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(616)  public void setColumns(final Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(616,"Columns", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(616)  public Integer getColumns() throws ComException {
    final Object obj = this._dispatchCall(616,"Columns", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(617)  public void setWordWrap(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(617,"WordWrap", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(617)  public String getWordWrap() throws ComException {
    final Object obj = this._dispatchCall(617,"WordWrap", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  public HTMLTextArea() throws ComException {
    super("{5512D124-5CC6-11CF-8D67-00AA00BDCE1D}", "{5512D125-5CC6-11CF-8D67-00AA00BDCE1D}");
  }
  protected HTMLTextArea(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[HTMLTextArea" + super.toString() + "]";
  }
}
