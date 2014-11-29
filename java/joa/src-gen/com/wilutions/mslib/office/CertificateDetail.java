/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * CertificateDetail.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class CertificateDetail {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static CertificateDetail certdetAvailable = new CertificateDetail(0);
  public final static CertificateDetail certdetSubject = new CertificateDetail(1);
  public final static CertificateDetail certdetIssuer = new CertificateDetail(2);
  public final static CertificateDetail certdetExpirationDate = new CertificateDetail(3);
  public final static CertificateDetail certdetThumbprint = new CertificateDetail(4);

  // Integer constants for bitsets and switch statements
  public final static int _certdetAvailable = 0;
  public final static int _certdetSubject = 1;
  public final static int _certdetIssuer = 2;
  public final static int _certdetExpirationDate = 3;
  public final static int _certdetThumbprint = 4;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private CertificateDetail(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  CertificateDetail valueOf(int value) {
    switch(value) {
    case 0: return certdetAvailable;
    case 1: return certdetSubject;
    case 2: return certdetIssuer;
    case 3: return certdetExpirationDate;
    case 4: return certdetThumbprint;
    default: return new CertificateDetail(value);
    }
  }
}
