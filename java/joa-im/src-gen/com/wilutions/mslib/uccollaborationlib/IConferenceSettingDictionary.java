/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IConferenceSettingDictionary.
 * IConferenceSettingDictionary Interface 
 */
@CoInterface(guid="{BD891697-C93E-4A0B-9B6C-004BD81B6EE8}")
public interface IConferenceSettingDictionary extends IDispatch {
  @DeclDISPID(1610743808)  public Integer getCount() throws ComException;
  @DeclDISPID(0)  public Object getItem(ConferenceSetting _key) throws ComException;
  @DeclDISPID(0)  public void setItem(ConferenceSetting _key, Object value2) throws ComException;
  @DeclDISPID(1610743811)  public void Add(ConferenceSetting _key, Object _value) throws ComException;
  @DeclDISPID(1610743812)  public ConferenceSetting[] getKeys() throws ComException;
  @DeclDISPID(1610743813)  public Object[] getValues() throws ComException;
  @DeclDISPID(1610743814)  public Boolean TryGetValue(ConferenceSetting _key, ByRef<Object> _value) throws ComException;
  @DeclDISPID(1610743815)  public ConferenceSetting GetKeyAt(Integer _index) throws ComException;
  @DeclDISPID(1610743816)  public Object GetValueAt(Integer _index) throws ComException;
  @DeclDISPID(1610743817)  public Boolean ContainsKey(ConferenceSetting _key) throws ComException;
  @DeclDISPID(1610743818)  public void RemoveAt(Integer _index) throws ComException;
  @DeclDISPID(1610743819)  public void Remove(ConferenceSetting _key) throws ComException;
  @DeclDISPID(1610743820)  public void RemoveAll() throws ComException;
}
