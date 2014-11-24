/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoFilterConjunction.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoFilterConjunction {

  // Typed constants
  public final static MsoFilterConjunction msoFilterConjunctionAnd = new MsoFilterConjunction(0);
  public final static MsoFilterConjunction msoFilterConjunctionOr = new MsoFilterConjunction(1);

  // Integer constants for bitsets and switch statements
  public final static int _msoFilterConjunctionAnd = 0;
  public final static int _msoFilterConjunctionOr = 1;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoFilterConjunction(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoFilterConjunction valueOf(int value) {
    switch(value) {
    case 0: return msoFilterConjunctionAnd;
    case 1: return msoFilterConjunctionOr;
    default: return new MsoFilterConjunction(value);
    }
  }
}
