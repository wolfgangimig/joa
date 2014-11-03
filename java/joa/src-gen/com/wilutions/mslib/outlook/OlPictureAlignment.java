/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlPictureAlignment.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{0BEAB7D8-3BA8-4960-899B-096FCE2EE60F}")
public enum OlPictureAlignment {
  olPictureAlignmentLeft(0),
  olPictureAlignmentTop(1);

  public final int value;
  private OlPictureAlignment(int value) { this.value = value; }
  public static  OlPictureAlignment valueOf(int value) {
    switch(value) {
    case 0: return olPictureAlignmentLeft;
    case 1: return olPictureAlignmentTop;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlPictureAlignment.class);
    }
  }
}
