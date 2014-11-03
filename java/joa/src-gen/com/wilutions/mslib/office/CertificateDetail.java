/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * CertificateDetail.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum CertificateDetail {
  certdetAvailable(0),
  certdetSubject(1),
  certdetIssuer(2),
  certdetExpirationDate(3),
  certdetThumbprint(4);

  public final int value;
  private CertificateDetail(int value) { this.value = value; }
  public static  CertificateDetail valueOf(int value) {
    switch(value) {
    case 0: return certdetAvailable;
    case 1: return certdetSubject;
    case 2: return certdetIssuer;
    case 3: return certdetExpirationDate;
    case 4: return certdetThumbprint;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + CertificateDetail.class);
    }
  }
}
