/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * fmListStyle.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{F00164C1-B17B-11CE-A95D-00AA006CB389}")
public enum fmListStyle {
  fmListStylePlain(0),
  fmListStyleOption(1);

  public final int value;
  private fmListStyle(int value) { this.value = value; }
  public static  fmListStyle valueOf(int value) {
    switch(value) {
    case 0: return fmListStylePlain;
    case 1: return fmListStyleOption;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + fmListStyle.class);
    }
  }
}
