/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * ICustomXMLPartsEvents.
 * 
 */
@CoInterface(guid="{000CDB0A-0000-0000-C000-000000000046}")
public interface ICustomXMLPartsEvents extends IDispatch {
  @DeclDISPID(1)  public void onPartAfterAdd(CustomXMLPart NewPart) throws ComException;
  @DeclDISPID(2)  public void onPartBeforeDelete(CustomXMLPart OldPart) throws ComException;
  @DeclDISPID(3)  public void onPartAfterLoad(CustomXMLPart Part) throws ComException;
}
