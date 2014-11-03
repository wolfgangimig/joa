/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlContactPhoneNumber.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlContactPhoneNumber {
  olContactPhoneAssistant(0),
  olContactPhoneBusiness(1),
  olContactPhoneBusiness2(2),
  olContactPhoneBusinessFax(3),
  olContactPhoneCallback(4),
  olContactPhoneCar(5),
  olContactPhoneCompany(6),
  olContactPhoneHome(7),
  olContactPhoneHome2(8),
  olContactPhoneHomeFax(9),
  olContactPhoneISDN(10),
  olContactPhoneMobile(11),
  olContactPhoneOther(12),
  olContactPhoneOtherFax(13),
  olContactPhonePager(14),
  olContactPhonePrimary(15),
  olContactPhoneRadio(16),
  olContactPhoneTelex(17),
  olContactPhoneTTYTTD(18);

  public final int value;
  private OlContactPhoneNumber(int value) { this.value = value; }
  public static  OlContactPhoneNumber valueOf(int value) {
    switch(value) {
    case 0: return olContactPhoneAssistant;
    case 1: return olContactPhoneBusiness;
    case 2: return olContactPhoneBusiness2;
    case 3: return olContactPhoneBusinessFax;
    case 4: return olContactPhoneCallback;
    case 5: return olContactPhoneCar;
    case 6: return olContactPhoneCompany;
    case 7: return olContactPhoneHome;
    case 8: return olContactPhoneHome2;
    case 9: return olContactPhoneHomeFax;
    case 10: return olContactPhoneISDN;
    case 11: return olContactPhoneMobile;
    case 12: return olContactPhoneOther;
    case 13: return olContactPhoneOtherFax;
    case 14: return olContactPhonePager;
    case 15: return olContactPhonePrimary;
    case 16: return olContactPhoneRadio;
    case 17: return olContactPhoneTelex;
    case 18: return olContactPhoneTTYTTD;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlContactPhoneNumber.class);
    }
  }
}
