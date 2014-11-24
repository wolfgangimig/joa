/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * CertificateVerificationResults.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class CertificateVerificationResults {

  // Typed constants
  public final static CertificateVerificationResults certverresError = new CertificateVerificationResults(0);
  public final static CertificateVerificationResults certverresVerifying = new CertificateVerificationResults(1);
  public final static CertificateVerificationResults certverresUnverified = new CertificateVerificationResults(2);
  public final static CertificateVerificationResults certverresValid = new CertificateVerificationResults(3);
  public final static CertificateVerificationResults certverresInvalid = new CertificateVerificationResults(4);
  public final static CertificateVerificationResults certverresExpired = new CertificateVerificationResults(5);
  public final static CertificateVerificationResults certverresRevoked = new CertificateVerificationResults(6);
  public final static CertificateVerificationResults certverresUntrusted = new CertificateVerificationResults(7);

  // Integer constants for bitsets and switch statements
  public final static int _certverresError = 0;
  public final static int _certverresVerifying = 1;
  public final static int _certverresUnverified = 2;
  public final static int _certverresValid = 3;
  public final static int _certverresInvalid = 4;
  public final static int _certverresExpired = 5;
  public final static int _certverresRevoked = 6;
  public final static int _certverresUntrusted = 7;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private CertificateVerificationResults(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
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
    default: return new CertificateVerificationResults(value);
    }
  }
}
