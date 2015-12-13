/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * SignatureProviderDetail.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class SignatureProviderDetail implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static SignatureProviderDetail sigprovdetUrl = new SignatureProviderDetail(0);
  public final static SignatureProviderDetail sigprovdetHashAlgorithm = new SignatureProviderDetail(1);
  public final static SignatureProviderDetail sigprovdetUIOnly = new SignatureProviderDetail(2);
  public final static SignatureProviderDetail sigprovdetUseOfficeUI = new SignatureProviderDetail(3);
  public final static SignatureProviderDetail sigprovdetUseOfficeStampUI = new SignatureProviderDetail(4);

  // Integer constants for bitsets and switch statements
  public final static int _sigprovdetUrl = 0;
  public final static int _sigprovdetHashAlgorithm = 1;
  public final static int _sigprovdetUIOnly = 2;
  public final static int _sigprovdetUseOfficeUI = 3;
  public final static int _sigprovdetUseOfficeStampUI = 4;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private SignatureProviderDetail(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  SignatureProviderDetail valueOf(int value) {
    switch(value) {
    case 0: return sigprovdetUrl;
    case 1: return sigprovdetHashAlgorithm;
    case 2: return sigprovdetUIOnly;
    case 3: return sigprovdetUseOfficeUI;
    case 4: return sigprovdetUseOfficeStampUI;
    default: return new SignatureProviderDetail(value);
    }
  }

  public String toString() {
    switch(value) {
    case 0: return "sigprovdetUrl";
    case 1: return "sigprovdetHashAlgorithm";
    case 2: return "sigprovdetUIOnly";
    case 3: return "sigprovdetUseOfficeUI";
    case 4: return "sigprovdetUseOfficeStampUI";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 0) != 0) sbuf.append("|sigprovdetUrl");
      if ((value & 1) != 0) sbuf.append("|sigprovdetHashAlgorithm");
      if ((value & 2) != 0) sbuf.append("|sigprovdetUIOnly");
      if ((value & 3) != 0) sbuf.append("|sigprovdetUseOfficeUI");
      if ((value & 4) != 0) sbuf.append("|sigprovdetUseOfficeStampUI");
      return sbuf.toString();
      }
    }
  }
}
