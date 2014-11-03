/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * SyncObject.
 * 
 */
@CoClass(guid="{00063084-0000-0000-C000-000000000046}")
public class SyncObject extends Dispatch implements _SyncObject {
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
  @DeclDISPID(8448)  public String getName() throws ComException {
    final Object obj = this._dispatchCall(8448,"Name", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(8449)  public void Start() throws ComException {
    this._dispatchCall(8449,"Start", DISPATCH_METHOD,null);
  }
  @DeclDISPID(8450)  public void Stop() throws ComException {
    this._dispatchCall(8450,"Stop", DISPATCH_METHOD,null);
  }
  public SyncObject() throws ComException {
    super("{00063084-0000-0000-C000-000000000046}");
  }
  protected SyncObject(long ndisp) {
    super(ndisp);
  }
  public SyncObject(Dispatch ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[SyncObject" + super.toString() + "]";
  }
}
