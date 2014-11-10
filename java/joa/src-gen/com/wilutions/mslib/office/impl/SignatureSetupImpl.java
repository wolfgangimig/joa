/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B4FCA-A463-DB41-5DAE-69E7A5F7FCBC}")
public class SignatureSetupImpl extends Dispatch implements com.wilutions.mslib.office.SignatureSetup {
  @DeclDISPID(1610743808)  public Dispatch getApplication() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"Creator", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1)  public Boolean getReadOnly() throws ComException {
    final Object obj = this._dispatchCall(1,"ReadOnly", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(2)  public String getId() throws ComException {
    final Object obj = this._dispatchCall(2,"Id", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(3)  public String getSignatureProvider() throws ComException {
    final Object obj = this._dispatchCall(3,"SignatureProvider", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(4)  public String getSuggestedSigner() throws ComException {
    final Object obj = this._dispatchCall(4,"SuggestedSigner", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(4)  public void setSuggestedSigner(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(4,"SuggestedSigner", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(5)  public String getSuggestedSignerLine2() throws ComException {
    final Object obj = this._dispatchCall(5,"SuggestedSignerLine2", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(5)  public void setSuggestedSignerLine2(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(5,"SuggestedSignerLine2", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(6)  public String getSuggestedSignerEmail() throws ComException {
    final Object obj = this._dispatchCall(6,"SuggestedSignerEmail", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(6)  public void setSuggestedSignerEmail(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(6,"SuggestedSignerEmail", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(7)  public String getSigningInstructions() throws ComException {
    final Object obj = this._dispatchCall(7,"SigningInstructions", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(7)  public void setSigningInstructions(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(7,"SigningInstructions", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(8)  public Boolean getAllowComments() throws ComException {
    final Object obj = this._dispatchCall(8,"AllowComments", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(8)  public void setAllowComments(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(8,"AllowComments", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(9)  public Boolean getShowSignDate() throws ComException {
    final Object obj = this._dispatchCall(9,"ShowSignDate", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(9)  public void setShowSignDate(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(9,"ShowSignDate", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(10)  public String getAdditionalXml() throws ComException {
    final Object obj = this._dispatchCall(10,"AdditionalXml", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(10)  public void setAdditionalXml(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(10,"AdditionalXml", DISPATCH_PROPERTYPUT,value);
  }
  public SignatureSetupImpl(String progId) throws ComException {
    super(progId);
  }
  protected SignatureSetupImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[SignatureSetupImpl" + super.toString() + "]";
  }
}
