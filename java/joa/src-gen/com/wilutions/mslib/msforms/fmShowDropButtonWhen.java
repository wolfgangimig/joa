/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * fmShowDropButtonWhen.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{C5D98C41-4EB2-11CE-8EA0-00AA004BA6AE}")
public enum fmShowDropButtonWhen {
  fmShowDropButtonWhenNever(0),
  fmShowDropButtonWhenFocus(1),
  fmShowDropButtonWhenAlways(2);

  public final int value;
  private fmShowDropButtonWhen(int value) { this.value = value; }
  public static  fmShowDropButtonWhen valueOf(int value) {
    switch(value) {
    case 0: return fmShowDropButtonWhenNever;
    case 1: return fmShowDropButtonWhenFocus;
    case 2: return fmShowDropButtonWhenAlways;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + fmShowDropButtonWhen.class);
    }
  }
}
