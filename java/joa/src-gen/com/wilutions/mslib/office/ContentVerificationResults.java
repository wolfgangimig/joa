/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * ContentVerificationResults.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum ContentVerificationResults {
  contverresError(0),
  contverresVerifying(1),
  contverresUnverified(2),
  contverresValid(3),
  contverresModified(4);

  public final int value;
  private ContentVerificationResults(int value) { this.value = value; }
  public static  ContentVerificationResults valueOf(int value) {
    switch(value) {
    case 0: return contverresError;
    case 1: return contverresVerifying;
    case 2: return contverresUnverified;
    case 3: return contverresValid;
    case 4: return contverresModified;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + ContentVerificationResults.class);
    }
  }
}
