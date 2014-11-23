/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IContactInformationDictionary.
 * IContactInformationDictionary Interface 
 */
@CoInterface(guid="{F0CE810F-E36F-4CD8-A836-515B9A6E09FC}")
public interface IContactInformationDictionary extends IDispatch {
  @DeclDISPID(1610743808)  public Object[] getValues() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCount() throws ComException;
  @DeclDISPID(0)  public Object getItem(ContactInformationType _key) throws ComException;
  @DeclDISPID(1610743811)  public ContactInformationType[] getKeys() throws ComException;
  @DeclDISPID(1610743812)  public Boolean TryGetValue(ContactInformationType _key, ByRef<Object> _value) throws ComException;
  @DeclDISPID(1610743813)  public ContactInformationType GetKeyAt(Integer _index) throws ComException;
  @DeclDISPID(1610743814)  public Object GetValueAt(Integer _index) throws ComException;
  @DeclDISPID(1610743815)  public Boolean ContainsKey(ContactInformationType _key) throws ComException;
}
