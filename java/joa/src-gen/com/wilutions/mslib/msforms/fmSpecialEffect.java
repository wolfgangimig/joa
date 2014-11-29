/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * fmSpecialEffect.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{A7946240-EA45-11CE-8043-00AA006009FA}")
public class fmSpecialEffect {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static fmSpecialEffect fmSpecialEffectFlat = new fmSpecialEffect(0);
  public final static fmSpecialEffect fmSpecialEffectRaised = new fmSpecialEffect(1);
  public final static fmSpecialEffect fmSpecialEffectSunken = new fmSpecialEffect(2);
  public final static fmSpecialEffect fmSpecialEffectEtched = new fmSpecialEffect(3);
  public final static fmSpecialEffect fmSpecialEffectBump = new fmSpecialEffect(6);

  // Integer constants for bitsets and switch statements
  public final static int _fmSpecialEffectFlat = 0;
  public final static int _fmSpecialEffectRaised = 1;
  public final static int _fmSpecialEffectSunken = 2;
  public final static int _fmSpecialEffectEtched = 3;
  public final static int _fmSpecialEffectBump = 6;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private fmSpecialEffect(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  fmSpecialEffect valueOf(int value) {
    switch(value) {
    case 0: return fmSpecialEffectFlat;
    case 1: return fmSpecialEffectRaised;
    case 2: return fmSpecialEffectSunken;
    case 3: return fmSpecialEffectEtched;
    case 6: return fmSpecialEffectBump;
    default: return new fmSpecialEffect(value);
    }
  }
}
