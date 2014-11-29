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
  @DeclDISPID(0)  public Object getItem(ShareableContentProperty _propertyType) throws ComException;
  @DeclDISPID(1610743810)  public ShareableContentProperty[] getKeys() throws ComException;
  @DeclDISPID(1610743811)  public Object[] getValues() throws ComException;
  @DeclDISPID(1610743812)  public Boolean TryGetValue(ShareableContentProperty _propertyType, ByRef<Object> _itemValue) throws ComException;
  @DeclDISPID(1610743813)  public ShareableContentProperty GetKeyAt(Integer _index) throws ComException;
  @DeclDISPID(1610743814)  public Object GetValueAt(Integer _index) throws ComException;
  @DeclDISPID(1610743815)  public Boolean ContainsKey(ShareableContentProperty _propertyType) throws ComException;
}
