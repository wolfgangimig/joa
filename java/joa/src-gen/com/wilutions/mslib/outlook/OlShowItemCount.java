/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlShowItemCount.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlShowItemCount {

  // Typed constants
  public final static OlShowItemCount olNoItemCount = new OlShowItemCount(0);
  public final static OlShowItemCount olShowUnreadItemCount = new OlShowItemCount(1);
  public final static OlShowItemCount olShowTotalItemCount = new OlShowItemCount(2);

  // Integer constants for bitsets and switch statements
  public final static int _olNoItemCount = 0;
  public final static int _olShowUnreadItemCount = 1;
  public final static int _olShowTotalItemCount = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlShowItemCount(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlShowItemCount valueOf(int value) {
    switch(value) {
    case 0: return olNoItemCount;
    case 1: return olShowUnreadItemCount;
    case 2: return olShowTotalItemCount;
    default: return new OlShowItemCount(value);
    }
  }
}
