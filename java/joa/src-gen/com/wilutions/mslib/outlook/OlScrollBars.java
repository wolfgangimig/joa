/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlScrollBars.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{D1788312-EDEE-4673-AE33-B3C3BC0753EA}")
public class OlScrollBars {

  // Typed constants
  public final static OlScrollBars olScrollBarsNone = new OlScrollBars(0);
  public final static OlScrollBars olScrollBarsHorizontal = new OlScrollBars(1);
  public final static OlScrollBars olScrollBarsVertical = new OlScrollBars(2);
  public final static OlScrollBars olScrollBarsBoth = new OlScrollBars(3);

  // Integer constants for bitsets and switch statements
  public final static int _olScrollBarsNone = 0;
  public final static int _olScrollBarsHorizontal = 1;
  public final static int _olScrollBarsVertical = 2;
  public final static int _olScrollBarsBoth = 3;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlScrollBars(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlScrollBars valueOf(int value) {
    switch(value) {
    case 0: return olScrollBarsNone;
    case 1: return olScrollBarsHorizontal;
    case 2: return olScrollBarsVertical;
    case 3: return olScrollBarsBoth;
    default: return new OlScrollBars(value);
    }
  }
}
