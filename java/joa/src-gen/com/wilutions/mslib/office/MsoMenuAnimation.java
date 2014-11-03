/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoMenuAnimation.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoMenuAnimation {
  msoMenuAnimationNone(0),
  msoMenuAnimationRandom(1),
  msoMenuAnimationUnfold(2),
  msoMenuAnimationSlide(3);

  public final int value;
  private MsoMenuAnimation(int value) { this.value = value; }
  public static  MsoMenuAnimation valueOf(int value) {
    switch(value) {
    case 0: return msoMenuAnimationNone;
    case 1: return msoMenuAnimationRandom;
    case 2: return msoMenuAnimationUnfold;
    case 3: return msoMenuAnimationSlide;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoMenuAnimation.class);
    }
  }
}
