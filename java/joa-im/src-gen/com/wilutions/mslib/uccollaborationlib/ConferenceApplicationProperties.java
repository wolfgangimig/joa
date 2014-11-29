/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ConferenceApplicationProperties.
 * ConferenceApplicationProperties Class 
 */
@CoClass(guid="{541FE2A9-95BE-4098-960A-64464B251405}")
public class ConferenceApplicationProperties extends Dispatch implements IConferenceApplicationProperties {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610743809)  public void GetItem(final Integer index, final ByRef<String> _key, final ByRef<String> _value) throws ComException {
    assert(index != null);
    assert(_key != null);
    assert(_value != null);
    this._dispatchCall(1610743809,"GetItem", DISPATCH_METHOD,null,index,_key,_value);
  }
  @DeclDISPID(1610743810)  public String getItem(final String _key) throws ComException {
    assert(_key != null);
    final Object obj = this._dispatchCall(1610743810,"Item", DISPATCH_PROPERTYGET,null,_key);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743811)  public void Add(final String _key, final String _value) throws ComException {
    assert(_key != null);
    assert(_value != null);
    this._dispatchCall(1610743811,"Add", DISPATCH_METHOD,null,_key,_value);
  }
  @DeclDISPID(1610743812)  public void Remove(final String _key) throws ComException {
    assert(_key != null);
    this._dispatchCall(1610743812,"Remove", DISPATCH_METHOD,null,_key);
  }
  @DeclDISPID(1610743813)  public void RemoveAll() throws ComException {
    this._dispatchCall(1610743813,"RemoveAll", DISPATCH_METHOD,null);
  }
  public ConferenceApplicationProperties() throws ComException {
    super("{541FE2A9-95BE-4098-960A-64464B251405}", "{64B7E9AD-D920-4EAA-95C7-9D95DE9ACE24}");
  }
  protected ConferenceApplicationProperties(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ConferenceApplicationProperties" + super.toString() + "]";
  }
}
