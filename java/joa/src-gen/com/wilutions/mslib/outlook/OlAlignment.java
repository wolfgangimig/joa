/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlAlignment.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{35A805A1-009F-4307-A6D9-3654104862B5}")
public enum OlAlignment {
  olAlignmentLeft(0),
  olAlignmentRight(1);

  public final int value;
  private OlAlignment(int value) { this.value = value; }
  public static  OlAlignment valueOf(int value) {
    switch(value) {
    case 0: return olAlignmentLeft;
    case 1: return olAlignmentRight;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlAlignment.class);
    }
  }
}
