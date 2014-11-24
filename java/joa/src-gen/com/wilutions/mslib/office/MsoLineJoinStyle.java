/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoLineJoinStyle.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoLineJoinStyle {

  // Typed constants
  public final static MsoLineJoinStyle msoLineJoinMixed = new MsoLineJoinStyle(-2);
  public final static MsoLineJoinStyle msoLineJoinRound = new MsoLineJoinStyle(1);
  public final static MsoLineJoinStyle msoLineJoinBevel = new MsoLineJoinStyle(2);
  public final static MsoLineJoinStyle msoLineJoinMiter = new MsoLineJoinStyle(3);

  // Integer constants for bitsets and switch statements
  public final static int _msoLineJoinMixed = -2;
  public final static int _msoLineJoinRound = 1;
  public final static int _msoLineJoinBevel = 2;
  public final static int _msoLineJoinMiter = 3;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoLineJoinStyle(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoLineJoinStyle valueOf(int value) {
    switch(value) {
    case -2: return msoLineJoinMixed;
    case 1: return msoLineJoinRound;
    case 2: return msoLineJoinBevel;
    case 3: return msoLineJoinMiter;
    default: return new MsoLineJoinStyle(value);
    }
  }
}
