/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C08ED969-7DA0-CA92-10F7-69B7A1747819}")
public class ILicAgentImpl extends Dispatch implements com.wilutions.mslib.office.ILicAgent {
  @DeclDISPID(1)  public Integer Initialize(final Integer dwBPC, final Integer dwMode, final String bstrLicSource) throws ComException {
    assert(dwBPC != null);
    assert(dwMode != null);
    assert(bstrLicSource != null);
    final Object obj = this._dispatchCall(1,"Initialize", DISPATCH_METHOD,null,dwBPC,dwMode,bstrLicSource);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(3)  public String GetFirstName() throws ComException {
    final Object obj = this._dispatchCall(3,"GetFirstName", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(4)  public void SetFirstName(final String bstrNewVal) throws ComException {
    assert(bstrNewVal != null);
    this._dispatchCall(4,"SetFirstName", DISPATCH_METHOD,null,bstrNewVal);
  }
  @DeclDISPID(5)  public String GetLastName() throws ComException {
    final Object obj = this._dispatchCall(5,"GetLastName", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(6)  public void SetLastName(final String bstrNewVal) throws ComException {
    assert(bstrNewVal != null);
    this._dispatchCall(6,"SetLastName", DISPATCH_METHOD,null,bstrNewVal);
  }
  @DeclDISPID(7)  public String GetOrgName() throws ComException {
    final Object obj = this._dispatchCall(7,"GetOrgName", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(8)  public void SetOrgName(final String bstrNewVal) throws ComException {
    assert(bstrNewVal != null);
    this._dispatchCall(8,"SetOrgName", DISPATCH_METHOD,null,bstrNewVal);
  }
  @DeclDISPID(9)  public String GetEmail() throws ComException {
    final Object obj = this._dispatchCall(9,"GetEmail", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(10)  public void SetEmail(final String bstrNewVal) throws ComException {
    assert(bstrNewVal != null);
    this._dispatchCall(10,"SetEmail", DISPATCH_METHOD,null,bstrNewVal);
  }
  @DeclDISPID(11)  public String GetPhone() throws ComException {
    final Object obj = this._dispatchCall(11,"GetPhone", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(12)  public void SetPhone(final String bstrNewVal) throws ComException {
    assert(bstrNewVal != null);
    this._dispatchCall(12,"SetPhone", DISPATCH_METHOD,null,bstrNewVal);
  }
  @DeclDISPID(13)  public String GetAddress1() throws ComException {
    final Object obj = this._dispatchCall(13,"GetAddress1", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(14)  public void SetAddress1(final String bstrNewVal) throws ComException {
    assert(bstrNewVal != null);
    this._dispatchCall(14,"SetAddress1", DISPATCH_METHOD,null,bstrNewVal);
  }
  @DeclDISPID(15)  public String GetCity() throws ComException {
    final Object obj = this._dispatchCall(15,"GetCity", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(16)  public void SetCity(final String bstrNewVal) throws ComException {
    assert(bstrNewVal != null);
    this._dispatchCall(16,"SetCity", DISPATCH_METHOD,null,bstrNewVal);
  }
  @DeclDISPID(17)  public String GetState() throws ComException {
    final Object obj = this._dispatchCall(17,"GetState", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(18)  public void SetState(final String bstrNewVal) throws ComException {
    assert(bstrNewVal != null);
    this._dispatchCall(18,"SetState", DISPATCH_METHOD,null,bstrNewVal);
  }
  @DeclDISPID(19)  public String GetCountryCode() throws ComException {
    final Object obj = this._dispatchCall(19,"GetCountryCode", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(20)  public void SetCountryCode(final String bstrNewVal) throws ComException {
    assert(bstrNewVal != null);
    this._dispatchCall(20,"SetCountryCode", DISPATCH_METHOD,null,bstrNewVal);
  }
  @DeclDISPID(21)  public String GetCountryDesc() throws ComException {
    final Object obj = this._dispatchCall(21,"GetCountryDesc", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(22)  public void SetCountryDesc(final String bstrNewVal) throws ComException {
    assert(bstrNewVal != null);
    this._dispatchCall(22,"SetCountryDesc", DISPATCH_METHOD,null,bstrNewVal);
  }
  @DeclDISPID(23)  public String GetZip() throws ComException {
    final Object obj = this._dispatchCall(23,"GetZip", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(24)  public void SetZip(final String bstrNewVal) throws ComException {
    assert(bstrNewVal != null);
    this._dispatchCall(24,"SetZip", DISPATCH_METHOD,null,bstrNewVal);
  }
  @DeclDISPID(25)  public Integer GetIsoLanguage() throws ComException {
    final Object obj = this._dispatchCall(25,"GetIsoLanguage", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(26)  public void SetIsoLanguage(final Integer dwNewVal) throws ComException {
    assert(dwNewVal != null);
    this._dispatchCall(26,"SetIsoLanguage", DISPATCH_METHOD,null,dwNewVal);
  }
  @DeclDISPID(32)  public String GetMSUpdate() throws ComException {
    final Object obj = this._dispatchCall(32,"GetMSUpdate", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(33)  public void SetMSUpdate(final String bstrNewVal) throws ComException {
    assert(bstrNewVal != null);
    this._dispatchCall(33,"SetMSUpdate", DISPATCH_METHOD,null,bstrNewVal);
  }
  @DeclDISPID(34)  public String GetMSOffer() throws ComException {
    final Object obj = this._dispatchCall(34,"GetMSOffer", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(35)  public void SetMSOffer(final String bstrNewVal) throws ComException {
    assert(bstrNewVal != null);
    this._dispatchCall(35,"SetMSOffer", DISPATCH_METHOD,null,bstrNewVal);
  }
  @DeclDISPID(36)  public String GetOtherOffer() throws ComException {
    final Object obj = this._dispatchCall(36,"GetOtherOffer", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(37)  public void SetOtherOffer(final String bstrNewVal) throws ComException {
    assert(bstrNewVal != null);
    this._dispatchCall(37,"SetOtherOffer", DISPATCH_METHOD,null,bstrNewVal);
  }
  @DeclDISPID(38)  public String GetAddress2() throws ComException {
    final Object obj = this._dispatchCall(38,"GetAddress2", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(39)  public void SetAddress2(final String bstrNewVal) throws ComException {
    assert(bstrNewVal != null);
    this._dispatchCall(39,"SetAddress2", DISPATCH_METHOD,null,bstrNewVal);
  }
  @DeclDISPID(40)  public Integer CheckSystemClock() throws ComException {
    final Object obj = this._dispatchCall(40,"CheckSystemClock", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(41)  public java.util.Date GetExistingExpiryDate() throws ComException {
    final Object obj = this._dispatchCall(41,"GetExistingExpiryDate", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (java.util.Date)obj;
  }
  @DeclDISPID(42)  public java.util.Date GetNewExpiryDate() throws ComException {
    final Object obj = this._dispatchCall(42,"GetNewExpiryDate", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (java.util.Date)obj;
  }
  @DeclDISPID(43)  public String GetBillingFirstName() throws ComException {
    final Object obj = this._dispatchCall(43,"GetBillingFirstName", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(44)  public void SetBillingFirstName(final String bstrNewVal) throws ComException {
    assert(bstrNewVal != null);
    this._dispatchCall(44,"SetBillingFirstName", DISPATCH_METHOD,null,bstrNewVal);
  }
  @DeclDISPID(45)  public String GetBillingLastName() throws ComException {
    final Object obj = this._dispatchCall(45,"GetBillingLastName", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(46)  public void SetBillingLastName(final String bstrNewVal) throws ComException {
    assert(bstrNewVal != null);
    this._dispatchCall(46,"SetBillingLastName", DISPATCH_METHOD,null,bstrNewVal);
  }
  @DeclDISPID(47)  public String GetBillingPhone() throws ComException {
    final Object obj = this._dispatchCall(47,"GetBillingPhone", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(48)  public void SetBillingPhone(final String bstrNewVal) throws ComException {
    assert(bstrNewVal != null);
    this._dispatchCall(48,"SetBillingPhone", DISPATCH_METHOD,null,bstrNewVal);
  }
  @DeclDISPID(49)  public String GetBillingAddress1() throws ComException {
    final Object obj = this._dispatchCall(49,"GetBillingAddress1", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(50)  public void SetBillingAddress1(final String bstrNewVal) throws ComException {
    assert(bstrNewVal != null);
    this._dispatchCall(50,"SetBillingAddress1", DISPATCH_METHOD,null,bstrNewVal);
  }
  @DeclDISPID(51)  public String GetBillingAddress2() throws ComException {
    final Object obj = this._dispatchCall(51,"GetBillingAddress2", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(52)  public void SetBillingAddress2(final String bstrNewVal) throws ComException {
    assert(bstrNewVal != null);
    this._dispatchCall(52,"SetBillingAddress2", DISPATCH_METHOD,null,bstrNewVal);
  }
  @DeclDISPID(53)  public String GetBillingCity() throws ComException {
    final Object obj = this._dispatchCall(53,"GetBillingCity", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(54)  public void SetBillingCity(final String bstrNewVal) throws ComException {
    assert(bstrNewVal != null);
    this._dispatchCall(54,"SetBillingCity", DISPATCH_METHOD,null,bstrNewVal);
  }
  @DeclDISPID(55)  public String GetBillingState() throws ComException {
    final Object obj = this._dispatchCall(55,"GetBillingState", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(56)  public void SetBillingState(final String bstrNewVal) throws ComException {
    assert(bstrNewVal != null);
    this._dispatchCall(56,"SetBillingState", DISPATCH_METHOD,null,bstrNewVal);
  }
  @DeclDISPID(57)  public String GetBillingCountryCode() throws ComException {
    final Object obj = this._dispatchCall(57,"GetBillingCountryCode", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(58)  public void SetBillingCountryCode(final String bstrNewVal) throws ComException {
    assert(bstrNewVal != null);
    this._dispatchCall(58,"SetBillingCountryCode", DISPATCH_METHOD,null,bstrNewVal);
  }
  @DeclDISPID(59)  public String GetBillingZip() throws ComException {
    final Object obj = this._dispatchCall(59,"GetBillingZip", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(60)  public void SetBillingZip(final String bstrNewVal) throws ComException {
    assert(bstrNewVal != null);
    this._dispatchCall(60,"SetBillingZip", DISPATCH_METHOD,null,bstrNewVal);
  }
  @DeclDISPID(61)  public Integer SaveBillingInfo(final Integer bSave) throws ComException {
    assert(bSave != null);
    final Object obj = this._dispatchCall(61,"SaveBillingInfo", DISPATCH_METHOD,null,bSave);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(64)  public Integer IsCCRenewalCountry(final String bstrCountryCode) throws ComException {
    assert(bstrCountryCode != null);
    final Object obj = this._dispatchCall(64,"IsCCRenewalCountry", DISPATCH_METHOD,null,bstrCountryCode);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(65)  public String GetVATLabel(final String bstrCountryCode) throws ComException {
    assert(bstrCountryCode != null);
    final Object obj = this._dispatchCall(65,"GetVATLabel", DISPATCH_METHOD,null,bstrCountryCode);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(66)  public java.util.Date GetCCRenewalExpiryDate() throws ComException {
    final Object obj = this._dispatchCall(66,"GetCCRenewalExpiryDate", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (java.util.Date)obj;
  }
  @DeclDISPID(67)  public void SetVATNumber(final String bstrVATNumber) throws ComException {
    assert(bstrVATNumber != null);
    this._dispatchCall(67,"SetVATNumber", DISPATCH_METHOD,null,bstrVATNumber);
  }
  @DeclDISPID(68)  public void SetCreditCardType(final String bstrCCCode) throws ComException {
    assert(bstrCCCode != null);
    this._dispatchCall(68,"SetCreditCardType", DISPATCH_METHOD,null,bstrCCCode);
  }
  @DeclDISPID(69)  public void SetCreditCardNumber(final String bstrCCNumber) throws ComException {
    assert(bstrCCNumber != null);
    this._dispatchCall(69,"SetCreditCardNumber", DISPATCH_METHOD,null,bstrCCNumber);
  }
  @DeclDISPID(70)  public void SetCreditCardExpiryYear(final Integer dwCCYear) throws ComException {
    assert(dwCCYear != null);
    this._dispatchCall(70,"SetCreditCardExpiryYear", DISPATCH_METHOD,null,dwCCYear);
  }
  @DeclDISPID(71)  public void SetCreditCardExpiryMonth(final Integer dwCCMonth) throws ComException {
    assert(dwCCMonth != null);
    this._dispatchCall(71,"SetCreditCardExpiryMonth", DISPATCH_METHOD,null,dwCCMonth);
  }
  @DeclDISPID(72)  public Integer GetCreditCardCount() throws ComException {
    final Object obj = this._dispatchCall(72,"GetCreditCardCount", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(73)  public String GetCreditCardCode(final Integer dwIndex) throws ComException {
    assert(dwIndex != null);
    final Object obj = this._dispatchCall(73,"GetCreditCardCode", DISPATCH_METHOD,null,dwIndex);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(74)  public String GetCreditCardName(final Integer dwIndex) throws ComException {
    assert(dwIndex != null);
    final Object obj = this._dispatchCall(74,"GetCreditCardName", DISPATCH_METHOD,null,dwIndex);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(75)  public String GetVATNumber() throws ComException {
    final Object obj = this._dispatchCall(75,"GetVATNumber", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(76)  public String GetCreditCardType() throws ComException {
    final Object obj = this._dispatchCall(76,"GetCreditCardType", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(77)  public String GetCreditCardNumber() throws ComException {
    final Object obj = this._dispatchCall(77,"GetCreditCardNumber", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(78)  public Integer GetCreditCardExpiryYear() throws ComException {
    final Object obj = this._dispatchCall(78,"GetCreditCardExpiryYear", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(79)  public Integer GetCreditCardExpiryMonth() throws ComException {
    final Object obj = this._dispatchCall(79,"GetCreditCardExpiryMonth", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(80)  public Integer GetDisconnectOption() throws ComException {
    final Object obj = this._dispatchCall(80,"GetDisconnectOption", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(81)  public void SetDisconnectOption(final Integer bNewVal) throws ComException {
    assert(bNewVal != null);
    this._dispatchCall(81,"SetDisconnectOption", DISPATCH_METHOD,null,bNewVal);
  }
  @DeclDISPID(82)  public void AsyncProcessHandshakeRequest(final Integer bReviseCustInfo) throws ComException {
    assert(bReviseCustInfo != null);
    this._dispatchCall(82,"AsyncProcessHandshakeRequest", DISPATCH_METHOD,null,bReviseCustInfo);
  }
  @DeclDISPID(83)  public void AsyncProcessNewLicenseRequest() throws ComException {
    this._dispatchCall(83,"AsyncProcessNewLicenseRequest", DISPATCH_METHOD,null);
  }
  @DeclDISPID(84)  public void AsyncProcessReissueLicenseRequest() throws ComException {
    this._dispatchCall(84,"AsyncProcessReissueLicenseRequest", DISPATCH_METHOD,null);
  }
  @DeclDISPID(85)  public void AsyncProcessRetailRenewalLicenseRequest() throws ComException {
    this._dispatchCall(85,"AsyncProcessRetailRenewalLicenseRequest", DISPATCH_METHOD,null);
  }
  @DeclDISPID(86)  public void AsyncProcessReviseCustInfoRequest() throws ComException {
    this._dispatchCall(86,"AsyncProcessReviseCustInfoRequest", DISPATCH_METHOD,null);
  }
  @DeclDISPID(87)  public void AsyncProcessCCRenewalPriceRequest() throws ComException {
    this._dispatchCall(87,"AsyncProcessCCRenewalPriceRequest", DISPATCH_METHOD,null);
  }
  @DeclDISPID(88)  public void AsyncProcessCCRenewalLicenseRequest() throws ComException {
    this._dispatchCall(88,"AsyncProcessCCRenewalLicenseRequest", DISPATCH_METHOD,null);
  }
  @DeclDISPID(90)  public Integer GetAsyncProcessReturnCode() throws ComException {
    final Object obj = this._dispatchCall(90,"GetAsyncProcessReturnCode", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(91)  public Integer IsUpgradeAvailable() throws ComException {
    final Object obj = this._dispatchCall(91,"IsUpgradeAvailable", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(92)  public void WantUpgrade(final Integer bWantUpgrade) throws ComException {
    assert(bWantUpgrade != null);
    this._dispatchCall(92,"WantUpgrade", DISPATCH_METHOD,null,bWantUpgrade);
  }
  @DeclDISPID(93)  public void AsyncProcessDroppedLicenseRequest() throws ComException {
    this._dispatchCall(93,"AsyncProcessDroppedLicenseRequest", DISPATCH_METHOD,null);
  }
  @DeclDISPID(94)  public String GenerateInstallationId() throws ComException {
    final Object obj = this._dispatchCall(94,"GenerateInstallationId", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(95)  public Integer DepositConfirmationId(final String bstrVal) throws ComException {
    assert(bstrVal != null);
    final Object obj = this._dispatchCall(95,"DepositConfirmationId", DISPATCH_METHOD,null,bstrVal);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(96)  public Integer VerifyCheckDigits(final String bstrCIDIID) throws ComException {
    assert(bstrCIDIID != null);
    final Object obj = this._dispatchCall(96,"VerifyCheckDigits", DISPATCH_METHOD,null,bstrCIDIID);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(97)  public java.util.Date GetCurrentExpiryDate() throws ComException {
    final Object obj = this._dispatchCall(97,"GetCurrentExpiryDate", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (java.util.Date)obj;
  }
  @DeclDISPID(98)  public void CancelAsyncProcessRequest(final Integer bIsLicenseRequest) throws ComException {
    assert(bIsLicenseRequest != null);
    this._dispatchCall(98,"CancelAsyncProcessRequest", DISPATCH_METHOD,null,bIsLicenseRequest);
  }
  @DeclDISPID(100)  public String GetCurrencyDescription(final Integer dwCurrencyIndex) throws ComException {
    assert(dwCurrencyIndex != null);
    final Object obj = this._dispatchCall(100,"GetCurrencyDescription", DISPATCH_METHOD,null,dwCurrencyIndex);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(101)  public Integer GetPriceItemCount() throws ComException {
    final Object obj = this._dispatchCall(101,"GetPriceItemCount", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(102)  public String GetPriceItemLabel(final Integer dwIndex) throws ComException {
    assert(dwIndex != null);
    final Object obj = this._dispatchCall(102,"GetPriceItemLabel", DISPATCH_METHOD,null,dwIndex);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(103)  public String GetPriceItemValue(final Integer dwCurrencyIndex, final Integer dwIndex) throws ComException {
    assert(dwCurrencyIndex != null);
    assert(dwIndex != null);
    final Object obj = this._dispatchCall(103,"GetPriceItemValue", DISPATCH_METHOD,null,dwCurrencyIndex,dwIndex);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(104)  public String GetInvoiceText() throws ComException {
    final Object obj = this._dispatchCall(104,"GetInvoiceText", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(105)  public String GetBackendErrorMsg() throws ComException {
    final Object obj = this._dispatchCall(105,"GetBackendErrorMsg", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(106)  public Integer GetCurrencyOption() throws ComException {
    final Object obj = this._dispatchCall(106,"GetCurrencyOption", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(107)  public void SetCurrencyOption(final Integer dwCurrencyOption) throws ComException {
    assert(dwCurrencyOption != null);
    this._dispatchCall(107,"SetCurrencyOption", DISPATCH_METHOD,null,dwCurrencyOption);
  }
  @DeclDISPID(108)  public String GetEndOfLifeHtmlText() throws ComException {
    final Object obj = this._dispatchCall(108,"GetEndOfLifeHtmlText", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(109)  public Integer DisplaySSLCert() throws ComException {
    final Object obj = this._dispatchCall(109,"DisplaySSLCert", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  public ILicAgentImpl(String progId) throws ComException {
    super(progId, "{00194002-D9C3-11D3-8D59-0050048384E3}");
  }
  protected ILicAgentImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ILicAgentImpl" + super.toString() + "]";
  }
}
