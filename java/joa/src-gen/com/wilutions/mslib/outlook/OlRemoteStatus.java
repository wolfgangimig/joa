/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlRemoteStatus.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlRemoteStatus {
  olRemoteStatusNone(0),
  olUnMarked(1),
  olMarkedForDownload(2),
  olMarkedForCopy(3),
  olMarkedForDelete(4);

  public final int value;
  private OlRemoteStatus(int value) { this.value = value; }
  public static  OlRemoteStatus valueOf(int value) {
    switch(value) {
    case 0: return olRemoteStatusNone;
    case 1: return olUnMarked;
    case 2: return olMarkedForDownload;
    case 3: return olMarkedForCopy;
    case 4: return olMarkedForDelete;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlRemoteStatus.class);
    }
  }
}
