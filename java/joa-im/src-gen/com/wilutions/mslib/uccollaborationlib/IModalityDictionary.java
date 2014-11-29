/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IModalityDictionary.
 * IModalityDictionary Interface 
 */
@CoInterface(guid="{ED5040FA-8F8F-4876-BF6D-9C62F5EFFD5B}")
public interface IModalityDictionary extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public Integer getCount() throws ComException;
  @DeclDISPID(0)  public IModality getItem(final ModalityTypes _modalityType) throws ComException;
  @DeclDISPID(1610743810)  public ModalityTypes[] getKeys() throws ComException;
  @DeclDISPID(1610743811)  public IModality[] getValues() throws ComException;
  @DeclDISPID(1610743812)  public Boolean TryGetValue(final ModalityTypes _modalityType, final ByRef<IModality> _itemValue) throws ComException;
  @DeclDISPID(1610743813)  public ModalityTypes GetKeyAt(final Integer _index) throws ComException;
  @DeclDISPID(1610743814)  public IModality GetValueAt(final Integer _index) throws ComException;
  @DeclDISPID(1610743815)  public Boolean ContainsKey(final ModalityTypes _modalityType) throws ComException;
}
