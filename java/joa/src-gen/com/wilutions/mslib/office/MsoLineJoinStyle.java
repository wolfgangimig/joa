/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoLineJoinStyle.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoLineJoinStyle {
  msoLineJoinMixed(-2),
  msoLineJoinRound(1),
  msoLineJoinBevel(2),
  msoLineJoinMiter(3);

  public final int value;
  private MsoLineJoinStyle(int value) { this.value = value; }
  public static  MsoLineJoinStyle valueOf(int value) {
    switch(value) {
    case -2: return msoLineJoinMixed;
    case 1: return msoLineJoinRound;
    case 2: return msoLineJoinBevel;
    case 3: return msoLineJoinMiter;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoLineJoinStyle.class);
    }
  }
}
