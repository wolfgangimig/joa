/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IContactInformationDictionary.
 * IContactInformationDictionary Interface 
 */
@CoInterface(guid="{F0CE810F-E36F-4CD8-A836-515B9A6E09FC}")
public interface IContactInformationDictionary extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public Object[] getValues() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCount() throws ComException;
  @DeclDISPID(0)  public Object getItem(final ContactInformationType _key) throws ComException;
  @DeclDISPID(1610743811)  public ContactInformationType[] getKeys() throws ComException;
  @DeclDISPID(1610743812)  public Boolean TryGetValue(final ContactInformationType _key, final ByRef<Object> _value) throws ComException;
  @DeclDISPID(1610743813)  public ContactInformationType GetKeyAt(final Integer _index) throws ComException;
  @DeclDISPID(1610743814)  public Object GetValueAt(final Integer _index) throws ComException;
  @DeclDISPID(1610743815)  public Boolean ContainsKey(final ContactInformationType _key) throws ComException;
}
