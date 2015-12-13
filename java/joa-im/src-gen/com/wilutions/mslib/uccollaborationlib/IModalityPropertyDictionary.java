/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IModalityPropertyDictionary.
 * IModalityPropertyDictionary Interface 
 */
@CoInterface(guid="{62074904-8D06-43FE-A531-E63DF7FDC2E7}")
public interface IModalityPropertyDictionary extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public Integer getCount() throws ComException;
  @DeclDISPID(0)  public Object getItem(final ModalityProperty _propertyType) throws ComException;
  @DeclDISPID(1610743810)  public ModalityProperty[] getKeys() throws ComException;
  @DeclDISPID(1610743811)  public Object[] getValues() throws ComException;
  @DeclDISPID(1610743812)  public Boolean TryGetValue(final ModalityProperty _propertyType, final ByRef<Object> _itemValue) throws ComException;
  @DeclDISPID(1610743813)  public ModalityProperty GetKeyAt(final Integer _index) throws ComException;
  @DeclDISPID(1610743814)  public Object GetValueAt(final Integer _index) throws ComException;
  @DeclDISPID(1610743815)  public Boolean ContainsKey(final ModalityProperty _propertyType) throws ComException;
}
