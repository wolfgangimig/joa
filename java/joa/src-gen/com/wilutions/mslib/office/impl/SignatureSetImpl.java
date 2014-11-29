/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9D7B-A463-DB41-5DAE-69E7A5F7FCBC}")
public class SignatureSetImpl extends Dispatch implements com.wilutions.mslib.office.SignatureSet {
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"Creator", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException {
    final Object obj = this._dispatchCall(-4,"_NewEnum", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1610809345)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(1610809345,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(0)  public com.wilutions.mslib.office.Signature getItem(final Integer iSig) throws ComException {
    assert(iSig != null);
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_PROPERTYGET,null,iSig);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.SignatureImpl.class);
  }
  @DeclDISPID(1610809349)  public IDispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(1610809349,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(1610809350)  public com.wilutions.mslib.office.Signature AddNonVisibleSignature(final Object varSigProv) throws ComException {
    assert(varSigProv != null);
    final Object obj = this._dispatchCall(1610809350,"AddNonVisibleSignature", DISPATCH_METHOD,null,varSigProv);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.SignatureImpl.class);
  }
  @DeclDISPID(1610809351)  public Boolean getCanAddSignatureLine() throws ComException {
    final Object obj = this._dispatchCall(1610809351,"CanAddSignatureLine", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610809352)  public com.wilutions.mslib.office.Signature AddSignatureLine(final Object varSigProv) throws ComException {
    assert(varSigProv != null);
    final Object obj = this._dispatchCall(1610809352,"AddSignatureLine", DISPATCH_METHOD,null,varSigProv);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.SignatureImpl.class);
  }
  @DeclDISPID(1610809353)  public com.wilutions.mslib.office.MsoSignatureSubset getSubset() throws ComException {
    final Object obj = this._dispatchCall(1610809353,"Subset", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoSignatureSubset.valueOf((Integer)obj);
  }
  @DeclDISPID(1610809353)  public void setSubset(final com.wilutions.mslib.office.MsoSignatureSubset value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610809353,"Subset", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(1610809355)  public void setShowSignaturesPane(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610809355,"ShowSignaturesPane", DISPATCH_PROPERTYPUT,value);
  }
  public SignatureSetImpl(String progId) throws ComException {
    super(progId, "{000C0410-0000-0000-C000-000000000046}");
  }
  protected SignatureSetImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[SignatureSetImpl" + super.toString() + "]";
  }
}
