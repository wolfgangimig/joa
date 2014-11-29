/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IContactSettingDictionary.
 * IContactSettingDictionary Interface 
 */
@CoInterface(guid="{FD9000B3-479F-4B16-9D63-70A49E078946}")
public interface IContactSettingDictionary extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public ContactSetting[] getKeys() throws ComException;
  @DeclDISPID(1610743809)  public Object[] getValues() throws ComException;
  @DeclDISPID(1610743810)  public Boolean TryGetValue(final ContactSetting _key, final ByRef<Object> _value) throws ComException;
  @DeclDISPID(0)  public Object getItem(final ContactSetting _key) throws ComException;
  @DeclDISPID(1610743812)  public ContactSetting GetKeyAt(final Integer _index) throws ComException;
  @DeclDISPID(1610743813)  public Object GetValueAt(final Integer _index) throws ComException;
  @DeclDISPID(1610743814)  public Boolean ContainsKey(final ContactSetting _key) throws ComException;
  @DeclDISPID(1610743815)  public Integer getCount() throws ComException;
}
