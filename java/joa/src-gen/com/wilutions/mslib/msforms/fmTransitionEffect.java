/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * fmTransitionEffect.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{0EE49F40-E956-11CE-8141-00AA00611080}")
public class fmTransitionEffect {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static fmTransitionEffect fmTransitionEffectNone = new fmTransitionEffect(0);
  public final static fmTransitionEffect fmTransitionEffectCoverUp = new fmTransitionEffect(1);
  public final static fmTransitionEffect fmTransitionEffectCoverRightUp = new fmTransitionEffect(2);
  public final static fmTransitionEffect fmTransitionEffectCoverRight = new fmTransitionEffect(3);
  public final static fmTransitionEffect fmTransitionEffectCoverRightDown = new fmTransitionEffect(4);
  public final static fmTransitionEffect fmTransitionEffectCoverDown = new fmTransitionEffect(5);
  public final static fmTransitionEffect fmTransitionEffectCoverLeftDown = new fmTransitionEffect(6);
  public final static fmTransitionEffect fmTransitionEffectCoverLeft = new fmTransitionEffect(7);
  public final static fmTransitionEffect fmTransitionEffectCoverLeftUp = new fmTransitionEffect(8);
  public final static fmTransitionEffect fmTransitionEffectPushUp = new fmTransitionEffect(9);
  public final static fmTransitionEffect fmTransitionEffectPushRight = new fmTransitionEffect(10);
  public final static fmTransitionEffect fmTransitionEffectPushDown = new fmTransitionEffect(11);
  public final static fmTransitionEffect fmTransitionEffectPushLeft = new fmTransitionEffect(12);

  // Integer constants for bitsets and switch statements
  public final static int _fmTransitionEffectNone = 0;
  public final static int _fmTransitionEffectCoverUp = 1;
  public final static int _fmTransitionEffectCoverRightUp = 2;
  public final static int _fmTransitionEffectCoverRight = 3;
  public final static int _fmTransitionEffectCoverRightDown = 4;
  public final static int _fmTransitionEffectCoverDown = 5;
  public final static int _fmTransitionEffectCoverLeftDown = 6;
  public final static int _fmTransitionEffectCoverLeft = 7;
  public final static int _fmTransitionEffectCoverLeftUp = 8;
  public final static int _fmTransitionEffectPushUp = 9;
  public final static int _fmTransitionEffectPushRight = 10;
  public final static int _fmTransitionEffectPushDown = 11;
  public final static int _fmTransitionEffectPushLeft = 12;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private fmTransitionEffect(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
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
    default: return new fmTransitionEffect(value);
    }
  }
}
