/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9ACF-A463-DB41-5DAE-69E7A5F7FCBC}")
public class ThemeFontsImpl extends Dispatch implements com.wilutions.mslib.office.ThemeFonts {
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"Creator", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1)  public IDispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(1,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(2)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(2,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(0)  public com.wilutions.mslib.office.ThemeFont Item(final com.wilutions.mslib.office.MsoFontLanguageIndex Index) throws ComException {
    assert(Index != null);
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_METHOD,null,Index.value);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.ThemeFontImpl.class);
  }
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException {
    final Object obj = this._dispatchCall(-4,"_NewEnum", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  public ThemeFontsImpl(String progId) throws ComException {
    super(progId, "{000C03A4-0000-0000-C000-000000000046}");
  }
  protected ThemeFontsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ThemeFontsImpl" + super.toString() + "]";
  }
}
