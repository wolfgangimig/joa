/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * fmTextAlign.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{66BAAC90-7C2A-11CE-B783-00AA004BA6AE}")
public enum fmTextAlign {
  fmTextAlignLeft(1),
  fmTextAlignCenter(2),
  fmTextAlignRight(3);

  public final int value;
  private fmTextAlign(int value) { this.value = value; }
  public static  fmTextAlign valueOf(int value) {
    switch(value) {
    case 1: return fmTextAlignLeft;
    case 2: return fmTextAlignCenter;
    case 3: return fmTextAlignRight;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + fmTextAlign.class);
    }
  }
}
