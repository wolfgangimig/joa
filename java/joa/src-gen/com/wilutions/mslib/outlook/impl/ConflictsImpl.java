/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C091A9A9-A463-DB41-5DAE-69E7A5F7FCBC}")
public class ConflictsImpl extends Dispatch implements com.wilutions.mslib.outlook.Conflicts {
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
  @DeclDISPID(81)  public com.wilutions.mslib.outlook.Conflict Item(Object Index) throws ComException {
    assert(Index != null);
    final Object obj = this._dispatchCall(81,"Item", DISPATCH_METHOD,null,Index);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl.ConflictImpl.class);
  }
  @DeclDISPID(86)  public com.wilutions.mslib.outlook.Conflict GetFirst() throws ComException {
    final Object obj = this._dispatchCall(86,"GetFirst", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl.ConflictImpl.class);
  }
  @DeclDISPID(88)  public com.wilutions.mslib.outlook.Conflict GetLast() throws ComException {
    final Object obj = this._dispatchCall(88,"GetLast", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl.ConflictImpl.class);
  }
  @DeclDISPID(87)  public com.wilutions.mslib.outlook.Conflict GetNext() throws ComException {
    final Object obj = this._dispatchCall(87,"GetNext", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl.ConflictImpl.class);
  }
  @DeclDISPID(89)  public com.wilutions.mslib.outlook.Conflict GetPrevious() throws ComException {
    final Object obj = this._dispatchCall(89,"GetPrevious", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl.ConflictImpl.class);
  }
  public ConflictsImpl(String progId) throws ComException {
    super(progId, "{000630C2-0000-0000-C000-000000000046}");
  }
  protected ConflictsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ConflictsImpl" + super.toString() + "]";
  }
}
