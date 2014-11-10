/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9078-A463-DB41-5DAE-69E7A5F7FCBC}")
public class WebPageFontImpl extends Dispatch implements com.wilutions.mslib.office.WebPageFont {
  @DeclDISPID(1610743808)  public Dispatch getApplication() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"Creator", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(10)  public String getProportionalFont() throws ComException {
    final Object obj = this._dispatchCall(10,"ProportionalFont", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(10)  public void setProportionalFont(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(10,"ProportionalFont", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(11)  public Float getProportionalFontSize() throws ComException {
    final Object obj = this._dispatchCall(11,"ProportionalFontSize", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(11)  public void setProportionalFontSize(Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(11,"ProportionalFontSize", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(12)  public String getFixedWidthFont() throws ComException {
    final Object obj = this._dispatchCall(12,"FixedWidthFont", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(12)  public void setFixedWidthFont(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(12,"FixedWidthFont", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(13)  public Float getFixedWidthFontSize() throws ComException {
    final Object obj = this._dispatchCall(13,"FixedWidthFontSize", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(13)  public void setFixedWidthFontSize(Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(13,"FixedWidthFontSize", DISPATCH_PROPERTYPUT,value);
  }
  public WebPageFontImpl(String progId) throws ComException {
    super(progId);
  }
  protected WebPageFontImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[WebPageFontImpl" + super.toString() + "]";
  }
}
