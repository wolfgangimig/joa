/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IConferenceApplicationProperties.
 * IConferenceApplicationProperties Interface 
 */
@CoInterface(guid="{64B7E9AD-D920-4EAA-95C7-9D95DE9ACE24}")
public interface IConferenceApplicationProperties extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public Integer getCount() throws ComException;
  @DeclDISPID(1610743809)  public void GetItem(final Integer index, final ByRef<String> _key, final ByRef<String> _value) throws ComException;
  @DeclDISPID(1610743810)  public String getItem(final String _key) throws ComException;
  @DeclDISPID(1610743811)  public void Add(final String _key, final String _value) throws ComException;
  @DeclDISPID(1610743812)  public void Remove(final String _key) throws ComException;
  @DeclDISPID(1610743813)  public void RemoveAll() throws ComException;
}
