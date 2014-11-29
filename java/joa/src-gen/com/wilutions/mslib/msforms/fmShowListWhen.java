/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * fmShowListWhen.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{A4069F24-4221-11CE-8EA0-00AA004BA6AE}")
public class fmShowListWhen {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static fmShowListWhen fmShowListWhenNever = new fmShowListWhen(0);
  public final static fmShowListWhen fmShowListWhenButton = new fmShowListWhen(1);
  public final static fmShowListWhen fmShowListWhenFocus = new fmShowListWhen(2);
  public final static fmShowListWhen fmShowListWhenAlways = new fmShowListWhen(3);

  // Integer constants for bitsets and switch statements
  public final static int _fmShowListWhenNever = 0;
  public final static int _fmShowListWhenButton = 1;
  public final static int _fmShowListWhenFocus = 2;
  public final static int _fmShowListWhenAlways = 3;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private fmShowListWhen(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  fmShowListWhen valueOf(int value) {
    switch(value) {
    case 0: return fmShowListWhenNever;
    case 1: return fmShowListWhenButton;
    case 2: return fmShowListWhenFocus;
    case 3: return fmShowListWhenAlways;
    default: return new fmShowListWhen(value);
    }
  }
}
