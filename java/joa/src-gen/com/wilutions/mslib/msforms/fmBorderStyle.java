/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * fmBorderStyle.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{5931055C-16BA-101B-989C-00006B82871A}")
public class fmBorderStyle {

  // Typed constants
  public final static fmBorderStyle fmBorderStyleNone = new fmBorderStyle(0);
  public final static fmBorderStyle fmBorderStyleSingle = new fmBorderStyle(1);

  // Integer constants for bitsets and switch statements
  public final static int _fmBorderStyleNone = 0;
  public final static int _fmBorderStyleSingle = 1;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private fmBorderStyle(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  fmBorderStyle valueOf(int value) {
    switch(value) {
    case 0: return fmBorderStyleNone;
    case 1: return fmBorderStyleSingle;
    default: return new fmBorderStyle(value);
    }
  }
}
