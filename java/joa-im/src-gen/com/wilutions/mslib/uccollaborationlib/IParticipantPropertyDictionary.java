/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IParticipantPropertyDictionary.
 * IParticipantPropertyDictionary Interface 
 */
@CoInterface(guid="{8665FD95-7720-4F9E-B605-6ABCBD7EDFF4}")
public interface IParticipantPropertyDictionary extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public Integer getCount() throws ComException;
  @DeclDISPID(0)  public Object getItem(final ParticipantProperty _propertyType) throws ComException;
  @DeclDISPID(1610743810)  public ParticipantProperty[] getKeys() throws ComException;
  @DeclDISPID(1610743811)  public Object[] getValues() throws ComException;
  @DeclDISPID(1610743812)  public Boolean TryGetValue(final ParticipantProperty _propertyType, final ByRef<Object> _itemValue) throws ComException;
  @DeclDISPID(1610743813)  public ParticipantProperty GetKeyAt(final Integer _index) throws ComException;
  @DeclDISPID(1610743814)  public Object GetValueAt(final Integer _index) throws ComException;
  @DeclDISPID(1610743815)  public Boolean ContainsKey(final ParticipantProperty _propertyType) throws ComException;
}
