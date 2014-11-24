/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * InstantMessageCapabilities.
 * Enumerates the InstantMessage Capabilities 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class InstantMessageCapabilities {

  // Typed constants
  public final static InstantMessageCapabilities ucInstantMessageCapabilityCanRenderIsf = new InstantMessageCapabilities(1);
  public final static InstantMessageCapabilities ucInstantMessageCapabilityCanRenderGif = new InstantMessageCapabilities(2);
  public final static InstantMessageCapabilities ucInstantMessageCapabilityCanRenderRtf = new InstantMessageCapabilities(4);
  public final static InstantMessageCapabilities ucInstantMessageCapabilitySupportMime = new InstantMessageCapabilities(8);
  public final static InstantMessageCapabilities ucInstantMessageCapabilityCanRenderHtml = new InstantMessageCapabilities(16);

  // Integer constants for bitsets and switch statements
  public final static int _ucInstantMessageCapabilityCanRenderIsf = 1;
  public final static int _ucInstantMessageCapabilityCanRenderGif = 2;
  public final static int _ucInstantMessageCapabilityCanRenderRtf = 4;
  public final static int _ucInstantMessageCapabilitySupportMime = 8;
  public final static int _ucInstantMessageCapabilityCanRenderHtml = 16;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private InstantMessageCapabilities(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  InstantMessageCapabilities valueOf(int value) {
    switch(value) {
    case 1: return ucInstantMessageCapabilityCanRenderIsf;
    case 2: return ucInstantMessageCapabilityCanRenderGif;
    case 4: return ucInstantMessageCapabilityCanRenderRtf;
    case 8: return ucInstantMessageCapabilitySupportMime;
    case 16: return ucInstantMessageCapabilityCanRenderHtml;
    default: return new InstantMessageCapabilities(value);
    }
  }
}
