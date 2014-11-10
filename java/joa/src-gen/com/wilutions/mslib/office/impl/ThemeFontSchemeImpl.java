/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9ACE-A463-DB41-5DAE-69E7A5F7FCBC}")
public class ThemeFontSchemeImpl extends Dispatch implements com.wilutions.mslib.office.ThemeFontScheme {
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
  @DeclDISPID(2)  public void Load(String FileName) throws ComException {
    assert(FileName != null);
    this._dispatchCall(2,"Load", DISPATCH_METHOD,null,FileName);
  }
  @DeclDISPID(3)  public void Save(String FileName) throws ComException {
    assert(FileName != null);
    this._dispatchCall(3,"Save", DISPATCH_METHOD,null,FileName);
  }
  @DeclDISPID(4)  public com.wilutions.mslib.office.ThemeFonts getMinorFont() throws ComException {
    final Object obj = this._dispatchCall(4,"MinorFont", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.ThemeFontsImpl.class);
  }
  @DeclDISPID(5)  public com.wilutions.mslib.office.ThemeFonts getMajorFont() throws ComException {
    final Object obj = this._dispatchCall(5,"MajorFont", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.ThemeFontsImpl.class);
  }
  public ThemeFontSchemeImpl(String progId) throws ComException {
    super(progId);
  }
  protected ThemeFontSchemeImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ThemeFontSchemeImpl" + super.toString() + "]";
  }
}
