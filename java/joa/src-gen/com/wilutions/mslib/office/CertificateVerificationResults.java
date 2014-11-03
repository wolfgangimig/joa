/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * CertificateVerificationResults.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum CertificateVerificationResults {
  certverresError(0),
  certverresVerifying(1),
  certverresUnverified(2),
  certverresValid(3),
  certverresInvalid(4),
  certverresExpired(5),
  certverresRevoked(6),
  certverresUntrusted(7);

  public final int value;
  private CertificateVerificationResults(int value) { this.value = value; }
  public static  CertificateVerificationResults valueOf(int value) {
    switch(value) {
    case 0: return certverresError;
    case 1: return certverresVerifying;
    case 2: return certverresUnverified;
    case 3: return certverresValid;
    case 4: return certverresInvalid;
    case 5: return certverresExpired;
    case 6: return certverresRevoked;
    case 7: return certverresUntrusted;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + CertificateVerificationResults.class);
    }
  }
}
