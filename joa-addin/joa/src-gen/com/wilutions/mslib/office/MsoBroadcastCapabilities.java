/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoBroadcastCapabilities.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoBroadcastCapabilities implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoBroadcastCapabilities BroadcastCapFileSizeLimited = new MsoBroadcastCapabilities(1);
  public final static MsoBroadcastCapabilities BroadcastCapSupportsMeetingNotes = new MsoBroadcastCapabilities(2);
  public final static MsoBroadcastCapabilities BroadcastCapSupportsUpdateDoc = new MsoBroadcastCapabilities(4);

  // Integer constants for bitsets and switch statements
  public final static int _BroadcastCapFileSizeLimited = 1;
  public final static int _BroadcastCapSupportsMeetingNotes = 2;
  public final static int _BroadcastCapSupportsUpdateDoc = 4;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoBroadcastCapabilities(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoBroadcastCapabilities valueOf(int value) {
    switch(value) {
    case 1: return BroadcastCapFileSizeLimited;
    case 2: return BroadcastCapSupportsMeetingNotes;
    case 4: return BroadcastCapSupportsUpdateDoc;
    default: return new MsoBroadcastCapabilities(value);
    }
  }

  public String toString() {
    switch(value) {
    case 1: return "BroadcastCapFileSizeLimited";
    case 2: return "BroadcastCapSupportsMeetingNotes";
    case 4: return "BroadcastCapSupportsUpdateDoc";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 1) != 0) sbuf.append("|BroadcastCapFileSizeLimited");
      if ((value & 2) != 0) sbuf.append("|BroadcastCapSupportsMeetingNotes");
      if ((value & 4) != 0) sbuf.append("|BroadcastCapSupportsUpdateDoc");
      return sbuf.toString();
      }
    }
  }
}
