/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * IWHTMLSelect.
 * 
 */
@CoInterface(guid="{5512D123-5CC6-11CF-8D67-00AA00BDCE1D}")
public interface IWHTMLSelect extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(-541)  public void setHTMLName(final String value) throws ComException;
  @DeclDISPID(-541)  public String getHTMLName() throws ComException;
  @DeclDISPID(611)  public void setValues(final Object value) throws ComException;
  @DeclDISPID(611)  public Object getValues() throws ComException;
  @DeclDISPID(612)  public void setDisplayValues(final Object value) throws ComException;
  @DeclDISPID(612)  public Object getDisplayValues() throws ComException;
  @DeclDISPID(613)  public void setSelected(final String value) throws ComException;
  @DeclDISPID(613)  public String getSelected() throws ComException;
  @DeclDISPID(614)  public void setMultiSelect(final Boolean value) throws ComException;
  @DeclDISPID(614)  public Boolean getMultiSelect() throws ComException;
  @DeclDISPID(619)  public void setSize(final Integer value) throws ComException;
  @DeclDISPID(619)  public Integer getSize() throws ComException;
}
