/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * fmTabStyle.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{EBC7FDE3-6899-11CE-80C0-00AA00611080}")
public class fmTabStyle {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static fmTabStyle fmTabStyleTabs = new fmTabStyle(0);
  public final static fmTabStyle fmTabStyleButtons = new fmTabStyle(1);
  public final static fmTabStyle fmTabStyleNone = new fmTabStyle(2);

  // Integer constants for bitsets and switch statements
  public final static int _fmTabStyleTabs = 0;
  public final static int _fmTabStyleButtons = 1;
  public final static int _fmTabStyleNone = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private fmTabStyle(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  fmTabStyle valueOf(int value) {
    switch(value) {
    case 0: return fmTabStyleTabs;
    case 1: return fmTabStyleButtons;
    case 2: return fmTabStyleNone;
    default: return new fmTabStyle(value);
    }
  }
}
