/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9A5F-A463-DB41-5DAE-69E7A5F7FCBC}")
public class PropertyTestsImpl extends Dispatch implements com.wilutions.mslib.office.PropertyTests {
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
  @DeclDISPID(0)  public com.wilutions.mslib.office.PropertyTest getItem(final Integer Index) throws ComException {
    assert(Index != null);
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_PROPERTYGET,null,Index);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.PropertyTestImpl.class);
  }
  @DeclDISPID(4)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(4,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(5)  public void Add(final String Name, final com.wilutions.mslib.office.MsoCondition Condition, final Object Value, final Object SecondValue, final com.wilutions.mslib.office.MsoConnector Connector) throws ComException {
    assert(Name != null);
    assert(Condition != null);
    assert(Value != null);
    assert(SecondValue != null);
    assert(Connector != null);
    this._dispatchCall(5,"Add", DISPATCH_METHOD,null,Name,Condition.value,Value,SecondValue,Connector.value);
  }
  @DeclDISPID(6)  public void Remove(final Integer Index) throws ComException {
    assert(Index != null);
    this._dispatchCall(6,"Remove", DISPATCH_METHOD,null,Index);
  }
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException {
    final Object obj = this._dispatchCall(-4,"_NewEnum", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  public PropertyTestsImpl(String progId) throws ComException {
    super(progId, "{000C0334-0000-0000-C000-000000000046}");
  }
  protected PropertyTestsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[PropertyTestsImpl" + super.toString() + "]";
  }
}
