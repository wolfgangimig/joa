/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C091A932-A463-DB41-5DAE-69E7A5F7FCBC}")
public class _FormRegionStartupImpl extends Dispatch implements com.wilutions.mslib.outlook._FormRegionStartup {
  @DeclDISPID(64310)  public Object GetFormRegionStorage(String FormRegionName, Dispatch Item, Integer LCID, com.wilutions.mslib.outlook.OlFormRegionMode FormRegionMode, com.wilutions.mslib.outlook.OlFormRegionSize FormRegionSize) throws ComException {
    assert(FormRegionName != null);
    assert(LCID != null);
    assert(FormRegionMode != null);
    assert(FormRegionSize != null);
    final Object obj = this._dispatchCall(64310,"GetFormRegionStorage", DISPATCH_METHOD,null,FormRegionName,(Item!=null?Item:Dispatch.NULL),LCID,FormRegionMode.value,FormRegionSize.value);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(64317)  public void BeforeFormRegionShow(com.wilutions.mslib.outlook.FormRegion FormRegion) throws ComException {
    this._dispatchCall(64317,"BeforeFormRegionShow", DISPATCH_METHOD,null,(FormRegion!=null?FormRegion:Dispatch.NULL));
  }
  @DeclDISPID(64563)  public Object GetFormRegionManifest(String FormRegionName, Integer LCID) throws ComException {
    assert(FormRegionName != null);
    assert(LCID != null);
    final Object obj = this._dispatchCall(64563,"GetFormRegionManifest", DISPATCH_METHOD,null,FormRegionName,LCID);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(64564)  public Object GetFormRegionIcon(String FormRegionName, Integer LCID, com.wilutions.mslib.outlook.OlFormRegionIcon Icon) throws ComException {
    assert(FormRegionName != null);
    assert(LCID != null);
    assert(Icon != null);
    final Object obj = this._dispatchCall(64564,"GetFormRegionIcon", DISPATCH_METHOD,null,FormRegionName,LCID,Icon.value);
    if (obj == null) return null;
    return (Object)obj;
  }
  public _FormRegionStartupImpl(String progId) throws ComException {
    super(progId, "{00063059-0000-0000-C000-000000000046}");
  }
  protected _FormRegionStartupImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_FormRegionStartupImpl" + super.toString() + "]";
  }
}
