/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IModalityStateChangePropertyDictionary.
 * IModalityStateChangePropertyDictionary Interface 
 */
@CoInterface(guid="{C79E4169-535F-4A41-8DE2-C65A90D9503D}")
public interface IModalityStateChangePropertyDictionary extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public Integer getCount() throws ComException;
  @DeclDISPID(0)  public Object getItem(final ModalityStateChangeProperty _modalityType) throws ComException;
  @DeclDISPID(1610743810)  public ModalityStateChangeProperty[] getKeys() throws ComException;
  @DeclDISPID(1610743811)  public Object[] getValues() throws ComException;
  @DeclDISPID(1610743812)  public Boolean TryGetValue(final ModalityStateChangeProperty _modalityType, final ByRef<Object> _itemValue) throws ComException;
  @DeclDISPID(1610743813)  public ModalityStateChangeProperty GetKeyAt(final Integer _index) throws ComException;
  @DeclDISPID(1610743814)  public Object GetValueAt(final Integer _index) throws ComException;
  @DeclDISPID(1610743815)  public Boolean ContainsKey(final ModalityStateChangeProperty _modalityType) throws ComException;
}
