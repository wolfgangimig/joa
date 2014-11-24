/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IConferenceInfoPropertyDictionary.
 * IConferenceInfoPropertyDictionary Interface 
 */
@CoInterface(guid="{2D3D62CA-E9F6-4F94-8EBD-5FABAB29E6A5}")
public interface IConferenceInfoPropertyDictionary extends IDispatch {
  @DeclDISPID(1610743808)  public Integer getCount() throws ComException;
  @DeclDISPID(0)  public Object getItem(ConferenceInfoProperty _key) throws ComException;
  @DeclDISPID(0)  public void setItem(ConferenceInfoProperty _key, Object value2) throws ComException;
  @DeclDISPID(1610743811)  public void Add(ConferenceInfoProperty _key, Object _value) throws ComException;
  @DeclDISPID(1610743812)  public ConferenceInfoProperty[] getKeys() throws ComException;
  @DeclDISPID(1610743813)  public Object[] getValues() throws ComException;
  @DeclDISPID(1610743814)  public Boolean TryGetValue(ConferenceInfoProperty _key, ByRef<Object> _value) throws ComException;
  @DeclDISPID(1610743815)  public ConferenceInfoProperty GetKeyAt(Integer _index) throws ComException;
  @DeclDISPID(1610743816)  public Object GetValueAt(Integer _index) throws ComException;
  @DeclDISPID(1610743817)  public Boolean ContainsKey(ConferenceInfoProperty _key) throws ComException;
  @DeclDISPID(1610743818)  public void RemoveAt(Integer _index) throws ComException;
  @DeclDISPID(1610743819)  public void Remove(ConferenceInfoProperty _key) throws ComException;
  @DeclDISPID(1610743820)  public void RemoveAll() throws ComException;
}
