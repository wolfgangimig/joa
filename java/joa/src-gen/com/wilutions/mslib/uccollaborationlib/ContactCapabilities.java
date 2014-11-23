/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ContactCapabilities.
 * Defines Contact Capability types. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum ContactCapabilities {
  ucContactCanShowPresence(1),
  ucContactCanCaptureInstantMessage(2),
  ucContactCanRenderInstantMessage(4),
  ucContactCanCaptureAudio(8),
  ucContactCanRenderAudio(16),
  ucContactCanCaptureVideo(32),
  ucContactCanRenderVideo(64),
  ucContactCanCaptureAppShare(128),
  ucContactCanRenderAppShare(256);

  public final int value;
  private ContactCapabilities(int value) { this.value = value; }
  public static  ContactCapabilities valueOf(int value) {
    switch(value) {
    case 1: return ucContactCanShowPresence;
    case 2: return ucContactCanCaptureInstantMessage;
    case 4: return ucContactCanRenderInstantMessage;
    case 8: return ucContactCanCaptureAudio;
    case 16: return ucContactCanRenderAudio;
    case 32: return ucContactCanCaptureVideo;
    case 64: return ucContactCanRenderVideo;
    case 128: return ucContactCanCaptureAppShare;
    case 256: return ucContactCanRenderAppShare;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + ContactCapabilities.class);
    }
  }
}
