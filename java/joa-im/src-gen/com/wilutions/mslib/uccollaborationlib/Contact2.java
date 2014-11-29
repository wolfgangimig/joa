/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * Contact2.
 * Contact2 Coclass 
 */
@CoClass(guid="{FD28F0A8-D83A-40FB-8C30-6908A6117D5B}")
public class Contact2 extends Dispatch implements IContact2 {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(268435457)  public void SetAdditionalUris(String[] _contactUris) throws ComException {
    assert(_contactUris != null);
    this._dispatchCall(268435457,"SetAdditionalUris", DISPATCH_METHOD,null,_contactUris);
  }
  @DeclDISPID(268435458)  public IContact GetRawContactbyUri(String _contactUri) throws ComException {
    assert(_contactUri != null);
    final Object obj = this._dispatchCall(268435458,"GetRawContactbyUri", DISPATCH_METHOD,null,_contactUri);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IContactImpl.class);
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
  public Contact2() throws ComException {
    super("{FD28F0A8-D83A-40FB-8C30-6908A6117D5B}", "{10FDD9BA-0CBA-4958-B6C8-D0912BF2703F}");
  }
  protected Contact2(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[Contact2" + super.toString() + "]";
  }
}
