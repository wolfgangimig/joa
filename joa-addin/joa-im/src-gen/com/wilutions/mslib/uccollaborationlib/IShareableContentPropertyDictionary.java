/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IShareableContentPropertyDictionary.
 * IModalityPropertyDictionary Interface 
 */
@CoInterface(guid="{CA478B44-4FCE-4082-8700-8CEC69FB50E1}")
public interface IShareableContentPropertyDictionary extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public Integer getCount() throws ComException;
  @DeclDISPID(0)  public Object getItem(final ShareableContentProperty _propertyType) throws ComException;
  @DeclDISPID(1610743810)  public ShareableContentProperty[] getKeys() throws ComException;
  @DeclDISPID(1610743811)  public Object[] getValues() throws ComException;
  @DeclDISPID(1610743812)  public Boolean TryGetValue(final ShareableContentProperty _propertyType, final ByRef<Object> _itemValue) throws ComException;
  @DeclDISPID(1610743813)  public ShareableContentProperty GetKeyAt(final Integer _index) throws ComException;
  @DeclDISPID(1610743814)  public Object GetValueAt(final Integer _index) throws ComException;
  @DeclDISPID(1610743815)  public Boolean ContainsKey(final ShareableContentProperty _propertyType) throws ComException;
}
