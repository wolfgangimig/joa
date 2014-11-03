/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoShadowStyle.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoShadowStyle {
  msoShadowStyleMixed(-2),
  msoShadowStyleInnerShadow(1),
  msoShadowStyleOuterShadow(2);

  public final int value;
  private MsoShadowStyle(int value) { this.value = value; }
  public static  MsoShadowStyle valueOf(int value) {
    switch(value) {
    case -2: return msoShadowStyleMixed;
    case 1: return msoShadowStyleInnerShadow;
    case 2: return msoShadowStyleOuterShadow;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoShadowStyle.class);
    }
  }
}
