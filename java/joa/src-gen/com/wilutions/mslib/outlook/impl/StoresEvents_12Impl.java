/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C091A993-A463-DB41-5DAE-69E7A5F7FCBC}")
public class StoresEvents_12Impl extends Dispatch implements com.wilutions.mslib.outlook.StoresEvents_12 {
  @DeclDISPID(64433)  public void onBeforeStoreRemove(final com.wilutions.mslib.outlook._Store Store, final ByRef<Boolean> Cancel) throws ComException {
    assert(Cancel != null);
    this._dispatchCall(64433,"BeforeStoreRemove", DISPATCH_METHOD,null,(Store!=null?Store:Dispatch.NULL),Cancel);
  }
  @DeclDISPID(61441)  public void onStoreAdd(final com.wilutions.mslib.outlook._Store Store) throws ComException {
    this._dispatchCall(61441,"StoreAdd", DISPATCH_METHOD,null,(Store!=null?Store:Dispatch.NULL));
  }
  public StoresEvents_12Impl(String progId) throws ComException {
    super(progId, "{000630F8-0000-0000-C000-000000000046}");
  }
  protected StoresEvents_12Impl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[StoresEvents_12Impl" + super.toString() + "]";
  }
}
