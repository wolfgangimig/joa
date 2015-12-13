/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * fmLayoutEffect.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{02DFD4F0-EA2B-11CE-8043-00AA006009FA}")
public class fmLayoutEffect implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static fmLayoutEffect fmLayoutEffectNone = new fmLayoutEffect(0);
  public final static fmLayoutEffect fmLayoutEffectInitiate = new fmLayoutEffect(1);
  public final static fmLayoutEffect _fmLayoutEffectRespond = new fmLayoutEffect(2);

  // Integer constants for bitsets and switch statements
  public final static int _fmLayoutEffectNone = 0;
  public final static int _fmLayoutEffectInitiate = 1;
  public final static int __fmLayoutEffectRespond = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private fmLayoutEffect(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  fmLayoutEffect valueOf(int value) {
    switch(value) {
    case 0: return fmLayoutEffectNone;
    case 1: return fmLayoutEffectInitiate;
    case 2: return _fmLayoutEffectRespond;
    default: return new fmLayoutEffect(value);
    }
  }

  public String toString() {
    switch(value) {
    case 0: return "fmLayoutEffectNone";
    case 1: return "fmLayoutEffectInitiate";
    case 2: return "_fmLayoutEffectRespond";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 0) != 0) sbuf.append("|fmLayoutEffectNone");
      if ((value & 1) != 0) sbuf.append("|fmLayoutEffectInitiate");
      if ((value & 2) != 0) sbuf.append("|_fmLayoutEffectRespond");
      return sbuf.toString();
      }
    }
  }
}
