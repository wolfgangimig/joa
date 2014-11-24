/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * fmShowDropButtonWhen.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{C5D98C41-4EB2-11CE-8EA0-00AA004BA6AE}")
public class fmShowDropButtonWhen {

  // Typed constants
  public final static fmShowDropButtonWhen fmShowDropButtonWhenNever = new fmShowDropButtonWhen(0);
  public final static fmShowDropButtonWhen fmShowDropButtonWhenFocus = new fmShowDropButtonWhen(1);
  public final static fmShowDropButtonWhen fmShowDropButtonWhenAlways = new fmShowDropButtonWhen(2);

  // Integer constants for bitsets and switch statements
  public final static int _fmShowDropButtonWhenNever = 0;
  public final static int _fmShowDropButtonWhenFocus = 1;
  public final static int _fmShowDropButtonWhenAlways = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private fmShowDropButtonWhen(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  fmShowDropButtonWhen valueOf(int value) {
    switch(value) {
    case 0: return fmShowDropButtonWhenNever;
    case 1: return fmShowDropButtonWhenFocus;
    case 2: return fmShowDropButtonWhenAlways;
    default: return new fmShowDropButtonWhen(value);
    }
  }
}
