/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * fmBackStyle.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{1AFB3130-C129-11CD-A777-00DD01143C57}")
public class fmBackStyle {

  // Typed constants
  public final static fmBackStyle fmBackStyleTransparent = new fmBackStyle(0);
  public final static fmBackStyle fmBackStyleOpaque = new fmBackStyle(1);

  // Integer constants for bitsets and switch statements
  public final static int _fmBackStyleTransparent = 0;
  public final static int _fmBackStyleOpaque = 1;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private fmBackStyle(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  fmBackStyle valueOf(int value) {
    switch(value) {
    case 0: return fmBackStyleTransparent;
    case 1: return fmBackStyleOpaque;
    default: return new fmBackStyle(value);
    }
  }
}
