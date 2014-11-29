/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * IWHTMLCheckbox.
 * 
 */
@CoInterface(guid="{5512D117-5CC6-11CF-8D67-00AA00BDCE1D}")
public interface IWHTMLCheckbox extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(-541)  public void setHTMLName(final String value) throws ComException;
  @DeclDISPID(-541)  public String getHTMLName() throws ComException;
  @DeclDISPID(607)  public void setValue(final String value) throws ComException;
  @DeclDISPID(607)  public String getValue() throws ComException;
  @DeclDISPID(0)  public void setChecked(final Boolean value) throws ComException;
  @DeclDISPID(0)  public Boolean getChecked() throws ComException;
}
