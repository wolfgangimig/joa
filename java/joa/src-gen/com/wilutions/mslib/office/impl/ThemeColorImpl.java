/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9ACA-A463-DB41-5DAE-69E7A5F7FCBC}")
public class ThemeColorImpl extends Dispatch implements com.wilutions.mslib.office.ThemeColor {
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
  @DeclDISPID(0)  public com.wilutions.mslib.office.MsoRGBType getRGB() throws ComException {
    final Object obj = this._dispatchCall(0,"RGB", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Integer als = (Integer)obj;
    return new com.wilutions.mslib.office.MsoRGBType(als);
  }
  @DeclDISPID(0)  public void setRGB(com.wilutions.mslib.office.MsoRGBType value) throws ComException {
    assert(value != null);
    this._dispatchCall(0,"RGB", DISPATCH_PROPERTYPUT,value.getValue());
  }
  @DeclDISPID(1)  public Dispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(1,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(1610809347)  public com.wilutions.mslib.office.MsoThemeColorSchemeIndex getThemeColorSchemeIndex() throws ComException {
    final Object obj = this._dispatchCall(1610809347,"ThemeColorSchemeIndex", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoThemeColorSchemeIndex.valueOf((Integer)obj);
  }
  public ThemeColorImpl(String progId) throws ComException {
    super(progId);
  }
  protected ThemeColorImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ThemeColorImpl" + super.toString() + "]";
  }
}
