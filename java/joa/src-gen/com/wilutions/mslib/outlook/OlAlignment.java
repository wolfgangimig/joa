/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlAlignment.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{35A805A1-009F-4307-A6D9-3654104862B5}")
public class OlAlignment {

  // Typed constants
  public final static OlAlignment olAlignmentLeft = new OlAlignment(0);
  public final static OlAlignment olAlignmentRight = new OlAlignment(1);

  // Integer constants for bitsets and switch statements
  public final static int _olAlignmentLeft = 0;
  public final static int _olAlignmentRight = 1;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlAlignment(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlAlignment valueOf(int value) {
    switch(value) {
    case 0: return olAlignmentLeft;
    case 1: return olAlignmentRight;
    default: return new OlAlignment(value);
    }
  }
}
