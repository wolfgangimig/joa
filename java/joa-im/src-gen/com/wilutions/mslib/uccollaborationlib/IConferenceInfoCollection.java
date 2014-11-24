/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IConferenceInfoCollection.
 * IConferenceInfoCollection Interface 
 */
@CoInterface(guid="{1FF8AA01-D8AF-4B2B-B254-BEFEFABAF2D6}")
public interface IConferenceInfoCollection extends IDispatch {
  @DeclDISPID(1610743808)  public Integer getCount() throws ComException;
  @DeclDISPID(0)  public IConferenceInfo getItem(Integer _index) throws ComException;
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException;
}
