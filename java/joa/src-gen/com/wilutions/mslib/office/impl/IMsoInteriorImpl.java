/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B8E70-A463-DB41-5DAE-69E7A5F7FCBC}")
public class IMsoInteriorImpl extends Dispatch implements com.wilutions.mslib.office.IMsoInterior {
  @DeclDISPID(1610743808)  public void setColor(final Object value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743808,"Color", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743808)  public Object getColor() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Color", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1610743810)  public void setColorIndex(final Object value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743810,"ColorIndex", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743810)  public Object getColorIndex() throws ComException {
    final Object obj = this._dispatchCall(1610743810,"ColorIndex", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1610743812)  public void setInvertIfNegative(final Object value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743812,"InvertIfNegative", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743812)  public Object getInvertIfNegative() throws ComException {
    final Object obj = this._dispatchCall(1610743812,"InvertIfNegative", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1610743814)  public void setPattern(final Object value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743814,"Pattern", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743814)  public Object getPattern() throws ComException {
    final Object obj = this._dispatchCall(1610743814,"Pattern", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1610743816)  public void setPatternColor(final Object value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743816,"PatternColor", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743816)  public Object getPatternColor() throws ComException {
    final Object obj = this._dispatchCall(1610743816,"PatternColor", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1610743818)  public void setPatternColorIndex(final Object value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743818,"PatternColorIndex", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743818)  public Object getPatternColorIndex() throws ComException {
    final Object obj = this._dispatchCall(1610743818,"PatternColorIndex", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(148)  public IDispatch getApplication() throws ComException {
    final Object obj = this._dispatchCall(148,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(149)  public Integer getCreator() throws ComException {
    final Object obj = this._dispatchCall(149,"Creator", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(150)  public IDispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(150,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  public IMsoInteriorImpl(String progId) throws ComException {
    super(progId, "{000C171B-0000-0000-C000-000000000046}");
  }
  protected IMsoInteriorImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IMsoInteriorImpl" + super.toString() + "]";
  }
}
