/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * fmButtonEffect.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{317A54C0-C7B1-11CE-9AFD-00AA00600AB8}")
public class fmButtonEffect {

  // Typed constants
  public final static fmButtonEffect fmButtonEffectFlat = new fmButtonEffect(0);
  public final static fmButtonEffect fmButtonEffectSunken = new fmButtonEffect(2);

  // Integer constants for bitsets and switch statements
  public final static int _fmButtonEffectFlat = 0;
  public final static int _fmButtonEffectSunken = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private fmButtonEffect(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  fmButtonEffect valueOf(int value) {
    switch(value) {
    case 0: return fmButtonEffectFlat;
    case 2: return fmButtonEffectSunken;
    default: return new fmButtonEffect(value);
    }
  }
}
