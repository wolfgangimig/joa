/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * fmSpecialEffect.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{A7946240-EA45-11CE-8043-00AA006009FA}")
public enum fmSpecialEffect {
  fmSpecialEffectFlat(0),
  fmSpecialEffectRaised(1),
  fmSpecialEffectSunken(2),
  fmSpecialEffectEtched(3),
  fmSpecialEffectBump(6);

  public final int value;
  private fmSpecialEffect(int value) { this.value = value; }
  public static  fmSpecialEffect valueOf(int value) {
    switch(value) {
    case 0: return fmSpecialEffectFlat;
    case 1: return fmSpecialEffectRaised;
    case 2: return fmSpecialEffectSunken;
    case 3: return fmSpecialEffectEtched;
    case 6: return fmSpecialEffectBump;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + fmSpecialEffect.class);
    }
  }
}
