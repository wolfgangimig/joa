/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * TimeZones.
 * 
 */
@CoClass(guid="{000610FC-0000-0000-C000-000000000046}")
public class TimeZones extends Dispatch implements _TimeZones {
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
  @DeclDISPID(80)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(80,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(81)  public _TimeZone Item(Object Index) throws ComException {
    assert(Index != null);
    final Object obj = this._dispatchCall(81,"Item", DISPATCH_METHOD,null,Index);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.impl._TimeZoneImpl.class);
  }
  @DeclDISPID(64550)  public java.util.Date ConvertTime(java.util.Date SourceDateTime, _TimeZone SourceTimeZone, _TimeZone DestinationTimeZone) throws ComException {
    assert(SourceDateTime != null);
    final Object obj = this._dispatchCall(64550,"ConvertTime", DISPATCH_METHOD,null,SourceDateTime,(SourceTimeZone!=null?SourceTimeZone:Dispatch.NULL),(DestinationTimeZone!=null?DestinationTimeZone:Dispatch.NULL));
    if (obj == null) return null;
    return (java.util.Date)obj;
  }
  @DeclDISPID(64554)  public _TimeZone getCurrentTimeZone() throws ComException {
    final Object obj = this._dispatchCall(64554,"CurrentTimeZone", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.impl._TimeZoneImpl.class);
  }
  public TimeZones() throws ComException {
    super("{000610FC-0000-0000-C000-000000000046}");
  }
  protected TimeZones(long ndisp) {
    super(ndisp);
  }
  public TimeZones(Dispatch ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[TimeZones" + super.toString() + "]";
  }
}
