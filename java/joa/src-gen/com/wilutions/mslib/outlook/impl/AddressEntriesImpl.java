/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C091A921-A463-DB41-5DAE-69E7A5F7FCBC}")
public class AddressEntriesImpl extends Dispatch implements com.wilutions.mslib.outlook.AddressEntries {
  @DeclDISPID(61440)  public com.wilutions.mslib.outlook._Application getApplication() throws ComException {
    final Object obj = this._dispatchCall(61440,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl._ApplicationImpl.class);
  }
  @DeclDISPID(61450)  public com.wilutions.mslib.outlook.OlObjectClass getClass_() throws ComException {
    final Object obj = this._dispatchCall(61450,"Class", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.outlook.OlObjectClass.valueOf((Integer)obj);
  }
  @DeclDISPID(61451)  public com.wilutions.mslib.outlook._NameSpace getSession() throws ComException {
    final Object obj = this._dispatchCall(61451,"Session", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl._NameSpaceImpl.class);
  }
  @DeclDISPID(61441)  public IDispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(61441,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(80)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(80,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(81)  public com.wilutions.mslib.outlook.AddressEntry Item(final Object Index) throws ComException {
    assert(Index != null);
    final Object obj = this._dispatchCall(81,"Item", DISPATCH_METHOD,null,Index);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl.AddressEntryImpl.class);
  }
  @DeclDISPID(95)  public com.wilutions.mslib.outlook.AddressEntry Add(final String Type, final Object Name, final Object Address) throws ComException {
    assert(Type != null);
    assert(Name != null);
    assert(Address != null);
    final Object obj = this._dispatchCall(95,"Add", DISPATCH_METHOD,null,Type,Variant.param(Name),Variant.param(Address));
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl.AddressEntryImpl.class);
  }
  @DeclDISPID(86)  public com.wilutions.mslib.outlook.AddressEntry GetFirst() throws ComException {
    final Object obj = this._dispatchCall(86,"GetFirst", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl.AddressEntryImpl.class);
  }
  @DeclDISPID(88)  public com.wilutions.mslib.outlook.AddressEntry GetLast() throws ComException {
    final Object obj = this._dispatchCall(88,"GetLast", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl.AddressEntryImpl.class);
  }
  @DeclDISPID(87)  public com.wilutions.mslib.outlook.AddressEntry GetNext() throws ComException {
    final Object obj = this._dispatchCall(87,"GetNext", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl.AddressEntryImpl.class);
  }
  @DeclDISPID(89)  public com.wilutions.mslib.outlook.AddressEntry GetPrevious() throws ComException {
    final Object obj = this._dispatchCall(89,"GetPrevious", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl.AddressEntryImpl.class);
  }
  @DeclDISPID(97)  public void Sort(final Object Property, final Object Order) throws ComException {
    assert(Property != null);
    assert(Order != null);
    this._dispatchCall(97,"Sort", DISPATCH_METHOD,null,Variant.param(Property),Variant.param(Order));
  }
  public AddressEntriesImpl(String progId) throws ComException {
    super(progId, "{0006304A-0000-0000-C000-000000000046}");
  }
  protected AddressEntriesImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[AddressEntriesImpl" + super.toString() + "]";
  }
}
