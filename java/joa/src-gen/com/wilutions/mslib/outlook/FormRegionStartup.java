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
  @DeclDISPID(64310)  public Object GetFormRegionStorage(final String FormRegionName, final IDispatch Item, final Integer LCID, final OlFormRegionMode FormRegionMode, final OlFormRegionSize FormRegionSize) throws ComException {
    assert(FormRegionName != null);
    assert(LCID != null);
    assert(FormRegionMode != null);
    assert(FormRegionSize != null);
    final Object obj = this._dispatchCall(64310,"GetFormRegionStorage", DISPATCH_METHOD,null,FormRegionName,Dispatch.param(Item),LCID,FormRegionMode.value,FormRegionSize.value);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(64317)  public void BeforeFormRegionShow(final FormRegion FormRegion) throws ComException {
    this._dispatchCall(64317,"BeforeFormRegionShow", DISPATCH_METHOD,null,Dispatch.param(FormRegion));
  }
  @DeclDISPID(64563)  public Object GetFormRegionManifest(final String FormRegionName, final Integer LCID) throws ComException {
    assert(FormRegionName != null);
    assert(LCID != null);
    final Object obj = this._dispatchCall(64563,"GetFormRegionManifest", DISPATCH_METHOD,null,FormRegionName,LCID);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(64564)  public Object GetFormRegionIcon(final String FormRegionName, final Integer LCID, final OlFormRegionIcon Icon) throws ComException {
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
