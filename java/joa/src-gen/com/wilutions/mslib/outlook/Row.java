/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * Row.
 * 
 */
@CoClass(guid="{000610D3-0000-0000-C000-000000000046}")
public class Row extends Dispatch implements _Row {
  @DeclDISPID(61440)  public _Application getApplication() throws ComException {
    final Object obj = this._dispatchCall(61440,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.impl._ApplicationImpl.class);
  }
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException {
    final Object obj = this._dispatchCall(61450,"Class", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return OlObjectClass.valueOf((Integer)obj);
  }
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException {
    final Object obj = this._dispatchCall(61451,"Session", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.impl._NameSpaceImpl.class);
  }
  @DeclDISPID(61441)  public Dispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(61441,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(64259)  public String BinaryToString(Object Index) throws ComException {
    assert(Index != null);
    final Object obj = this._dispatchCall(64259,"BinaryToString", DISPATCH_METHOD,null,Index);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(64462)  public Object GetValues() throws ComException {
    final Object obj = this._dispatchCall(64462,"GetValues", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(81)  public Object Item(Object Index) throws ComException {
    assert(Index != null);
    final Object obj = this._dispatchCall(81,"Item", DISPATCH_METHOD,null,Index);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(64257)  public java.util.Date LocalTimeToUTC(Object Index) throws ComException {
    assert(Index != null);
    final Object obj = this._dispatchCall(64257,"LocalTimeToUTC", DISPATCH_METHOD,null,Index);
    if (obj == null) return null;
    return (java.util.Date)obj;
  }
  @DeclDISPID(64256)  public java.util.Date UTCToLocalTime(Object Index) throws ComException {
    assert(Index != null);
    final Object obj = this._dispatchCall(64256,"UTCToLocalTime", DISPATCH_METHOD,null,Index);
    if (obj == null) return null;
    return (java.util.Date)obj;
  }
  public Row() throws ComException {
    super("{000610D3-0000-0000-C000-000000000046}");
  }
  protected Row(long ndisp) {
    super(ndisp);
  }
  public Row(Dispatch ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[Row" + super.toString() + "]";
  }
}
