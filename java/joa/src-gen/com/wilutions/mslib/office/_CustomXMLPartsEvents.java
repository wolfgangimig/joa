/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * _CustomXMLPartsEvents.
 * 
 */
@CoInterface(guid="{000CDB0B-0000-0000-C000-000000000046}")
public interface _CustomXMLPartsEvents extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1)  public void onPartAfterAdd(CustomXMLPart NewPart) throws ComException;
  @DeclDISPID(2)  public void onPartBeforeDelete(CustomXMLPart OldPart) throws ComException;
  @DeclDISPID(3)  public void onPartAfterLoad(CustomXMLPart Part) throws ComException;
}
