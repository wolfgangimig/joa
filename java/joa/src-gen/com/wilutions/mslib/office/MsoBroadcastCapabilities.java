/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoBroadcastCapabilities.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoBroadcastCapabilities {
  BroadcastCapFileSizeLimited(1),
  BroadcastCapSupportsMeetingNotes(2),
  BroadcastCapSupportsUpdateDoc(4);

  public final int value;
  private MsoBroadcastCapabilities(int value) { this.value = value; }
  public static  MsoBroadcastCapabilities valueOf(int value) {
    switch(value) {
    case 1: return BroadcastCapFileSizeLimited;
    case 2: return BroadcastCapSupportsMeetingNotes;
    case 4: return BroadcastCapSupportsUpdateDoc;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoBroadcastCapabilities.class);
    }
  }
}
