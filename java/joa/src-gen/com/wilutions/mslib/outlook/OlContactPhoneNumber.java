/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlContactPhoneNumber.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlContactPhoneNumber implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static OlContactPhoneNumber olContactPhoneAssistant = new OlContactPhoneNumber(0);
  public final static OlContactPhoneNumber olContactPhoneBusiness = new OlContactPhoneNumber(1);
  public final static OlContactPhoneNumber olContactPhoneBusiness2 = new OlContactPhoneNumber(2);
  public final static OlContactPhoneNumber olContactPhoneBusinessFax = new OlContactPhoneNumber(3);
  public final static OlContactPhoneNumber olContactPhoneCallback = new OlContactPhoneNumber(4);
  public final static OlContactPhoneNumber olContactPhoneCar = new OlContactPhoneNumber(5);
  public final static OlContactPhoneNumber olContactPhoneCompany = new OlContactPhoneNumber(6);
  public final static OlContactPhoneNumber olContactPhoneHome = new OlContactPhoneNumber(7);
  public final static OlContactPhoneNumber olContactPhoneHome2 = new OlContactPhoneNumber(8);
  public final static OlContactPhoneNumber olContactPhoneHomeFax = new OlContactPhoneNumber(9);
  public final static OlContactPhoneNumber olContactPhoneISDN = new OlContactPhoneNumber(10);
  public final static OlContactPhoneNumber olContactPhoneMobile = new OlContactPhoneNumber(11);
  public final static OlContactPhoneNumber olContactPhoneOther = new OlContactPhoneNumber(12);
  public final static OlContactPhoneNumber olContactPhoneOtherFax = new OlContactPhoneNumber(13);
  public final static OlContactPhoneNumber olContactPhonePager = new OlContactPhoneNumber(14);
  public final static OlContactPhoneNumber olContactPhonePrimary = new OlContactPhoneNumber(15);
  public final static OlContactPhoneNumber olContactPhoneRadio = new OlContactPhoneNumber(16);
  public final static OlContactPhoneNumber olContactPhoneTelex = new OlContactPhoneNumber(17);
  public final static OlContactPhoneNumber olContactPhoneTTYTTD = new OlContactPhoneNumber(18);

  // Integer constants for bitsets and switch statements
  public final static int _olContactPhoneAssistant = 0;
  public final static int _olContactPhoneBusiness = 1;
  public final static int _olContactPhoneBusiness2 = 2;
  public final static int _olContactPhoneBusinessFax = 3;
  public final static int _olContactPhoneCallback = 4;
  public final static int _olContactPhoneCar = 5;
  public final static int _olContactPhoneCompany = 6;
  public final static int _olContactPhoneHome = 7;
  public final static int _olContactPhoneHome2 = 8;
  public final static int _olContactPhoneHomeFax = 9;
  public final static int _olContactPhoneISDN = 10;
  public final static int _olContactPhoneMobile = 11;
  public final static int _olContactPhoneOther = 12;
  public final static int _olContactPhoneOtherFax = 13;
  public final static int _olContactPhonePager = 14;
  public final static int _olContactPhonePrimary = 15;
  public final static int _olContactPhoneRadio = 16;
  public final static int _olContactPhoneTelex = 17;
  public final static int _olContactPhoneTTYTTD = 18;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlContactPhoneNumber(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
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
    default: return new OlContactPhoneNumber(value);
    }
  }

  public String toString() {
    switch(value) {
    case 18: return "olContactPhoneTTYTTD";
    case 8: return "olContactPhoneHome2";
    case 10: return "olContactPhoneISDN";
    case 0: return "olContactPhoneAssistant";
    case 1: return "olContactPhoneBusiness";
    case 2: return "olContactPhoneBusiness2";
    case 3: return "olContactPhoneBusinessFax";
    case 4: return "olContactPhoneCallback";
    case 5: return "olContactPhoneCar";
    case 6: return "olContactPhoneCompany";
    case 7: return "olContactPhoneHome";
    case 9: return "olContactPhoneHomeFax";
    case 11: return "olContactPhoneMobile";
    case 12: return "olContactPhoneOther";
    case 13: return "olContactPhoneOtherFax";
    case 14: return "olContactPhonePager";
    case 15: return "olContactPhonePrimary";
    case 16: return "olContactPhoneRadio";
    case 17: return "olContactPhoneTelex";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 18) != 0) sbuf.append("|olContactPhoneTTYTTD");
      if ((value & 8) != 0) sbuf.append("|olContactPhoneHome2");
      if ((value & 10) != 0) sbuf.append("|olContactPhoneISDN");
      if ((value & 0) != 0) sbuf.append("|olContactPhoneAssistant");
      if ((value & 1) != 0) sbuf.append("|olContactPhoneBusiness");
      if ((value & 2) != 0) sbuf.append("|olContactPhoneBusiness2");
      if ((value & 3) != 0) sbuf.append("|olContactPhoneBusinessFax");
      if ((value & 4) != 0) sbuf.append("|olContactPhoneCallback");
      if ((value & 5) != 0) sbuf.append("|olContactPhoneCar");
      if ((value & 6) != 0) sbuf.append("|olContactPhoneCompany");
      if ((value & 7) != 0) sbuf.append("|olContactPhoneHome");
      if ((value & 9) != 0) sbuf.append("|olContactPhoneHomeFax");
      if ((value & 11) != 0) sbuf.append("|olContactPhoneMobile");
      if ((value & 12) != 0) sbuf.append("|olContactPhoneOther");
      if ((value & 13) != 0) sbuf.append("|olContactPhoneOtherFax");
      if ((value & 14) != 0) sbuf.append("|olContactPhonePager");
      if ((value & 15) != 0) sbuf.append("|olContactPhonePrimary");
      if ((value & 16) != 0) sbuf.append("|olContactPhoneRadio");
      if ((value & 17) != 0) sbuf.append("|olContactPhoneTelex");
      return sbuf.toString();
      }
    }
  }
}
