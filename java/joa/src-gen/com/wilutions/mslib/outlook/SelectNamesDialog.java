/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * SelectNamesDialog.
 * 
 */
@CoClass(guid="{000610C8-0000-0000-C000-000000000046}")
public class SelectNamesDialog extends Dispatch implements _SelectNamesDialog {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(61440)  public _Application getApplication() throws ComException {
    final Object obj = this._dispatchCall(61440,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl._ApplicationImpl.class);
  }
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException {
    final Object obj = this._dispatchCall(61450,"Class", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return OlObjectClass.valueOf((Integer)obj);
  }
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException {
    final Object obj = this._dispatchCall(61451,"Session", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl._NameSpaceImpl.class);
  }
  @DeclDISPID(61441)  public IDispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(61441,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(64226)  public String getCaption() throws ComException {
    final Object obj = this._dispatchCall(64226,"Caption", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(64226)  public void setCaption(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(64226,"Caption", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(61473)  public Boolean Display() throws ComException {
    final Object obj = this._dispatchCall(61473,"Display", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(63508)  public Recipients getRecipients() throws ComException {
    final Object obj = this._dispatchCall(63508,"Recipients", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl.RecipientsImpl.class);
  }
  @DeclDISPID(63508)  public void setRecipients(Recipients value) throws ComException {
    this._dispatchCall(63508,"Recipients", DISPATCH_PROPERTYPUT,(value!=null?value:Dispatch.NULL));
  }
  @DeclDISPID(64227)  public String getBccLabel() throws ComException {
    final Object obj = this._dispatchCall(64227,"BccLabel", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(64227)  public void setBccLabel(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(64227,"BccLabel", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(64228)  public String getCcLabel() throws ComException {
    final Object obj = this._dispatchCall(64228,"CcLabel", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(64228)  public void setCcLabel(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(64228,"CcLabel", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(64229)  public String getToLabel() throws ComException {
    final Object obj = this._dispatchCall(64229,"ToLabel", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(64229)  public void setToLabel(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(64229,"ToLabel", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(64230)  public Boolean getAllowMultipleSelection() throws ComException {
    final Object obj = this._dispatchCall(64230,"AllowMultipleSelection", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(64230)  public void setAllowMultipleSelection(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(64230,"AllowMultipleSelection", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(64231)  public Boolean getForceResolution() throws ComException {
    final Object obj = this._dispatchCall(64231,"ForceResolution", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(64231)  public void setForceResolution(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(64231,"ForceResolution", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(64232)  public Boolean getShowOnlyInitialAddressList() throws ComException {
    final Object obj = this._dispatchCall(64232,"ShowOnlyInitialAddressList", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(64232)  public void setShowOnlyInitialAddressList(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(64232,"ShowOnlyInitialAddressList", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(64233)  public OlRecipientSelectors getNumberOfRecipientSelectors() throws ComException {
    final Object obj = this._dispatchCall(64233,"NumberOfRecipientSelectors", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return OlRecipientSelectors.valueOf((Integer)obj);
  }
  @DeclDISPID(64233)  public void setNumberOfRecipientSelectors(OlRecipientSelectors value) throws ComException {
    assert(value != null);
    this._dispatchCall(64233,"NumberOfRecipientSelectors", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(64234)  public AddressList getInitialAddressList() throws ComException {
    final Object obj = this._dispatchCall(64234,"InitialAddressList", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl.AddressListImpl.class);
  }
  @DeclDISPID(64234)  public void setInitialAddressList(AddressList value) throws ComException {
    this._dispatchCall(64234,"InitialAddressList", DISPATCH_PROPERTYPUT,(value!=null?value:Dispatch.NULL));
  }
  @DeclDISPID(64235)  public void SetDefaultDisplayMode(OlDefaultSelectNamesDisplayMode defaultMode) throws ComException {
    assert(defaultMode != null);
    this._dispatchCall(64235,"SetDefaultDisplayMode", DISPATCH_METHOD,null,defaultMode.value);
  }
  public SelectNamesDialog() throws ComException {
    super("{000610C8-0000-0000-C000-000000000046}", "{000630C8-0000-0000-C000-000000000046}");
  }
  protected SelectNamesDialog(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[SelectNamesDialog" + super.toString() + "]";
  }
}
