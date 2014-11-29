/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * ICustomXMLPartsEvents.
 * 
 */
@CoInterface(guid="{000CDB0A-0000-0000-C000-000000000046}")
public interface ICustomXMLPartsEvents extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1)  public void onPartAfterAdd(final CustomXMLPart NewPart) throws ComException;
  @DeclDISPID(2)  public void onPartBeforeDelete(final CustomXMLPart OldPart) throws ComException;
  @DeclDISPID(3)  public void onPartAfterLoad(final CustomXMLPart Part) throws ComException;
}
