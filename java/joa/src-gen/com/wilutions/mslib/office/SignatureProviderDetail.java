/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * SignatureProviderDetail.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum SignatureProviderDetail {
  sigprovdetUrl(0),
  sigprovdetHashAlgorithm(1),
  sigprovdetUIOnly(2),
  sigprovdetUseOfficeUI(3),
  sigprovdetUseOfficeStampUI(4);

  public final int value;
  private SignatureProviderDetail(int value) { this.value = value; }
  public static  SignatureProviderDetail valueOf(int value) {
    switch(value) {
    case 0: return sigprovdetUrl;
    case 1: return sigprovdetHashAlgorithm;
    case 2: return sigprovdetUIOnly;
    case 3: return sigprovdetUseOfficeUI;
    case 4: return sigprovdetUseOfficeStampUI;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + SignatureProviderDetail.class);
    }
  }
}
