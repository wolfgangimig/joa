/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IConferenceInfoPropertyDictionary.
 * IConferenceInfoPropertyDictionary Interface 
 */
@CoInterface(guid="{2D3D62CA-E9F6-4F94-8EBD-5FABAB29E6A5}")
public interface IConferenceInfoPropertyDictionary extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public Integer getCount() throws ComException;
  @DeclDISPID(0)  public Object getItem(final ConferenceInfoProperty _key) throws ComException;
  @DeclDISPID(0)  public void setItem(final ConferenceInfoProperty _key, final Object value2) throws ComException;
  @DeclDISPID(1610743811)  public void Add(final ConferenceInfoProperty _key, final Object _value) throws ComException;
  @DeclDISPID(1610743812)  public ConferenceInfoProperty[] getKeys() throws ComException;
  @DeclDISPID(1610743813)  public Object[] getValues() throws ComException;
  @DeclDISPID(1610743814)  public Boolean TryGetValue(final ConferenceInfoProperty _key, final ByRef<Object> _value) throws ComException;
  @DeclDISPID(1610743815)  public ConferenceInfoProperty GetKeyAt(final Integer _index) throws ComException;
  @DeclDISPID(1610743816)  public Object GetValueAt(final Integer _index) throws ComException;
  @DeclDISPID(1610743817)  public Boolean ContainsKey(final ConferenceInfoProperty _key) throws ComException;
  @DeclDISPID(1610743818)  public void RemoveAt(final Integer _index) throws ComException;
  @DeclDISPID(1610743819)  public void Remove(final ConferenceInfoProperty _key) throws ComException;
  @DeclDISPID(1610743820)  public void RemoveAll() throws ComException;
}
