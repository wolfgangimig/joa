/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * TimeZone.
 * 
 */
@CoClass(guid="{000610FD-0000-0000-C000-000000000046}")
public class TimeZone extends Dispatch implements _TimeZone {
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
  @DeclDISPID(8450)  public String getName() throws ComException {
    final Object obj = this._dispatchCall(8450,"Name", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(64555)  public String getDaylightDesignation() throws ComException {
    final Object obj = this._dispatchCall(64555,"DaylightDesignation", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(64556)  public String getStandardDesignation() throws ComException {
    final Object obj = this._dispatchCall(64556,"StandardDesignation", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(64545)  public Integer getBias() throws ComException {
    final Object obj = this._dispatchCall(64545,"Bias", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(64546)  public Integer getStandardBias() throws ComException {
    final Object obj = this._dispatchCall(64546,"StandardBias", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(64547)  public Integer getDaylightBias() throws ComException {
    final Object obj = this._dispatchCall(64547,"DaylightBias", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(64548)  public java.util.Date getStandardDate() throws ComException {
    final Object obj = this._dispatchCall(64548,"StandardDate", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (java.util.Date)obj;
  }
  @DeclDISPID(64549)  public java.util.Date getDaylightDate() throws ComException {
    final Object obj = this._dispatchCall(64549,"DaylightDate", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (java.util.Date)obj;
  }
  @DeclDISPID(64562)  public String getID() throws ComException {
    final Object obj = this._dispatchCall(64562,"ID", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  public TimeZone() throws ComException {
    super("{000610FD-0000-0000-C000-000000000046}");
  }
  protected TimeZone(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[TimeZone" + super.toString() + "]";
  }
}
