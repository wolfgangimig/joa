/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoMenuAnimation.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoMenuAnimation implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoMenuAnimation msoMenuAnimationNone = new MsoMenuAnimation(0);
  public final static MsoMenuAnimation msoMenuAnimationRandom = new MsoMenuAnimation(1);
  public final static MsoMenuAnimation msoMenuAnimationUnfold = new MsoMenuAnimation(2);
  public final static MsoMenuAnimation msoMenuAnimationSlide = new MsoMenuAnimation(3);

  // Integer constants for bitsets and switch statements
  public final static int _msoMenuAnimationNone = 0;
  public final static int _msoMenuAnimationRandom = 1;
  public final static int _msoMenuAnimationUnfold = 2;
  public final static int _msoMenuAnimationSlide = 3;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoMenuAnimation(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoMenuAnimation valueOf(int value) {
    switch(value) {
    case 0: return msoMenuAnimationNone;
    case 1: return msoMenuAnimationRandom;
    case 2: return msoMenuAnimationUnfold;
    case 3: return msoMenuAnimationSlide;
    default: return new MsoMenuAnimation(value);
    }
  }

  public String toString() {
    switch(value) {
    case 0: return "msoMenuAnimationNone";
    case 1: return "msoMenuAnimationRandom";
    case 2: return "msoMenuAnimationUnfold";
    case 3: return "msoMenuAnimationSlide";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 0) != 0) sbuf.append("|msoMenuAnimationNone");
      if ((value & 1) != 0) sbuf.append("|msoMenuAnimationRandom");
      if ((value & 2) != 0) sbuf.append("|msoMenuAnimationUnfold");
      if ((value & 3) != 0) sbuf.append("|msoMenuAnimationSlide");
      return sbuf.toString();
      }
    }
  }
}
