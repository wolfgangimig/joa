/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9AAA-A463-DB41-5DAE-69E7A5F7FCBC}")
public class Ruler2Impl extends Dispatch implements com.wilutions.mslib.office.Ruler2 {
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
  @DeclDISPID(2)  public com.wilutions.mslib.office.RulerLevels2 getLevels() throws ComException {
    final Object obj = this._dispatchCall(2,"Levels", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.RulerLevels2Impl.class);
  }
  @DeclDISPID(3)  public com.wilutions.mslib.office.TabStops2 getTabStops() throws ComException {
    final Object obj = this._dispatchCall(3,"TabStops", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.TabStops2Impl.class);
  }
  public Ruler2Impl(String progId) throws ComException {
    super(progId, "{000C03C1-0000-0000-C000-000000000046}");
  }
  protected Ruler2Impl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[Ruler2Impl" + super.toString() + "]";
  }
}
