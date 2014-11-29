/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * IReturnString.
 * 
 */
@CoInterface(guid="{82B02372-B5BC-11CF-810F-00A0C9030074}")
public interface IReturnString extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(0)  public void setValue(String value) throws ComException;
  @DeclDISPID(0)  public String getValue() throws ComException;
}
