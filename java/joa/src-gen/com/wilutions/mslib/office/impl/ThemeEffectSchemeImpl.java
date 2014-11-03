/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9ACD-A463-DB41-5DAE-69E7A5F7FCBC}")
public class ThemeEffectSchemeImpl extends Dispatch implements com.wilutions.mslib.office.ThemeEffectScheme {
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
  public ThemeEffectSchemeImpl(String progId) throws ComException {
    super(progId);
  }
  protected ThemeEffectSchemeImpl(long ndisp) {
    super(ndisp);
  }
  public ThemeEffectSchemeImpl(Dispatch ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ThemeEffectSchemeImpl" + super.toString() + "]";
  }
}
