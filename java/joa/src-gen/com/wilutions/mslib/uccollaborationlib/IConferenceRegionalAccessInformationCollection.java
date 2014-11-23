/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IConferenceRegionalAccessInformationCollection.
 * IConferenceRegionalAccessInformationCollection Interface 
 */
@CoInterface(guid="{A0984F01-5D2C-4302-87A0-69BE7B015143}")
public interface IConferenceRegionalAccessInformationCollection extends IDispatch {
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCount() throws ComException;
  @DeclDISPID(0)  public IConferenceRegionalAccessInformation getItem(Integer _index) throws ComException;
}
