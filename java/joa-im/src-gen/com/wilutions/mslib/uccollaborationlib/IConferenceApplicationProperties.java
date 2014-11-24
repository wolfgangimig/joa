/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IConferenceApplicationProperties.
 * IConferenceApplicationProperties Interface 
 */
@CoInterface(guid="{64B7E9AD-D920-4EAA-95C7-9D95DE9ACE24}")
public interface IConferenceApplicationProperties extends IDispatch {
  @DeclDISPID(1610743808)  public Integer getCount() throws ComException;
  @DeclDISPID(1610743809)  public void GetItem(Integer index, ByRef<String> _key, ByRef<String> _value) throws ComException;
  @DeclDISPID(1610743810)  public String getItem(String _key) throws ComException;
  @DeclDISPID(1610743811)  public void Add(String _key, String _value) throws ComException;
  @DeclDISPID(1610743812)  public void Remove(String _key) throws ComException;
  @DeclDISPID(1610743813)  public void RemoveAll() throws ComException;
}
