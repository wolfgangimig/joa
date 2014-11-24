/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlFormatInteger.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlFormatInteger {

  // Typed constants
  public final static OlFormatInteger olFormatIntegerPlain = new OlFormatInteger(1);
  public final static OlFormatInteger olFormatIntegerComputer1 = new OlFormatInteger(2);
  public final static OlFormatInteger olFormatIntegerComputer2 = new OlFormatInteger(3);
  public final static OlFormatInteger olFormatIntegerComputer3 = new OlFormatInteger(4);

  // Integer constants for bitsets and switch statements
  public final static int _olFormatIntegerPlain = 1;
  public final static int _olFormatIntegerComputer1 = 2;
  public final static int _olFormatIntegerComputer2 = 3;
  public final static int _olFormatIntegerComputer3 = 4;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlFormatInteger(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlFormatInteger valueOf(int value) {
    switch(value) {
    case 1: return olFormatIntegerPlain;
    case 2: return olFormatIntegerComputer1;
    case 3: return olFormatIntegerComputer2;
    case 4: return olFormatIntegerComputer3;
    default: return new OlFormatInteger(value);
    }
  }
}
