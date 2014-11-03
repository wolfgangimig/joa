/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * fmLayoutEffect.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{02DFD4F0-EA2B-11CE-8043-00AA006009FA}")
public enum fmLayoutEffect {
  fmLayoutEffectNone(0),
  fmLayoutEffectInitiate(1),
  _fmLayoutEffectRespond(2);

  public final int value;
  private fmLayoutEffect(int value) { this.value = value; }
  public static  fmLayoutEffect valueOf(int value) {
    switch(value) {
    case 0: return fmLayoutEffectNone;
    case 1: return fmLayoutEffectInitiate;
    case 2: return _fmLayoutEffectRespond;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + fmLayoutEffect.class);
    }
  }
}
