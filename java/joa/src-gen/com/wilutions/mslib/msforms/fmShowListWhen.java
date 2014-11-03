/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * fmShowListWhen.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{A4069F24-4221-11CE-8EA0-00AA004BA6AE}")
public enum fmShowListWhen {
  fmShowListWhenNever(0),
  fmShowListWhenButton(1),
  fmShowListWhenFocus(2),
  fmShowListWhenAlways(3);

  public final int value;
  private fmShowListWhen(int value) { this.value = value; }
  public static  fmShowListWhen valueOf(int value) {
    switch(value) {
    case 0: return fmShowListWhenNever;
    case 1: return fmShowListWhenButton;
    case 2: return fmShowListWhenFocus;
    case 3: return fmShowListWhenAlways;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + fmShowListWhen.class);
    }
  }
}
