/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlBackStyle.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{AA3E840F-7079-4AA4-91A9-6F3546DA6A95}")
public class OlBackStyle {

  // Typed constants
  public final static OlBackStyle olBackStyleTransparent = new OlBackStyle(0);
  public final static OlBackStyle olBackStyleOpaque = new OlBackStyle(1);

  // Integer constants for bitsets and switch statements
  public final static int _olBackStyleTransparent = 0;
  public final static int _olBackStyleOpaque = 1;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlBackStyle(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlBackStyle valueOf(int value) {
    switch(value) {
    case 0: return olBackStyleTransparent;
    case 1: return olBackStyleOpaque;
    default: return new OlBackStyle(value);
    }
  }
}
