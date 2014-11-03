/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * fmTransitionEffect.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{0EE49F40-E956-11CE-8141-00AA00611080}")
public enum fmTransitionEffect {
  fmTransitionEffectNone(0),
  fmTransitionEffectCoverUp(1),
  fmTransitionEffectCoverRightUp(2),
  fmTransitionEffectCoverRight(3),
  fmTransitionEffectCoverRightDown(4),
  fmTransitionEffectCoverDown(5),
  fmTransitionEffectCoverLeftDown(6),
  fmTransitionEffectCoverLeft(7),
  fmTransitionEffectCoverLeftUp(8),
  fmTransitionEffectPushUp(9),
  fmTransitionEffectPushRight(10),
  fmTransitionEffectPushDown(11),
  fmTransitionEffectPushLeft(12);

  public final int value;
  private fmTransitionEffect(int value) { this.value = value; }
  public static  fmTransitionEffect valueOf(int value) {
    switch(value) {
    case 0: return fmTransitionEffectNone;
    case 1: return fmTransitionEffectCoverUp;
    case 2: return fmTransitionEffectCoverRightUp;
    case 3: return fmTransitionEffectCoverRight;
    case 4: return fmTransitionEffectCoverRightDown;
    case 5: return fmTransitionEffectCoverDown;
    case 6: return fmTransitionEffectCoverLeftDown;
    case 7: return fmTransitionEffectCoverLeft;
    case 8: return fmTransitionEffectCoverLeftUp;
    case 9: return fmTransitionEffectPushUp;
    case 10: return fmTransitionEffectPushRight;
    case 11: return fmTransitionEffectPushDown;
    case 12: return fmTransitionEffectPushLeft;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + fmTransitionEffect.class);
    }
  }
}
