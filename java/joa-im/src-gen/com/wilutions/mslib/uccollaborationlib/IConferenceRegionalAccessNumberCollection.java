/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IConferenceRegionalAccessNumberCollection.
 * IConferenceRegionalAccessNumberCollection Interface 
 */
@CoInterface(guid="{4CB70415-BA71-491E-B12D-155D85CBDFF1}")
public interface IConferenceRegionalAccessNumberCollection extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCount() throws ComException;
  @DeclDISPID(0)  public IConferenceRegionalAccessNumber getItem(Integer _index) throws ComException;
}
