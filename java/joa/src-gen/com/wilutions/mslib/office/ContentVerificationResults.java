/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * ContentVerificationResults.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class ContentVerificationResults {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static ContentVerificationResults contverresError = new ContentVerificationResults(0);
  public final static ContentVerificationResults contverresVerifying = new ContentVerificationResults(1);
  public final static ContentVerificationResults contverresUnverified = new ContentVerificationResults(2);
  public final static ContentVerificationResults contverresValid = new ContentVerificationResults(3);
  public final static ContentVerificationResults contverresModified = new ContentVerificationResults(4);

  // Integer constants for bitsets and switch statements
  public final static int _contverresError = 0;
  public final static int _contverresVerifying = 1;
  public final static int _contverresUnverified = 2;
  public final static int _contverresValid = 3;
  public final static int _contverresModified = 4;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private ContentVerificationResults(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  ContentVerificationResults valueOf(int value) {
    switch(value) {
    case 0: return contverresError;
    case 1: return contverresVerifying;
    case 2: return contverresUnverified;
    case 3: return contverresValid;
    case 4: return contverresModified;
    default: return new ContentVerificationResults(value);
    }
  }
}
