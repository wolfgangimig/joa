/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * FormRegionStartup.
 * 
 */
@CoClass(guid="{00061059-0000-0000-C000-000000000046}")
public class FormRegionStartup extends Dispatch implements _FormRegionStartup {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(64310)  public Object GetFormRegionStorage(String FormRegionName, IDispatch Item, Integer LCID, OlFormRegionMode FormRegionMode, OlFormRegionSize FormRegionSize) throws ComException {
    assert(FormRegionName != null);
    assert(LCID != null);
    assert(FormRegionMode != null);
    assert(FormRegionSize != null);
    final Object obj = this._dispatchCall(64310,"GetFormRegionStorage", DISPATCH_METHOD,null,FormRegionName,(Item!=null?Item:Dispatch.NULL),LCID,FormRegionMode.value,FormRegionSize.value);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(64317)  public void BeforeFormRegionShow(FormRegion FormRegion) throws ComException {
    this._dispatchCall(64317,"BeforeFormRegionShow", DISPATCH_METHOD,null,(FormRegion!=null?FormRegion:Dispatch.NULL));
  }
  @DeclDISPID(64563)  public Object GetFormRegionManifest(String FormRegionName, Integer LCID) throws ComException {
    assert(FormRegionName != null);
    assert(LCID != null);
    final Object obj = this._dispatchCall(64563,"GetFormRegionManifest", DISPATCH_METHOD,null,FormRegionName,LCID);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(64564)  public Object GetFormRegionIcon(String FormRegionName, Integer LCID, OlFormRegionIcon Icon) throws ComException {
    assert(FormRegionName != null);
    assert(LCID != null);
    assert(Icon != null);
    final Object obj = this._dispatchCall(64564,"GetFormRegionIcon", DISPATCH_METHOD,null,FormRegionName,LCID,Icon.value);
    if (obj == null) return null;
    return (Object)obj;
  }
  public FormRegionStartup() throws ComException {
    super("{00061059-0000-0000-C000-000000000046}", "{00063059-0000-0000-C000-000000000046}");
  }
  protected FormRegionStartup(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[FormRegionStartup" + super.toString() + "]";
  }
}
