/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IContactCollection.
 * IContactCollection Interface 
 */
@CoInterface(guid="{57C3CB4D-C794-456F-846D-0E1ECA78BD00}")
public interface IContactCollection extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCount() throws ComException;
  @DeclDISPID(1610743810)  public Boolean TryGetContact(final String _uri, final ByRef<IContact> _value) throws ComException;
}
