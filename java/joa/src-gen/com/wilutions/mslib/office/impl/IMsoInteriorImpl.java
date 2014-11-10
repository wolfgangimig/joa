/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B8E70-A463-DB41-5DAE-69E7A5F7FCBC}")
public class IMsoInteriorImpl extends Dispatch implements com.wilutions.mslib.office.IMsoInterior {
  @DeclDISPID(1610743808)  public void setColor(Object value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743808,"Color", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743808)  public Object getColor() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Color", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1610743810)  public void setColorIndex(Object value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743810,"ColorIndex", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743810)  public Object getColorIndex() throws ComException {
    final Object obj = this._dispatchCall(1610743810,"ColorIndex", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1610743812)  public void setInvertIfNegative(Object value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743812,"InvertIfNegative", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743812)  public Object getInvertIfNegative() throws ComException {
    final Object obj = this._dispatchCall(1610743812,"InvertIfNegative", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1610743814)  public void setPattern(Object value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743814,"Pattern", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743814)  public Object getPattern() throws ComException {
    final Object obj = this._dispatchCall(1610743814,"Pattern", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1610743816)  public void setPatternColor(Object value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743816,"PatternColor", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743816)  public Object getPatternColor() throws ComException {
    final Object obj = this._dispatchCall(1610743816,"PatternColor", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1610743818)  public void setPatternColorIndex(Object value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743818,"PatternColorIndex", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743818)  public Object getPatternColorIndex() throws ComException {
    final Object obj = this._dispatchCall(1610743818,"PatternColorIndex", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(148)  public Dispatch getApplication() throws ComException {
    final Object obj = this._dispatchCall(148,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(149)  public Integer getCreator() throws ComException {
    final Object obj = this._dispatchCall(149,"Creator", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(150)  public Dispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(150,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  public IMsoInteriorImpl(String progId) throws ComException {
    super(progId);
  }
  protected IMsoInteriorImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IMsoInteriorImpl" + super.toString() + "]";
  }
}
