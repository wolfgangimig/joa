/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9AA4-A463-DB41-5DAE-69E7A5F7FCBC}")
public class EffectParameterImpl extends Dispatch implements com.wilutions.mslib.office.EffectParameter {
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
  @DeclDISPID(0)  public String getName() throws ComException {
    final Object obj = this._dispatchCall(0,"Name", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1)  public Object getValue() throws ComException {
    final Object obj = this._dispatchCall(1,"Value", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1)  public void setValue(Object value) throws ComException {
    assert(value != null);
    this._dispatchCall(1,"Value", DISPATCH_PROPERTYPUT,value);
  }
  public EffectParameterImpl(String progId) throws ComException {
    super(progId, "{000C03CF-0000-0000-C000-000000000046}");
  }
  protected EffectParameterImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[EffectParameterImpl" + super.toString() + "]";
  }
}
