/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlShowItemCount.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlShowItemCount {
  olNoItemCount(0),
  olShowUnreadItemCount(1),
  olShowTotalItemCount(2);

  public final int value;
  private OlShowItemCount(int value) { this.value = value; }
  public static  OlShowItemCount valueOf(int value) {
    switch(value) {
    case 0: return olNoItemCount;
    case 1: return olShowUnreadItemCount;
    case 2: return olShowTotalItemCount;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlShowItemCount.class);
    }
  }
}
