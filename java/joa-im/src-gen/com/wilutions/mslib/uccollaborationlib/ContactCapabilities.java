/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ContactCapabilities.
 * Defines Contact Capability types. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class ContactCapabilities {

  // Typed constants
  public final static ContactCapabilities ucContactCanShowPresence = new ContactCapabilities(1);
  public final static ContactCapabilities ucContactCanCaptureInstantMessage = new ContactCapabilities(2);
  public final static ContactCapabilities ucContactCanRenderInstantMessage = new ContactCapabilities(4);
  public final static ContactCapabilities ucContactCanCaptureAudio = new ContactCapabilities(8);
  public final static ContactCapabilities ucContactCanRenderAudio = new ContactCapabilities(16);
  public final static ContactCapabilities ucContactCanCaptureVideo = new ContactCapabilities(32);
  public final static ContactCapabilities ucContactCanRenderVideo = new ContactCapabilities(64);
  public final static ContactCapabilities ucContactCanCaptureAppShare = new ContactCapabilities(128);
  public final static ContactCapabilities ucContactCanRenderAppShare = new ContactCapabilities(256);

  // Integer constants for bitsets and switch statements
  public final static int _ucContactCanShowPresence = 1;
  public final static int _ucContactCanCaptureInstantMessage = 2;
  public final static int _ucContactCanRenderInstantMessage = 4;
  public final static int _ucContactCanCaptureAudio = 8;
  public final static int _ucContactCanRenderAudio = 16;
  public final static int _ucContactCanCaptureVideo = 32;
  public final static int _ucContactCanRenderVideo = 64;
  public final static int _ucContactCanCaptureAppShare = 128;
  public final static int _ucContactCanRenderAppShare = 256;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private ContactCapabilities(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
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
    default: return new ContactCapabilities(value);
    }
  }
}
