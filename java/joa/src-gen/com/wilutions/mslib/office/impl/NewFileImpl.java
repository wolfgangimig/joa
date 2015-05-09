/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B905D-A463-DB41-5DAE-69E7A5F7FCBC}")
public class NewFileImpl extends Dispatch implements com.wilutions.mslib.office.NewFile {
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
  @DeclDISPID(1)  public Boolean Add(final String FileName, final Object Section, final Object DisplayName, final Object Action) throws ComException {
    assert(FileName != null);
    assert(Section != null);
    assert(DisplayName != null);
    assert(Action != null);
    final Object obj = this._dispatchCall(1,"Add", DISPATCH_METHOD,null,FileName,Variant.param(Section),Variant.param(DisplayName),Variant.param(Action));
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(2)  public Boolean Remove(final String FileName, final Object Section, final Object DisplayName, final Object Action) throws ComException {
    assert(FileName != null);
    assert(Section != null);
    assert(DisplayName != null);
    assert(Action != null);
    final Object obj = this._dispatchCall(2,"Remove", DISPATCH_METHOD,null,FileName,Variant.param(Section),Variant.param(DisplayName),Variant.param(Action));
    if (obj == null) return null;
    return (Boolean)obj;
  }
  public NewFileImpl(String progId) throws ComException {
    super(progId, "{000C0936-0000-0000-C000-000000000046}");
  }
  protected NewFileImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[NewFileImpl" + super.toString() + "]";
  }
}
