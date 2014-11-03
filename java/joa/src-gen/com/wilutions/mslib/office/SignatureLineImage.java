/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * SignatureLineImage.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum SignatureLineImage {
  siglnimgSoftwareRequired(0),
  siglnimgUnsigned(1),
  siglnimgSignedValid(2),
  siglnimgSignedInvalid(3),
  siglnimgSigned(4);

  public final int value;
  private SignatureLineImage(int value) { this.value = value; }
  public static  SignatureLineImage valueOf(int value) {
    switch(value) {
    case 0: return siglnimgSoftwareRequired;
    case 1: return siglnimgUnsigned;
    case 2: return siglnimgSignedValid;
    case 3: return siglnimgSignedInvalid;
    case 4: return siglnimgSigned;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + SignatureLineImage.class);
    }
  }
}
