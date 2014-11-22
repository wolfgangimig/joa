/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9ACB-A463-DB41-5DAE-69E7A5F7FCBC}")
public class OfficeThemeImpl extends Dispatch implements com.wilutions.mslib.office.OfficeTheme {
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
  @DeclDISPID(1)  public Dispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(1,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(2)  public com.wilutions.mslib.office.ThemeColorScheme getThemeColorScheme() throws ComException {
    final Object obj = this._dispatchCall(2,"ThemeColorScheme", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.ThemeColorSchemeImpl.class);
  }
  @DeclDISPID(3)  public com.wilutions.mslib.office.ThemeFontScheme getThemeFontScheme() throws ComException {
    final Object obj = this._dispatchCall(3,"ThemeFontScheme", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.ThemeFontSchemeImpl.class);
  }
  @DeclDISPID(4)  public com.wilutions.mslib.office.ThemeEffectScheme getThemeEffectScheme() throws ComException {
    final Object obj = this._dispatchCall(4,"ThemeEffectScheme", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.ThemeEffectSchemeImpl.class);
  }
  public OfficeThemeImpl(String progId) throws ComException {
    super(progId, "{000C03A0-0000-0000-C000-000000000046}");
  }
  protected OfficeThemeImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[OfficeThemeImpl" + super.toString() + "]";
  }
}
