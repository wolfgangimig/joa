/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9AE1-A463-DB41-5DAE-69E7A5F7FCBC}")
public class MsoDebugOptions_UTsImpl extends Dispatch implements com.wilutions.mslib.office.MsoDebugOptions_UTs {
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
  @DeclDISPID(0)  public com.wilutions.mslib.office.MsoDebugOptions_UT getItem(Integer Index) throws ComException {
    assert(Index != null);
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_PROPERTYGET,null,Index);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.MsoDebugOptions_UTImpl.class);
  }
  @DeclDISPID(1)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(1,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException {
    final Object obj = this._dispatchCall(-4,"_NewEnum", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(2)  public com.wilutions.mslib.office.MsoDebugOptions_UTs GetUnitTestsInCollection(String bstrCollectionName) throws ComException {
    assert(bstrCollectionName != null);
    final Object obj = this._dispatchCall(2,"GetUnitTestsInCollection", DISPATCH_METHOD,null,bstrCollectionName);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.MsoDebugOptions_UTsImpl.class);
  }
  @DeclDISPID(3)  public com.wilutions.mslib.office.MsoDebugOptions_UT GetUnitTest(String bstrCollectionName, String bstrUnitTestName) throws ComException {
    assert(bstrCollectionName != null);
    assert(bstrUnitTestName != null);
    final Object obj = this._dispatchCall(3,"GetUnitTest", DISPATCH_METHOD,null,bstrCollectionName,bstrUnitTestName);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.MsoDebugOptions_UTImpl.class);
  }
  @DeclDISPID(4)  public com.wilutions.mslib.office.MsoDebugOptions_UTs GetMatchingUnitTestsInCollection(String bstrCollectionName, String bstrUnitTestNameFilter) throws ComException {
    assert(bstrCollectionName != null);
    assert(bstrUnitTestNameFilter != null);
    final Object obj = this._dispatchCall(4,"GetMatchingUnitTestsInCollection", DISPATCH_METHOD,null,bstrCollectionName,bstrUnitTestNameFilter);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.MsoDebugOptions_UTsImpl.class);
  }
  public MsoDebugOptions_UTsImpl(String progId) throws ComException {
    super(progId, "{000C038A-0000-0000-C000-000000000046}");
  }
  protected MsoDebugOptions_UTsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[MsoDebugOptions_UTsImpl" + super.toString() + "]";
  }
}
