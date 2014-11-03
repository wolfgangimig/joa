/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * fmButtonEffect.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{317A54C0-C7B1-11CE-9AFD-00AA00600AB8}")
public enum fmButtonEffect {
  fmButtonEffectFlat(0),
  fmButtonEffectSunken(2);

  public final int value;
  private fmButtonEffect(int value) { this.value = value; }
  public static  fmButtonEffect valueOf(int value) {
    switch(value) {
    case 0: return fmButtonEffectFlat;
    case 2: return fmButtonEffectSunken;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + fmButtonEffect.class);
    }
  }
}
