/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{D06A40D1-A8D9-9219-2B66-B9768E058CC5}")
public class IContact2Impl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IContact2 {
  @DeclDISPID(268435457)  public void SetAdditionalUris(String[] _contactUris) throws ComException {
    assert(_contactUris != null);
    this._dispatchCall(268435457,"SetAdditionalUris", DISPATCH_METHOD,null,_contactUris);
  }
  @DeclDISPID(268435458)  public com.wilutions.mslib.uccollaborationlib.IContact GetRawContactbyUri(String _contactUri) throws ComException {
    assert(_contactUri != null);
    final Object obj = this._dispatchCall(268435458,"GetRawContactbyUri", DISPATCH_METHOD,null,_contactUri);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IContactImpl.class);
  }
  @DeclDISPID(268435459)  public Boolean IsAnonymous() throws ComException {
    final Object obj = this._dispatchCall(268435459,"IsAnonymous", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(268435460)  public Object[] BatchGetContactInformation2(Long _contactInformationTypes) throws ComException {
    assert(_contactInformationTypes != null);
    final Object obj = this._dispatchCall(268435460,"BatchGetContactInformation2", DISPATCH_METHOD,null,_contactInformationTypes);
    if (obj == null) return null;
    return (Object[])obj;
  }
  public IContact2Impl(String progId) throws ComException {
    super(progId, "{10FDD9BA-0CBA-4958-B6C8-D0912BF2703F}");
  }
  protected IContact2Impl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IContact2Impl" + super.toString() + "]";
  }
}
