/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IConferenceSettingDictionary.
 * IConferenceSettingDictionary Interface 
 */
@CoInterface(guid="{BD891697-C93E-4A0B-9B6C-004BD81B6EE8}")
public interface IConferenceSettingDictionary extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public Integer getCount() throws ComException;
  @DeclDISPID(0)  public Object getItem(final ConferenceSetting _key) throws ComException;
  @DeclDISPID(0)  public void setItem(final ConferenceSetting _key, final Object value2) throws ComException;
  @DeclDISPID(1610743811)  public void Add(final ConferenceSetting _key, final Object _value) throws ComException;
  @DeclDISPID(1610743812)  public ConferenceSetting[] getKeys() throws ComException;
  @DeclDISPID(1610743813)  public Object[] getValues() throws ComException;
  @DeclDISPID(1610743814)  public Boolean TryGetValue(final ConferenceSetting _key, final ByRef<Object> _value) throws ComException;
  @DeclDISPID(1610743815)  public ConferenceSetting GetKeyAt(final Integer _index) throws ComException;
  @DeclDISPID(1610743816)  public Object GetValueAt(final Integer _index) throws ComException;
  @DeclDISPID(1610743817)  public Boolean ContainsKey(final ConferenceSetting _key) throws ComException;
  @DeclDISPID(1610743818)  public void RemoveAt(final Integer _index) throws ComException;
  @DeclDISPID(1610743819)  public void Remove(final ConferenceSetting _key) throws ComException;
  @DeclDISPID(1610743820)  public void RemoveAll() throws ComException;
}
