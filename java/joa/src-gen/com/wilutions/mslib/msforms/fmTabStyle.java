/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * fmTabStyle.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{EBC7FDE3-6899-11CE-80C0-00AA00611080}")
public enum fmTabStyle {
  fmTabStyleTabs(0),
  fmTabStyleButtons(1),
  fmTabStyleNone(2);

  public final int value;
  private fmTabStyle(int value) { this.value = value; }
  public static  fmTabStyle valueOf(int value) {
    switch(value) {
    case 0: return fmTabStyleTabs;
    case 1: return fmTabStyleButtons;
    case 2: return fmTabStyleNone;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + fmTabStyle.class);
    }
  }
}
