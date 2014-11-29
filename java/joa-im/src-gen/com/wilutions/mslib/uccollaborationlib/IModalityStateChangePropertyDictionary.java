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
  @DeclDISPID(0)  public Object getItem(ModalityStateChangeProperty _modalityType) throws ComException;
  @DeclDISPID(1610743810)  public ModalityStateChangeProperty[] getKeys() throws ComException;
  @DeclDISPID(1610743811)  public Object[] getValues() throws ComException;
  @DeclDISPID(1610743812)  public Boolean TryGetValue(ModalityStateChangeProperty _modalityType, ByRef<Object> _itemValue) throws ComException;
  @DeclDISPID(1610743813)  public ModalityStateChangeProperty GetKeyAt(Integer _index) throws ComException;
  @DeclDISPID(1610743814)  public Object GetValueAt(Integer _index) throws ComException;
  @DeclDISPID(1610743815)  public Boolean ContainsKey(ModalityStateChangeProperty _modalityType) throws ComException;
}
