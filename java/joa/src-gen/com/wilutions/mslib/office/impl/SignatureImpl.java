/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9D7A-A463-DB41-5DAE-69E7A5F7FCBC}")
public class SignatureImpl extends Dispatch implements com.wilutions.mslib.office.Signature {
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
  @DeclDISPID(1610809350)  public void Delete() throws ComException {
    this._dispatchCall(1610809350,"Delete", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1610809351)  public Dispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(1610809351,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(1610809355)  public Boolean getIsSigned() throws ComException {
    final Object obj = this._dispatchCall(1610809355,"IsSigned", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610809356)  public void Sign(Object varSigImg, Object varDelSuggSigner, Object varDelSuggSignerLine2, Object varDelSuggSignerEmail) throws ComException {
    assert(varSigImg != null);
    assert(varDelSuggSigner != null);
    assert(varDelSuggSignerLine2 != null);
    assert(varDelSuggSignerEmail != null);
    this._dispatchCall(1610809356,"Sign", DISPATCH_METHOD,null,varSigImg,varDelSuggSigner,varDelSuggSignerLine2,varDelSuggSignerEmail);
  }
  @DeclDISPID(1610809357)  public com.wilutions.mslib.office.SignatureInfo getDetails() throws ComException {
    final Object obj = this._dispatchCall(1610809357,"Details", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.SignatureInfoImpl.class);
  }
  @DeclDISPID(1610809358)  public void ShowDetails() throws ComException {
    this._dispatchCall(1610809358,"ShowDetails", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1610809359)  public Boolean getCanSetup() throws ComException {
    final Object obj = this._dispatchCall(1610809359,"CanSetup", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610809360)  public com.wilutions.mslib.office.SignatureSetup getSetup() throws ComException {
    final Object obj = this._dispatchCall(1610809360,"Setup", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.SignatureSetupImpl.class);
  }
  @DeclDISPID(1610809361)  public Boolean getIsSignatureLine() throws ComException {
    final Object obj = this._dispatchCall(1610809361,"IsSignatureLine", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610809362)  public Dispatch getSignatureLineShape() throws ComException {
    final Object obj = this._dispatchCall(1610809362,"SignatureLineShape", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(1610809363)  public Integer getSortHint() throws ComException {
    final Object obj = this._dispatchCall(1610809363,"SortHint", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  public SignatureImpl(String progId) throws ComException {
    super(progId);
  }
  protected SignatureImpl(long ndisp) {
    super(ndisp);
  }
  public SignatureImpl(Dispatch ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[SignatureImpl" + super.toString() + "]";
  }
}
