/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * fmTextAlign.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{66BAAC90-7C2A-11CE-B783-00AA004BA6AE}")
public class fmTextAlign {

  // Typed constants
  public final static fmTextAlign fmTextAlignLeft = new fmTextAlign(1);
  public final static fmTextAlign fmTextAlignCenter = new fmTextAlign(2);
  public final static fmTextAlign fmTextAlignRight = new fmTextAlign(3);

  // Integer constants for bitsets and switch statements
  public final static int _fmTextAlignLeft = 1;
  public final static int _fmTextAlignCenter = 2;
  public final static int _fmTextAlignRight = 3;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private fmTextAlign(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  fmTextAlign valueOf(int value) {
    switch(value) {
    case 1: return fmTextAlignLeft;
    case 2: return fmTextAlignCenter;
    case 3: return fmTextAlignRight;
    default: return new fmTextAlign(value);
    }
  }
}
