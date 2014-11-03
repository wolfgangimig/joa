/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlDownloadState.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlDownloadState {
  olHeaderOnly(0),
  olFullItem(1);

  public final int value;
  private OlDownloadState(int value) { this.value = value; }
  public static  OlDownloadState valueOf(int value) {
    switch(value) {
    case 0: return olHeaderOnly;
    case 1: return olFullItem;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlDownloadState.class);
    }
  }
}
