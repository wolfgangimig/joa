/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IContact2.
 * IContact2 Interface 
 */
@CoInterface(guid="{10FDD9BA-0CBA-4958-B6C8-D0912BF2703F}")
public interface IContact2 extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(268435457)  public void SetAdditionalUris(final String[] _contactUris) throws ComException;
  @DeclDISPID(268435458)  public IContact GetRawContactbyUri(final String _contactUri) throws ComException;
  @DeclDISPID(268435459)  public Boolean IsAnonymous() throws ComException;
  @DeclDISPID(268435460)  public Object[] BatchGetContactInformation2(final Long _contactInformationTypes) throws ComException;
}
