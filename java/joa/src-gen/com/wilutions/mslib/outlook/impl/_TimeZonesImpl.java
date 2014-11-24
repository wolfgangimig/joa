/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C091A997-A463-DB41-5DAE-69E7A5F7FCBC}")
public class _TimeZonesImpl extends Dispatch implements com.wilutions.mslib.outlook._TimeZones {
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
  @DeclDISPID(81)  public com.wilutions.mslib.outlook._TimeZone Item(Object Index) throws ComException {
    assert(Index != null);
    final Object obj = this._dispatchCall(81,"Item", DISPATCH_METHOD,null,Index);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl._TimeZoneImpl.class);
  }
  @DeclDISPID(64550)  public java.util.Date ConvertTime(java.util.Date SourceDateTime, com.wilutions.mslib.outlook._TimeZone SourceTimeZone, com.wilutions.mslib.outlook._TimeZone DestinationTimeZone) throws ComException {
    assert(SourceDateTime != null);
    final Object obj = this._dispatchCall(64550,"ConvertTime", DISPATCH_METHOD,null,SourceDateTime,(SourceTimeZone!=null?SourceTimeZone:Dispatch.NULL),(DestinationTimeZone!=null?DestinationTimeZone:Dispatch.NULL));
    if (obj == null) return null;
    return (java.util.Date)obj;
  }
  @DeclDISPID(64554)  public com.wilutions.mslib.outlook._TimeZone getCurrentTimeZone() throws ComException {
    final Object obj = this._dispatchCall(64554,"CurrentTimeZone", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl._TimeZoneImpl.class);
  }
  public _TimeZonesImpl(String progId) throws ComException {
    super(progId, "{000630FC-0000-0000-C000-000000000046}");
  }
  protected _TimeZonesImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_TimeZonesImpl" + super.toString() + "]";
  }
}
