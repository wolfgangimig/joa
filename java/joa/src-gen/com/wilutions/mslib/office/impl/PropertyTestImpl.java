/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9A58-A463-DB41-5DAE-69E7A5F7FCBC}")
public class PropertyTestImpl extends Dispatch implements com.wilutions.mslib.office.PropertyTest {
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
  @DeclDISPID(2)  public com.wilutions.mslib.office.MsoCondition getCondition() throws ComException {
    final Object obj = this._dispatchCall(2,"Condition", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoCondition.valueOf((Integer)obj);
  }
  @DeclDISPID(3)  public Object getValue() throws ComException {
    final Object obj = this._dispatchCall(3,"Value", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(4)  public Object getSecondValue() throws ComException {
    final Object obj = this._dispatchCall(4,"SecondValue", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(5)  public com.wilutions.mslib.office.MsoConnector getConnector() throws ComException {
    final Object obj = this._dispatchCall(5,"Connector", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoConnector.valueOf((Integer)obj);
  }
  public PropertyTestImpl(String progId) throws ComException {
    super(progId);
  }
  protected PropertyTestImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[PropertyTestImpl" + super.toString() + "]";
  }
}
