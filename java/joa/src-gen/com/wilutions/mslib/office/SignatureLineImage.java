/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * SignatureLineImage.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class SignatureLineImage {

  // Typed constants
  public final static SignatureLineImage siglnimgSoftwareRequired = new SignatureLineImage(0);
  public final static SignatureLineImage siglnimgUnsigned = new SignatureLineImage(1);
  public final static SignatureLineImage siglnimgSignedValid = new SignatureLineImage(2);
  public final static SignatureLineImage siglnimgSignedInvalid = new SignatureLineImage(3);
  public final static SignatureLineImage siglnimgSigned = new SignatureLineImage(4);

  // Integer constants for bitsets and switch statements
  public final static int _siglnimgSoftwareRequired = 0;
  public final static int _siglnimgUnsigned = 1;
  public final static int _siglnimgSignedValid = 2;
  public final static int _siglnimgSignedInvalid = 3;
  public final static int _siglnimgSigned = 4;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private SignatureLineImage(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  SignatureLineImage valueOf(int value) {
    switch(value) {
    case 0: return siglnimgSoftwareRequired;
    case 1: return siglnimgUnsigned;
    case 2: return siglnimgSignedValid;
    case 3: return siglnimgSignedInvalid;
    case 4: return siglnimgSigned;
    default: return new SignatureLineImage(value);
    }
  }
}
