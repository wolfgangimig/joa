/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C091A9E8-A463-DB41-5DAE-69E7A5F7FCBC}")
public class _SyncObjectImpl extends Dispatch implements com.wilutions.mslib.outlook._SyncObject {
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
  public _SyncObjectImpl(String progId) throws ComException {
    super(progId, "{00063083-0000-0000-C000-000000000046}");
  }
  protected _SyncObjectImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_SyncObjectImpl" + super.toString() + "]";
  }
}
