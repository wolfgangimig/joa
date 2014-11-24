/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * LyncClientCapabilityTypes.
 * Enumerates the capabilities that for preferred client. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class LyncClientCapabilityTypes {

  // Typed constants
  public final static LyncClientCapabilityTypes ucCapabilityUserActivity = new LyncClientCapabilityTypes(1);
  public final static LyncClientCapabilityTypes ucCapabilityText = new LyncClientCapabilityTypes(2);
  public final static LyncClientCapabilityTypes ucCapabilityGifInk = new LyncClientCapabilityTypes(4);
  public final static LyncClientCapabilityTypes ucCapabilityIsfInk = new LyncClientCapabilityTypes(8);
  public final static LyncClientCapabilityTypes ucCapabilityAudio = new LyncClientCapabilityTypes(16);
  public final static LyncClientCapabilityTypes ucCapabilityVideo = new LyncClientCapabilityTypes(32);
  public final static LyncClientCapabilityTypes ucCapabilityCccp = new LyncClientCapabilityTypes(64);
  public final static LyncClientCapabilityTypes ucCapabilityCalendar = new LyncClientCapabilityTypes(128);
  public final static LyncClientCapabilityTypes ucCapabilityRemoteCallControl = new LyncClientCapabilityTypes(256);
  public final static LyncClientCapabilityTypes ucCapabilityBreakthrough = new LyncClientCapabilityTypes(512);
  public final static LyncClientCapabilityTypes ucCapabilityApplicationSharing = new LyncClientCapabilityTypes(1024);

  // Integer constants for bitsets and switch statements
  public final static int _ucCapabilityUserActivity = 1;
  public final static int _ucCapabilityText = 2;
  public final static int _ucCapabilityGifInk = 4;
  public final static int _ucCapabilityIsfInk = 8;
  public final static int _ucCapabilityAudio = 16;
  public final static int _ucCapabilityVideo = 32;
  public final static int _ucCapabilityCccp = 64;
  public final static int _ucCapabilityCalendar = 128;
  public final static int _ucCapabilityRemoteCallControl = 256;
  public final static int _ucCapabilityBreakthrough = 512;
  public final static int _ucCapabilityApplicationSharing = 1024;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private LyncClientCapabilityTypes(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  LyncClientCapabilityTypes valueOf(int value) {
    switch(value) {
    case 1: return ucCapabilityUserActivity;
    case 2: return ucCapabilityText;
    case 4: return ucCapabilityGifInk;
    case 8: return ucCapabilityIsfInk;
    case 16: return ucCapabilityAudio;
    case 32: return ucCapabilityVideo;
    case 64: return ucCapabilityCccp;
    case 128: return ucCapabilityCalendar;
    case 256: return ucCapabilityRemoteCallControl;
    case 512: return ucCapabilityBreakthrough;
    case 1024: return ucCapabilityApplicationSharing;
    default: return new LyncClientCapabilityTypes(value);
    }
  }
}
